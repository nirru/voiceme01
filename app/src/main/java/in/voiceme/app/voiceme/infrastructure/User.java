package in.voiceme.app.voiceme.infrastructure;

import java.util.Date;

/**
 * Created by Harish on 7/20/2016.
 */
public class User {

    private int idUserName;
    private String avatarPics;
    private String userNickName;
    private Date userDateOfBirth;
    private String email;
    private boolean hasPassword;
    private boolean isLoggedIn;

    public boolean isHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(boolean hasPassword) {
        this.hasPassword = hasPassword;
    }

    public int getIdUserName() {
        return idUserName;
    }

    public void setIdUserName(int idUserName) {
        this.idUserName = idUserName;
    }

    public String getAvatarPics() {
        return avatarPics;
    }

    public void setAvatarPics(String avatarPics) {
        this.avatarPics = avatarPics;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Date getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public void setUserDateOfBirth(Date userDateOfBirth) {
        this.userDateOfBirth = userDateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

}
