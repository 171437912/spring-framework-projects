package com.lyk.spring.basic_di.a_start_byname.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Liu
 * @description
 * @date 2021-08-06 22:49
 */
public class StartByNameApplication {
    public static void main(String[] args) throws Exception{
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("start-byname.xml");
        Object person = beanFactory.getBean("person");
        System.out.println(person);
    }
}
