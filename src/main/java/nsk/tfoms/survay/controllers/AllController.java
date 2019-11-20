package nsk.tfoms.survay.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.jasperreports.engine.JRException;
import nsk.tfoms.survay.entity.SurvayClinic;
import nsk.tfoms.survay.entity.SurvayDaystacionar;
import nsk.tfoms.survay.entity.SurvayStacionar;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSecondlevel;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.DayStacionarSecondlevel;
import nsk.tfoms.survay.pojo.ParamOnePart;
import nsk.tfoms.survay.pojo.ParamTwoPart;
import nsk.tfoms.survay.pojo.ReportPg1;
import nsk.tfoms.survay.service.BigReportSL;
import nsk.tfoms.survay.service.ClinicService;
import nsk.tfoms.survay.service.ClinicServiceSecondLevel;
import nsk.tfoms.survay.service.DayStacionarService;
import nsk.tfoms.survay.service.DayStacionarServiceSecondLevel;
import nsk.tfoms.survay.service.SSLservice;
import nsk.tfoms.survay.service.StacionarService;
import nsk.tfoms.survay.util.Util;
import nsk.tfoms.survay.util.report.Reports;



@Controller
public class AllController
{
	@Autowired private ServletContext servletContext;
	
	@Autowired private DayStacionarService daystacionarservice;
	@Autowired private StacionarService stacionarservice;
	@Autowired private ClinicService personSvc;
	
	@Autowired private ClinicServiceSecondLevel dssl;
	@Autowired private DayStacionarServiceSecondLevel DayStacionarSecondlevel;
	@Autowired private SSLservice sslservice;
	@Autowired private BigReportSL bigreportsl;
	
    private static final int BUFFER_SIZE = 4096;
    
    
    
	@RequestMapping(value = "/general",method = RequestMethod.GET)
	  public String listAll(Model model){
		File mo = new File( servletContext.getRealPath("/WEB-INF/mo.txt"));
		File age = new File( servletContext.getRealPath("/WEB-INF/age.txt"));
		
		model.addAttribute("listmo", Util.getMo(mo.getPath()));
		model.addAttribute("listage", Util.getMo(age.getPath()));
		
	    return "private/general";
	}
	
	
	@RequestMapping(value = "/download",method = RequestMethod.GET)
	public void doDownload(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
     
		String filePath  = "/downloads/"+request.getSession().getAttribute("filename");
		// get absolute path of the application
		ServletContext context = request.getServletContext();
		String appPath = context.getRealPath("");

		// construct the complete absolute path of the file
		String fullPath = appPath + filePath;		
		File downloadFile = new File(fullPath);
		FileInputStream inputStream = new FileInputStream(downloadFile);
		
		String mimeType = context.getMimeType(fullPath);
		if (mimeType == null) {
			// set to binary type if MIME mapping not found
			mimeType = "application/octet-stream";
		}

		// set content attributes for the response
		response.setContentType(mimeType);
		response.setContentLength((int) downloadFile.length());

		// set headers for the response
		String headerKey = "Content-Disposition";
		String headerValue = String.format("attachment; filename=\"%s\"",
				downloadFile.getName());
		response.setHeader(headerKey, headerValue);

		// get output stream of the response
		OutputStream outStream = response.getOutputStream();

		byte[] buffer = new byte[BUFFER_SIZE];
		int bytesRead = -1;

		// write bytes read from the input stream into the output stream
		while ((bytesRead = inputStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, bytesRead);
		}
		
		inputStream.close();
		outStream.close();
		
		new File(fullPath).delete();
     
	}
	 

	
	/**
     * Method for handling file download request from client
     */
    @RequestMapping(value = "/firstPartReport",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse doDownload(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamOnePart paramonepart) throws IOException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
    	

    	List<List<SurvayClinicSecondlevel>> forOneOrgClinic2 = null;
    	List<List<DayStacionarSecondlevel>> forOneOrgDayStac2 = null;
    	List<List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel>> forOneOrgStac2 = null;
    	
    //	int age_min_1 = 0,age_max_1 = 0,age_min_2 = 0,age_max_2 = 0,age_min_3 = 0,age_min_4 = 0; 
    	int age_min_0_1 = 0,age_max_0_1 = 0,age_min_0_2 = 0,age_max_0_2 = 0,age_min_0_3 = 0,age_max_0_3 = 0,age_min_0_4 = 0,age_max_0_4 = 0,
    	    age_min_1 = 0,age_max_1 = 0,age_min_2 = 0,age_max_2 = 0,age_min_3 = 0,age_min_4 = 0; 	
    	    	
    			 
    	if (	(paramonepart.getKids().equals("true") && paramonepart.getAdult().equals("true")) ||
    			( (paramonepart.getKids().equals("false") && paramonepart.getAdult().equals("false")))
    			
    		){
    		//27.03.2019
    		age_min_0_1 = 0; age_max_0_1 = 13;
    		age_min_0_2 = 0; age_max_0_2 = 13;
    		age_min_0_3 = 14; age_max_0_3 = 17;
    		age_min_0_4 = 14; age_max_0_4 = 17;
    		
    		age_min_1 = 18; age_max_1 = 59;
    		age_min_2 = 18; age_max_2 = 54;
    		age_min_3 = 60;
    		age_min_4 = 55;
    		
    	}else if(paramonepart.getKids().equals("true") && paramonepart.getAdult().equals("false")){
    		
    		//������
    		//28.03.2019
    		age_min_0_1 = 0; age_max_0_1 = 13;
    		age_min_0_2 = 0; age_max_0_2 = 13;
    		age_min_0_3 = 14; age_max_0_3 = 17;
    		age_min_0_4 = 14; age_max_0_4 = 17;
    		//04.04.2019
    		age_min_1 = 10000;
    		age_min_2 = 10000;
    		age_min_3 = 10000;
    		age_min_4 = 10000;
    		//
    		
    	/*	age_min_1 = 0; age_max_1 = 18;
    		age_min_2 = 0; age_max_2 = 18;
    		age_min_3 = 10000;
    		age_min_4 = 10000;*/
    		
    	}else if(paramonepart.getKids().equals("false") && paramonepart.getAdult().equals("true")){
    		
    		//27.03.2019
    	/*	age_min_0_1 = 0; age_max_0_1 = 13;
    		age_min_0_2 = 0; age_max_0_2 = 13;
    		age_min_0_3 = 14; age_max_0_3 = 17;
    		age_min_0_4 = 14; age_max_0_4 = 17;*/
    		
    		//04.04.2019
    		age_min_0_1 = 10000;
    		age_min_0_2 = 10000;
    		age_min_0_3 = 10000;
    		age_min_0_4 = 10000;
    		//
    		
    		age_min_1 = 18; age_max_1 = 59;
    		age_min_2 = 18; age_max_2 = 54;
    		age_min_3 = 60;
    		age_min_4 = 55;
    		   		
    	}else{
    		//27.03.2019
    		age_min_0_1 = 0; age_max_0_1 = 13;
    		age_min_0_2 = 0; age_max_0_2 = 13;
    		age_min_0_3 = 14; age_max_0_3 = 17;
    		age_min_0_4 = 14; age_max_0_4 = 17;
    		
    		age_min_1 = 18; age_max_1 = 59;
    		age_min_2 = 18; age_max_2 = 54;
    		age_min_3 = 60;
    		age_min_4 = 55;
    	}
    	
    //	if(paramonepart.getPlus_twolevel().equals("true")) 
     	if(paramonepart.getPlus_twolevel().equals("true") || paramonepart.getPlus_onlytwolevel().equals("true")) 
    	
   
   	{

    		
    		
        	if(! parseorg(paramonepart).equals(""))
        	{
        		//===================Clinic================================
        		//27.03.2019
    		    List<SurvayClinicSecondlevel> list01 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
    		    List<SurvayClinicSecondlevel> list02 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
    		    List<SurvayClinicSecondlevel> list03 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
    		    List<SurvayClinicSecondlevel> list04 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4 ,paramonepart.getLpu());
        		
    		    List<SurvayClinicSecondlevel> list1 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
    		    List<SurvayClinicSecondlevel> list2 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
    		    List<SurvayClinicSecondlevel> list3 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������", age_min_3, 10000 ,paramonepart.getLpu());
    		    List<SurvayClinicSecondlevel> list4 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������", age_min_4, 10000 ,paramonepart.getLpu());
    		    
    		    forOneOrgClinic2 = new ArrayList<List<SurvayClinicSecondlevel>>();
    		    //27.03.2019
    		    forOneOrgClinic2.add(list01);
    		    forOneOrgClinic2.add(list02);
    		    forOneOrgClinic2.add(list03);
    		    forOneOrgClinic2.add(list04);
    		    
    		    forOneOrgClinic2.add(list1);
    		    forOneOrgClinic2.add(list2);
    		    forOneOrgClinic2.add(list3);
    		    forOneOrgClinic2.add(list4);
        		

        		
        		
    		    
    		    
    		    //=============================DayStacionar===============================
    		    //27.03.2019
    		    List<DayStacionarSecondlevel> list05 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
    		    List<DayStacionarSecondlevel> list06 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
    		    List<DayStacionarSecondlevel> list07 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
    		    List<DayStacionarSecondlevel> list08 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
    		    
    		    List<DayStacionarSecondlevel> list5 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
    		    List<DayStacionarSecondlevel> list6 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
    		    List<DayStacionarSecondlevel> list7 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
    		    List<DayStacionarSecondlevel> list8 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());
    		    
    		    forOneOrgDayStac2 = new ArrayList<List<DayStacionarSecondlevel>>();
    		   //27.03.2019
    		    forOneOrgDayStac2.add(list05);
    		    forOneOrgDayStac2.add(list06);
    		    forOneOrgDayStac2.add(list07);
    		    forOneOrgDayStac2.add(list08);
    		    
    		    forOneOrgDayStac2.add(list5);
    		    forOneOrgDayStac2.add(list6);
    		    forOneOrgDayStac2.add(list7);
    		    forOneOrgDayStac2.add(list8);
    		    
    		    
    		    //=========================================Stacionar==========================
    		    //27.03.2019
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list09 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list010 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list011 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list012 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
    		    
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list9 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list10 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list11 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
    		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list12 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());

    		    forOneOrgStac2 = new ArrayList<List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel>>();
    		    //27.03.2019
    		    forOneOrgStac2.add(list09);
    		    forOneOrgStac2.add(list010);
    		    forOneOrgStac2.add(list011);
    		    forOneOrgStac2.add(list012);
    		    
    		    forOneOrgStac2.add(list9);
    		    forOneOrgStac2.add(list10);
    		    forOneOrgStac2.add(list11);
    		    forOneOrgStac2.add(list12);
        	}
    	}	
       
    	List<List<SurvayClinic>> forOneOrgClinic = null;
    	List<List<SurvayDaystacionar>> forOneOrgDayStac = null;
    	List<List<SurvayStacionar>> forOneOrgStac = null;
    	
    	
    	if(! parseorg(paramonepart).equals(""))
    	{
    		//===================Clinic================================
    		//29.03.2019
    		List<SurvayClinic> list01 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
		    List<SurvayClinic> list02 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
		    List<SurvayClinic> list03 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
		    List<SurvayClinic> list04 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
    		
		    List<SurvayClinic> list1 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
		    List<SurvayClinic> list2 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
		    List<SurvayClinic> list3 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
		    List<SurvayClinic> list4 = personSvc.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());
		    
		    forOneOrgClinic = new ArrayList<List<SurvayClinic>>();
		  //29.03.2019
		    forOneOrgClinic.add(list01);
		    forOneOrgClinic.add(list02);
		    forOneOrgClinic.add(list03);
		    forOneOrgClinic.add(list04);   
		    forOneOrgClinic.add(list1);
		    forOneOrgClinic.add(list2);
		    forOneOrgClinic.add(list3);
		    forOneOrgClinic.add(list4);
		    

		    //=============================DayStacionar===============================
		    //29.03.2019
		    List<SurvayDaystacionar> list05 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
		    List<SurvayDaystacionar> list06 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
		    List<SurvayDaystacionar> list07 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
		    List<SurvayDaystacionar> list08 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
		    
		    List<SurvayDaystacionar> list5 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
		    List<SurvayDaystacionar> list6 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
		    List<SurvayDaystacionar> list7 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
		    List<SurvayDaystacionar> list8 = daystacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());
		    
		    forOneOrgDayStac = new ArrayList<List<SurvayDaystacionar>>();
		    //29.03.2019
		    forOneOrgDayStac.add(list05);
		    forOneOrgDayStac.add(list06);
		    forOneOrgDayStac.add(list07);
		    forOneOrgDayStac.add(list08);
		    
		    forOneOrgDayStac.add(list5);
		    forOneOrgDayStac.add(list6);
		    forOneOrgDayStac.add(list7);
		    forOneOrgDayStac.add(list8);
		    
		    
		    //=========================================Stacionar==========================
		    //29.03.2019
		    List<SurvayStacionar> list09 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
		    List<SurvayStacionar> list010 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
		    List<SurvayStacionar> list011 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
		    List<SurvayStacionar> list012 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
		    
		    List<SurvayStacionar> list9 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
		    List<SurvayStacionar> list10 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
		    List<SurvayStacionar> list11 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
		    List<SurvayStacionar> list12 = stacionarservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());

		    forOneOrgStac = new ArrayList<List<SurvayStacionar>>();
		    //29.03.2019
		    forOneOrgStac.add(list09);
		    forOneOrgStac.add(list010);
		    forOneOrgStac.add(list011);
		    forOneOrgStac.add(list012);
		    
		    forOneOrgStac.add(list9);
		    forOneOrgStac.add(list10);
		    forOneOrgStac.add(list11);
		    forOneOrgStac.add(list12);
		    
		    
		    new Reports().loadToExcelResalt2(forOneOrgClinic,forOneOrgDayStac,forOneOrgStac,request, parseorg(paramonepart),paramonepart,forOneOrgClinic2,forOneOrgDayStac2,forOneOrgStac2);
		    
    	}
    	else
    	{
    		// ���������� ��� ���������� ���������� checkbox'��  ����� �����
    	}
	    
    	
    	
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }
        
    
    
    
    
    /*
     * Method being search  organizacion and pass resalt to return
     * 1 - tfoms
     * 2 - ingos
     * 3 - simaz
     * 4 - rosno  
     */
    private String parseorg(ParamOnePart paramonepart)
    {
        int i = 0;	
        int j = 0;
        String orgs="";
    	if(paramonepart.getOnefoms().equals("true")){	i=i+1;	j = 1; orgs =orgs+"tfoms!"; }
    	if(paramonepart.getOneingos().equals("true")){	i=i+1;	j = 2; orgs =orgs+"smo_ingos!";}
    	if(paramonepart.getOnesimaz().equals("true")){	i=i+1;	j = 3; orgs =orgs+"smo_simaz!";}
    	if(paramonepart.getOnerosno().equals("true")){	i=i+1;	j = 4; orgs =orgs+"smo_rosno!";}
    	
    	
    	
    	
    	return orgs;
    }
    
    
    private void  count(List<Object> list)
    {
    	for(int i = 0; i<list.size();i++)
    	{
    		Object t = list.get(0);
    		
    	}
    	
       
    }
    
    
	/**
     * Method for handling file download request from client
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws JRException 
     */
    @RequestMapping(value = "/slcbPartTwoReport",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse secondReport(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamTwoPart paramtwopart) throws IOException, ClassNotFoundException, SQLException, JRException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
    	File otch1 = new File( servletContext.getRealPath("/resources/clinic_report.jrxml"));
    	File file_for_ontch = new File( servletContext.getRealPath("/resources/clinic_report.xls"));
       
    	List<List<SurvayClinicSecondlevel>> forOneOrgClinic = null;
    	
    	if(! parseorgtwoclinic(paramtwopart).equals(""))
    	{
    		bigreportsl.BigReportClinic(paramtwopart,otch1,file_for_ontch);
    	}   
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }
    
  //07.05.2019 ���
    @RequestMapping(value = "/slcbPartTwoReport2",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse secondReport2(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamTwoPart paramtwopart) throws IOException, ClassNotFoundException, SQLException, JRException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
    	File otch1 = new File( servletContext.getRealPath("/resources/clinic_report2.jrxml"));
    	File file_for_ontch = new File( servletContext.getRealPath("/resources/clinic_report2.xls"));
       
    	List<List<SurvayClinicSecondlevel>> forOneOrgClinic = null;
    	
    	if(! parseorgtwoclinic(paramtwopart).equals(""))
    	{
    		bigreportsl.BigReportClinic(paramtwopart,otch1,file_for_ontch);
    	}   
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }
    
//07.05.2019 ���


    
    @RequestMapping(value = "/report_big_clinic", method = RequestMethod.GET)
    public void report_1_1(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        downloadFile(request, response, request.getServletContext().getRealPath("/resources/clinic_report.xls"));
	}
    
  //07.05.2019 ���
    @RequestMapping(value = "/report_big_clinic2", method = RequestMethod.GET)
    public void report_1_12(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        downloadFile(request, response, request.getServletContext().getRealPath("/resources/clinic_report2.xls"));
	}
//07.05.2019 ���




    
    @RequestMapping(value = "/report_big_ds", method = RequestMethod.GET)
    public void report_1_2(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        downloadFile(request, response, request.getServletContext().getRealPath("/resources/ds_report.xls"));
	}
    
    @RequestMapping(value = "/report_big_s", method = RequestMethod.GET)
    public void report_1_3(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        downloadFile(request, response, request.getServletContext().getRealPath("/resources/s_report.xls"));
	}
    
    @RequestMapping(value = "/sldsbPartTwoReport",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse secondReportdsb(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamTwoPart paramtwopart) throws IOException, ClassNotFoundException, SQLException, JRException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
    	File otch1 = new File( servletContext.getRealPath("/resources/ds_report.jrxml"));
    	File file_for_ontch = new File( servletContext.getRealPath("/resources/ds_report.xls"));
       
    	
    	
    	if(! parseorgtwoclinic(paramtwopart).equals(""))
    	{
    		
    		bigreportsl.BigReportClinic(paramtwopart,otch1,file_for_ontch);
    	}   
    	
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }
    
  //13.05.2019 ��� 
    @RequestMapping(value = "/sldsbPartTwoReport2",method = RequestMethod.POST)
       public @ResponseBody nsk.tfoms.survay.util.JsonResponse secondReportdsb2(HttpServletRequest request,HttpServletResponse response,
       		@RequestBody ParamTwoPart paramtwopart) throws IOException, ClassNotFoundException, SQLException, JRException {
       	
       	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
       	File otch1 = new File( servletContext.getRealPath("/resources/ds_report2.jrxml"));
       	File file_for_ontch = new File( servletContext.getRealPath("/resources/ds_report2.xls"));
          
       	
       	
       	if(! parseorgtwoclinic(paramtwopart).equals(""))
       	{
       		
       		bigreportsl.BigReportClinic(paramtwopart,otch1,file_for_ontch);
       	}   
       	
   	    
   	    res.setStatus("SUCCESS");
   	    res.setResult(new String("Ok"));

   		return res; 
           
       }
   //13.05.2019 ���

  //13.05.2019 ���    
    @RequestMapping(value = "/report_big_ds2", method = RequestMethod.GET)
       public void report_1_22(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
           downloadFile(request, response, request.getServletContext().getRealPath("/resources/ds_report2.xls"));
   	}
   //13.05.2019 ���   

  
    
    
    
    
    @RequestMapping(value = "/slsbPartTwoReport",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse secondReportsb(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamTwoPart paramtwopart) throws IOException, ClassNotFoundException, SQLException, JRException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
    	File otch1 = new File( servletContext.getRealPath("/resources/s_report.jrxml"));
    	File file_for_ontch = new File( servletContext.getRealPath("/resources/s_report.xls"));
       
    	
    	
    	if(! parseorgtwoclinic(paramtwopart).equals(""))
    	{
    		
    		bigreportsl.BigReportClinic(paramtwopart,otch1,file_for_ontch);
    	}   
    	
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }
    
  //15.05.2019 ���
    @RequestMapping(value = "/slsbPartTwoReport2",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse secondReportsb2(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamTwoPart paramtwopart) throws IOException, ClassNotFoundException, SQLException, JRException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
    	File otch1 = new File( servletContext.getRealPath("/resources/s_report2.jrxml"));
    	File file_for_ontch = new File( servletContext.getRealPath("/resources/s_report2.xls"));
       
    	
    	
    	if(! parseorgtwoclinic(paramtwopart).equals(""))
    	{
    		
    		bigreportsl.BigReportClinic(paramtwopart,otch1,file_for_ontch);
    	}   
    	
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }
//15.05.2019 ���

  //15.05.2019 ���
    @RequestMapping(value = "/report_big_s2", method = RequestMethod.GET)
    public void report_1_32(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        downloadFile(request, response, request.getServletContext().getRealPath("/resources/s_report2.xls"));
	}
//15.05.2019 ���
   
  //05.06.2019 ���
    @RequestMapping(value = "/slsbPartTwoReport3",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse secondReportsb3(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamTwoPart paramtwopart) throws IOException, ClassNotFoundException, SQLException, JRException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
    	File otch1 = new File( servletContext.getRealPath("/resources/interviewed_lpu.jrxml"));
    	File file_for_ontch = new File( servletContext.getRealPath("/resources/interviewed_lpu.xls"));
       
    	
    	if(! parseorgtwoclinic(paramtwopart).equals(""))
    	{
    		
    		bigreportsl.BigReportClinic(paramtwopart,otch1,file_for_ontch);
    	}   
    	
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }
//05.06.2019 ���

  //05.06.2019 ���
    @RequestMapping(value = "/report_big_s3", method = RequestMethod.GET)
    public void report_1_33(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        downloadFile(request, response, request.getServletContext().getRealPath("/resources/interviewed_lpu.xls"));
	}
//15.06.2019 ���

    

    /*
     * Method being search  organizacion and pass resalt to return
     * 1 - tfoms
     * 2 - ingos
     * 3 - simaz
     * 4 - rosno  
     */
    private String parseorgtwoclinic(ParamTwoPart paramtwopart)
    {
    	List<String> org = paramtwopart.getOrg();
    	String orgs="";
    	
    	for (int i = 0; i < org.size(); i++) {
    		
			if(org.get(i).equals("twotfoms")){	orgs =orgs+"tfoms!";	}
			if(org.get(i).equals("twoingos")){	orgs =orgs+"smo_ingos!";	}
			if(org.get(i).equals("twosimaz")){	orgs =orgs+"smo_simaz!";	}
			if(org.get(i).equals("tworosno")){	orgs =orgs+"smo_rosno!";	}
		}
        
    	return orgs;
    }
    
   
    
	/**
     * Method for handling file download request from client
     */
    @RequestMapping(value = "/secondPartReport",method = RequestMethod.POST)
    public @ResponseBody nsk.tfoms.survay.util.JsonResponse doDownloadtwoRep(HttpServletRequest request,HttpServletResponse response,
    		@RequestBody ParamOnePart paramonepart) throws IOException {
    	
    	nsk.tfoms.survay.util.JsonResponse res = new nsk.tfoms.survay.util.JsonResponse();
       

    	List<List<SurvayClinicSecondlevel>> forOneOrgClinic = null;
    	List<List<DayStacionarSecondlevel>> forOneOrgDayStac = null;
    	List<List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel>> forOneOrgStac = null;
    	
    	//int age_min_1 = 0,age_max_1 = 0,age_min_2 = 0,age_max_2 = 0,age_min_3 = 0,age_min_4 = 0; 
    	//29.03.2019
    	int age_min_0_1 = 0,age_max_0_1 = 0,age_min_0_2 = 0,age_max_0_2 = 0,age_min_0_3 = 0,age_max_0_3 = 0,age_min_0_4 = 0,age_max_0_4 = 0,
        	    age_min_1 = 0,age_max_1 = 0,age_min_2 = 0,age_max_2 = 0,age_min_3 = 0,age_min_4 = 0; 	
    	
    	if (paramonepart.getKids().equals("true") && paramonepart.getAdult().equals("true") ||
    		(	paramonepart.getKids().equals("false") && paramonepart.getAdult().equals("false")	)	
    			){
    		//29.03.2019
    		age_min_0_1 = 0; age_max_0_1 = 13;
    		age_min_0_2 = 0; age_max_0_2 = 13;
    		age_min_0_3 = 14; age_max_0_3 = 17;
    		age_min_0_4 = 14; age_max_0_4 = 17;
    		
    		age_min_1 = 18; age_max_1 = 59;
    		age_min_2 = 18; age_max_2 = 54;
    		age_min_3 = 60;
    		age_min_4 = 55;
    		
    	}else if(paramonepart.getKids().equals("true") && paramonepart.getAdult().equals("false")){
    		//29.03.2019
    		age_min_0_1 = 0; age_max_0_1 = 13;
    		age_min_0_2 = 0; age_max_0_2 = 13;
    		age_min_0_3 = 14; age_max_0_3 = 17;
    		age_min_0_4 = 14; age_max_0_4 = 17;
    		//04.04.2019
    		age_min_1 = 10000;
    		age_min_2 = 10000;
    		age_min_3 = 10000;
    		age_min_4 = 10000;
    		//
    		
    		
    	/*	age_min_1 = 0; age_max_1 = 18;
    		age_min_2 = 0; age_max_2 = 18;
    		age_min_3 = 10000;
    		age_min_4 = 10000;*/
    		
    	}else if(paramonepart.getKids().equals("false") && paramonepart.getAdult().equals("true")){
    		//29.03.2019
    		/*age_min_0_1 = 0; age_max_0_1 = 13;
    		age_min_0_2 = 0; age_max_0_2 = 13;
    		age_min_0_3 = 14; age_max_0_3 = 17;
    		age_min_0_4 = 14; age_max_0_4 = 17;*/
    		//04.04.2019
    		age_min_0_1 = 10000;
    		age_min_0_2 = 10000;
    		age_min_0_3 = 10000;
    		age_min_0_4 = 10000;
    		//
    		
    		age_min_1 = 18; age_max_1 = 59;
    		age_min_2 = 18; age_max_2 = 54;
    		age_min_3 = 60;
    		age_min_4 = 55;
    		   		
    	}
    	
    	
    	if(! parseorg(paramonepart).equals(""))
    	{
    		//===================Clinic================================
    		//29.03.2019
		    List<SurvayClinicSecondlevel> list01 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
		    List<SurvayClinicSecondlevel> list02 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
		    List<SurvayClinicSecondlevel> list03 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
		    List<SurvayClinicSecondlevel> list04 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
    		
		    List<SurvayClinicSecondlevel> list1 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
		    List<SurvayClinicSecondlevel> list2 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
		    List<SurvayClinicSecondlevel> list3 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
		    List<SurvayClinicSecondlevel> list4 = dssl.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());
		    
		    forOneOrgClinic = new ArrayList<List<SurvayClinicSecondlevel>>();
		    //29.03.2019
		    forOneOrgClinic.add(list01);
		    forOneOrgClinic.add(list02);
		    forOneOrgClinic.add(list03);
		    forOneOrgClinic.add(list04);
		    
		    forOneOrgClinic.add(list1);
		    forOneOrgClinic.add(list2);
		    forOneOrgClinic.add(list3);
		    forOneOrgClinic.add(list4);
		    
		    //=============================DayStacionar===============================
		    //29.03.2019
		    List<DayStacionarSecondlevel> list05 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
		    List<DayStacionarSecondlevel> list06 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
		    List<DayStacionarSecondlevel> list07 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
		    List<DayStacionarSecondlevel> list08 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
		    
		    List<DayStacionarSecondlevel> list5 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
		    List<DayStacionarSecondlevel> list6 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
		    List<DayStacionarSecondlevel> list7 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
		    List<DayStacionarSecondlevel> list8 = DayStacionarSecondlevel.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());
		    
		    forOneOrgDayStac = new ArrayList<List<DayStacionarSecondlevel>>();
		    //29.03.2019
		    forOneOrgDayStac.add(list05);
		    forOneOrgDayStac.add(list06);
		    forOneOrgDayStac.add(list07);
		    forOneOrgDayStac.add(list08);
		    
		    forOneOrgDayStac.add(list5);
		    forOneOrgDayStac.add(list6);
		    forOneOrgDayStac.add(list7);
		    forOneOrgDayStac.add(list8);
		    
		    
		    //=========================================Stacionar==========================
		    //29.032019
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list09 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_1, age_max_0_1,paramonepart.getLpu());
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list010 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_2, age_max_0_2,paramonepart.getLpu());
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list011 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_3, age_max_0_3,paramonepart.getLpu());
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list012 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_0_4, age_max_0_4,paramonepart.getLpu());
		    
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list9 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_1, age_max_1,paramonepart.getLpu());
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list10 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_2, age_max_2,paramonepart.getLpu());
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list11 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_3, 10000,paramonepart.getLpu());
		    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> list12 = sslservice.getReport(paramonepart.getDatestart(), paramonepart.getDateend(), parseorg(paramonepart), "�������",age_min_4, 10000,paramonepart.getLpu());

		    forOneOrgStac = new ArrayList<List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel>>();
		    //29.03.2019
		    forOneOrgStac.add(list09);
		    forOneOrgStac.add(list010);
		    forOneOrgStac.add(list011);
		    forOneOrgStac.add(list012);
		    
		    forOneOrgStac.add(list9);
		    forOneOrgStac.add(list10);
		    forOneOrgStac.add(list11);
		    forOneOrgStac.add(list12);
		    
		    
		    new Reports().loadToExcelSLpg(forOneOrgClinic,forOneOrgDayStac,forOneOrgStac,request, parseorg(paramonepart),paramonepart);
		    
    	}
    	else
    	{
    		// ���������� ��� ���������� ���������� checkbox'��  ����� �����
    	}

	    
    	
    	
	    
	    res.setStatus("SUCCESS");
	    res.setResult(new String("Ok"));

		return res; 
        
    }  
    
    
    private void downloadFile(HttpServletRequest request,HttpServletResponse response, String filePath) throws FileNotFoundException,IOException {
		ServletContext context = request.getServletContext();
        String appPath = context.getRealPath("");
        System.out.println("appPath = " + appPath);
 
        //String fullPath = appPath + filePath ;      
        //String fullPath = "D:\\Appeals3\\Appeal" + filePath ;
        String fullPath = filePath ;
        File downloadFile = new File(fullPath);
        FileInputStream inputStream = new FileInputStream(downloadFile);
         
        String mimeType = context.getMimeType(fullPath);
        if (mimeType == null) {
            mimeType = "application/octet-stream";
        }
        System.out.println("MIME type: " + mimeType);
 
        response.setContentType(mimeType);
        response.setContentLength((int) downloadFile.length());
 
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"",
                downloadFile.getName());
        response.setHeader(headerKey, headerValue);
 
        OutputStream outStream = response.getOutputStream();
 
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
 
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
 
        inputStream.close();
        outStream.close();
	}    
    
    
    
    
    
    
    
}
