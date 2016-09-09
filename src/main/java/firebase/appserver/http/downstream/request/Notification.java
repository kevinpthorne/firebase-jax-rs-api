package firebase.appserver.http.downstream.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by kevint on 9/5/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Notification {

    String title;
    String body;
    /**
     * Android only: Sets value to myicon for drawable resource myicon
     */
    String icon;
    /**
     * <b>iOS:</b> Sound files can be in the main bundle of the client app or in the Library/Sounds folder of the app's data container <br>
     * <b>Android:</b> relative to /res/raw. "default" is supported
     */
    String sound;
    /**
     * <b><i>iOS only</i></b>
     */
    String badge;
    /**
     * <b><i>Android only:</i></b><p>Indicates whether each notification results in a new entry in the notification drawer on Android.
     *                               If not set, each request creates a new notification.
     *                               If set, and a notification with the same tag is already being shown, the new notification
     *                               replaces the existing one in the notification drawer.</p>
     */
    String tag;
    /**
     * <b><i>Android only:</i></b> #rrggbb
     */
    String color;
    /**
     * <b>iOS:</b> Corresponds to category in the APNs payloads <br>
     * <b>Android:</b> Activity with matching intent filter is launched
     */
    String click_action;

    /**
     * <b>iOS:</b> Corresponds to "loc-key" in the APNs payload. <br>
     * <b>Android:</b> Use the key in the app's string resources when populating this value.
     */
    String body_loc_key;
    /**
     * <b>iOS:</b> Corresponds to "loc-args" in the APNs payload.<br>
     * <b>Android:</b> Indicates the string value to replace format specifiers in the body string for localization.
     *      For more information, <a href="http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling">Formatting and Styling</a>.
     */
    String[] body_loc_args;
    String title_loc_key;
    String[] title_loc_args;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClick_action() {
        return click_action;
    }

    public void setClick_action(String click_action) {
        this.click_action = click_action;
    }

    public String getBody_loc_key() {
        return body_loc_key;
    }

    public void setBody_loc_key(String body_loc_key) {
        this.body_loc_key = body_loc_key;
    }

    public String[] getBody_loc_args() {
        return body_loc_args;
    }

    public void setBody_loc_args(String[] body_loc_args) {
        this.body_loc_args = body_loc_args;
    }

    public String getTitle_loc_key() {
        return title_loc_key;
    }

    public void setTitle_loc_key(String title_loc_key) {
        this.title_loc_key = title_loc_key;
    }

    public String[] getTitle_loc_args() {
        return title_loc_args;
    }

    public void setTitle_loc_args(String[] title_loc_args) {
        this.title_loc_args = title_loc_args;
    }

}
