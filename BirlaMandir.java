package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BirlaMandir extends AppCompatActivity {
    ImageView gi1, gi2,gi3,gi4,gi5,gi6,gi7,gi8;
    Button gb,gb1,gb2,gb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birla_mandir);
        gi1 = findViewById(R.id.gi1);
        Picasso.get().load("https://scontent.fhyd2-2.fna.fbcdn.net/v/t1.18169-9/17103536_103786400151694_2357929937561771760_n.jpg?_nc_cat=109&ccb=1-5&_nc_sid=174925&_nc_ohc=eg0ZrmaBVxIAX-IBr6s&_nc_ht=scontent.fhyd2-2.fna&oh=00_AT82DcV9hMo4t0TygiSe-azL5F8-bkHmfLogxqnhH2clPw&oe=61E04A39").placeholder(R.drawable.appbg).into(gi1);
        gi2 = findViewById(R.id.gi2);
        Picasso.get().load("https://img.veenaworld.com/wp-content/uploads/2021/05/Birla-Mandir-Hyderabad-Timings-History-How-to-Visit.jpeg").placeholder(R.drawable.appbg).into(gi2);
        gi3 = findViewById(R.id.gi3);
        Picasso.get().load("https://www.tutorialspoint.com/golconda_fort/images/ntr_garden.jpg").placeholder(R.drawable.ic_launcher_background).into(gi3);
        gi4 = findViewById(R.id.gi4);
        Picasso.get().load("https://belurmath.org/wp-content/uploads/2021/05/Sri-Ramakrishna-Temple-9.jpg").placeholder(R.drawable.appbg).into(gi4);
        gi5 = findViewById(R.id.gi5);
        Picasso.get().load("https://pix8.agoda.net/hotelImages/27922190/-1/1ed6ae61f109093b7f4fe199b3af1f7b.jpg?ca=22&ce=0&s=450x450").placeholder(R.drawable.appbg).into(gi5);
        gi6 = findViewById(R.id.gi6);
        Picasso.get().load("https://pix8.agoda.net/hotelImages/4871502/0/c787c242ab69e760e3354dbe9c8247c2.jpg?s=450x450").placeholder(R.drawable.appbg).into(gi6);
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
        Uri webpage = Uri.parse("https://goo.gl/maps/xBkdPYE7LHPGW9Zf9");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onr(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/kQJ9SeSUUqja8KUC9");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void onh(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/gfrfi2EkSqLvxNDz9");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
    public void oncl(View v) {
        Uri webpage = Uri.parse("https://goo.gl/maps/K1HqYkPwqbEX6FZU6");
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