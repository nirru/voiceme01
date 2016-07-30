package in.voiceme.app.voiceme.services.entities;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import java.util.Calendar;

/**
 * Created by Harish on 7/28/2016.
 */
public class PostCardView implements Parcelable {
    private int id_posts;
    private int id_username;
    private String imageUrl;
    private String username;
    private String isFeeling;
    private String feeling;
    private String category;

    private Calendar time;
    private String postMessage;
    private String readMore;
    private ImageView playButton;

    private String likes;
    private String hug;
    private String same;
    private String duration;
    private String listen;

    private int likesCount;
    private int hugCount;
    private int sameCount;
    private String durationCount;
    private int listenCount;

    public PostCardView(int id_posts,
                        int id_username,
                        String imageUrl,
                        String username,
                        String isFeeling,
                        String feeling,
                        String category,
                        Calendar time,
                        String postMessage,
                        String readMore,
                        ImageView playButton,
                        String likes,
                        String hug,
                        String same,
                        String duration,
                        String listen,
                        int likesCount,
                        int hugCount,
                        int sameCount,
                        String durationCount,
                        int listenCount) {
        this.id_posts = id_posts;
        this.id_username = id_username;
        this.imageUrl = imageUrl;
        this.username = username;
        this.isFeeling = isFeeling;
        this.feeling = feeling;
        this.category = category;
        this.time = time;
        this.postMessage = postMessage;
        this.readMore = readMore;
        this.playButton = playButton;
        this.likes = likes;
        this.hug = hug;
        this.same = same;
        this.duration = duration;
        this.listen = listen;
        this.likesCount = likesCount;
        this.hugCount = hugCount;
        this.sameCount = sameCount;
        this.durationCount = durationCount;
        this.listenCount = listenCount;
    }

    public int getId_posts() {
        return id_posts;
    }

    public int getId_username() {
        return id_username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getIsFeeling() {
        return isFeeling;
    }

    public String getFeeling() {
        return feeling;
    }

    public String getCategory() {
        return category;
    }

    public Calendar getTime() {
        return time;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public String getReadMore() {
        return readMore;
    }

    public ImageView getPlayButton() {
        return playButton;
    }

    public String getLikes() {
        return likes;
    }

    public String getHug() {
        return hug;
    }

    public String getSame() {
        return same;
    }

    public String getDuration() {
        return duration;
    }

    public String getListen() {
        return listen;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public int getHugCount() {
        return hugCount;
    }

    public int getSameCount() {
        return sameCount;
    }

    public String getDurationCount() {
        return durationCount;
    }

    public int getListenCount() {
        return listenCount;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public static final Creator<PostCardView> CREATOR = new Creator<PostCardView>() {
        @Override
        public PostCardView createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public PostCardView[] newArray(int size) {
            return new PostCardView[0];
        }
    };
}
