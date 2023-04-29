package com.khadri.jee.hibernate.integration.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khadri.jee.hibernate.integration.dao.RegisterDAO;
import com.khadri.jee.hibernate.integration.dto.RegisterDTO;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Eneterd into RegisterServlet:service(-,-) ");
		String studentName = req.getParameter("sName");
		String studentAge = req.getParameter("sAge");
		String studentBranch = req.getParameter("sBranch");
		String studentPhone = req.getParameter("sPhone");
		String studentAddress = req.getParameter("sAddress");
		String studentParentPhone = req.getParameter("sParentPhone");

		RegisterDTO registerDTO = new RegisterDTO();
		registerDTO.setStudentName(studentName);
		registerDTO.setStudentAge(studentAge);
		registerDTO.setStudentBranch(studentBranch);
		registerDTO.setStudentPhone(studentPhone);
		registerDTO.setStudentAddress(studentAddress);
		registerDTO.setStudentParentPhone(studentParentPhone);

		RegisterDAO registerDao = new RegisterDAO();

		System.out.println("Invoked RegisterDao from Servlet ");
		registerDao.saveStudentForm(registerDTO);

	}
}
