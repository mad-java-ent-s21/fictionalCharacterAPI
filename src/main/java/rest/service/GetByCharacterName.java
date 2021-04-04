package rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/name")
public class GetByCharacterName {

    private String name = "";

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")

    @Path("{name}")
    public Response getMessage(@PathParam("name") String name) {

        String output = "Hello ";

        if (null != name) {
            output += name;
        } else {
            output += "World";
        }

        return Response.status(200).entity(output).build();
    }
}