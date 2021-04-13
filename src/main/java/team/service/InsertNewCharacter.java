package team.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.entity.Character;
import team.persistence.GenericDao;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/insert")
public class InsertNewCharacter {
    private String foundCharacterJson;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postCharacter(Character character) throws JsonProcessingException {
        GenericDao postCharacter = new GenericDao(Character.class);
        // connect to form to enter new character

        int lastInsertedId = postCharacter.insert(character);

        ObjectMapper mapper = new ObjectMapper();

        try {
            foundCharacterJson = mapper.writeValueAsString(character);
        } catch (IOException ioe) {

        }

        return Response.status(200).entity(character).build();
    }
}