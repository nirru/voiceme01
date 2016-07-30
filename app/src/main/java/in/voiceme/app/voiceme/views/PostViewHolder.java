package in.voiceme.app.voiceme.views;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.services.entities.PostCardView;

/**
 * Created by Harish on 7/28/2016.
 */
public class PostViewHolder extends RecyclerView.ViewHolder {
    private ImageView avatarUrl;
    private TextView username;
    private TextView isFeeling;
    private TextView feeling;
    private TextView category;

    private TextView timeStamp;
    private TextView postMessage;
    private TextView readMore;
    private ImageView playButton;

    private TextView likes;
    private TextView hug;
    private TextView same;
    private TextView duration;
    private TextView listen;

    private int likesCount;
    private int hugCount;
    private int sameCount;
    private TextView durationCount;
    private int listenCount;

    private CardView cardView;

    public PostViewHolder(View view) {
        super(view);
        cardView = (CardView) view;

        avatarUrl = (ImageView) view.findViewById(R.id.list_item_posts_avatar);
        username = (TextView) view.findViewById(R.id.list_item_post_userNickName);
        isFeeling = (TextView) view.findViewById(R.id.list_item_post_is);
        category = (TextView) view.findViewById(R.id.list_item_posts_category);
        timeStamp = (TextView) view.findViewById(R.id.list_item_posts_timeStamp);
        postMessage = (TextView) view.findViewById(R.id.list_item_posts_message);
        readMore = (TextView) view.findViewById(R.id.list_item_posts_read_more);
        playButton = (ImageView) view.findViewById(R.id.list_item_posts_play_button);
        likes = (TextView) view.findViewById(R.id.list_item_posts_likes);
        hug = (TextView) view.findViewById(R.id.list_item_posts_hug);
        same = (TextView) view.findViewById(R.id.list_item_posts_same);
        duration = (TextView) view.findViewById(R.id.list_item_posts_duration);
        listen = (TextView) view.findViewById(R.id.list_item_posts_listen);

    }

    public void populate(Context context, PostCardView postCardView){
        itemView.setTag(postCardView);

        Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(avatarUrl);

        String timeStamp = DateUtils.formatDateTime(
                context,
                postCardView.getTime().getTimeInMillis(),
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_TIME);

        username.setText(postCardView.getUsername());
        isFeeling.setText(postCardView.getIsFeeling());
        category.setText(postCardView.getCategory());
        feeling.setText(postCardView.getFeeling());
        postMessage.setText(postCardView.getPostMessage());
        readMore.setText(postCardView.getReadMore());
        likes.setText(postCardView.getLikes());
        hug.setText(postCardView.getHug());
        duration.setText(postCardView.getDuration());
        listen.setText(postCardView.getListen());

        this.timeStamp.setText(timeStamp);
    }
}
