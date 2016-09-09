package com.google.firebase.messaging.contrib.jax.rs.api.response;

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
