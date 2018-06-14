package com.rabbit.green.jokedisplay;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String JOKE_BUNDLE_KEY = JokeActivity.class.getName() + ".JOKE_BUNDLE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_BUNDLE_KEY)) {
            ((TextView) findViewById(R.id.joke_tv)).setText(intent.getStringExtra(JOKE_BUNDLE_KEY));
        }
    }

    public static void startJokeActivity(@NonNull String joke, @NonNull Context context) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(JOKE_BUNDLE_KEY, joke);
        context.startActivity(intent);
    }
}
