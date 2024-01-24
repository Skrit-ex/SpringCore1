package org.example;

import java.util.Optional;

public class ConsoleApplication implements Application {

    private final OperationService service;
        private final ConsoleWriter writer;
        private final ConsoleReader reader;

    public ConsoleApplication(OperationService service, ConsoleWriter writer, ConsoleReader reader) {
        this.service = service;
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public void run() {
        while (true){
            writer.writeMessage("enter num1");
            double num1 = reader.readDouble();
            writer.writeMessage("enter num2");
            double num2 = reader.readDouble();
            writer.writeMessage("enter type");
            String type = reader.readText();


            Operation operation = new Operation();
            operation.setNum1(num1);
            operation.setNum2(num2);
            operation.setType(type);

            Optional<Operation> calculate = service.calculate(operation);

            if(calculate.isPresent()){
                Operation operation1 = calculate.get();
                writer.writeMessage("result = " + operation1.getResult());
            }else {
                writer.writeMessage("Found Operation");
            }
        }


    }
}
