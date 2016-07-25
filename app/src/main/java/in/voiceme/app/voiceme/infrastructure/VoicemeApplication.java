package in.voiceme.app.voiceme.infrastructure;

import android.app.Application;

/**
 * Created by Harish on 7/20/2016.
 */
public class VoicemeApplication extends Application {
    private Auth auth;

    @Override
    public void onCreate(){
        super.onCreate();
        auth = new Auth(this);
    }

    public Auth getAuth() {
        return auth;
    }
}
