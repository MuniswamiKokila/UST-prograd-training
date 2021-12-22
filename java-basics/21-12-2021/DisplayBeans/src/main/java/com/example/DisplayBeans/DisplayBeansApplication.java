package com.example.DisplayBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DisplayBeansApplication{
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DisplayBeansApplication.class, args);
		System.out.println("===========Beans loaded by spring boot================");
		String[] beanNames = context.getBeanDefinitionNames(); //return array of bean names
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		System.out.println(context.getBeanDefinitionCount());
	};
}