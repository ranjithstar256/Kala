package com.androidmanifester.kala;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AudioVideoExpl extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_video_expl);
        mediaPlayer=MediaPlayer.create(this,R.raw.abc);
    }

    public void str(View view) {
        mediaPlayer.start();
    }

    public void pau(View view) {
        mediaPlayer.pause();
    }

    public void stp(View view) {
        mediaPlayer.stop();
    }
}
