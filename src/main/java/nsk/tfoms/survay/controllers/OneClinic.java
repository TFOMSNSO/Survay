package nsk.tfoms.survay.controllers;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import nsk.tfoms.survay.entity.SurvayClinic;
import nsk.tfoms.survay.service.ClinicService;
import nsk.tfoms.survay.util.TimesAndDate;

/*
 * Контроллер обрабатывает все что связано с анкетой первого уровня АПУ
 */

@Controller
public class OneClinic {

	  @Autowired private ClinicService personSvc;
	/*  
	  @RequestMapping(value = "/addClinic", method = RequestMethod.POST)
	  public String addClinic(@Valid SurvayClinic survay, BindingResult binding) {
		
	    personSvc.add(survay);
	    return "redirect:general";
	  }
	 */
	  
	  @RequestMapping(value = "/addoneclinic", method = RequestMethod.POST)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse save(@RequestBody @Valid SurvayClinic survay) throws ParseException
	  { 
		    
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    personSvc.add(survay);
		    List<SurvayClinic> list = personSvc.getAll(survay.getPolzovatel());
		    for (int i = 0; i < list.size(); i++)
		    {
		    	list.get(i).setDataResp(	TimesAndDate.parseDate(list.get(i).getDataResp())	);
			}
		    res.setStatus("SUCCESS");
		    res.setResult(list);

			return res;
	  }
	  
	  @RequestMapping(value = "/oneclinic", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse save(@RequestParam String test) throws ParseException
	  { 
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayClinic> list = personSvc.getAll(test);
		    System.out.println("list "+ list );
		    for (int i = 0; i < list.size(); i++)
		    {
		    	list.get(i).setDataResp(	TimesAndDate.parseDate(list.get(i).getDataResp())	);
		    	list.get(i).setDataInput(	TimesAndDate.parseDate(list.get(i).getDataInput())	);
			}
		    res.setStatus("SUCCESS");
		    res.setResult(list);
		    
			return res;
	  }
	  
	  
	/**
     * Method for chart pie on header site
     */
    @RequestMapping(value = "/firstchartpieclinic",method = RequestMethod.GET)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse chartpie(@RequestParam String test) throws ParseException
	  { 
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayClinic> list = personSvc.getAll(test);
		    List<Integer> ls = new ArrayList<Integer>();
		    
		    int m=0,sh=0,m2=0,sh2=0;
		    for (int i = 0; i < list.size(); i++)
		    {
		    	if(Integer.valueOf(list.get(i).getAge())<=59 && list.get(i).getSex().equals("Мужской"))
		    	{
		    		m++;
		    	}
		    	if(Integer.valueOf(list.get(i).getAge())<=54 && list.get(i).getSex().equals("Женский"))
		    	{
		    		sh++;
		    	}
		    	if(Integer.valueOf(list.get(i).getAge())>=60 && list.get(i).getSex().equals("Мужской"))
		    	{
		    		m2++;
		    	}
		    	if(Integer.valueOf(list.get(i).getAge())>=55 && list.get(i).getSex().equals("Женский"))
		    	{
		    		sh2++;
		    	}
			}
		    ls.add(m);ls.add(sh);ls.add(m2);ls.add(sh2);
		    res.setStatus("SUCCESS");
		    res.setResult(ls);

			return res;
	  }
    
    /**
     * Method for chart pie on header site with option between
     */
    @RequestMapping(value = "/firstchartpieclinicbetween",method = RequestMethod.GET)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse chartpiebetween(@RequestParam String datebegin,String dateend,String userp) throws ParseException

    { 
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
	    // вытаскиваем из базы 
	    List<SurvayClinic> list = personSvc.getAllbetween(datebegin, dateend,userp);

    	
		    List<Integer> ls = new ArrayList<Integer>();
		    
		    int m=0,sh=0,m2=0,sh2=0;
		    for (int i = 0; i < list.size(); i++)
		    {
		    	if(Integer.valueOf(list.get(i).getAge())<=59 && list.get(i).getSex().equals("Мужской"))
		    	{
		    		m++;
		    	}
		    	if(Integer.valueOf(list.get(i).getAge())<=54 && list.get(i).getSex().equals("Женский"))
		    	{
		    		sh++;
		    	}
		    	if(Integer.valueOf(list.get(i).getAge())>=60 && list.get(i).getSex().equals("Мужской"))
		    	{
		    		m2++;
		    	}
		    	if(Integer.valueOf(list.get(i).getAge())>=55 && list.get(i).getSex().equals("Женский"))
		    	{
		    		sh2++;
		    	}
			}
		    ls.add(m);ls.add(sh);ls.add(m2);ls.add(sh2);
		    res.setStatus("SUCCESS");
		    res.setResult(ls);

			return res;
	  }
	  
	  @RequestMapping(value = "/oneclinicbetween", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse getDataBetween(@RequestParam String datebegin,String dateend,String userp) throws ParseException

	  { 
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayClinic> list = personSvc.getAllbetween(datebegin, dateend,userp);

			for (int i = 0; i < list.size(); i++)
		    {
		    	list.get(i).setDataResp(	TimesAndDate.parseDate(list.get(i).getDataResp())	);
			}
		    
		    res.setStatus("SUCCESS");
		    res.setResult(list);
			return res;
	  }
	  
	  @RequestMapping(value = "/onecliniceditid", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse editOnId(@RequestParam String id,String user) throws ParseException
	  { 
		  BigDecimal idBD = new BigDecimal(id.replaceAll(",", ""));
		  
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayClinic> list = personSvc.getOnId(idBD, user);
		    list.get(0).setDataResp(	TimesAndDate.parseDate(list.get(0).getDataResp())	);
		    res.setStatus("SUCCESS");
		    res.setResult(list);
			return res;
	  }

	
}
