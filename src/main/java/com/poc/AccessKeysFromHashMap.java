package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class AccessKeysFromHashMap {

    public void exampleAccessKeysFromHashMap() {

        Map<String, String> userCityMapping = new HashMap<>();

        // Check if a HashMap is empty
        log.info("--- Is userCityMapping empty ? : {}", userCityMapping.isEmpty());

        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        // data HashMap
        log.info("--- userCityMapping HashMap : {}", userCityMapping);

        // Find the size of a HashMap
        log.info("--- We have the city information of " + userCityMapping.size() + " users");

        String userName = "Steve";
        // Check if a key exists in the HashMap
        if (userCityMapping.containsKey(userName)) {
            // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            log.info("--- " + userName + " lives in " + city);
        } else {
            log.info("--- City details not found for user : {}", userName);
        }

        // Check if a value exists in a HashMap
        if (userCityMapping.containsValue("New York")) {
            log.info("--- There is a user in the userCityMapping who lives in New York");
        } else {
            log.info("--- There is no user in the userCityMapping who lives in New York");
        }

        // Modify the value assigned to an existing key
        userCityMapping.put(userName, "California");
        log.info("--- " + userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);

        // The get() method returns `null` if the specified key was not found in the HashMap
        log.info("--- Lisa's city : " + userCityMapping.get("Lisa"));
    }
}
