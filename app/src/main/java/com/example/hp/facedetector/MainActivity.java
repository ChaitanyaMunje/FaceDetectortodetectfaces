package com.example.hp.facedetector;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
private FaceOverlayView mfaceOverlayview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfaceOverlayview=(FaceOverlayView)findViewById(R.id.face_overlay);
        InputStream stream=getResources().openRawResource(R.raw.img);
        Bitmap bitmap=BitmapFactory.decodeStream(stream);
        mfaceOverlayview.setBitmap(bitmap);

    }
}
