package in.voiceme.app.voiceme.fragments;

import android.app.Fragment;
import android.os.Bundle;

import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;


public abstract class BaseFragment extends Fragment {
    protected VoicemeApplication application;

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        application = (VoicemeApplication) getActivity().getApplication();
    }
}
