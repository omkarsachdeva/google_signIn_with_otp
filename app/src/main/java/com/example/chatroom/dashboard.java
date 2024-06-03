package com.example.chatroom;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    private static final String TAG = "dashboard";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageView githubIcon = findViewById(R.id.github);
        ImageView twitterIcon = findViewById(R.id.twitter);
        ImageView linkedinIcon = findViewById(R.id.linkdin);
        ImageView instagramIcon = findViewById(R.id.instagram);

        githubIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/omkarsachdeva");
            }

            private void gotoUrl(String url) {
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        twitterIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://x.com/SachdevaOm3020");
            }

            private void gotoUrl(String url) {
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        linkedinIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/omkar-sachdeva-00443328a/");
            }

            private void gotoUrl(String url) {
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        instagramIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/omkarsachdeva/");
            }

            private void gotoUrl(String url) {
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        // Test if the URLs open directly on activity start


    }


    }
