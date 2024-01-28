package org.example;

import org.springframework.context.annotation.Scope;

import java.util.Scanner;


//@Scope("prototype")
@Scope("singleton")
public class ConsoleReader {

    public final Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readText(){
        return scanner.next();
    }
    public Double readDouble(){
        return scanner.nextDouble();
    }

    private void init(){
        System.out.println("write Init ");
    }

    private void destroy(){
        System.out.println("Destroy");
    }
}
