package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Slf4j
public class IterateOverHashMap {
    public void exampleIterateOverHashMap() {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);

        log.info("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        employeeSalary.forEach((employee, salary) -> {
            log.info("--- " + employee + " => " + salary);
        });

        log.info("=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, Double>> employeeSalaryEntries = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> employeeSalaryIterator = employeeSalaryEntries.iterator();
        while (employeeSalaryIterator.hasNext()) {
            Map.Entry<String, Double> entry = employeeSalaryIterator.next();
            log.info("--- " + entry.getKey() + " => " + entry.getValue());
        }

        log.info("=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
        employeeSalary.entrySet().forEach(entry -> {
            log.info("--- " + entry.getKey() + " => " + entry.getValue());
        });

        log.info("=== Iterating over the HashMap's entrySet using simple for-each loop ===");
        for (Map.Entry<String, Double> entry : employeeSalary.entrySet()) {
            log.info("--- " + entry.getKey() + " => " + entry.getValue());
        }

        log.info("=== Iterating over the HashMap's keySet ===");
        employeeSalary.keySet().forEach(employee -> {
            log.info("--- " + employee + " => " + employeeSalary.get(employee));
        });
    }
}
