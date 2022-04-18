package study.spring.lee.controller;

import java.util.HashMap;
import java.util.Map;

import study.spring.lee.servlet.Controller;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/first", new StudyController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
