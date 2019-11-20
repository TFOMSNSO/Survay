package nsk.tfoms.survay.service;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import nsk.tfoms.survay.entity.SurvayStacionar;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StacionarService {

	@PersistenceContext
	  private EntityManager em;
	  
	  @Transactional
	  public List<SurvayStacionar> getAll(String userp) {
	    List<SurvayStacionar> result = em.createQuery("SELECT p FROM SurvayStacionar p WHERE p.polzovatelonestac =:userp ORDER BY p.id DESC", SurvayStacionar.class)
	    		.setParameter("userp", userp)
	    		.getResultList();
	    return result;
	  }
	  
	  @Transactional
	  public void add(SurvayStacionar p) {
		  
		  if (p.getId() == null) {this.em.persist(p);} else {this.em.merge(p);}
	  }

	  @Transactional
	  public List<SurvayStacionar> getOnId(BigDecimal id,String userp) {
	    List<SurvayStacionar> result = em.createQuery("SELECT p FROM SurvayStacionar p WHERE p.polzovatelonestac =:userp AND p.id=:id", SurvayStacionar.class)
	    .setParameter("id", id)  
	    .setParameter("userp", userp)
	    .getResultList();
	    return result;
	  }
	  
	  @Transactional
	  public List<SurvayStacionar> getAllbetween(String d1, String d2,String userp) {
	    List<SurvayStacionar> result = em.createQuery("SELECT p FROM SurvayStacionar p WHERE p.polzovatelonestac =:userp AND p.dataRespStac BETWEEN :d1 AND :d2 ORDER BY p.id DESC", SurvayStacionar.class)
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
	  public List<SurvayStacionar> getReport(String d1, String d2,String userp,String sex,Integer age_min,Integer age_max,String lpu) {
		  String agefor = "p.ageStac between "+age_min+" and "+age_max+" ";;
		  if((sex.equals("Мужской") && age_min >= 60) || (sex.equals("Женский") && age_min >= 55)){	agefor = "p.ageStac>= "+age_min+" ";		}
		  
		  String paste="p.moonestac=:lpu";
		  // enter ALL we will passing in query NOT "ALL"(p.mo!=:lpu) because in db no records with  name 'ALL' => so we get all records 
		  if(lpu.equals("Все"))	{	paste="p.moonestac!=:lpu";	}
		  
		  String []mas = userp.split("!");
		  String name="(";
		  if(mas.length == 1){	userp = mas[0]; name = "p.polzovatelonestac =:userp";}
		  if(mas.length > 1){
			  for (int i = 0; i < mas.length-1; i++) {
				  name = name + "p.polzovatelonestac ='"+mas[i]+"' or ";
			  }
			  userp = mas[mas.length-1]; name = name + "p.polzovatelonestac =:userp)";
		  }
		  
	    List<SurvayStacionar> result = em.createQuery("SELECT p FROM SurvayStacionar p WHERE "+name+" and "+paste+" AND p.sexStac=:sex AND "+agefor+" AND (p.dataRespStac BETWEEN :d1 AND :d2)  ORDER BY p.id DESC", SurvayStacionar.class)
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
