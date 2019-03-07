package com.bdqn.zll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Jstls")
public class Test extends HttpServlet{
	//doget:这个方法很特殊，get请求（a标签点击，地址栏url拼接访问）都会进来
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> list = new ArrayList<String>();
		list.add("张三1");
		list.add("张三2");
		list.add("张三3");
		list.add("张三4");
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("NewFile.jsp").forward(req,resp);
	}
}	
