package in.voiceme.app.voiceme.services.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Harish on 7/30/2016.
 */
public class UserDetails implements Parcelable {
    private int id_user_name;
    private String avatar_url;
    private String user_nick_name;

    public UserDetails(int id_user_name, String user_nick_name, String avatar_url) {
        this.id_user_name = id_user_name;
        this.user_nick_name = user_nick_name;
        this.avatar_url = avatar_url;
    }

    private UserDetails(Parcel parcel) {
        id_user_name = parcel.readInt();
        user_nick_name = parcel.readString();
        avatar_url = parcel.readString();
    }

    @Override
    public void writeToParcel(Parcel destination, int flags) {
        destination.writeInt(id_user_name);
        destination.writeString(user_nick_name);
        destination.writeString(avatar_url);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public int getId_user_name() {
        return id_user_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getUser_nick_name() {
        return user_nick_name;
    }

    public static final Creator<UserDetails> CREATOR = new Creator<UserDetails>() {
        @Override
        public UserDetails createFromParcel(Parcel source) {
            return new UserDetails(source);
        }

        @Override
        public UserDetails[] newArray(int size) {
            return new UserDetails[size];
        }
    };
}
