package team.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.persistence.GenericDao;
import team.entity.Character;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("/character")
public class CharacterRequests {

    private String foundCharacterJson;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{column}/{value}")
    public Response processRequest(@PathParam("column") String column, @PathParam("value") String value) throws JsonProcessingException {
        GenericDao dao = new GenericDao(Character.class);

//        Character foundCharacter = (Character) dao.findByPropertyEqual("name", characterName);

        List<Character> characters = dao.findByPropertyEqual(column, value);

        ObjectMapper mapper = new ObjectMapper();

        try {
            foundCharacterJson = mapper.writeValueAsString(characters);
        } catch (IOException ioe) {

        }

        return Response.status(200).entity(foundCharacterJson).build();
    }
}