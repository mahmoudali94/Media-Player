package com.trustorg.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        // Create an Custom ArrayList
        ArrayList<CustomArray> albumsList = new ArrayList<CustomArray>();
        albumsList.add(new CustomArray("When We All Fall Asleep, Where Do We Go?", "Billie Eilish"));
        albumsList.add(new CustomArray("Reputation", "Taylor Swift"));
        albumsList.add(new CustomArray("Daydream", "Mariah Carey"));
        albumsList.add(new CustomArray("Like a Virgin", "Madonna"));
        albumsList.add(new CustomArray("The Immaculate Collection", "Madonna"));
        albumsList.add(new CustomArray("Can’t Slow Down", "Lionel Richie"));
        albumsList.add(new CustomArray("Hybrid Theory", "Linkin Park"));
        albumsList.add(new CustomArray("Led Zeppelin", "Led Zeppelin"));
        albumsList.add(new CustomArray(" Please Hammer Don’t Hurt ‘Em", "Hammer"));
        albumsList.add(new CustomArray("The Ultimate Hits", "Garth Brooks"));
        albumsList.add(new CustomArray("Unplugged", "Eric Clapton"));
        albumsList.add(new CustomArray("The Eminem Show", "Eminem"));
        albumsList.add(new CustomArray("The Marshall Mathers LP", "Eminem"));
        albumsList.add(new CustomArray("Elvis’ Christmas Album", "Elvis Presley"));
        albumsList.add(new CustomArray("Best of the Doobies", "Doobie Brothers"));
        albumsList.add(new CustomArray("Fly", "Dixie Chicks"));
        albumsList.add(new CustomArray("Pyromania", "Def Leppard"));
        albumsList.add(new CustomArray("20 Greatest Hits", "Creedence Clearwater Revival, Chronicle"));
        albumsList.add(new CustomArray("Let’s Talk About Love", "Celine Dion"));
        albumsList.add(new CustomArray("All Eyez on Me", "2 Pac"));
        albumsList.add(new CustomArray("Houses of the Holy", "Led Zeppelin"));

        CustomAdapter itemAdapter = new CustomAdapter(this, albumsList);

        ListView albumList = (ListView) findViewById(R.id.listView);
        albumList.setAdapter(itemAdapter);    }
}