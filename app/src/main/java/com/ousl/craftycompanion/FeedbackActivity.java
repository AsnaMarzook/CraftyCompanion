package com.ousl.craftycompanion;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeedbackActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private EditText feedbackEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        ratingBar = findViewById(R.id.ratingBar);
        feedbackEditText = findViewById(R.id.feedbackEditText);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = ratingBar.getRating();
                String feedback = feedbackEditText.getText().toString();

                // Handle the feedback submission here
                // For now, we'll just show a toast message with the feedback
                String message = "Feedback: " + feedback + "\nRating: " + rating;
                Toast.makeText(FeedbackActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
