package org.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationStorage implements OperationStorage{

    private List<Operation> operations;

    @Override
    public void save(Operation operation) {
        operations.add(operation);
    }

    @Override
    public List<Operation> findAll() {
        return new ArrayList<>(operations);
    }
}
