package firebase.appserver.http.downstream.response;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by kevint on 9/5/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    String message_id;
    ErrorType error;

    String registration_id;

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public ErrorType getError() {
        return error;
    }

    public void setError(ErrorType error) {
        this.error = error;
    }

    public String getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(String registration_id) {
        this.registration_id = registration_id;
    }

}
