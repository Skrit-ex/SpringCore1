package org.example.spring;


import org.example.Application;
import org.example.ConsoleApplication;
import org.example.ConsoleReader;
import org.example.ConsoleWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfiguration {


    @Bean
    public Application consoleApplication(){
        return new ConsoleApplication();
    }

    @Bean
    public ConsoleReader reader(){
        return new ConsoleReader();
    }

    @Bean
    public ConsoleWriter writer(){
        return new ConsoleWriter();
    }
}
