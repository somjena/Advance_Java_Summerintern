package org.example;

import org.example.entity.Airtel;
import org.example.entity.Student;
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
        //System.out.println("Application Path Loaded");
        /*Airtel al =(Airtel)ap.getBean("Airtel");
        al.calling();
        al.datause();
        int id =al.getId();
        String name = al.getName();
        String usd = al.getUsd();
        System.out.println("id = "+id+"\n"+"name = "+name+ " \n"+"Usd = "+usd);
         */
       Student st1 = ap.getBean("student1", Student.class);
       Student st2 = ap.getBean("student2", Student.class);
       System.out.println(st1.getId() + " "+ st1.getName()+" "+st1.getUniv());
       System.out.println(st2.getId() + " "+ st2.getName()+" "+st2.getUniv());
    }
}
