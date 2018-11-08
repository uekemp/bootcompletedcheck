package com.telekom.bootcompletedcheck;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this::clear);
    }

    @Override
    protected void onResume() {
        super.onResume();
        update();
    }

    @SuppressLint("SetTextI18n")
    private void update() {
        TextView tv = findViewById(R.id.text);
        long timestamp = Timestamp.with(this).get();
        if (timestamp <= 0) {
            tv.setText("No BOOT_COMPLETED broadcast received");
        } else {
            tv.setText("Last BOOT_COMPLETED broadcast received:\n" + new Date(timestamp));
        }
    }

    private void clear(View view) {
        Timestamp.with(this).clear();
        update();
    }
}
