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
public class DiscoverTrendingFragment extends Fragment {
    public static final String ARG_TRENDING_PAGE = "ARG_TRENDING_PAGE";

    private int mPage;


    public DiscoverTrendingFragment() {
        // Required empty public constructor
    }

    public static DiscoverTrendingFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_TRENDING_PAGE, page);
        DiscoverTrendingFragment fragment = new DiscoverTrendingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_TRENDING_PAGE);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover_trending, container, false);
        return view;
    }

}
