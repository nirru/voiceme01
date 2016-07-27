package in.voiceme.app.voiceme.services;

import com.squareup.otto.Subscribe;

import in.voiceme.app.voiceme.infrastructure.Auth;
import in.voiceme.app.voiceme.infrastructure.User;
import in.voiceme.app.voiceme.infrastructure.VoicemeApplication;

/**
 * Created by Harish on 7/26/2016.
 */
public class InMemoryAccountService extends BaseInMemoryService {

    public InMemoryAccountService(VoicemeApplication application) {
        super(application);
    }

    @Subscribe
    public void updateProfile(final Account.UpdateProfileRequest request) {
        final Account.UpdateProfileResponse response = new Account.UpdateProfileResponse();

        if (request.UserNickName.equals("nelson")) {
            response.setPropertyError("displayName", "You may not be named Nelson!");
        }

        invokeDelayed(new Runnable() {
            @Override
            public void run() {
                User user = application.getAuth().getUser();
                user.setUserNickName(request.UserNickName);
                user.setEmail(request.Email);

                bus.post(response);
                bus.post(new Account.UserDetailsUpdatedEvent(user));
            }
        }, 2000, 3000);


    }

    @Subscribe
    public void updateAvatar(final Account.ChangeAvatarRequest request) {
        invokeDelayed(new Runnable() {
            @Override
            public void run() {
                User user = application.getAuth().getUser();
                user.setAvatarPics(request.NewAvatarUri.toString());

                bus.post(new Account.ChangeAvatarResponse());
                bus.post(new Account.UserDetailsUpdatedEvent(user));
            }
        }, 4000, 5000);
    }


    @Subscribe
    public void changePassword(Account.ChangePasswordRequest request) {
        Account.ChangePasswordResponse response = new Account.ChangePasswordResponse();

        if (!request.NewPassword.equals(request.ConfirmNewPassword))
            response.setPropertyError("confirmNewPassword", "Passwords must match!");

        if (request.NewPassword.length() < 3)
            response.setPropertyError("newPassword", "Password must be larger than 3 characters");

        postDelayed(response);
    }

    /* fake login with username */
    @Subscribe
    public void loginWithUsername(final Account.LoginWithUsernameRequest request) {
        invokeDelayed(new Runnable() {
            @Override
            public void run() {
                Account.LoginWithUsernameResponse response = new Account.LoginWithUsernameResponse();

                if (request.Username.equals("nelson"))
                    response.setPropertyError("userName", "Invalid username or password");

                loginUser(response);
                bus.post(response);
            }
        }, 1000, 2000);
    }

    /* fake login with external token */
    @Subscribe
    public void loginWithExternalToken(Account.LoginWithExternalTokenRequest request) {
        invokeDelayed(new Runnable() {
            @Override
            public void run() {
                Account.LoginWithExternalTokenResponse response = new Account.LoginWithExternalTokenResponse();
                loginUser(response);
                bus.post(response);
            }
        }, 1000, 2000);
    }


    /* fake register */
    @Subscribe
    public void register(Account.RegisterRequest request) {
        invokeDelayed(new Runnable() {
            @Override
            public void run() {
                Account.RegisterResponse response = new Account.RegisterResponse();
                loginUser(response);
                bus.post(response);
            }
        }, 1000, 2000);
    }

    /* fake register with facebook andd google */
    @Subscribe
    public void externalRegister(Account.RegisterWithExternalTokenRequest request) {
        invokeDelayed(new Runnable() {
            @Override
            public void run() {
                Account.RegisterResponse response = new Account.RegisterResponse();
                loginUser(response);
                bus.post(response);
            }
        }, 1000, 2000);
    }

    /* fake auto login with local token */
    @Subscribe
    public void loginWithLocalToken(Account.LoginWithLocalTokenRequest request) {
        invokeDelayed(new Runnable() {
            @Override
            public void run() {
                Account.LoginWithLocalTokenResponse response = new Account.LoginWithLocalTokenResponse();
                loginUser(response);
                bus.post(response);
            }
        }, 1000, 2000);
    }


    private void loginUser(Account.UserResponse response) {
        Auth auth = application.getAuth();
        User user = auth.getUser();

        user.setUserNickName("Nelson LaQuet");
        user.setEmail("nelson@3dbuzz.com");
        user.setAvatarPics("http://www.gravatar.com/avatar/1?d=identicon");
        user.setLoggedIn(true);
        user.setIdUserName(123);
        bus.post(new Account.UserDetailsUpdatedEvent(user));

        auth.setAuthToken("fakeauthtoken");

        response.UserNickName = user.getUserNickName();
        response.Email = user.getEmail();
        response.AvatarUrl = user.getAvatarPics();
        response.Id = user.getIdUserName();
        response.AuthToken = auth.getAuthToken();
    }
}
