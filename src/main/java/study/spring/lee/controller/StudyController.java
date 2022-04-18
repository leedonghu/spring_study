package study.spring.lee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.spring.lee.servlet.Controller;

public class StudyController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("controller excute");
		String page = request.getParameter("page");
		return page;
	}

}
