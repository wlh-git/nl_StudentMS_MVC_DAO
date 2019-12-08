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
import com.nl.mysql.dao.proxy.StudentDaoProxy;
import com.nl.vo.Student;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//int i = 0;
		String ID = request.getParameter("ID");
		String identify = request.getParameter("identify");
		String name = request.getParameter("name");
		StudentDao sql = DaoFactory.getStudentDaoInstance() ;
		//ResultSet rs = sql.selectData("select name,identify from student where id='" + ID + "'");
		Student student = new Student() ;
		student.setID(ID);
		student.setIdentify(identify);
		student.setName(name);
		if (sql.doCheck(student)) {
			response.setHeader("refresh", "0;URL=student.jsp");
		}else {
			JOptionPane.showMessageDialog(null, "身份信息核对不正确", "请重新核对你的学号、身份证号和姓名!!!", JOptionPane.ERROR_MESSAGE);
			response.setHeader("refresh", "0;URL=login.jsp");
		}
/*		
		try {
			if (rs.next()) {
				if (!rs.getString("identify").equals(identify)) {
					i = 1;
					JOptionPane.showMessageDialog(null, "身份证号错误！", "身份证号错误！", JOptionPane.ERROR_MESSAGE);
					response.setHeader("refresh", "0;URL=login.jsp");
				} else if (!rs.getString("name").equals(name)) {
					i = 1;
					JOptionPane.showMessageDialog(null, "名字错误！", "名字错误！", JOptionPane.ERROR_MESSAGE);
					response.setHeader("refresh", "0;URL=login.jsp");
				}
			} else {
				i = 1;
				JOptionPane.showMessageDialog(null, "该ID不存在！请重新输入！", "ID不存在！", JOptionPane.ERROR_MESSAGE);
				response.setHeader("refresh", "0;URL=login.jsp");

			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i == 0) {
			response.setHeader("refresh", "0;URL=student.jsp");
		}
		sql.close();
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
