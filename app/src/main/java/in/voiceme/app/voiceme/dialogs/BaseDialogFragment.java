package in.voiceme.app.voiceme.dialogs;

import android.app.DialogFragment;
import android.os.Bundle;

import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;

/**
 * Created by Harish on 7/25/2016.
 */
public class BaseDialogFragment extends DialogFragment {
    protected VoicemeApplication application;

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        application = (VoicemeApplication) getActivity().getApplication();
    }
}
