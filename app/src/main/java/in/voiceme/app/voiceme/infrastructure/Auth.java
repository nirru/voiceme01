package in.voiceme.app.voiceme.infrastructure;

import android.content.Context;

/**
 * Created by Harish on 7/20/2016.
 */
public class Auth {
    private final Context context;
    private User user;


    public Auth(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }
}
