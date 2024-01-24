package org.example;

import java.util.Scanner;

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
}
