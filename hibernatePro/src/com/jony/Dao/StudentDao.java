package com.jony.Dao;

import java.util.List;

import org.dom4j.dom.DOMNodeHelper.EmptyNodeList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.jony.Dto.StudentDto;

public class StudentDao {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration con= new Configuration();
		con.configure();
		
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		StudentDto dto= new StudentDto();
		
		//=====Create======
		/*dto.setId(102);
		dto.setName("JK");
		dto.setSalary(5000.0);
		session.save(dto);
		System.out.println("Done");*/
		
		//=======update=======
		/*dto.setId(101);
		dto.setName("Ahesan");
		dto.setSalary(100.0);
		session.update(dto);*/
		
		//======Read=====
		/*StudentDto load = session.load(StudentDto.class, 101);
		System.out.println(load.getId()+" "+load.getName()+" "+load.getSalary());*/
		
		//=========Delete======
		/*StudentDto load = session.load(StudentDto.class, 101);
		session.remove(load);*/
		
		//=====HQL========
		/*Query query = session.createQuery("from StudentDto");
		List<StudentDto> list = query.list();
		
		for (StudentDto dto1 : list) {
			System.out.println(dto1.getId()+" "+dto1.getName()+" "+dto1.getSalary());
		}*/
		
		//=======HCQL========
		/*Criteria cr =session.createCriteria(StudentDto.class);// select * from StudentDto
		List<StudentDto> list = cr.list();
		
		for (StudentDto dto1 : list) {
			System.out.println(dto1);
		}*/
		
		//=====HCQL==========
	/*	Criteria cr=session.createCriteria(StudentDto.class); // select * from StudentDto where name='jony'
		cr.add(Restrictions.eq("name", "jony"));    // ===AND====
		cr.add(Restrictions.eq("salary", 5000.0)); 
		List<StudentDto> list = cr.list();          // fetch all the records
		
		for (StudentDto dto1 : list) {
			System.out.println(dto1);
		}*/
		
		//======HCQL=======
		/*Criteria cr=session.createCriteria(StudentDto.class);
		cr.add(Restrictions.eq("id", 102));
		StudentDto dto1 = (StudentDto) cr.uniqueResult();     // fetch only one record
		System.out.println(dto1);*/
		
		//========HCQL=========
		/*Criteria cr = session.createCriteria(StudentDto.class);
		cr.addOrder(Order.asc("salary"));    //======= asc order only =======
		
		List<StudentDto> list = cr.list();
		for (StudentDto dto1 : list) {
			System.out.println(dto1);
		}*/
		
		
		//======HCQL=======
		/*Criteria cr = session.createCriteria(StudentDto.class);   
		cr.add(Restrictions.or(Restrictions.eq("name", "jony"),       // =====OR criteria====without disjunction
								Restrictions.eq("salary", 7000.0)));
		
		List<StudentDto> list = cr.list();
		for (StudentDto dto1 : list) {
			System.out.println(dto1);
		}*/
			
		
		//=======HCQL========OR criteria
		Criteria cr = session.createCriteria(StudentDto.class);
		Disjunction dj = Restrictions.disjunction();    //=======using disjunction=====
		
		dj.add(Restrictions.eq("name", "jony")); 
		dj.add(Restrictions.eq("salary", 7000.0));
		
		cr.add(dj);
		
		List<StudentDto> list = cr.list();
		for (StudentDto studentDto : list) {
			System.out.println(studentDto);
		}
		
		/*Criteria cr = session.createCriteria(StudentDto.class);
		cr.setProjection(Projections.projectionList()
				.add(Projections.property("name"))
				.add(Projections.property("salary")));
		
		List<Object[]> list = cr.list();
		for (Object[] studentDto : list) {
			System.out.println(studentDto[0]+" "+studentDto[1]);
		}*/
		
		//=======HCQL=====
		/*Criteria cr = session.createCriteria(StudentDto.class);
		ProjectionList pl = Projections.projectionList();      //======Set Projection======
		pl.add(Projections.property("name"));
		pl.add(Projections.property("salary"));
		
		cr.setProjection(pl);
		
		List<Object[]> list = cr.list();
		for (Object[] dtos : list) {
			System.out.println(dtos[0]+" "+dtos[1]);
		}*/
		
		transaction.commit();
	
	}
}

