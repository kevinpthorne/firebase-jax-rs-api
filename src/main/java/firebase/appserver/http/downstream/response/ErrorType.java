package firebase.appserver.http.downstream.response;

/**
 * Created by kevint on 9/5/2016.
 */
public enum ErrorType {

    InvalidRegistration,
    NotRegistered,
    MissingRegistration,
    InvalidPackageName,
    MismatchSenderId,
    MessageTooBig,
    InvalidDataKey,
    InvalidTtl,
    Unavailable,
    InternalServerError,
    DeviceMessageRateExceeded,
    TopicsMessageRateExceeded;

}
