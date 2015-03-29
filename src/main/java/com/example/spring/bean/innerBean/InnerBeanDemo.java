package com.example.spring.bean.innerBean;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.TextEditor;

/**
 * @author Maulik
 * 
 */
public class InnerBeanDemo {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(InnerBeanDemo.class);

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		TextEditor textEditor = (TextEditor) context
				.getBean("outerBeanTextEditor");
		textEditor.getSpellChecker().checkSpelling();
		context.registerShutdownHook();
	}
}
