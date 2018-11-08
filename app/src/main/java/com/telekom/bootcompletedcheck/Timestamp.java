package com.telekom.bootcompletedcheck;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Timestamp {

    private static final String KEY = "timestamp";

    private SharedPreferences prefs;

    private Timestamp(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static Timestamp with(Context context) {
        return new Timestamp(context);
    }

    public void save(long timestamp) {
        prefs.edit().putLong(KEY, timestamp).apply();
    }

    public long get() {
        return prefs.getLong(KEY, 0L);
    }

    public void clear() {
        prefs.edit().remove(KEY).apply();
    }
}
