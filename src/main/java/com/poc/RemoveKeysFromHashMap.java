package com.poc;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class RemoveKeysFromHashMap {
    public void exampleRemoveKeysFromHashMap() {

        Map<String, String> husbandWifeMapping = new HashMap<>();
        husbandWifeMapping.put("Jack", "Marie");
        husbandWifeMapping.put("Chris", "Lisa");
        husbandWifeMapping.put("Steve", "Jennifer");

        log.info("--- Husband-Wife Mapping : " + husbandWifeMapping);

        // Remove a key from the HashMap
        // Ex - Unfortunately, Chris got divorced. Let's remove him from the mapping
        String husband = "Chris";
        String wife = husbandWifeMapping.remove(husband);

        log.info("--- Couple (" + husband + " => " + wife + ") got divorced");
        log.info("--- New Mapping : " + husbandWifeMapping);

        // Remove a key from the HashMap only if it is mapped to the given value
        // Ex - Divorce "Jack" only if He is married to "Linda"
        boolean isRemoved = husbandWifeMapping.remove("Jack", "Linda");
        log.info("--- Did Jack get removed from the mapping ? : " + isRemoved);

        // remove() returns null if the mapping was not found for the supplied key
        wife = husbandWifeMapping.remove("David");
        if (wife == null) {
            log.info("--- Looks like David is not married to anyone");
        } else {
            log.info("--- Removed David and his wife from the mapping");
        }

    }
}
