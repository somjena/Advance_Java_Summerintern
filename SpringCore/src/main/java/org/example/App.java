package org.example;

import org.example.entity.Airtel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Application Path Loaded");
        Airtel al =(Airtel)ap.getBean("Airtel");
        al.calling();
        al.datause();
        int id =al.getId();
        String name = al.getName();
        String usd = al.getUsd();
        System.out.println("id = "+id+"\n"+"name = "+name+ " \n"+"Usd = "+usd);
    }
}
