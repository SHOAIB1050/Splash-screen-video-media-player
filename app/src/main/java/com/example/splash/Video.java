package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    public ImageButton imageButton;
    public CheckBox checkBox;
    public VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        imageButton =findViewById(R.id.imageButton);
        checkBox=findViewById(R.id.checkBox);
        videoView=findViewById(R.id.videoView);


        videoView.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.video);
        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    Toast.makeText(Video.this, "SUCCEFULLY LOGIN", Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(Video.this, "UN SUCCEFULLY LOGIN", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}