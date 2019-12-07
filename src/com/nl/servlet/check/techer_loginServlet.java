package com.nl.servlet.check;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nl.vo.Manager;

/**
 * Servlet implementation class techer_loginServlet
 */
@WebServlet("/techer_loginServlet")
public class techer_loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public techer_loginServlet() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Manager manager = new Manager();
		manager.setUsername(username);
		manager.setPassword(password);
		//ManagerDao sql = new Manager();
		
/*		
		ResultSet rs = sql.selectData("select password from manager where username='" + username + "'");
		try {
			if (rs.next()) {
				if (!rs.getString("password").equals(password)) {
					i = 1;
					JOptionPane.showMessageDialog(null, "密码错误！", "密码错误！", JOptionPane.ERROR_MESSAGE);
					response.setHeader("refresh", "0;URL=login.jsp");
				}
			} else {
				i = 1;
				JOptionPane.showMessageDialog(null, "该用户名不存在！请重新输入！", "改用户名不存在！", JOptionPane.ERROR_MESSAGE);
				response.setHeader("refresh", "0;URL=login.jsp");
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i == 0) {
			response.setHeader("refresh", "0;URL=teacher.jsp");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
