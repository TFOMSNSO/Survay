package nsk.tfoms.survay.service;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nsk.tfoms.survay.entity.SurvayClinic;

@Service
public class ClinicService {
  
  @PersistenceContext
  private EntityManager em;
  
  @Transactional
  public List<SurvayClinic> getAll(String userp) {
    List<SurvayClinic> result = em.createQuery("SELECT p FROM SurvayClinic p WHERE p.polzovatel =:userp ORDER BY p.id DESC", SurvayClinic.class)
    		.setParameter("userp", userp)
    		.getResultList();
    return result;
  }
  
  @Transactional
  public List<SurvayClinic> getAllbetween(String d1, String d2,String userp) {
    List<SurvayClinic> result = em.createQuery("SELECT p FROM SurvayClinic p WHERE p.polzovatel =:userp AND p.dataResp BETWEEN :d1 AND :d2 ORDER BY p.id DESC", SurvayClinic.class)
    .setParameter("d1", d1)  
    .setParameter("d2", d2)  
    .setParameter("userp", userp)
    .getResultList();
    return result;
  }
  
  @Transactional
  public List<SurvayClinic> getOnId(BigDecimal id,String userp) {
    List<SurvayClinic> result = em.createQuery("SELECT p FROM SurvayClinic p WHERE p.polzovatel =:userp AND p.id=:id", SurvayClinic.class)
    .setParameter("id", id)  
    .setParameter("userp", userp)
    .getResultList();
    return result;
  }
  
  @Transactional
  public void add(SurvayClinic p) {
	  
	  if (p.getId() == null) {this.em.persist(p);} else {this.em.merge(p);}
  }
  
  /*
   * block querys for reports дата ограничение на возраст и пол
   */

  @Transactional
  public List<SurvayClinic> getReport(String d1, String d2,String userp,String sex,Integer age_min,Integer age_max,String lpu) {
	  String agefor = "p.age between "+age_min+" and "+age_max+" ";
	  if((sex.equals("Мужской") && age_min >= 60) || (sex.equals("Женский") && age_min >= 55)){	agefor = "p.age>= "+age_min+" ";		}
	  
	  String paste="p.mo=:lpu";
	  // enter ALL we will passing in query NOT "ALL"(p.mo!=:lpu) because in db no records with  name 'ALL' => so we get all records 
	  if(lpu.equals("Все"))	{	paste="p.mo!=:lpu";	}
	  
	  String []mas = userp.split("!");
	  String name="(";
	  if(mas.length == 1){	userp = mas[0]; name = "p.polzovatel =:userp";}
	  if(mas.length > 1){
		  for (int i = 0; i < mas.length-1; i++) {
			  name = name + "p.polzovatel ='"+mas[i]+"' or ";
		  }
		  userp = mas[mas.length-1]; name = name + "p.polzovatel =:userp)";
	  }
	  
    List<SurvayClinic> result = em.createQuery("SELECT p FROM SurvayClinic p WHERE "+name+" and "+paste+" AND p.sex=:sex AND "+agefor+" AND (p.dataResp BETWEEN :d1 AND :d2)  ORDER BY p.id DESC", SurvayClinic.class)
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
