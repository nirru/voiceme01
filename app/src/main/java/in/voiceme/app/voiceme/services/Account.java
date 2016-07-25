package in.voiceme.app.voiceme.services;

import android.net.Uri;

/**
 * Created by Harish on 7/25/2016.
 */
public final class Account {

    private Account(){

    }

    public static class ChangeAvatarRequest {
        public Uri NewAvatarUri;

        public ChangeAvatarRequest(Uri newAvatarUri) {
            NewAvatarUri = newAvatarUri;
        }
    }

    public static class ChangeAvatarResponse {
    }
}
