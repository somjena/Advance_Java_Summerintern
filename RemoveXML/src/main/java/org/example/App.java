package org.example;

import org.example.entity.Configuration;
import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context= new AnnotationConfigApplicationContext(Configuration.class);
    Student student = context.getBean("student",Student.class);


    }
}
