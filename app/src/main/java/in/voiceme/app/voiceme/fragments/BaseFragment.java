package in.voiceme.app.voiceme.fragments;

import android.app.Fragment;
import android.os.Bundle;

import com.squareup.otto.Bus;

import in.voiceme.app.voiceme.infrastructure.ActionScheduler;
import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;


public abstract class BaseFragment extends Fragment {
    protected VoicemeApplication application;
    protected Bus bus;
    protected ActionScheduler scheduler;

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        application = (VoicemeApplication) getActivity().getApplication();
        scheduler = new ActionScheduler(application);

        bus = application.getBus();
        bus.register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        scheduler.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        scheduler.onResume();
    }
}
