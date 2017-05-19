package com.codingblocks.attendancetracker;

import android.app.Application;

public class AttinderApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "fonts/" + FontsOverride.FONT_PROXIMA_NOVA);
    }
}
