package in.voiceme.app.voiceme.fragments;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.views.UserPostDetails;
import in.voiceme.app.voiceme.views.MyRecyclerAdapter;


public class DiscoverLatestFragment extends BaseFragment {
    public static final String ARG_LATEST_PAGE = "ARG_LATEST_PAGE";

    private int mPage;


    public DiscoverLatestFragment() {
        // Required empty public constructor
    }

    public static DiscoverLatestFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_LATEST_PAGE, page);
        DiscoverLatestFragment fragment = new DiscoverLatestFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_LATEST_PAGE);


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_discover_latest, container, false);

        //recyclerview
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_discover_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new MyRecyclerAdapter(this.getActivity(), getDiscoverLatest()));

        return view;
    }

    private ArrayList<UserPostDetails> getDiscoverLatest(){
        // collection of crime movies
        ArrayList<UserPostDetails> movies = new ArrayList<>();

        UserPostDetails movie = new UserPostDetails(R.mipmap.ic_launcher,
                                "DavidU",
                                "is",
                                "happy",
                                "family",
                                "5 minutes ago",
                                "this is a sample post message",
                                "READ MORE....",
                                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new UserPostDetails(R.mipmap.ic_launcher,
                "sussy",
                "is",
                "sad",
                "social",
                "10 minutes ago",
                "this is a sample post message, this is a sample post message, this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new UserPostDetails(R.mipmap.ic_launcher,
                "morene",
                "is",
                "angry",
                "health",
                "25 minutes ago",
                "this is a sample post message, this is a sample post message, this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new UserPostDetails(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "happy",
                "family",
                "35 minutes ago",
                "this is a sample post message,this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new UserPostDetails(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "other",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        return movies;
    }

    @Override
    public String toString() {
        return "documentary";
    }

}
