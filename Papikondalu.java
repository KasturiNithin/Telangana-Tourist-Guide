package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Papikondalu extends AppCompatActivity {

    ImageView gi1, gi2,gi3,gi4,gi5,gi6,gi7,gi8;
    Button gb,gb1,gb2,gb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papikondalu);
        gi1 = findViewById(R.id.gi1);
        Picasso.get().load("https://www.holidify.com/images/bgImages/PAPI-KONDALU.jpg").placeholder(R.drawable.appbg).into(gi1);
        gi2 = findViewById(R.id.gi2);
        Picasso.get().load("https://www.holidify.com/images/compressed/1329.jpg").placeholder(R.drawable.appbg).into(gi2);
        gi3 = findViewById(R.id.gi3);
        Picasso.get().load("https://thumbs.dreamstime.com/b/kotilingeshwara-temple-karnataka-106019678.jpg").placeholder(R.drawable.ic_launcher_background).into(gi3);
        gi4 = findViewById(R.id.gi4);
        Picasso.get().load("https://media-cdn.tripadvisor.com/media/photo-s/11/99/d0/05/temple.jpg").placeholder(R.drawable.appbg).into(gi4);
        gi5 = findViewById(R.id.gi5);
        Picasso.get().load("https://lh3.googleusercontent.com/p/AF1QipOkbv5u4_AqI6sCv0Ey_l83DhvNITQKQdgMqKEu=w592-h404-n-k-no-v1-rj").placeholder(R.drawable.appbg).into(gi5);
        gi6 = findViewById(R.id.gi6);
        Picasso.get().load("https://lh3.googleusercontent.com/p/AF1QipPXqlmkvIxh0g7oposuGnUyF7ffjXOCFQsU8Fua=w592-h404-n-k-no-v1-rj").placeholder(R.drawable.appbg).into(gi6);
        gi7 = findViewById(R.id.gi7);
        Picasso.get().load("https://content3.jdmagicbox.com/comp/def_content/travel_agents/default-travel-agents-2.jpg?clr=333333").placeholder(R.drawable.appbg).into(gi7);
        gi8 = findViewById(R.id.gi8);
        Picasso.get().load("https://media.glassdoor.com/sqll/634811/traveltriangle-squarelogo-1454582950552.png").placeholder(R.drawable.appbg).into(gi8);

        gb = findViewById(R.id.gb);
        gb1 = findViewById(R.id.gb1);
        gb3 = findViewById(R.id.gb3);
        gb2 = findViewById(R.id.gb2);

    }
    public void on(View v) {
        Uri webpage = Uri.parse("https://maps.google.com/?cid=201697465308188686&entry=gps");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onr(View v) {
        Uri webpage = Uri.parse("https://www.google.com/travel/hotels/s/kRV5N");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onh(View v) {
        Uri webpage = Uri.parse("https://www.google.com/travel/hotels/s/c7GYr");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void oncl(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/cFVXjQ2Qwe5xkFPWA");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onc(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/LgPjrjCU4ZT9L8Ty8");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void oncm(View v) {
        Uri uri=Uri.parse("https://www.justdial.com/Hyderabad/Hyderabad-Tourism-City-Guide-Gulzar-House/040PXX40-XX40-090810185915-K6C9_BZDET");
        Intent intent5=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent5);


    }
    public void oncmp(View v) {
        Uri uri=Uri.parse("https://traveltriangle.com/madhya-pradesh-tourism/bhopal/places-to-visit/birla-mandir/tips");
        Intent intent5=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent5);


    }
}