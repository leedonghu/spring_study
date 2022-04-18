package study.spring.lee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.spring.lee.controller.HandlerMapping;
import study.spring.lee.controller.ViewResolver;

public class DispatcherServlet extends HttpServlet {
	
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	
	public void init() throws ServletException {
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		
		Controller ctrl = handlerMapping.getController(path);
		System.out.println("ctrl : " + ctrl);
		String viewName = ctrl.handleRequest(request, response);
		
		String view = viewName;
		
	}
}
