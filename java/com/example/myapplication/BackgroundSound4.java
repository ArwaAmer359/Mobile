package com.example.firstapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class BackgroundSound4 extends Service {

    private MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        player = MediaPlayer.create( this,R.raw.history );
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        player.setLooping( true );
        player.start();
        return START_STICKY;
    }

    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }

}
