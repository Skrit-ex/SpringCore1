package org.example;

import java.util.Optional;

public class OperationService {

    private final InMemoryOperationStorage storage = new InMemoryOperationStorage();

    public Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case "sum":
                double v = operation.getNum1() + operation.getNum2();
                operation.setResult(v);
                storage.save(operation);
                return Optional.of(operation);
            case "sub":
                double v1 = operation.getNum1() - operation.getNum2();
                operation.setResult(v1);
                storage.save(operation);
                Optional.of(operation);
            case "mul":
                double v2 = operation.getNum1() - operation.getNum2();
                operation.setResult(v2);
                storage.save(operation);
                Optional.of(operation);
            case "div":
                double v3 = operation.getNum1() - operation.getNum2();
                operation.setResult(v3);
                storage.save(operation);
                Optional.of(operation);
        }
        return Optional.empty();
    }
}
