package firebase.appserver.http.downstream.filters;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * Created by kevint on 9/5/2016.
 */
public class FirebaseRequestSecurityFilter implements ClientRequestFilter {

    String apiKey;

    public FirebaseRequestSecurityFilter(String firebaseApiKey) {
        apiKey = firebaseApiKey;
    }

    public void filter(ClientRequestContext requestContext) throws IOException {
        requestContext.getHeaders().add("Authorization", "key=" + apiKey);
    }

}
