package in.voiceme.app.voiceme.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.voiceme.app.voiceme.R;


/**
 * Created by Harish on 7/31/2016.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView user_avatar;
    ImageView play_button;
    TextView user_name;
    TextView isPost;
    TextView feeling;
    TextView category;
    TextView timeStamp;
    TextView postMessage;
    TextView postReadMore;
    ItemClickListener listener;


    public MyViewHolder(View itemView) {
        super(itemView);

        user_name = (TextView) itemView.findViewById(R.id.list_item_post_userNickName);
        isPost = (TextView) itemView.findViewById(R.id.list_item_post_is);
        feeling = (TextView) itemView.findViewById(R.id.list_item_posts_feeling);
        category = (TextView) itemView.findViewById(R.id.list_item_posts_category);
        timeStamp = (TextView) itemView.findViewById(R.id.list_item_posts_timeStamp);
        postMessage = (TextView) itemView.findViewById(R.id.list_item_posts_message);
        postReadMore = (TextView) itemView.findViewById(R.id.list_item_posts_read_more);
        user_avatar = (ImageView) itemView.findViewById(R.id.list_item_posts_avatar);
        play_button = (ImageView) itemView.findViewById(R.id.list_item_posts_play_button);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.listener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        this.listener.onItemClick(view, getLayoutPosition());
    }

}
