package chapter15.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static chapter15.json.Sex.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class JsonSerializerTest {

    @Test
    public void testSerialize(){
        Person person = new Person();
        person.setName("Aramide");
        String dateOfBirth = "2024-03-03";
        person.setDateOfBirth(LocalDate.parse(dateOfBirth));
        person.setGender(Sex.SHIM);
        person.setPhoneNumber("09028979349");

        String json = JsonSerializer.serialize(person);
        String expected = "{\"phoneNumber\":\"09028979349\",\"name\":\"Aramide\",\"dateOfBirth\":\"2024-03-03\",\"gender\":\"SHIM\"}";
        assertEquals(expected,json);
    }


    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("09023456789","john", LocalDate.now(),MALE);
        String json = JsonSerializer.serialize(person);
        String expected = "{\"phoneNumber\":\"09028979349\",\"name\":\"Aramide\",\"dateOfBirth\":\"2024-03-03\",\"gender\":\"SHIM\"}";
        System.out.println("json" + json);
        Person personFromJson = JsonSerializer.deserialize(json);
        System.out.println("person from json" + personFromJson);

        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(),personFromJson.getDateOfBirth());
        assertEquals(MALE,personFromJson.getGender());
        assertEquals("john",personFromJson.getName());
        assertEquals("09023456789",personFromJson.getPhoneNumber());
    }


}