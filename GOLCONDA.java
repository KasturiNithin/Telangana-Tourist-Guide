package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GOLCONDA extends AppCompatActivity {
    ImageView gi1, gi2,gi3,gi4,gi5,gi6;
    Button gb,gb1,gb2,gb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golconda);
        gi1 = findViewById(R.id.gi1);
        Picasso.get().load("https://media.tacdn.com/media/attractions-splice-spp-674x446/06/74/b9/0b.jpg").placeholder(R.drawable.appbg).into(gi1);
        gi2 = findViewById(R.id.gi2);
        Picasso.get().load("https://1.bp.blogspot.com/-nCb575DjTBw/XtlVjaAqjCI/AAAAAAAAebE/NtRHHn8nKnkHrm-p2QkQGDMtrvzkr383gCK4BGAsYHg/s1008/2880px-Golkonda_Fort_001.jpgaaa").placeholder(R.drawable.appbg).into(gi2);
        gb = findViewById(R.id.gb);
        gb1 = findViewById(R.id.gb1);
        gb3 = findViewById(R.id.gb3);
        gi3 = findViewById(R.id.gi3);
        gb2 = findViewById(R.id.gb2);
        Picasso.get().load("https://www.tutorialspoint.com/golconda_fort/images/ntr_garden.jpg").placeholder(R.drawable.ic_launcher_background).into(gi3);
        gi4 = findViewById(R.id.gi4);
        Picasso.get().load("https://www.tutorialspoint.com/golconda_fort/images/chowmahalla_palace.jpg").placeholder(R.drawable.appbg).into(gi4);
        gi5 = findViewById(R.id.gi5);
        Picasso.get().load("https://imgmediagumlet.lbb.in/media/2019/12/5de5ed87df7c1f2a374c3469_1575349639052.jpg?fm=webp&w=750&h=500&dpr=").placeholder(R.drawable.appbg).into(gi5);
        gi6 = findViewById(R.id.gi6);
        Picasso.get().load("https://q-xx.bstatic.com/xdata/images/hotel/840x460/14039677.jpg?k=e6c8c2c668478249af96068c352376aec72ac4f6462f5dd9a8bca1491f22bc3b&o=").placeholder(R.drawable.appbg).into(gi6);

    }

    public void on(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/bDYyUz7dDhpuRjN17");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);

    }
    public void onr(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/zKWmuHxd4Ss6a3ez6");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onh(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/JRRHgU2BGb7hpQbt9");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void oncl(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/t8QrW7vJ6nuMXB6X9");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onc(View v) {
        Uri webpage = Uri.parse("https://maps.app.goo.gl/BoQCtEHGZfA9RCRc7");
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