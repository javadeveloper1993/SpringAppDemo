package com.example.spring.bean.beanPostProcessor;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @author Maulik
 * 
 */
public class BeanPostProcessorDemo implements BeanPostProcessor,Ordered {
	@SuppressWarnings("unused")
	private static final Logger logger = Logger
			.getLogger(BeanPostProcessorDemo.class);

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
//		 logger.info("AfterInitialization  : " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
//		 logger.info("BeforeInitialization  : " + beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
