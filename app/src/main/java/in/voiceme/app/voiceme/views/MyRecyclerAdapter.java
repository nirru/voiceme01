package in.voiceme.app.voiceme.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import in.voiceme.app.voiceme.R;

/**
 * Created by Harish on 7/31/2016.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    ArrayList<Movie> movies;

    public MyRecyclerAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    // initilise holder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_posts_cardview, null);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    //bind the data
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.user_name.setText(movies.get(position).getUsername());
        holder.isPost.setText(movies.get(position).getIsFeeling());
        holder.feeling.setText(movies.get(position).getFeeling());
        holder.category.setText(movies.get(position).getCategory());
        holder.timeStamp.setText(movies.get(position).getTimeStamp());
        holder.postMessage.setText(movies.get(position).getPostMessage());
        holder.postReadMore.setText(movies.get(position).getReadMore());
        holder.user_avatar.setImageResource(movies.get(position).getAvatarUrl());
        holder.play_button.setImageResource(movies.get(position).getPlayButton());

        //listener
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(context, movies.get(position).getUsername(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
