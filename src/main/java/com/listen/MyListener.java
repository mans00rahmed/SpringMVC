package com.listen;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entity.Todo;

public class MyListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context reated");
		List<Todo> list = new ArrayList<Todo>();
		
		ServletContext context = sce.getServletContext();
		context.setAttribute("list", list);
	}

}
