package in.voiceme.app.voiceme.views;

import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.activities.BaseActivity;
import in.voiceme.app.voiceme.services.entities.PostCardView;

/**
 * Created by Harish on 7/28/2016.
 */
public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> implements View.OnClickListener {
    private final LayoutInflater layoutInflater;
    private final BaseActivity activity;
    private final ArrayList<PostCardView> postCardView;
    private final OnMessageClickedListener listener;

    public PostAdapter(BaseActivity activity, OnMessageClickedListener listener) {
        this.activity = activity;
        this.listener = listener;
        postCardView = new ArrayList<>();
        layoutInflater = activity.getLayoutInflater();
    }

    public ArrayList<PostCardView> getPostCardView() {
        return postCardView;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item_posts_cardview, parent, false);
        view.setOnClickListener(this);
        PostViewHolder viewHolder = new PostViewHolder(view);
        viewHolder.getBackgroundView().setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        PostCardView postCardView = this.postCardView.get(position);
        holder.getBackgroundView().setTag(postCardView);
        holder.populate(activity, postCardView);
    }

    @Override
    public int getItemCount() {
        return postCardView.size();
    }

    @Override
    public void onClick(View view) {
        if (view.getTag() instanceof Message) {
            PostCardView postCardView = (PostCardView) view.getTag();
            listener.onMessageClicked(postCardView);
        }
    }

    public interface OnMessageClickedListener {
        void onMessageClicked(PostCardView postCardView);
    }
}
