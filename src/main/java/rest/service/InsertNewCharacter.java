package rest.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import entity.Character;
import persistence.GenericDao;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/insert_character/{name}/{media}/{franchise}/{species}/{alignment}")
public class InsertNewCharacter {
    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    public Response postCharacter(@PathParam("name") String name, @PathParam("media") String media, @PathParam("franchise") String franchise, @PathParam("species") String species, @PathParam("alignment") String alignment) throws JsonProcessingException {
        GenericDao postCharacter = new GenericDao(Character.class);
        // connect to form to enter new character
        Character character = new Character(name, media, franchise, species, alignment);
        // insert character
        postCharacter.insert(character);
        return Response.status(200).entity(character).build();
    }
}