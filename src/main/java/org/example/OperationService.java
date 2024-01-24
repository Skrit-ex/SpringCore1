package org.example;

import java.util.Optional;

public class OperationService {

//    private final OperationStorage operationStorage = new InMemoryOperationStorage();

    private final OperationStorage operationStorage;

    public OperationService(OperationStorage operationStorage) {
        this.operationStorage = operationStorage;
    }


    public Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case "sum":
                double v = operation.getNum1() + operation.getNum2();
                operation.setResult(v);
                operationStorage.save(operation);
                return Optional.of(operation);
            case "sub":
                double v1 = operation.getNum1() - operation.getNum2();
                operation.setResult(v1);
                operationStorage.save(operation);
                Optional.of(operation);
            case "mul":
                double v2 = operation.getNum1() - operation.getNum2();
                operation.setResult(v2);
                operationStorage.save(operation);
                Optional.of(operation);
            case "div":
                double v3 = operation.getNum1() - operation.getNum2();
                operation.setResult(v3);
                operationStorage.save(operation);
                Optional.of(operation);
        }
        return Optional.empty();
    }
}
