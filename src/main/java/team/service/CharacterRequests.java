package team.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.persistence.GenericDao;
import team.entity.Character;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/name")
public class CharacterRequests {

    private String foundCharacterJson;

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")

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
}