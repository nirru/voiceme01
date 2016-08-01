package in.voiceme.app.voiceme.fragments;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.views.Movie;
import in.voiceme.app.voiceme.views.MyRecyclerAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverPopularFragment extends BaseFragment {
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
        //recyclerview
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mRecyclerDoc);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new MyRecyclerAdapter(this.getActivity(), getCrimeMovies()));
        return view;
    }


    private ArrayList<Movie> getCrimeMovies(){
        // collection of crime movies
        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie = new Movie(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new Movie(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new Movie(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new Movie(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        movies.add(movie);

        movie = new Movie(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
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
