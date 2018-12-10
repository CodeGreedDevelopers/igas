package com.codegreed_devs.i_gas.auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.codegreed_devs.i_gas.DashBoard.Main_Activity;
import com.codegreed_devs.i_gas.MainActivity;
import com.codegreed_devs.i_gas.R;

public class RegistrationActivity extends AppCompatActivity {
    Button signupButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        signupButton = findViewById(R.id.signupButton);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMain_Activity();
            }
        });

    }

    private void goToMainActivity() {
        Intent homeIntent = new Intent(RegistrationActivity.this,MainActivity.class);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
        finish();
    }

    public void goToMain_Activity() {
        Intent mainActivity = new Intent(RegistrationActivity.this, Main_Activity.class);
        mainActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainActivity);
        finish();
    }

    private void goToLogInActivity() {
        Intent loginIntent = new Intent(RegistrationActivity.this,LoginActivity.class);
        loginIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(loginIntent);
        finish();
    }
}
