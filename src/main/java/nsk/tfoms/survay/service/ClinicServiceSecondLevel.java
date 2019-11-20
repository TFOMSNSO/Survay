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

import nsk.tfoms.survay.entity.SurvayClinic;
import nsk.tfoms.survay.entity.secondlevel.Clinic.QuestionManyClinic;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSec1;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSec2;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSec25;
import nsk.tfoms.survay.entity.secondlevel.Clinic.SurvayClinicSecondlevel;
import nsk.tfoms.survay.pojo.Sender;
import nsk.tfoms.survay.pojo.WrapMany;

@Service
public class ClinicServiceSecondLevel {
  
  @PersistenceContext
  private EntityManager em;
  
  @SuppressWarnings("unchecked")
  @Transactional
  public List<SurvayClinicSecondlevel> getAll(String userp) {
	
	 Query query = em.createQuery("SELECT p FROM SurvayClinicSecondlevel p WHERE p.polzovatelSecondlevel=:userp ORDER BY p.id DESC");
	 query.setParameter("userp", userp);
	 
	 return query.getResultList();
  }
  
  @Transactional
  public List<SurvayClinicSecondlevel> getOnId(int id,String userp) {
	  
    List<SurvayClinicSecondlevel> result = em.createQuery("SELECT p FROM SurvayClinicSecondlevel p WHERE p.polzovatelSecondlevel =:userp AND p.id=:id", SurvayClinicSecondlevel.class)
    .setParameter("id", id)  
    .setParameter("userp", userp)
    .getResultList();
    return result;
  }
  
  @Transactional
  public void add(SurvayClinicSecondlevel p) {
	  
	  if (p.getId() == null) {this.em.persist(p);} else {this.em.merge(p);}
  }
  
  @Transactional
  public void delete(int id) {
	  QuestionManyClinic questionmanyclinic = em.find(QuestionManyClinic.class, id);
	  em.remove(questionmanyclinic);
  }
  
  @Transactional
  public void create(Sender sender) {
	  
	
	  /* Дано: В тесте есть 5-7 вопросов. На каждый вопрос может быть несколько ответов
	   * Проблема: При добавлении в базу добовляется только один вопрос т.е.
	   * 
	   * id записи	|	Столбец2	|	Столбец3	|	id ключа	|
	   * 123			запись1							789
	   * 124			запись2							789
	   * 125			запись3							789
	   * 126							запись1			789
	   * 127							запись2			789
	   * 128							запись3			789
	   * 
	   * >>>>>>>>>>>>>>>>>>>А НАДО
	   * 
	   * id записи	|	Столбец2	|	Столбец3	|	id ключа	|
	   * 123			запись1			запись1			789
	   * 124			запись2			запись2			789
	   * 125			запись3			запись3			789
	   * 
	   * Решение:
	   * 	1.	Находим вопрос с наибольшим количеством ответов. Сколько ответов столько созданим строк в базе 

	   * 
	   *  								|	вопрос1/строка	|	вопрос2		|	вопрос3	|
	   *  new QuestionManyClinic()			set1(текст1)	 set2(текст2)	  se3t(текст3)
	   *  new QuestionManyClinic()			set1(текст1)	 set2(текст2)	  		
	   *  new QuestionManyClinic()			set1(текст1)	 	  
	   *  
	   */
	  
	  SurvayClinicSecondlevel survay = sender.getSurvay1();
	  WrapMany mod = sender.getSurvay5();
	  SurvayClinicSec2 sec2 = sender.getSurvay3();
	  SurvayClinicSec1 sec1 =  sender.getSurvay2();
	  SurvayClinicSec25 sec25 = sender.getSurvay4();
	  
	  /*
	   * создаем QuestionManyClinic и присваеваем из WrapMany не пустые значения одного поля
	   * т.е. а анкете (по дному вопросу) было проставлено 3 галочки...сервер обворачивает(собирает все несколько вариантов  этого  вопроса(это происходит в классе WrapMany))
	   *  и уже здесь, в цикле каждый варианты ответа на один вопрос добовляется в базу по правилам добовления one to many
	   */
	  Set<QuestionManyClinic> ls = new HashSet<QuestionManyClinic>();
      QuestionManyClinic temp;
      
      List<List<String>> listCount = new ArrayList<List<String>>();
      
      List<String> getwrapQuestion2 = mod.wrapQuestion2();
      listCount.add(getwrapQuestion2);
      List<String> getwrapQuestion6_1 = mod.wrapQuestion6_1();
      listCount.add(getwrapQuestion6_1);
      List<String> getwrapQuestion6_2 = mod.wrapQuestion6_2();
      listCount.add(getwrapQuestion6_2);
      List<String> getwrapQuestion24 = mod.wrapQuestion24();
      listCount.add(getwrapQuestion24);
      List<String> getwrapQuestion26 = mod.wrapQuestion26();
      listCount.add(getwrapQuestion26);
      List<String> getwrapQuestion28 = mod.wrapQuestion28();
      listCount.add(getwrapQuestion28);
      List<String> getwrapQuestion29 = mod.wrapQuestion29();
      listCount.add(getwrapQuestion29);
      List<String> getwrapQuestion31 = mod.wrapQuestion31();
      listCount.add(getwrapQuestion31);
      List<String> getwrapQuestion32 = mod.wrapQuestion32();
      listCount.add(getwrapQuestion32);
      
      Comparator<List<String>> comparator = new Comparator<List<String>>() {
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return o2.size() - o1.size();
			}
    	};
    	
    	Collections.sort(listCount, comparator); 
    	
    	// количество строк в бд будет соответствовать количеству ответов на  вопрос (который выбран по принципу максимального киличества ответов в каждом вопросе) 
    	for(int i = 1; i<listCount.get(0).size(); i++)
    	{
    		// создаем объект (количество объектов зависит от максимально-отвеченного относительно вариантов ответа, вопроса)
    		temp = new QuestionManyClinic();
    		
    		/* подставляем из отсортированного listCount вопрос с наибольшим количеством ответов (в вопросе может быть неслько ответов)
    		 * определив какой вопрос с наибольши количеством  по listCount.get(0).get(0).equals("question2") и  определяем ему соответствующий сеттер
    		 * i=1 так первым элементом идет ключ - название вопроса: question2 или question6_1 или question6_2
    		 */
    		if(listCount.get(0).get(0).equals("question2")) temp.setQuestion2_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(0).get(i));
    		
    		// если вариантов ответа в вопросе отсортированном в позиции 1 больше чем элемент который требуется
    		// т.е. в массиве 0	1 (2 элемента) а i=2...то будет исключение
    		if(listCount.get(1).size() > i)	{
    			
    			if(listCount.get(1).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(1).get(i));
    		}
    		
			if(listCount.get(2).size() > i)	{
			    			
			    			if(listCount.get(2).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(2).get(i));
			    		}
			
			if(listCount.get(3).size() > i)	{
    			
    			if(listCount.get(3).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(3).get(i));
    		}
			
			if(listCount.get(4).size() > i)	{
    			
    			if(listCount.get(4).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(4).get(i));
    		}
			
			if(listCount.get(5).size() > i)	{
    			
    			if(listCount.get(5).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(5).get(i));
    		}
			
			if(listCount.get(6).size() > i)	{
    			
    			if(listCount.get(6).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(6).get(i));
    		}
    		
			
			if(listCount.get(7).size() > i)	{
    			
    			if(listCount.get(7).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(7).get(i));
    		}
			
			if(listCount.get(8).size() > i)	{
    			
    			if(listCount.get(8).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(8).get(i));
    		}
    		
    		ls.add(temp);
    		temp.setSurvayClinicSecondlevel(survay);
    		this.em.persist(temp);
    		
    	}
      
      
      sec1.setSurvayClinicSecondlevel(survay);
      sec2.setSurvayClinicSecondlevel(survay);
      sec25.setSurvayClinicSecondlevel(survay);
      
      survay.setQuestion_many(ls);
      survay.setSurvayClinicSec1(sec1);
      survay.setSurvayClinicSec2(sec2);
      survay.setSurvayClinicSec25(sec25);
	  
	  
	  this.em.persist(survay);
	  
  }
  
  
  @Transactional
  public void edit(Sender sender,HttpServletRequest request) {
	  
	  SurvayClinicSecondlevel survay = sender.getSurvay1();
	 /*
	  * Удаляем прежние данные из табдлицы QuestionManyClinic
	  * а далее в нее заливаем новые (отредактированные) 
	  */
	 List<SurvayClinicSecondlevel> f = getOnId(survay.getId(),request.getUserPrincipal().getName());
	 Set<QuestionManyClinic> ss = f.get(0).getQuestion_many();
	 Iterator<QuestionManyClinic>  it = ss.iterator();
	 while(it.hasNext()){
		 QuestionManyClinic qq = it.next();
		 qq.setSurvayClinicSecondlevel(null);
		 this.em.merge(qq);
		 delete(qq.getIdQuestionManyClinic());
	 }
	 //=========================================================================
	 
	  WrapMany mod = sender.getSurvay5();
	  SurvayClinicSec2 sec2 = sender.getSurvay3();
	  sec2.setIdSurvayClinicSec2(survay.getId());
	  
	  SurvayClinicSec1 sec1 =  sender.getSurvay2();
	  sec1.setIdSurvayClinicSec1(survay.getId());
	  
	  SurvayClinicSec25 sec25 = sender.getSurvay4();
	  sec25.setIdSurvayClinicSec25(survay.getId());
	  
	  Set<QuestionManyClinic> ls = new HashSet<QuestionManyClinic>();
      QuestionManyClinic temp;
      
      List<List<String>> listCount = new ArrayList<List<String>>();
      
      List<String> getwrapQuestion2 = mod.wrapQuestion2();
      listCount.add(getwrapQuestion2);
      List<String> getwrapQuestion6_1 = mod.wrapQuestion6_1();
      listCount.add(getwrapQuestion6_1);
      List<String> getwrapQuestion6_2 = mod.wrapQuestion6_2();
      listCount.add(getwrapQuestion6_2);
      List<String> getwrapQuestion24 = mod.wrapQuestion24();
      listCount.add(getwrapQuestion24);
      List<String> getwrapQuestion26 = mod.wrapQuestion26();
      listCount.add(getwrapQuestion26);
      List<String> getwrapQuestion28 = mod.wrapQuestion28();
      listCount.add(getwrapQuestion28);
      List<String> getwrapQuestion29 = mod.wrapQuestion29();
      listCount.add(getwrapQuestion29);
      List<String> getwrapQuestion31 = mod.wrapQuestion31();
      listCount.add(getwrapQuestion31);
      List<String> getwrapQuestion32 = mod.wrapQuestion32();
      listCount.add(getwrapQuestion32);
      
      Comparator<List<String>> comparator = new Comparator<List<String>>() {
			@Override
			public int compare(List<String> o1, List<String> o2) {
				return o2.size() - o1.size();
			}
    	};
    	
    	Collections.sort(listCount, comparator); 
    	
    	// количество строк в бд будет соответствовать количеству ответов на  вопрос (который выбран по принципу максимального киличества ответов в каждом вопросе) 
    	for(int i = 1; i<listCount.get(0).size(); i++)
    	{
    		// создаем объект (количество объектов зависит от максимально-отвеченного относительно вариантов ответа, вопроса)
    		temp = new QuestionManyClinic();
    	//	temp.setIdQuestionManyClinic();
    		
    		/* подставляем из отсортированного listCount вопрос с наибольшим количеством ответов (в вопросе может быть неслько ответов)
    		 * определив какой вопрос с наибольши количеством  по listCount.get(0).get(0).equals("question2") и  определяем ему соответствующий сеттер
    		 * i=1 так первым элементом идет ключ - название вопроса: question2 или question6_1 или question6_2
    		 */
    		if(listCount.get(0).get(0).equals("question2")) temp.setQuestion2_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(0).get(i));
    		if(listCount.get(0).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(0).get(i));
    		
    		// если вариантов ответа в вопросе отсортированном в позиции 1 больше чем элемент который требуется
    		// т.е. в массиве 0	1 (2 элемента) а i=2...то будет исключение
    		if(listCount.get(1).size() > i)	{
    			
    			if(listCount.get(1).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(1).get(i));
    			if(listCount.get(1).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(1).get(i));
    		}
    		
			if(listCount.get(2).size() > i)	{
			    			
			    			if(listCount.get(2).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(2).get(i));
			    			if(listCount.get(2).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(2).get(i));
			    		}
			
			if(listCount.get(3).size() > i)	{
    			
    			if(listCount.get(3).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(3).get(i));
    			if(listCount.get(3).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(3).get(i));
    		}
			
			if(listCount.get(4).size() > i)	{
    			
    			if(listCount.get(4).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(4).get(i));
    			if(listCount.get(4).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(4).get(i));
    		}
			
			if(listCount.get(5).size() > i)	{
    			
    			if(listCount.get(5).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(5).get(i));
    			if(listCount.get(5).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(5).get(i));
    		}
			
			if(listCount.get(6).size() > i)	{
    			
    			if(listCount.get(6).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(6).get(i));
    			if(listCount.get(6).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(6).get(i));
    		}
    		
			
			if(listCount.get(7).size() > i)	{
    			
    			if(listCount.get(7).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(7).get(i));
    			if(listCount.get(7).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(7).get(i));
    		}
			
			if(listCount.get(8).size() > i)	{
    			
    			if(listCount.get(8).get(0).equals("question2"))	temp.setQuestion2_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question6_1")) temp.setQuestion6_1_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question6_2")) temp.setQuestion6_2_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question24")) temp.setQuestion24_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question26")) temp.setQuestion26_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question28")) temp.setQuestion28_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question29")) temp.setQuestion29_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question31")) temp.setQuestion31_clinic(listCount.get(8).get(i));
    			if(listCount.get(8).get(0).equals("question32")) temp.setQuestion32_clinic(listCount.get(8).get(i));
    		}
    		
    		ls.add(temp);
    		temp.setSurvayClinicSecondlevel(survay);
    		
    	}
    	
      
      
      sec1.setSurvayClinicSecondlevel(survay);
      sec2.setSurvayClinicSecondlevel(survay);
      sec25.setSurvayClinicSecondlevel(survay);
      
      survay.setQuestion_many(ls);
      survay.setSurvayClinicSec1(sec1);
      survay.setSurvayClinicSec2(sec2);
      survay.setSurvayClinicSec25(sec25);
	  
	  
	  this.em.merge(survay);
	  
  }

  @Transactional
  public List<SurvayClinicSecondlevel> getReport(String d1, String d2,String userp,List<String> lpulist) {
	  
	  String paste="";
	  String lpu = "";
	  if(lpulist.contains("Все")){
		  lpu = "Все";
		  paste="and p.moSecondlevel!=:lpu";
	  }else{
		  paste = "and (";
		  for (int i = 0; i < lpulist.size()-1; i++) {
			  paste = paste + "p.moSecondlevel ='"+lpulist.get(i)+"' or ";
		  }
		  lpu = lpulist.get(lpulist.size()-1); paste = paste + "p.moSecondlevel =:lpu)";
	  }

	  
	  String []mas = userp.split("!");
	  String name="(";
	  if(mas.length == 1){	userp = mas[0]; name = "p.polzovatelSecondlevel =:userp";}
	  if(mas.length > 1){
		  for (int i = 0; i < mas.length-1; i++) {
			  name = name + "p.polzovatelSecondlevel ='"+mas[i]+"' or ";
		  }
		  userp = mas[mas.length-1]; name = name + "p.polzovatelSecondlevel =:userp)";
	  }
	  
    List<SurvayClinicSecondlevel> result = em.createQuery("SELECT p FROM SurvayClinicSecondlevel p WHERE "+name+" "+paste+" AND (p.dataRespSecondlevel BETWEEN :d1 AND :d2)  ORDER BY p.id DESC", SurvayClinicSecondlevel.class)
    .setParameter("d1", d1)  
    .setParameter("d2", d2)  
    .setParameter("userp", userp)
    .setParameter("lpu", lpu)
    //.setParameter("age", age)
    .getResultList();
    return result;
  } 
  
  @Transactional
  
  public List<SurvayClinicSecondlevel> getReport(String d1, String d2,String userp,String sex,Integer age_min,Integer age_max,String lpu) {
	  String agefor = "p.ageSecondlevel between "+age_min+" and "+age_max+" ";
	  if((sex.equals("Мужской") && age_min >= 60) || (sex.equals("Женский") && age_min >= 55)){	agefor = "p.ageSecondlevel>="+age_min+" ";		}
	  
	  String paste="p.moSecondlevel=:lpu";
	  // enter ALL we will passing in query NOT "ALL"(p.mo!=:lpu) because in db no records with  name 'ALL' => so we get all records 
	  if(lpu.equals("Все"))	{	paste="p.moSecondlevel!=:lpu";	}
	  
	  String []mas = userp.split("!");
	  String name="(";
	  if(mas.length == 1){	userp = mas[0]; name = "p.polzovatelSecondlevel =:userp";}
	  if(mas.length > 1){
		  for (int i = 0; i < mas.length-1; i++) {
			  name = name + "p.polzovatelSecondlevel ='"+mas[i]+"' or ";
		  }
		  userp = mas[mas.length-1]; name = name + "p.polzovatelSecondlevel =:userp)";
	  }
	
    List<SurvayClinicSecondlevel> result = em.createQuery("SELECT p FROM SurvayClinicSecondlevel p WHERE "+name+" and "+paste+" and p.sexSecondlevel=:sex and "+agefor+" and p.dataRespSecondlevel BETWEEN to_date(:d1,'dd.mm.yyyy') and to_date(:d2,'dd.mm.yyyy')  ORDER BY p.id DESC", SurvayClinicSecondlevel.class)
    .setParameter("d1", d1)  
    .setParameter("d2", d2)  
    .setParameter("userp", userp)
    .setParameter("lpu", lpu)
    .setParameter("sex", sex)
    //.setParameter("age", age)
    .getResultList();
    
    for( SurvayClinicSecondlevel m : result){
    	
    	System.out.println("@@@@@@@@ "+m.getId()+" "+m.getDataRespSecondlevel() + " "+ m.getDataInputSecondlevel());	
    }
    
    
    return result;
  }
	

}