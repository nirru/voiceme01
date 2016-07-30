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
public class DiscoverPopularFragment extends Fragment {
    public static final String ARG_POPULAR_PAGE = "ARG_POPULAR_PAGE";

    private int mPage;


    public DiscoverPopularFragment() {
        // Required empty public constructor
    }

    public static DiscoverPopularFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_POPULAR_PAGE, page);
        DiscoverPopularFragment fragment2 = new DiscoverPopularFragment();
        fragment2.setArguments(args);
        return fragment2;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_POPULAR_PAGE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover_popular, container, false);
        return view;
    }

}
