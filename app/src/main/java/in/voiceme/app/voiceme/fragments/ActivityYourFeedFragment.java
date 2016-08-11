package in.voiceme.app.voiceme.fragments;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import com.like.LikeButton;

import org.json.JSONArray;
import org.json.JSONException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import in.voiceme.app.voiceme.AppConstants;
import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.adapter.LatestListAdapter;
import in.voiceme.app.voiceme.pojo.LatestModal;
import in.voiceme.app.voiceme.services.ServiceFactory;
import in.voiceme.app.voiceme.services.WebService;
import in.voiceme.app.voiceme.views.MyRecyclerAdapter;
import in.voiceme.app.voiceme.views.UserPostDetails;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class ActivityYourFeedFragment extends BaseFragment {


    public static final String ARG_FEED_PAGE = "ARG_FEED_PAGE";

    private int mPage;
    private LatestListAdapter latestListAdapter;
    private RecyclerView recyclerView;

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

        //recyclerview
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_main_feed_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new MyRecyclerAdapter(this.getActivity(), getMainFeed()));
        return view;
    }




    private ArrayList<UserPostDetails> getMainFeed(){
        // collection of crime movies
        ArrayList<UserPostDetails> userPostDetails = new ArrayList<>();
        UserPostDetails user = new UserPostDetails(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        userPostDetails.add(user);

        user = new UserPostDetails(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        userPostDetails.add(user);

        user = new UserPostDetails(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        userPostDetails.add(user);

        user = new UserPostDetails(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        userPostDetails.add(user);

        user = new UserPostDetails(R.mipmap.ic_launcher,
                "timestofly",
                "is",
                "sad",
                "family",
                "5 minutes ago",
                "this is a sample post message",
                "READ MORE....",
                R.drawable.ic_play_circle_outline_black_24dp);
        userPostDetails.add(user);

        return userPostDetails;
    }
}
