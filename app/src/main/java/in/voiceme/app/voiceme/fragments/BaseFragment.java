package in.voiceme.app.voiceme.fragments;

import android.app.Fragment;
import android.os.Bundle;

import com.squareup.otto.Bus;

import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;


public abstract class BaseFragment extends Fragment {
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
