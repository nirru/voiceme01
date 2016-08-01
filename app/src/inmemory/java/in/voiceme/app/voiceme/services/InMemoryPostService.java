package in.voiceme.app.voiceme.services;

import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;
import in.voiceme.app.voiceme.services.entities.UserDetails;

/**
 * Created by Harish on 7/30/2016.
 */
public class InMemoryPostService extends BaseInMemoryService {
    protected InMemoryPostService(VoicemeApplication application) {
        super(application);
    }

    private UserDetails createFakeuser(int id_user_name){
        String idString = Integer.toString(id_user_name);
        return new UserDetails(id_user_name,
                "User " + idString,
                "http://www.gravatar.com/avatar/" + idString + "?d=identicon&s=64");
    }
}
