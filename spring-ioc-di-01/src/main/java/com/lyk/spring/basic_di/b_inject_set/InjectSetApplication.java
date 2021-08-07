package com.lyk.spring.basic_di.b_inject_set;

import com.lyk.spring.basic_di.b_inject_set.bean.Cat;
import com.lyk.spring.basic_di.b_inject_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Liu
 * @description
 * @date 2021-08-06 23:22
 */
public class InjectSetApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
