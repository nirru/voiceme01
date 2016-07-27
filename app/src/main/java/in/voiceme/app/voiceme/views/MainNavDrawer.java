package in.voiceme.app.voiceme.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.activities.BaseActivity;
import in.voiceme.app.voiceme.activities.DiscoverActivity;
import in.voiceme.app.voiceme.activities.HomeActivity;
import in.voiceme.app.voiceme.activities.MainActivity;
import in.voiceme.app.voiceme.activities.ProfileActivity;
import in.voiceme.app.voiceme.infrastructure.User;
import in.voiceme.app.voiceme.services.Account;


public class MainNavDrawer extends NavDrawer {
    private final TextView displayNameText;
    private final ImageView avatarImage;

    public MainNavDrawer(final BaseActivity activity) {
        super(activity);

        addItem(new ActivityNavDrawerItem(HomeActivity.class, "Home", null, R.mipmap.ic_action_unread, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(ProfileActivity.class, "Profile", null, R.mipmap.ic_action_send_now, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(DiscoverActivity.class, "Discover", null, R.mipmap.ic_action_group, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityNavDrawerItem(MainActivity.class, "Activity", null, R.mipmap.ic_action_person, R.id.include_main_nav_drawer_topItems));

        addItem(new BasicNavDrawerItem("Logout", null, R.mipmap.ic_action_backspace, R.id.include_main_nav_drawer_bottomItems) {
            @Override
            public void onClick(View view) {
                /*Toast.makeText(activity, "You have logged out!", Toast.LENGTH_SHORT).show();*/
                activity.getVoicemeApplication().getAuth().logout();
            }
        });

        displayNameText = (TextView) navDrawerView.findViewById(R.id.include_main_nav_drawer_displayName);
        avatarImage = (ImageView) navDrawerView.findViewById(R.id.include_main_nav_drawer_avatar);

        User loggedInUser = activity.getVoicemeApplication().getAuth().getUser();
        displayNameText.setText(loggedInUser.getUserNickName());

        // todo: change avatarImage to avatarUrl from loggedInUser
    }

    @Subscribe
    public void onUserDetailsUpdated(Account.UserDetailsUpdatedEvent event) {
        // todo: update avatar URL
        displayNameText.setText(event.User.getUserNickName());
    }
}
