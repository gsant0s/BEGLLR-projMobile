package com.fmm.testebottom;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fmm.testebottom.videocard.Video;
import com.fmm.testebottom.videocard.VideoAdapter;

import java.util.ArrayList;

public class VideosScreen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView lista = (ListView) findViewById(R.id.listCard);

        ArrayAdapter adapter = new VideoAdapter(this, adicionarCard());
        lista.setAdapter(adapter);
    }

    private ArrayList<Video> adicionarCard(){
        ArrayList videos = new ArrayList<Video>();
        Video v = new Video(R.drawable.logo, "Tutoria de sla", "id ifjinef nf jwenfn wefni wnfnw finwjiefn wjnefnwfn wfjwnfi");
        videos.add(v);

        v = new Video(R.drawable.logo, "Tutoria de sla", "id ifjinef nf jwenfn wefni wnfnw finwjiefn wjnefnwfn wfjwnfi");
        videos.add(v);

        v = new Video(R.drawable.logo, "Tutoria de sla", "id ifjinef nf jwenfn wefni wnfnw finwjiefn wjnefnwfn wfjwnfi");
        videos.add(v);

        v = new Video(R.drawable.logo, "Tutoria de sla", "id ifjinef nf jwenfn wefni wnfnw finwjiefn wjnefnwfn wfjwnfi");
        videos.add(v);

        return videos;
    }
}
