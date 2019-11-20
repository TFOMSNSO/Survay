package nsk.tfoms.survay.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nsk.tfoms.survay.controllers.StacionarSecondLevel;
import nsk.tfoms.survay.entity.SurvayStacionar;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.DayStacionarSecondlevel;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.QuestionManyDayStacionar;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SCDSSLSec15;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SCDSSLSec2;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SCDSSLSec25;
import nsk.tfoms.survay.entity.secondlevel.DayStacionar.SurvayClinicDayStacionarSec1;
import nsk.tfoms.survay.entity.secondlevel.Stacionar.QuestionManyStacionar;
import nsk.tfoms.survay.entity.secondlevel.Stacionar.SCSSLSec1;
import nsk.tfoms.survay.entity.secondlevel.Stacionar.SCSSLSec2;
import nsk.tfoms.survay.entity.secondlevel.Stacionar.SCSSLSec3;
import nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel;
import nsk.tfoms.survay.pojo.SenderDSSL;
import nsk.tfoms.survay.pojo.SenderSSL;
import nsk.tfoms.survay.pojo.WrapManyDSSL;
import nsk.tfoms.survay.pojo.WrapManySSL;

@Service
public class SSLservice {
  
  @PersistenceContext
  private EntityManager em;
  
  @SuppressWarnings("unchecked")
  @Transactional
  public List<StacionarSecondlevel> getAll(String userp) {
	
	 Query query = em.createQuery("SELECT p FROM StacionarSecondlevel p WHERE p.polzSecondlSls=:userp ORDER BY p.id DESC");
	 query.setParameter("userp", userp);
	 
	 return query.getResultList();
  }
  
  
  

  
  @Transactional
  public void create(SenderSSL sender) {
	  
	  StacionarSecondlevel survay = sender.getSurvay1();
	  SCSSLSec2 sec2 = sender.getSurvay3();
	  SCSSLSec3 sec3 = sender.getSurvay4();
	  SCSSLSec1 sec1 =  sender.getSurvay2();
	  //SCDSSLSec15 sec15 = sender.getSurvay4();
	  //SCDSSLSec25 sec25 = sender.getSurvay5();
	  WrapManySSL wrap = sender.getSurvay5();

	  
	  Set<QuestionManyStacionar> ls = new HashSet<QuestionManyStacionar>();
	  QuestionManyStacionar temp;
      List<List<String>> listCount = new ArrayList<List<String>>();
      
      List<String> getwrapQuestion13 = wrap.wrapQuestion13();
      listCount.add(getwrapQuestion13);
      List<String> getwrapQuestion15 = wrap.wrapQuestion15();
      listCount.add(getwrapQuestion15);
      List<String> getwrapQuestion17 = wrap.wrapQuestion17();
      listCount.add(getwrapQuestion17);
      List<String> getwrapQuestion18 = wrap.wrapQuestion18();
      listCount.add(getwrapQuestion18);
      List<String> getwrapQuestion20 = wrap.wrapQuestion20();
      listCount.add(getwrapQuestion20);
      List<String> getwrapQuestion21 = wrap.wrapQuestion21();
      listCount.add(getwrapQuestion21);
      List<String> getwrapQuestion23 = wrap.wrapQuestion23();
      listCount.add(getwrapQuestion23);

      
      Comparator<List<String>> comparator = new Comparator<List<String>>() {
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return o2.size() - o1.size();
			}
  		};
  	
  		Collections.sort(listCount, comparator);
  	
	  	for(int i = 1; i<listCount.get(0).size(); i++)
		{
	  		temp = new QuestionManyStacionar();
	  		if(listCount.get(0).get(0).equals("question13")) temp.setQuestionS13many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question15")) temp.setQuestionS15many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question17")) temp.setQuestionS17many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question18")) temp.setQuestionS18many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question20")) temp.setQuestionS20many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question21")) temp.setQuestionS21many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question23")) temp.setQuestionS23many(listCount.get(0).get(i));
	  		
	  		if(listCount.get(1).size() > i)	{
    			
    			if(listCount.get(1).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(1).get(i));
    		}
	  		
	  		if(listCount.get(2).size() > i)	{
    			
    			if(listCount.get(2).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(2).get(i));
    		}
	  		
	  		if(listCount.get(3).size() > i)	{
    			
    			if(listCount.get(3).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(3).get(i));
    		}
	  		
	  		if(listCount.get(4).size() > i)	{
    			
    			if(listCount.get(4).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(4).get(i));
    		}
	  		if(listCount.get(5).size() > i)	{
    			
    			if(listCount.get(5).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(5).get(i));
    		}
	  		if(listCount.get(6).size() > i)	{
    			
    			if(listCount.get(6).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(6).get(i));
    		}
	  		
	  		
	  		ls.add(temp);
    		temp.setStacionarsecondlevel(survay);
    		this.em.persist(temp);
		}
	        
      
      sec1.setStacionarsecondlevel(survay);
      sec2.setStacionarsecondlevel(survay);
      sec3.setStacionarsecondlevel(survay);
      
      survay.setManySSL(ls);
      survay.setScsslsec1(sec1);
	  survay.setScsslsec2(sec2);
	  survay.setScsslsec3(sec3);
	  this.em.persist(survay);
	  
  }
  

  @Transactional
  public List<StacionarSecondlevel> getOnId(int id,String userp) {
	  
    List<StacionarSecondlevel> result = em.createQuery("SELECT p FROM StacionarSecondlevel p WHERE p.polzSecondlSls=:userp AND p.id=:id", StacionarSecondlevel.class)
    .setParameter("id", id)  
    .setParameter("userp", userp)
    .getResultList();
    return result;
  } 
	


  @Transactional
  public void delete(int id) {
	  QuestionManyStacionar questionmanyds = em.find(QuestionManyStacionar.class, id);
	  em.remove(questionmanyds);
  } 
  
  
  @Transactional
  public void edit(SenderSSL sender,HttpServletRequest request) {
	  
	  	StacionarSecondlevel survay = sender.getSurvay1();
	  /*
		  * Удаляем прежние данные из табдлицы QuestionManyClinic
		  * а далее в нее заливаем новые (отредактированные) 
		  */
		 List<StacionarSecondlevel> f = getOnId(survay.getId(),request.getUserPrincipal().getName());
		 Set<QuestionManyStacionar> ss = f.get(0).getManySSL();
		 Iterator<QuestionManyStacionar>  it = ss.iterator();
		 while(it.hasNext()){
			 QuestionManyStacionar qq = it.next();
			 qq.setStacionarsecondlevel(null);
			 this.em.merge(qq);
			 delete(qq.getIdQuestionManystacionar());
		 }
		 //=========================================================================
	  
	  
	  
	  SCSSLSec2 sec2 = sender.getSurvay3();
	  sec2.setIdSurvayClinicSSLSec2(sender.getSurvay1().getId());
	  SCSSLSec1 sec1 =  sender.getSurvay2();
	  sec1.setIdSCSSLSec1(sender.getSurvay1().getId());
	  SCSSLSec3 sec15 = sender.getSurvay4();
	  sec15.setIdSurvayClinicSSLSec3(sender.getSurvay1().getId());
	  
	  
	  WrapManySSL wrap = sender.getSurvay5();

	  
	  Set<QuestionManyStacionar> ls = new HashSet<QuestionManyStacionar>();
	  QuestionManyStacionar temp;
      List<List<String>> listCount = new ArrayList<List<String>>();
      
      List<String> getwrapQuestion13 = wrap.wrapQuestion13();
      listCount.add(getwrapQuestion13);
      List<String> getwrapQuestion15 = wrap.wrapQuestion15();
      listCount.add(getwrapQuestion15);
      List<String> getwrapQuestion17 = wrap.wrapQuestion17();
      listCount.add(getwrapQuestion17);
      List<String> getwrapQuestion18 = wrap.wrapQuestion18();
      listCount.add(getwrapQuestion18);
      List<String> getwrapQuestion20 = wrap.wrapQuestion20();
      listCount.add(getwrapQuestion20);
      List<String> getwrapQuestion21 = wrap.wrapQuestion21();
      listCount.add(getwrapQuestion21);
      List<String> getwrapQuestion23 = wrap.wrapQuestion23();
      listCount.add(getwrapQuestion23);
      
      Comparator<List<String>> comparator = new Comparator<List<String>>() {
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return o2.size() - o1.size();
			}
  		};
  	
  		Collections.sort(listCount, comparator);
  	
	  	for(int i = 1; i<listCount.get(0).size(); i++)
		{

	  		temp = new QuestionManyStacionar();
	  		if(listCount.get(0).get(0).equals("question13")) temp.setQuestionS13many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question15")) temp.setQuestionS15many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question17")) temp.setQuestionS17many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question18")) temp.setQuestionS18many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question20")) temp.setQuestionS20many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question21")) temp.setQuestionS21many(listCount.get(0).get(i));
	  		if(listCount.get(0).get(0).equals("question23")) temp.setQuestionS23many(listCount.get(0).get(i));
	  		
	  		if(listCount.get(1).size() > i)	{
    			
    			if(listCount.get(1).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(1).get(i));
    		}
	  		
	  		if(listCount.get(2).size() > i)	{
    			
    			if(listCount.get(2).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(2).get(i));
    			if(listCount.get(2).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(2).get(i));
    		}
	  		
	  		if(listCount.get(3).size() > i)	{
    			
    			if(listCount.get(3).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(3).get(i));
    		}
	  		
	  		if(listCount.get(4).size() > i)	{
    			
    			if(listCount.get(4).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(4).get(i));
    		}
	  		if(listCount.get(5).size() > i)	{
    			
    			if(listCount.get(5).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(5).get(i));
    		}
	  		if(listCount.get(6).size() > i)	{
    			
    			if(listCount.get(6).get(0).equals("question13"))	temp.setQuestionS13many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question15"))	temp.setQuestionS15many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question17"))	temp.setQuestionS17many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question18")) 	temp.setQuestionS18many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question20")) 	temp.setQuestionS20many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question21")) 	temp.setQuestionS21many(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question23")) 	temp.setQuestionS23many(listCount.get(6).get(i));
    		}
	  		
	  		
	  		ls.add(temp);
    		temp.setStacionarsecondlevel(survay);
    		//this.em.persist(temp);
		
	  		
		}
	        
      
      sec1.setStacionarsecondlevel(survay);
      sec2.setStacionarsecondlevel(survay);
      sec15.setStacionarsecondlevel(survay);
      
      survay.setManySSL(ls);
      survay.setScsslsec3(sec15);
      survay.setScsslsec2(sec2);
      survay.setScsslsec1(sec1);
	  
	  
	  this.em.merge(survay);
	  
  }
  
  
  @Transactional
  public List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> getReport(String d1, String d2,String userp,String sex,Integer age_min,Integer age_max,String lpu) {
	  String agefor = "p.ageSls between "+age_min+" and "+age_max+" ";
	  if((sex.equals("Мужской") && age_min >= 60) || (sex.equals("Женский") && age_min >= 55)){	agefor = "p.ageSls>= "+age_min+" ";		}
	  
	  String paste="p.moSLS=:lpu";
	  // enter ALL we will passing in query NOT "ALL"(p.mo!=:lpu) because in db no records with  name 'ALL' => so we get all records 
	  if(lpu.equals("Все"))	{	paste="p.moSLS!=:lpu";	}
	  
	  String []mas = userp.split("!");
	  String name="(";
	  if(mas.length == 1){	userp = mas[0]; name = "p.polzSecondlSls =:userp";}
	  if(mas.length > 1){
		  for (int i = 0; i < mas.length-1; i++) {
			  name = name + "p.polzSecondlSls ='"+mas[i]+"' or ";
		  }
		  userp = mas[mas.length-1]; name = name + "p.polzSecondlSls =:userp)";
	  }
	  
    List<nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel> result = em.createQuery("SELECT p FROM nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel p WHERE "+name+" and "+paste+" AND p.sexSls=:sex AND "+agefor+" AND (p.dataRespSls BETWEEN to_date(:d1,'dd.mm.yyyy') AND to_date(:d2,'dd.mm.yyyy'))  ORDER BY p.id DESC", nsk.tfoms.survay.entity.secondlevel.Stacionar.StacionarSecondlevel.class)
    .setParameter("d1", d1)  
    .setParameter("d2", d2)  
    .setParameter("userp", userp)
    .setParameter("lpu", lpu)
    .setParameter("sex", sex)
    //.setParameter("age", age)
    .getResultList();
    return result;
  }

  
  
  
}