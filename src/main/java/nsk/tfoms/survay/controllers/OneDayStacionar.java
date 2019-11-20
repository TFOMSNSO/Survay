package nsk.tfoms.survay.controllers;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import nsk.tfoms.survay.entity.SurvayDaystacionar;
import nsk.tfoms.survay.service.DayStacionarService;
import nsk.tfoms.survay.util.TimesAndDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * Контроллер обрабатывает все что связано с анкетой первого уровня Дневного стационара
 */

@Controller
public class OneDayStacionar {

	  @Autowired private DayStacionarService DayStacionarService;
	  
	  @RequestMapping(value = "/onedaystacionar", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse save(@RequestParam String test) throws ParseException
	  { 
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayDaystacionar> list = DayStacionarService.getAll(test);
		    for (int i = 0; i < list.size(); i++)
		    {
		    	list.get(i).setDataRespDaystac(	TimesAndDate.parseDate(list.get(i).getDataRespDaystac())	);
		    	list.get(i).setDataInputDaystac(	TimesAndDate.parseDate(list.get(i).getDataInputDaystac())	);
			}
		    res.setStatus("SUCCESS");
		    res.setResult(list);

			return res;
	  }
	  
	  /**
	     * Method for chart pie on header site
	     */
	    @RequestMapping(value = "/firstchartpiedaystac",method = RequestMethod.GET)
	    public @ResponseBody nsk.tfoms.survay.util.JsonResponse chartpie(@RequestParam String test) throws ParseException
		  { 
				nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
			    // вытаскиваем из базы 
				List<SurvayDaystacionar> list = DayStacionarService.getAll(test);
			    List<Integer> ls = new ArrayList<Integer>();
			    
			    int m=0,sh=0,m2=0,sh2=0;
			    for (int i = 0; i < list.size(); i++)
			    {
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())<=59 && list.get(i).getSexDaystac().equals("Мужской"))
			    	{
			    		m++;
			    	}
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())<=54 && list.get(i).getSexDaystac().equals("Женский"))
			    	{
			    		sh++;
			    	}
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())>=60 && list.get(i).getSexDaystac().equals("Мужской"))
			    	{
			    		m2++;
			    	}
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())>=55 && list.get(i).getSexDaystac().equals("Женский"))
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
	   * Method for chart pie on header site between
	   */
	    @RequestMapping(value = "/firstchartpiedaystacbetween",method = RequestMethod.GET)
	    public @ResponseBody nsk.tfoms.survay.util.JsonResponse chartpiebetween(@RequestParam String datebegin,String dateend,String userp) throws ParseException
   
	    {
		    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
			    // вытаскиваем из базы 
			    List<SurvayDaystacionar> list = DayStacionarService.getAllbetween(datebegin, dateend,userp);

		    	
			    List<Integer> ls = new ArrayList<Integer>();
			    
			    int m=0,sh=0,m2=0,sh2=0;
			    for (int i = 0; i < list.size(); i++)
			    {
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())<=59 && list.get(i).getSexDaystac().equals("Мужской"))
			    	{
			    		m++;
			    	}
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())<=54 && list.get(i).getSexDaystac().equals("Женский"))
			    	{
			    		sh++;
			    	}
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())>=60 && list.get(i).getSexDaystac().equals("Мужской"))
			    	{
			    		m2++;
			    	}
			    	if(Integer.valueOf(list.get(i).getAgeDaystac())>=55 && list.get(i).getSexDaystac().equals("Женский"))
			    	{
			    		sh2++;
			    	}
				}
			    ls.add(m);ls.add(sh);ls.add(m2);ls.add(sh2);
			    res.setStatus("SUCCESS");
			    res.setResult(ls);

				return res;
		  }
	  
	  
	  
	  @RequestMapping(value = "/addonedaystac", method = RequestMethod.POST)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse save(@RequestBody @Valid SurvayDaystacionar survayDaystacionar) throws ParseException
	  { 
		    
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
			// добовляем запись в базу
			DayStacionarService.add(survayDaystacionar);
		    // вытаскиваем из базы 
		    List<SurvayDaystacionar> list = DayStacionarService.getAll(survayDaystacionar.getPolzovateldaystacionar());
		    for (int i = 0; i < list.size(); i++)
		    {
		    	list.get(i).setDataRespDaystac(	TimesAndDate.parseDate(list.get(i).getDataRespDaystac())	);
			}
		    res.setStatus("SUCCESS");
		    res.setResult(list);

			return res;
	  }
	  
	  @RequestMapping(value = "/onedaystacid", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse editOnId(@RequestParam String id,String user) throws ParseException
	  { 
		  BigDecimal idBD = new BigDecimal(id.replaceAll(",", ""));
		  
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayDaystacionar> list = DayStacionarService.getOnId(idBD, user);
		    list.get(0).setDataRespDaystac(	TimesAndDate.parseDate(list.get(0).getDataRespDaystac())	);
		    res.setStatus("SUCCESS");
		    res.setResult(list);
			return res;
	  }
	  
	  @RequestMapping(value = "/onedaystacbetween", method = RequestMethod.GET)
	  public @ResponseBody nsk.tfoms.survay.util.JsonResponse getDataBetween(@RequestParam String datebegin,String dateend,String userp) throws ParseException
	  
	  { 
			nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
		    // вытаскиваем из базы 
		    List<SurvayDaystacionar> list = DayStacionarService.getAllbetween(datebegin, dateend,userp);
		    for (int i = 0; i < list.size(); i++)
		    {
		    	list.get(i).setDataRespDaystac(	TimesAndDate.parseDate(list.get(i).getDataRespDaystac())	);
			}
		    
		    res.setStatus("SUCCESS");
		    res.setResult(list);
			return res;
	  }
	  
}
