package in.voiceme.app.voiceme.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.voiceme.app.voiceme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivityYourFeedFragment extends Fragment {
    public static final String ARG_FEED_PAGE = "ARG_FEED_PAGE";

    private int mPage;


    public ActivityYourFeedFragment() {
        // Required empty public constructor
    }

    public static ActivityYourFeedFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_FEED_PAGE, page);
        ActivityYourFeedFragment fragment = new ActivityYourFeedFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_FEED_PAGE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_activity_your_feed, container, false);
        return view;
    }

}
