package org.example.spring;


import org.example.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;


//constructor
//field
//



@Configuration
public class CoreConfiguration {


    @Bean
    public Application consoleApplication(ConsoleWriter writer,
                                          ConsoleReader reader,
                                          OperationService service){
        return new ConsoleApplication(service, writer, reader);
    }
    @Value("system> ")
    private String prefix;

    @Bean
    public ConsoleReader reader(Scanner scanner){
        return new ConsoleReader(scanner);
    }

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

    @Bean
    public ConsoleWriter writer(){
        return new ConsoleWriter();
    }
    @Bean
    public OperationService operationService(OperationStorage operationStorage){
        return new OperationService(operationStorage);
    }
    @Bean
    public OperationStorage operationStorage(){
        return new InMemoryOperationStorage();
    }
}
