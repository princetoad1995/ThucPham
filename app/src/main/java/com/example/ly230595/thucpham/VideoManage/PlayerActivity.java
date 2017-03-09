package com.example.ly230595.thucpham.VideoManage;

import android.os.Bundle;

import com.example.ly230595.thucpham.R;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by nguen on 28/10/2015.
 */
public class PlayerActivity extends YouTubeBaseActivit {
    private String a="";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_activity);

        YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.player_view);
        youTubeView.initialize("AIzaSyCjI6ronpc9ZPNXVhXlLNCEMDbL8faRyvA", this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
                                        boolean wasRestored) {
        Bundle bundle = getIntent().getExtras();
        a= bundle.getString("url");
        if (!wasRestored) {
            player.cueVideo(a);
        }
    }

    @Override
    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView) findViewById(R.id.player_view);
    }

}
