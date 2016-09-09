package com.google.firebase.messaging.contrib.jax.rs.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kevint on 9/5/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownstreamMessageResponse {

    long multicase_id;
    long success;
    long failure;
    long canonical_ids;

    @JsonDeserialize(contentAs = Result.class, as = LinkedList.class)
    List<Result> results;

    //if sent to topic

    long message_id;
    ErrorType error;

    public long getMulticase_id() {
        return multicase_id;
    }

    public void setMulticase_id(long multicase_id) {
        this.multicase_id = multicase_id;
    }

    public long getSuccess() {
        return success;
    }

    public void setSuccess(long success) {
        this.success = success;
    }

    public long getFailure() {
        return failure;
    }

    public void setFailure(long failure) {
        this.failure = failure;
    }

    public long getCanonical_ids() {
        return canonical_ids;
    }

    public void setCanonical_ids(long canonical_ids) {
        this.canonical_ids = canonical_ids;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }

    public ErrorType getError() {
        return error;
    }

    public void setError(ErrorType error) {
        this.error = error;
    }
}
