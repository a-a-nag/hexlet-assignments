package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    public String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        String result;

        try {
            result = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public static Car unserialize(String str) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(str, Car.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
