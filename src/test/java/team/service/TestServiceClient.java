package team.service;

import team.entity.Character;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceClient {

    @Test
    public void fictionalCharacterAPIJSONCharacter() throws Exception {
        /*Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://localhost:8080/fictionalCharacterAPI_war/service/name/neo");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Character character = mapper.readValue(response, Character.class);
        assertEquals("neo", character.getName());
        //assertEquals("???", response);*/
    }

}