package com.taturo.excercise5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.Button);

//        1.Action view
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.vn"));
//                startActivity(intent);
//            }
//        });

//        2.Action call
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, MY_PERMISSIONS_REQUEST_CALL_PHONE);
//                } else {
//                    makePhoneCall();
//                }
//            }
//        });
//    }
//    private void makePhoneCall() {
//        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+84)19522362"));
//        startActivity(intent);
//    }

//        3.Action dial
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)19522362"));
//                startActivity(intent);
//            }
//        });

        //        4.Action view
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
//                startActivity(intent);
//            }
//        });

//      5. Action sendto
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:191"));
//                intent.putExtra("sms_body", "Smoke weed?");
//                startActivity(intent);
//            }
//        });

//        6. Xem ảnh
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent();
//                myIntent.setType("image/pictures/*");
//                myIntent.setAction(Intent.ACTION_GET_CONTENT);
//                startActivity(myIntent);
//            }
//        });

//        7. Nghe nhạc
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myActivity2 = new Intent("android.intent.action.MUSIC_PLAYER");
//                startActivity(myActivity2);
//            }
//        });

//        8. Tìm đường đi từ điểm A đến điểm B
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "http://maps.google.com/maps?"+"saddr=9.938083,-84.054430&daddr=9.926392,-84.055964";
//                Intent intent = new Intent(Intent.ACTION_VIEW,
//                        Uri.parse(url));
//                startActivity(intent);
//            }
//        });

//        9. 3 intent:
//      action insert
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent insertIntent = new Intent(Intent.ACTION_INSERT, ContactsContract.Contacts.CONTENT_URI);
//                startActivity(insertIntent);
//            }
//        });

//      ACTION_SET_WALLPAPER
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent wallpaperIntent = new Intent(Intent.ACTION_SET_WALLPAPER);
//                startActivity(Intent.createChooser(wallpaperIntent, "Set Wallpaper"));
//            }
//        });

//      ACTION_SYSTEM_TUTORIAL
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is the text that will be shared.");
//                sendIntent.setType("text/plain");
//                startActivity(sendIntent);
//            }
//        });

//        3 permission:
        
    }
}