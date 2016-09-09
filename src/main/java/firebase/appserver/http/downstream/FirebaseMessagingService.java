package firebase.appserver.http.downstream;

import firebase.appserver.http.downstream.request.DownstreamMessageRequest;
import firebase.appserver.http.downstream.response.DownstreamMessageResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @link https://firebase.google.com/docs/cloud-messaging/http-server-ref
 *
 * Created by kevint on 7/14/2016.
 */
@Path("/fcm")
public interface FirebaseMessagingService {

    String BASE = "https://fcm.googleapis.com/";

    @POST
    @Path("/send")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    DownstreamMessageResponse send(DownstreamMessageRequest messageRequest);

}
