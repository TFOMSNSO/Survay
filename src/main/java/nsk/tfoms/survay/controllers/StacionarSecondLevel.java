package nsk.tfoms.survay.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import nsk.tfoms.survay.entity.secondlevel.DayStacionar.DayStacionarSecondlevel;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.QuestionManyDayStacionar;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SCDSSLSec15;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SCDSSLSec2;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SCDSSLSec25;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SurvayClinicDayStacionarSec1;
import nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel;
import nsk.tfoms.survay.pojo.SenderDSSL;
import nsk.tfoms.survay.pojo.SenderSSL;
import nsk.tfoms.survay.pojo.WrapManyDSSL;
import nsk.tfoms.survay.service.SSLservice;

@Controller
public class StacionarSecondLevel {

	@Autowired SSLservice personSvcDssl;
	
	@RequestMapping(value = "/allssl", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse save(@RequestParam String test) throws ParseException
	  { 
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
			List<StacionarSecondlevel> list  = personSvcDssl.getAll(test);
		 
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
	
	
	@RequestMapping(value = "/addssl", method = RequestMethod.POST)
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
		      SenderSSL sender = mapper.readValue(fg2, SenderSSL.class);

		      System.out.println("@RRRRRRRR@"+ sender);
		      
		      if(sender.getSurvay1().getId() == null) personSvcDssl.create(sender);
		      else personSvcDssl.edit(sender,request);
			
		    List<StacionarSecondlevel> list = personSvcDssl.getAll(sender.getSurvay1().getPolzSecondlSls());
		    
		    res.setStatus("SUCCESS");
		    res.setResult(list);

		    
			return res;
	  }
	
	
	@RequestMapping(value = "/slsid", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse editOnId(@RequestParam String id,String user) throws ParseException
	  { 
		  int idInt = Integer.valueOf(id);
		  
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<StacionarSecondlevel> list = personSvcDssl.getOnId(idInt, user);
		    
		    res.setStatus("SUCCESS");
		    res.setResult(list);
			return res;
	  }


		

	
		
}
