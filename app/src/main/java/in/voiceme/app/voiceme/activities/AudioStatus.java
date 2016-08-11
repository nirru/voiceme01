package in.voiceme.app.voiceme.activities;

import android.os.Bundle;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.views.MainNavDrawer;

public class AudioStatus extends BaseAuthenticatedActivity {

    @Override
    protected void onVoicemeCreate(Bundle savedState) {
        setContentView(R.layout.activity_audio_status);
        getSupportActionBar().setTitle("Audio Status");
        setNavDrawer(new MainNavDrawer(this));
    }

}
