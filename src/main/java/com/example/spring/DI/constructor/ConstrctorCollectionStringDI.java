package com.example.spring.DI.constructor;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.DI.MapDI;

/**
 * @author Maulik
 * 
 */
public class ConstrctorCollectionStringDI {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger
			.getLogger(ConstrctorCollectionStringDI.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		
//		QuestionDI questionDI = (QuestionDI) context.getBean("collectionDI");
//		questionDI.displayInfo();

		// With Reference Object
//		QuestionDI questionDIObject = (QuestionDI) context
//				.getBean("collectionDIObject");
//		questionDIObject.displayInfoWithDIobject();

		// With Map
		MapDI mapDI = (MapDI) context.getBean("mapDI");
		mapDI.displayInfo();

	}
}
