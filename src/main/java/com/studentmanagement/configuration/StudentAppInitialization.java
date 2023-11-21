package com.studentmanagement.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 Class [] arr= {StudentConfiguration.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arr={"/"};
		return arr;
	}

}
