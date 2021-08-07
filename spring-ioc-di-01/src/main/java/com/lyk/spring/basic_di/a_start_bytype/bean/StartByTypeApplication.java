package com.lyk.spring.basic_di.a_start_bytype.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Liu
 * @description
 * @date 2021-08-06 22:49
 */
public class StartByTypeApplication {
    public static void main(String[] args) throws Exception{
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("start-bytype.xml");
        Person1 person1 = beanFactory.getBean(Person1.class);
        System.out.println(person1);

    }
}
