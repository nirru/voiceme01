package in.voiceme.app.voiceme.infrastructure;

import android.app.Application;
import android.net.Uri;

import com.squareup.otto.Bus;

import in.voiceme.app.voiceme.services.Module;

/**
 * Created by Harish on 7/20/2016.
 */
public class VoicemeApplication extends Application {
    public static final Uri API_ENDPOINT = Uri.parse("http://yora-playground.3dbuzz.com");
    public static final String STUDENT_TOKEN = "";

    private Auth auth;
    private Bus bus;

    public VoicemeApplication() {
        bus = new Bus();
    }

    @Override
    public void onCreate(){
        super.onCreate();
        auth = new Auth(this);
        Module.register(this);
    }

    public Auth getAuth() {
        return auth;
    }

    public Bus getBus() { return bus; }
}
