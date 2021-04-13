package team.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.entity.Character;
import team.persistence.GenericDao;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * This class receives a post request with JSON data and processes it to load
 * the contribution data to the database.
 * @author Zane Miller
 */
@Path("/insert")
public class InsertNewCharacter {

    private String foundCharacterJson;

    /**
     * This method processes a post request to add a fictional character to the
     * database.
     *
     * @param character The character object to add to the database.
     * @return The JSON response confirming the data that was added to the database
     * @throws JsonProcessingException
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postCharacter(Character character) throws JsonProcessingException {

        GenericDao postCharacter = new GenericDao(Character.class);
        int lastInsertedId = postCharacter.insert(character);

        ObjectMapper mapper = new ObjectMapper();
        try {
            foundCharacterJson = mapper.writeValueAsString(character);
        } catch (IOException ioe) {
        }
        return Response.status(200).entity(character).build();
    }
}