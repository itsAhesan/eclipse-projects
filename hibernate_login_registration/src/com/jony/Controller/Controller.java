package com.jony.Controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jony.Dao.UserDao;

import com.jony.Dto.UserDto;

public class Controller {

	public static void main(String[] args) {
		UserDto dto = new UserDto();
		UserDao dao = new UserDao();

		Configuration con = new Configuration();
		con.configure();

		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);

		System.out.println("Please select any one 1.Login 2.Registration");

		String login = sc.nextLine();

		if (login.equals("login")) {
			System.out.println("========Welcome to Login========");
			System.out.println("Enter Your user name ");
			String nam = sc.nextLine();

			System.out.println("Enter Your user password ");
			String pas = sc.nextLine();

			Query query = session.createQuery("from UserDto where username=:user and password =:password")
					.setParameter("user", nam).setParameter("password", pas);
			UserDto dto1 = (UserDto) query.uniqueResult();

			if (dto1 != null) {
				System.out.println("Login Successful, Below is the user Details");
				System.out.println(
						dto1.getId() + " " + dto1.getFullName() + " " + dto1.getPassword() + " " + dto1.getAddress());

			} else {
				System.out.println("Login Failed, Please try with correct Details");
			}

		} else if (login.equals("registration")) {

			System.out.println("=========Welcome to Registration===========");
			System.out.println("Enter Your user name ");
			String name = sc.nextLine();

			System.out.println("Enter Your password ");
			String password = sc.nextLine();

			System.out.println("Enter Your fullName ");
			String fullName = sc.nextLine();

			System.out.println("Enter Your address ");
			String address = sc.nextLine();

			dto.setUsername(name);
			dto.setPassword(password);
			dto.setFullName(fullName);
			dto.setAddress(address);

			session.save(dto);
			System.out.println("Registration Done ");

			dao.registration(dto);

			transaction.commit();

		}
		else {
			System.out.println("Wrong choice, Please try again");
		}

	}

}
