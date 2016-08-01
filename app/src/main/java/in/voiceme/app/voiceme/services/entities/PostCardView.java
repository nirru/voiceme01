package in.voiceme.app.voiceme.services.entities;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
    private boolean readMore;
    private ImageView playButton;

    private String likes;
    private String hug;
    private String same;
    private String duration;
    private String listen;

    private UserDetails otherUser;

    private int likesCount;
    private int hugCount;
    private int sameCount;
    private String durationCount;
    private int listenCount;

    private boolean isFromUs;
    private boolean isSelected;

    public PostCardView(int id_posts,
                        int id_username,
                        String imageUrl,
                        String username,
                        String isFeeling,
                        String feeling,
                        String category,
                        Calendar time,
                        String postMessage,
                        boolean readMore,
                        ImageView playButton,
                        String likes,
                        String hug,
                        String same,
                        String duration,
                        String listen,
                        UserDetails otherUser,
                        int likesCount,
                        int hugCount,
                        int sameCount,
                        String durationCount,
                        int listenCount,
                        boolean isFromUs) {
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
        this.otherUser = otherUser;
        this.likesCount = likesCount;
        this.hugCount = hugCount;
        this.sameCount = sameCount;
        this.durationCount = durationCount;
        this.listenCount = listenCount;
        this.isFromUs = isFromUs;
    }

    private PostCardView(Parcel in) {
        id_posts = in.readInt();
        id_username = in.readInt();
        time = new GregorianCalendar();
        time.setTimeInMillis(in.readLong());
        username = in.readString();
        isFeeling = in.readString();
        feeling = in.readString();
        category = in.readString();
        postMessage = in.readString();
        likes = in.readString();
        hug = in.readString();
        username = in.readString();
        same = in.readString();
        imageUrl = in.readString();
        otherUser = (UserDetails) in.readParcelable(UserDetails.class.getClassLoader());
        isFromUs = in.readByte() == 1;
        readMore = in.readByte() == 1;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(id_posts);
        out.writeInt(id_username);
        out.writeLong(time.getTimeInMillis());
        out.writeString(username);
        out.writeString(isFeeling);
        out.writeString(category);
        out.writeString(postMessage);
        out.writeString(likes);
        out.writeString(hug);
        out.writeString(username);
        out.writeString(same);
        out.writeString(username);
        out.writeString(imageUrl);
        out.writeParcelable(otherUser, 0);
        out.writeByte((byte)(isFromUs ? 1 : 0));
        out.writeByte((byte)(readMore ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
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

    public boolean getReadMore() {
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

    public UserDetails getOtherUser() {
        return otherUser;
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

    public void setReadMore(boolean readMore) {
        this.readMore = readMore;
    }


    public static final Creator<PostCardView> CREATOR = new Creator<PostCardView>() {
        @Override
        public PostCardView createFromParcel(Parcel source) {
            return new PostCardView(source);
        }

        @Override
        public PostCardView[] newArray(int size) {
            return new PostCardView[size];
        }
    };
}
