package team.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.persistence.GenericDao;
import team.entity.Character;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/name")
public class CharacterRequests {

    private String foundCharacterJson;

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces(MediaType.APPLICATION_JSON)

    @Path("{name}")
    public Response getCharacterByName(@PathParam("name") int name) throws JsonProcessingException {

        GenericDao characterGeneric = new GenericDao(Character.class);


        GenericDao characterGenericDao = new GenericDao(Character.class);
        Character foundCharacter = (Character) characterGenericDao.getById(name);
        //List foundCharacters = characterGenericDao.getByName();

        ObjectMapper mapper = new ObjectMapper();


        try {
            foundCharacterJson = mapper.writeValueAsString(foundCharacter);
        } catch (IOException e) {

        }




        return Response.status(200).entity(foundCharacterJson).build();

    }

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