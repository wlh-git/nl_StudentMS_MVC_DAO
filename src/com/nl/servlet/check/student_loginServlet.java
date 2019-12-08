package com.nl.servlet.check;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.nl.mysql.dao.StudentDao;
import com.nl.mysql.dao.factory.DaoFactory;

/**
 * Servlet implementation class student_loginServlet
 */
@WebServlet("/student_loginServlet")
public class student_loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public student_loginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("ID");
		String identify=request.getParameter("identify");
		String name=request.getParameter("name");
		StudentDao sql = DaoFactory.getStudentDaoInstance();
		try {
			if (sql.doCheckname(ID,identify,name)) {
				response.setHeader("refresh", "0;URL=student.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "请重新核对你的学号、身份证号和姓名!!!", "身份信息核对不正确", JOptionPane.ERROR_MESSAGE);
				response.setHeader("refresh", "0;URL=index.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
