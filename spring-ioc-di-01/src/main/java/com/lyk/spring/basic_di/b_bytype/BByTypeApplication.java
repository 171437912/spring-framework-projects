package com.lyk.spring.basic_di.b_bytype;

import com.lyk.spring.basic_di.b_bytype.bean.Person;
import com.lyk.spring.basic_di.b_bytype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Liu
 * @description
 * @date 2021-08-06 23:11
 */
public class BByTypeApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("b-bytype.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = beanFactory.getBean(DemoDao.class);
        System.out.println(demoDao.findAll());
    }
}
