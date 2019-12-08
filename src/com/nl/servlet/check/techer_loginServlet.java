package com.nl.servlet.check;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.nl.mysql.dao.ManagerDao;
import com.nl.mysql.dao.factory.DaoFactory;
@WebServlet("/techer_loginServlet")
public class techer_loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public techer_loginServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ManagerDao manager = DaoFactory.getManagerDaoInstance();
		try {
			if (manager.doCheckPassword(username,password)) {
				response.setHeader("refresh", "0;URL=teacher.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "请重新核对你的用户名和密码!!!", "用户名或密码错误", JOptionPane.ERROR_MESSAGE);
				response.setHeader("refresh", "0;URL=login.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
