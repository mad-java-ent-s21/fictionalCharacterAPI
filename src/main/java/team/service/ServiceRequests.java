package team.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * This class specifies the path that must be used by users in order to make
 * GET and POST requests for using the API and specifies which classes are
 * necessary in order for the API to function.
 *
 */
@ApplicationPath("/service")
public class ServiceRequests extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(CharacterRequests.class );
        h.add(InsertNewCharacter.class);
        return h;
    }
}