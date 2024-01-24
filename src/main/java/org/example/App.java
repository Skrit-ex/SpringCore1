package org.example;

import org.example.spring.CoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

//        Application application = new ConsoleApplication();
//        application.run();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguration.class);
        ConsoleApplication consoleApplication=  applicationContext.getBean("consoleApplication", ConsoleApplication.class);

        consoleApplication.run();

    }
}
