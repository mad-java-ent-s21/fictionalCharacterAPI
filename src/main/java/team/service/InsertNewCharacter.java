package team.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.persistence.GenericDao;
import team.entity.Character;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/insert_character")
public class InsertNewCharacter {

    private String foundCharacterJson;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Response postCharacter(Character character) throws JsonProcessingException {
        GenericDao characterDao = new GenericDao(Character.class);
        // connect to form to enter new character
        //Character character = new Character("1", "2", "3", "4", "5"
                //name, media, franchise, species, alignment

        // insert character

        int lastInsertedId = characterDao.insert(character);

        ObjectMapper mapper = new ObjectMapper();

        try {
            foundCharacterJson = mapper.writeValueAsString(character);
        } catch (IOException e) {

        }
        return Response.status(200).entity(character).build();

    }
}