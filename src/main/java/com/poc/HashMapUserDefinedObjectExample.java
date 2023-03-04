package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapUserDefinedObjectExample {
    public void exampleHashMapObject() {
        Map<Integer, Employee> employeesMap = new HashMap<>();
        employeesMap.put(1001, new Employee(1001, "Rajeev", "Bengaluru"));
        employeesMap.put(1002, new Employee(1002, "David", "New York"));
        employeesMap.put(1003, new Employee(1003, "Jack", "Paris"));

        log.info("--- Employee : " + employeesMap);
    }
}
