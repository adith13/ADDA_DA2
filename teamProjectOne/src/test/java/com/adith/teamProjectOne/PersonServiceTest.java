package com.adith.teamProjectOne;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonServiceTest {

    @Test
    public void testCorrectInput() {
        PersonService personService = new PersonService();
        String response = personService.generateResponse("ram", 3025);
        assertEquals("Correct Response", response);
    }

    @Test
    public void testIncorrectInput() {
        PersonService personService = new PersonService();
        String response = personService.generateResponse("John", 1234);
        assertEquals("Incorrect Response", response);
    }
}
