package org.example;

import java.util.Optional;

public class ConsoleApplication {


    public Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case "sum":
                double v = operation.getNum1() + operation.getNum2();
                operation.setResult(v);
                return Optional.of(operation);
            case "sub":
                double v1 = operation.getNum1() - operation.getNum2();
                operation.setResult(v1);
                Optional.of(operation);
            case "mul":
                double v2 = operation.getNum1() - operation.getNum2();
                operation.setResult(v2);
                Optional.of(operation);
            case "div":
                double v3 = operation.getNum1() - operation.getNum2();
                operation.setResult(v3);
                Optional.of(operation);
        }
        return Optional.empty();
    }
}
