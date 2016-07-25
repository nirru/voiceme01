package in.voiceme.app.voiceme.dialogs;

import android.app.DialogFragment;
import android.os.Bundle;

import com.squareup.otto.Bus;

import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;

/**
 * Created by Harish on 7/25/2016.
 */
public class BaseDialogFragment extends DialogFragment {
    protected VoicemeApplication application;
    protected Bus bus;

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        application = (VoicemeApplication) getActivity().getApplication();
        bus = application.getBus();

        bus.register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
