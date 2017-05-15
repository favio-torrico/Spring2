package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");// enlaza con Beans XML
      
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");// coge el bean helloWorld y lo castea
      objA.getMessage1();
      objA.getMessage2();

      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");// coge el bean helloIndia y lo castea
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
   }
}
// prueba de github