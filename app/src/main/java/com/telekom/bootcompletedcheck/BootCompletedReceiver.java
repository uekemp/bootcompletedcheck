package com.telekom.bootcompletedcheck;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompletedReceiver extends BroadcastReceiver {

    private static final String TAG = "BootCompletedReceiver";

    @Override
    public void onReceive(final Context context, final Intent intent) {
        Log.d(TAG, "++++++++++++++ Received intent action=" + intent.getAction() + " ++++++++++++++");
    }
}
