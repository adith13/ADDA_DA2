package com.adith.teamProjectOne;

public class PersonService {
    public String generateResponse(String name, int id) {
        if ("ram".equals(name) && id == 3025) {
            return "Correct Response";
        } else {
            return "Incorrect Response";
        }
    }
}
