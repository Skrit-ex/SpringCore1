package org.example;

import java.util.Scanner;

public class ConsoleReader {

    public final Scanner scanner= new Scanner(System.in);

    public String readText(){
        return scanner.next();
    }
    public Double readDouble(){
        return scanner.nextDouble();
    }
}
