package nsk.tfoms.survay.service;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import nsk.tfoms.survay.entity.SurvayDaystacionar;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DayStacionarService {

	@PersistenceContext
	  private EntityManager em;
	  
	  @Transactional
	  public List<SurvayDaystacionar> getAll(String userp) {
	    List<SurvayDaystacionar> result = em.createQuery("SELECT p FROM SurvayDaystacionar p WHERE p.polzovateldaystacionar =:userp ORDER BY p.id DESC", SurvayDaystacionar.class)
	    		.setParameter("userp", userp)
	    		.getResultList();
	    return result;
	  }
	  
	  @Transactional
	  public void add(SurvayDaystacionar p) {
		  
		  if (p.getId() == null) {this.em.persist(p);} else {this.em.merge(p);}
	  }

	  @Transactional
	  public List<SurvayDaystacionar> getOnId(BigDecimal id,String userp) {
	    List<SurvayDaystacionar> result = em.createQuery("SELECT p FROM SurvayDaystacionar p WHERE p.polzovateldaystacionar =:userp AND p.id=:id", SurvayDaystacionar.class)
	    .setParameter("id", id)  
	    .setParameter("userp", userp)
	    .getResultList();
	    return result;
	  }
	  
	  @Transactional
	  public List<SurvayDaystacionar> getAllbetween(String d1, String d2,String userp) {
	    List<SurvayDaystacionar> result = em.createQuery("SELECT p FROM SurvayDaystacionar p WHERE p.polzovateldaystacionar =:userp AND p.dataRespDaystac BETWEEN :d1 AND :d2 ORDER BY p.id DESC", SurvayDaystacionar.class)
	    .setParameter("d1", d1)  
	    .setParameter("d2", d2)  
	    .setParameter("userp", userp)
	    .getResultList();
	    return result;
	  }
	  
	  
	  /*
	   * block querys for reports дата ограничение на возраст и пол
	   */

	  @Transactional
	  public List<SurvayDaystacionar> getReport(String d1, String d2,String userp,String sex,Integer age_min,Integer age_max,String lpu) {
		  String agefor = "p.ageDaystac between "+age_min+" and "+age_max+" ";;
		  if((sex.equals("Мужской") && age_min >= 60) || (sex.equals("Женский") && age_min >= 55)){	agefor = "p.ageDaystac>= "+age_min+" ";		}
		  
		  String paste="p.moDayStac=:lpu";
		  // enter ALL we will passing in query NOT "ALL"(p.mo!=:lpu) because in db no records with  name 'ALL' => so we get all records 
		  if(lpu.equals("Все"))	{	paste="p.moDayStac!=:lpu";	}
		  
		  String []mas = userp.split("!");
		  String name="(";
		  if(mas.length == 1){	userp = mas[0]; name = "p.polzovateldaystacionar =:userp";}
		  if(mas.length > 1){
			  for (int i = 0; i < mas.length-1; i++) {
				  name = name + "p.polzovateldaystacionar ='"+mas[i]+"' or ";
			  }
			  userp = mas[mas.length-1]; name = name + "p.polzovateldaystacionar =:userp)";
		  }
		  
	    List<SurvayDaystacionar> result = em.createQuery("SELECT p FROM SurvayDaystacionar p WHERE "+name+" and "+paste+" AND p.sexDaystac=:sex AND "+agefor+" AND (p.dataRespDaystac BETWEEN :d1 AND :d2)  ORDER BY p.id DESC", SurvayDaystacionar.class)
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
