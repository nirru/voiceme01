package in.voiceme.app.voiceme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import in.voiceme.app.voiceme.R;


public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    private EditText usernameText;
    private EditText emailText;
    private EditText passwordText;
    private Button registerButton;
    private View progressBar;

    private View facebookLoginButton;
    private View googleLoginButton;

    private static final int REQUEST_EXTERNAL_LOGIN = 3;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        setContentView(R.layout.activity_register);

        usernameText = (EditText) findViewById(R.id.activity_register_userName);
        emailText = (EditText) findViewById(R.id.activity_register_email);
        passwordText = (EditText) findViewById(R.id.activity_register_password);
        registerButton = (Button) findViewById(R.id.activity_register_registerButton);
        progressBar = findViewById(R.id.activity_register_progressBar);

        facebookLoginButton = findViewById(R.id.activity_login_facebook);
        googleLoginButton = findViewById(R.id.activity_login_google);

        registerButton.setOnClickListener(this);
        progressBar.setVisibility(View.GONE);

        facebookLoginButton.setOnClickListener(this);
        googleLoginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == registerButton) {
            application.getAuth().getUser().setLoggedIn(true);

            setResult(RESULT_OK);
            finish();
        }  else if (view == googleLoginButton)
            doExternalLogin("Google");
        else if (view == facebookLoginButton)
            doExternalLogin("Facebook");
    }

    private void doExternalLogin(String externalService) {
        Intent intent = new Intent(this, ExternalLoginActivity.class);
        intent.putExtra(ExternalLoginActivity.EXTRA_EXTERNAL_SERVICE, externalService);
        startActivityForResult(intent, REQUEST_EXTERNAL_LOGIN);
    }
}
