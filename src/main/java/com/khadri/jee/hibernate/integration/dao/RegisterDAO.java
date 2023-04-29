package com.khadri.jee.hibernate.integration.dao;

import javax.persistence.EntityManager;

import com.khadri.jee.hibernate.integration.dto.RegisterDTO;
import com.khadri.jee.hibernate.integration.entities.Register;
import com.khadri.jee.hibernate.integration.util.JpaEntityManagerUtil;

/*
 * Insert into Database (Data Access Object)
 */
public class RegisterDAO {

	private EntityManager entityManager = JpaEntityManagerUtil
			.createEntityManager();

	public void saveStudentForm(RegisterDTO registerDTO) {
		System.out.println("Entered into RegisterDAO : saveStudentForm(-)");
		Register register = new Register();
		register.setStudName(registerDTO.getStudentName());
		register.setStudAge(Integer.parseInt(registerDTO.getStudentAge()));
		register.setStudBranch(registerDTO.getStudentBranch());
		register.setStudAddress(registerDTO.getStudentAddress());
		register.setStudPhone(Long.parseLong(registerDTO.getStudentPhone()));
		register.setStudParentPhone(
				Long.parseLong(registerDTO.getStudentParentPhone()));

		System.out.println("Saving object starts");
		
		entityManager.getTransaction().begin();

		entityManager.persist(register);

		entityManager.getTransaction().commit();
		
		System.out.println("Saving object ends");

	}

}
