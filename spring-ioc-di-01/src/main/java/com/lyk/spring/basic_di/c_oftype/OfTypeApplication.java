package com.lyk.spring.basic_di.c_oftype;

import com.lyk.spring.basic_di.c_oftype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author Mr.Liu
 * @description
 * @date 2021-08-06 23:35
 */
public class OfTypeApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic_di/oftype.xml");
        Map<String, DemoDao> beans = applicationContext.getBeansOfType(DemoDao.class);
        beans.forEach((beanName,bean)->{
            System.out.println(beanName+":"+bean.toString());
        });
    }
}
