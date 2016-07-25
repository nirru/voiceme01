package in.voiceme.app.voiceme.activities;

import android.content.Intent;
import android.os.Bundle;

public abstract class BaseAuthenticatedActivity extends BaseActivity {
    @Override
    protected final void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        if (!application.getAuth().getUser().isLoggedIn()) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onVoicemeCreate(savedState);
    }

    protected abstract void onVoicemeCreate(Bundle savedState);
}
