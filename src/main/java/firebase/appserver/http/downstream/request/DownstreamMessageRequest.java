package firebase.appserver.http.downstream.request;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.LinkedHashMap;

/**
 * Created by kevint on 9/5/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownstreamMessageRequest {

    String to;
    String[] registration_ids;

    String collapse_key;
    Priority priority;
    boolean content_available;
    boolean delay_while_idle;
    int time_to_live;
    String restricted_package_name;
    boolean dry_run;

    Object data;
    Notification notification;

    public String getTo() {
        return to;
    }

    public DownstreamMessageRequest setTo(String to) {
        this.to = to;
        return this;
    }

    public String[] getRegistration_ids() {
        return registration_ids;
    }

    public DownstreamMessageRequest setRegistration_ids(String[] registration_ids) {
        this.registration_ids = registration_ids;
        return this;
    }

    public String getCollapse_key() {
        return collapse_key;
    }

    public DownstreamMessageRequest setCollapse_key(String collapse_key) {
        this.collapse_key = collapse_key;
        return this;
    }

    public Priority getPriority() {
        return priority;
    }

    public DownstreamMessageRequest setPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    public boolean isContent_available() {
        return content_available;
    }

    public DownstreamMessageRequest setContent_available(boolean content_available) {
        this.content_available = content_available;
        return this;
    }

    public boolean isDelay_while_idle() {
        return delay_while_idle;
    }

    public DownstreamMessageRequest setDelay_while_idle(boolean delay_while_idle) {
        this.delay_while_idle = delay_while_idle;
        return this;
    }

    public int getTime_to_live() {
        return time_to_live;
    }

    public void setTime_to_live(int time_to_live) {
        this.time_to_live = time_to_live;
    }

    public String getRestricted_package_name() {
        return restricted_package_name;
    }

    public void setRestricted_package_name(String restricted_package_name) {
        this.restricted_package_name = restricted_package_name;
    }

    public boolean isDry_run() {
        return dry_run;
    }

    public void setDry_run(boolean dry_run) {
        this.dry_run = dry_run;
    }

    public Object getData() {
        return data;
    }

    public DownstreamMessageRequest setData(Object data) {
        this.data = data;
        return this;
    }

    public Notification getNotification() {
        return notification;
    }

    public DownstreamMessageRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

}
