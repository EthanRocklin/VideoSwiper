package com.example.videoswiper;

import android.os.Bundle;
import android.provider.MediaStore;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //
        final ViewPager2 videoViewPager = findViewById(R.id.videoViewPager);

        List<VideoItem> videoItemsList = new ArrayList<>();
        // Creates a temporary video for testing functionaity
        VideoItem video1 = new VideoItem();
        video1.setURL("URL_1");
        video1.setTitle("Title1");
        video1.setDescription("Description1");
        videoItemsList.add(video1);

        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));

    }
}