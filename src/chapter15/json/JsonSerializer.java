package chapter15.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializer {

    public static String serialize(Person person){
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(person);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }


    }

    public static Person deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

            return mapper.readValue(json,Person.class);


    }
}
