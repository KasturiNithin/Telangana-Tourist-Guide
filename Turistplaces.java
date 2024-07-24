package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
public class Turistplaces extends AppCompatActivity {
   ImageView i,i2,i3,i4,i5,i6,i7,i8;
   Button b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turistplaces);
        i = findViewById(R.id.i);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);



        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/d/d1/Charminar-Pride_of_Hyderabad.jpg").placeholder(R.drawable.appbg).into(i);
        Picasso.get().load("https://4.bp.blogspot.com/-LKDXK_Z7q0Q/U7f8_uKbd-I/AAAAAAAABrA/n1RRU4Cx5Iw/s1600/Golconda+fort.jpg").placeholder(R.drawable.appbg).into(i2);
        Picasso.get().load("https://static.toiimg.com/photo/39669197.cms").placeholder(R.drawable.appbg).into(i3);
        Picasso.get().load("https://images.picxy.com/cache/2018/7/19/8806fdd3047c4ef1368e326a9e884259.jpg").placeholder(R.drawable.appbg).into(i4);
        Picasso.get().load("https://i.prcdn.co/img?regionKey=RrJpMDr1JBDFqwhddNpg%2Fg%3D%3D").placeholder(R.drawable.appbg).into(i5);
        Picasso.get().load("https://imgstaticcontent.lbb.in/lbbnew/wp-content/uploads/2018/05/22135250/Papikondalu2.png").placeholder(R.drawable.appbg).into(i6);
        Picasso.get().load("https://www.trawell.in/admin/images/upload/861648391Basara_Main.jpg").placeholder(R.drawable.appbg).into(i7);
        Picasso.get().load("https://images.indianexpress.com/2021/09/kongthong-1200.jpg").placeholder(R.drawable.appbg).into(i8);


    }
        public void open(View v) {
            Intent intent=new Intent(this,Charminar.class);
            startActivity(intent);
        }

    public void openc(View v) {
        Intent intent=new Intent(this,GOLCONDA.class);
        startActivity(intent);
    }
    public void opencn(View v) {
        Intent intent=new Intent(this,BirlaMandir.class);
        startActivity(intent);
    }
    public void ope(View v) {
        Intent intent=new Intent(this,MecdakChurch.class);
        startActivity(intent);
    }
    public void oe(View v) {
        Intent intent=new Intent(this,MecdakChurch.class);
        startActivity(intent);
    }
    public void oem(View v) {
        Intent intent=new Intent(this,MallelaTheertham.class);
        startActivity(intent);
    }
    public void papi(View v) {
        Intent intent=new Intent(this,Papikondalu.class);
        startActivity(intent);
    }
    public void bas(View v) {
        Intent intent=new Intent(this,Basara.class);
        startActivity(intent);
    }
    public void pp(View v) {
        Intent intent=new Intent(this,PochampallyVillage.class);
        startActivity(intent);
    }


}