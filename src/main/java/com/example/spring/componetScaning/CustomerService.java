package com.example.spring.componetScaning;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Autowiring.Annotation.CategoriesAnnotation;

/**
 * @author Maulik
 * 
 */
@Component
public class CustomerService {
	@SuppressWarnings("unused")
	private static final Logger logger = Logger
			.getLogger(CustomerService.class);

	@Autowired
	CategoriesAnnotation categoriesAnnotation;

	@Override
	public String toString() {
		return "CustomerService [categoriesAnnotation=" + categoriesAnnotation
				+ "]";
	}

}
