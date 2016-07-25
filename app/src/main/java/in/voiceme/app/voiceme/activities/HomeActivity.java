package in.voiceme.app.voiceme.activities;

import android.os.Bundle;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.views.MainNavDrawer;


public class HomeActivity extends BaseAuthenticatedActivity {
    @Override
    protected void onVoicemeCreate(Bundle savedState) {
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        setNavDrawer(new MainNavDrawer(this));
    }
}
