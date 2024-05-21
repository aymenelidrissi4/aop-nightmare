package org.example;

import com.example.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Program program = (Program) context.getBean("program");
//        program.task();
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = context.getBean(UserService.class);
        userService.addUser("JohnDoe");
        ((ClassPathXmlApplicationContext) context).close();
    }
}