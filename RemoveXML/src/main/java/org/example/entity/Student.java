package org.example.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Student {
    private Mark mark;
    @Bean
    public Mark createmark(){
        return new Mark();
    }


}
