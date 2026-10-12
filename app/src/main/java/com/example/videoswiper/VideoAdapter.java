package com.example.videoswiper;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoAdapter {

    static class VideoViewHolder extends RecyclerView.ViewHolder {
        TextView videoTitleTV;
        TextView videoDescriptionTV;
        VideoView videoView;
        ProgressBar progressBar;
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            //
            videoView = itemView.findViewById(R.id.videoView);
            videoTitleTV = itemView.findViewById(R.id.videoTitleTV);
            videoDescriptionTV = itemView.findViewById(R.id.videoDescriptionTV);
            progressBar = itemView.findViewById(R.id.videoProgressBar);
        }

        void setVideoData(VideoItem videoItem) {
            //
            videoTitleTV.setText(videoItem.getVideoTitle());
            videoDescriptionTV.setText(videoItem.getVideoDescription());
            videoView.setVideoPath(videoItem.getVideoURL());
            //
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {

                }
            });
        }

    }

}
