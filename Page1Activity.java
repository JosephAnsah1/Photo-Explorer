package com.example.thirdappondesk;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Page1Activity extends AppCompatActivity {

    private String[] validPasswords = {"JOSEPH", "EBENEZER", "ALEX", "BEN", "EMMANUEL", "PAUL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }

    // Method to handle the "Next" button click
    public void onLoginClick(View view) {
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        String enteredPassword = passwordEditText.getText().toString().trim();

        for (String password : validPasswords) {
            if (password.equalsIgnoreCase(enteredPassword)) {
                startActivity(new Intent(this, Page2Activity.class));
                finish();
                return;
            }
        }

        // Password is incorrect, show an error or toast message
        // For simplicity, let's just clear the password field
        passwordEditText.setText("");
    }

}
