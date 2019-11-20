package nsk.tfoms.survay.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.net.URLEncoder;

import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSecondlevel;
import nsk.tfoms.survay.pojo.Sender;
import nsk.tfoms.survay.service.ClinicServiceSecondLevel;

/*
 * Контроллер обрабатывает все что связано с анкетой первого уровня АПУ
 
--delete from question_many_clinic t 
--delete from  survay_clinic_secondlevel d 
--delete from  survay_clinic_sec_1 ff 
--delete from  survay_clinic_sec_2 ll 
--delete from   survay_clinic_sec_25 hh
*/

@Controller
public class ClinicSecondLevel {

	  @Autowired private ClinicServiceSecondLevel personSvc;

	  
	  @RequestMapping(value = "/clinicsecondlevel", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse save(@RequestParam String test) throws ParseException
	  { 
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
			List<SurvayClinicSecondlevel> list  =	personSvc.getAll(test);
		 
		    for (int i = 0; i < list.size(); i++)
		    {
		    	//list.get(i).setDataRespSecondlevel(	TimesAndDate.parseDate(list.get(i).getDataRespSecondlevel())	);
		    	//list.get(i).setReplacementClinicSecondlevelsurvayClinicSec1(list.get(i).getSurvayClinicSec1().getReplacementClinicSecondlevel());
		    	//list.get(i).setSurvayClinicSec1(null);
			}

		    res.setStatus("SUCCESS");
		    res.setResult(list);
		    
		    
			return res;
	  }
	  
	
	  
	  
	  
	  @RequestMapping(value = "/addsecondclinic", method = RequestMethod.POST)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse save(HttpServletRequest request) throws ParseException, IOException
	  { 
		    
			  nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();

			  // 1. get received JSON data from request
		      BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		      String json = "";
		      if(br != null){ json = br.readLine(); }
		      br.close();
		      
		      String fg = URLEncoder.encode(json, "Cp1251");
		      String fg2 = URLDecoder.decode(fg, "UTF-8");
		      
		      // 2. initiate jackson mapper
		      ObjectMapper mapper = new ObjectMapper();
		      // 3. Convert received JSON to Article
		      Sender sender = mapper.readValue(fg2, Sender.class);
		      
		      if(sender.getSurvay1().getId() == null) personSvc.create(sender);
		      else personSvc.edit(sender,request);
			
		    List<SurvayClinicSecondlevel> list = personSvc.getAll(sender.getSurvay1().getPolzovatelSecondlevel());
		    
		    res.setStatus("SUCCESS");
		    res.setResult(list);

		    
			return res;
	  }
	  
	  
	  @RequestMapping(value = "/secondcliniceditid", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse editOnId(@RequestParam String id,String user) throws ParseException
	  { 
		  int idInt = Integer.valueOf(id);
		  
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayClinicSecondlevel> list = personSvc.getOnId(idInt, user);
		    
		    res.setStatus("SUCCESS");
		    res.setResult(list);
			return res;
	  }
	
}
