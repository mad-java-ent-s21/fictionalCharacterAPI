package team.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import team.persistence.GenericDao;
import team.entity.Character;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class receives GET requests with data passed along in path parameters
 * and utilizes the specifics of those path parameters to search within the
 * character database and returns the data found based upon the search parameters.
 *
 */
@Path("/character")
public class CharacterRequests {

    private String foundCharacterJson;

    /**
     * This method receives path parameters for a column within the database and
     * a value to search for within that column. This method then calls the
     * processRequest method passing that data and returns the Response.
     *
     * @param column
     * @param value
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{column}/{value}")
    public Response singleParamRequest(@PathParam("column") String column, @PathParam("value") String value) throws JsonProcessingException {

        Map<String, Object> searchParamMap = new HashMap<>();
        searchParamMap.put(column, value);

        return Response.status(200).entity(processRequest(searchParamMap)).build();
    }

    /**
     * This method receives 2 path parameters for columns within the database and
     * values to search for within those column. This method then calls the
     * processRequest method passing that data and returns the Response.
     *
     * @param column the database column to search within the database
     * @param value the value to use when searching the specific database column
     * @param secondaryColumn the second database column to search within the database
     * @param secondaryValue the second value to use when searching the specific second database column
     * @return the found result formatted as JSON within a String.
     * @throws JsonProcessingException
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{column}/{value}/{column2}/{value2}")
    public Response multiParamRequest(@PathParam("column") String column, @PathParam("value") String value,
                                             @PathParam("column2") String secondaryColumn, @PathParam("value2") String secondaryValue) throws JsonProcessingException {

        Map<String, Object> searchParamMap = new HashMap<>();
        searchParamMap.put(column, value);
        searchParamMap.put(secondaryColumn, secondaryValue);

        return Response.status(200).entity(processRequest(searchParamMap)).build();
    }

    /**
     * This method receives a Key Value pair of database columns and corresponding
     * values to search for within those columns and then returns the data received
     * from the query.
     *
     * @param searchParamMap The key value pair of data to use within the database search.
     * @return the found result formatted as JSON within a String.
     */
    public String processRequest(Map searchParamMap) {

        GenericDao dao = new GenericDao(Character.class);
        List<Character> characters = dao.findByPropertyEqual(searchParamMap);

        ObjectMapper mapper = new ObjectMapper();

        try {
            foundCharacterJson = mapper.writeValueAsString(characters);
        } catch (IOException ioe) {

        }

        return foundCharacterJson;

    }
}