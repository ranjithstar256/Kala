package com.androidmanifester.kala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class AnimationExpl extends AppCompatActivity {

    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_expl);
        animation= AnimationUtils.loadAnimation(this,R.anim.nav);
    }

    public void rot(View view) {
        view.startAnimation(animation);
    }
}
