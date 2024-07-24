package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MecdakChurch extends AppCompatActivity {
    ImageView gi1, gi2,gi3,gi4,gi5,gi6,gi7,gi8;
    Button gb,gb1,gb2,gb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecdak_church);
        gi1 = findViewById(R.id.gi1);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpi7OdR8n0jpAx5180s_jJIXUlbtr_2JauAQ&usqp=CAU").placeholder(R.drawable.appbg).into(gi1);
        gi2 = findViewById(R.id.gi2);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuOzrBSNhuILW7Ezjo0nXD7bZwEATlUJTzdw&usqp=CAU").placeholder(R.drawable.appbg).into(gi2);
        gi3 = findViewById(R.id.gi3);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToP22WMgEIv0ShVa-iylvOVhW2OM11Ow9ttQ&usqp=CAU").placeholder(R.drawable.ic_launcher_background).into(gi3);
        gi4 = findViewById(R.id.gi4);
        Picasso.get().load("https://www.trawell.in/admin/images/upload/797362531Medak_Wargal_Main.jpg").placeholder(R.drawable.appbg).into(gi4);
        gi5 = findViewById(R.id.gi5);
        Picasso.get().load("https://content.jdmagicbox.com/comp/medak/g2/9999p8452.8452.170604181552.c2g2/catalogue/haritha-heritage-hotel-medak-hotels-3sj3s0p8sf.jpg").placeholder(R.drawable.appbg).into(gi5);
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
        Uri webpage = Uri.parse("https://goo.gl/maps/PBYThGCkVuPXjCtM8");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onh(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/8LHXBVgowNRewLxe7");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void oncl(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/UbZqGbH8iNHGGJXG8");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onc(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/1oUDuPfNsdgAs5Gt7");
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