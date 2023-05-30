package com.khadri.spring.core.application.context;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
    public static void main(String[] args) {

        //ApplicatioContext implemented class ConfigurableApplicationContext
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student =  context.getBean(Student.class);

        System.out.println("Student ID "+student.getStdId());
        System.out.println("Student Name "+student.getStdName());
        context.close();

    }

}
