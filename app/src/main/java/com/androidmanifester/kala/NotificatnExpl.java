package com.androidmanifester.kala;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotificatnExpl extends AppCompatActivity {
String h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificatn_expl);
    }

    public void notifyy(View view) {

        // 1. create a Intent
        // 2. create a PendingIntent
        // 3. design Notification
        // 4. initilaze NotificationManager

        Intent intent = new Intent(NotificatnExpl.this,AnimationExpl.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(NotificatnExpl.this,0,intent,0);
//      h=getIntent().getStringExtra("nbfvd");
        Notification notification = new Notification.Builder(NotificatnExpl.this)
                .setSmallIcon(android.R.drawable.ic_media_play)
                .setContentTitle("New message received")
                .setContentIntent(pendingIntent)
                .setContentText("message from navneeth")
                .build();

        NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0,notification);
    }
}
