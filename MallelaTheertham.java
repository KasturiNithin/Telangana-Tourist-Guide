package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MallelaTheertham extends AppCompatActivity {
    ImageView gi1, gi2,gi3,gi4,gi5,gi6,gi7,gi8;
    Button gb,gb1,gb2,gb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mallela_theertham);
        gi1 = findViewById(R.id.gi1);
        Picasso.get().load("https://media-cdn.tripadvisor.com/media/photo-s/0c/91/ae/e8/mallela-theertham.jpg").placeholder(R.drawable.appbg).into(gi1);
        gi2 = findViewById(R.id.gi2);
        Picasso.get().load("https://www.hlimg.com/images/things2do/738X538/Mallela_Theertham_1523011483t.jpg").placeholder(R.drawable.appbg).into(gi2);
        gi3 = findViewById(R.id.gi3);
        Picasso.get().load("https://www.lingayatreligion.com/Galary/Srishailam/Akka%20mahadevi%20caves.JPG").placeholder(R.drawable.ic_launcher_background).into(gi3);
        gi4 = findViewById(R.id.gi4);
        Picasso.get().load("https://lh5.googleusercontent.com/p/AF1QipOJXiaeTMxAgzamCgloWJ_4RIobyXpHWqAgAf12=w580-h325-n-k-no").placeholder(R.drawable.appbg).into(gi4);
        gi5 = findViewById(R.id.gi5);
        Picasso.get().load("https://content.jdmagicbox.com/comp/srisailam/i5/9999p8524.8524.170303182139.b7i5/catalogue/mallikarjuna-sadan-srisailam-hotels-uq7cr0bryx.jpg").placeholder(R.drawable.appbg).into(gi5);
        gi6 = findViewById(R.id.gi6);
        Picasso.get().load("https://q-xx.bstatic.com/xdata/images/hotel/840x460/14039677.jpg?k=e6c8c2c668478249af96068c352376aec72ac4f6462f5dd9a8bca1491f22bc3b&o=").placeholder(R.drawable.appbg).into(gi6);
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
        Uri webpage = Uri.parse("https://maps.app.goo.gl/QqWYrhsp6UPxJxpy6");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onr(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/zKWmuHxd4Ss6a3ez6");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onh(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/23mqVnros4uub36R6");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void oncl(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/Sqko2GPp3BwShFA18");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onc(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/BKPMf9WobJW98k7H9");
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