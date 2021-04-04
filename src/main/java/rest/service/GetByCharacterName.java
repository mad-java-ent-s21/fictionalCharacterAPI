package rest.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.core.jackson.Log4jJsonObjectMapper;
import persistence.GenericDao;
import entity.Character;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/name")
public class GetByCharacterName {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")

    @Path("{name}")
    public Response getCharacterByName(@PathParam("name") String name) throws JsonProcessingException {

        GenericDao characterGenericDao = new GenericDao(Character.class);
//        List<Character> foundCharacter = characterGenericDao.findByPropertyEqual("name", name);
        List foundCharacters = characterGenericDao.getAll();

        ObjectMapper mapper = new ObjectMapper();
        String foundCharactersJson = mapper.writeValueAsString(foundCharacters);

        String test = "test";
        return Response.status(200).entity(foundCharactersJson).build();
    }
}