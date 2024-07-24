package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Charminar extends AppCompatActivity {
 ImageView ci,c2,c3,c4,c5,c6,c7;
 Button cb,cb1,cb2,cb3,cb4,cb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charminar);
        ci=findViewById(R.id.ci);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c7=findViewById(R.id.c7);
        c6=findViewById(R.id.c6);
        c5=findViewById(R.id.c5);
        cb=findViewById(R.id.cb);
        c4=findViewById(R.id.c4);
        cb1=findViewById(R.id.cb1);
        cb5=findViewById(R.id.cb5);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        Picasso.get().load("https://media.gettyimages.com/photos/the-majestic-charminar-picture-id158892963?s=2048x2048").placeholder(R.drawable.appbg).into(ci);
        Picasso.get().load("https://imgcy.trivago.com/c_lfill,d_dummy.jpeg,e_sharpen:60,f_auto,h_450,q_auto,w_450/itemimages/22/68/2268946_v6.jpeg").placeholder(R.drawable.appbg).into(c6);
        Picasso.get().load("https://content3.jdmagicbox.com/comp/def_content/travel_agents/default-travel-agents-2.jpg?clr=333333").placeholder(R.drawable.appbg).into(c7);
        Picasso.get().load("https://www.holidify.com/images/cmsuploads/compressed/n98_20170921161259.PNG").placeholder(R.drawable.appbg).into(c4);
        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/d/d1/Charminar-Pride_of_Hyderabad.jpg").placeholder(R.drawable.appbg).into(c2);
        Picasso.get().load("https://www.gosahin.com/go/p/e/1528638842_Makkah-Masjid-Hyderabad1.jpg").placeholder(R.drawable.appbg).into(c3);
        Picasso.get().load("https://imgcld.yatra.com/ytimages/image/upload/t_seo_Hotel_w_930_h_550_c_fill_g_auto_q_40_f_jpg/v1551165707/AdvNation/00052441/Charminar_1_N8iD3G.png").placeholder(R.drawable.appbg).into(c5);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Uri webpage = Uri.parse("https://maps.app.goo.gl/e2zNB77FgZ9om1vq8");
                    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);

                }

                    cb1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri uri=Uri.parse("https://maps.app.goo.gl/us1oNnu1FRjhPVKh7");
                            Intent intent1=new Intent(Intent.ACTION_VIEW,uri);
                            if(intent1.resolveActivity(getPackageManager())!=null)
                            {
                                startActivity(intent1);
                        }
                        }
                    });
                 cb2.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Uri uri=Uri.parse("https://goo.gl/maps/JYwQZaj2iEvbvyRHA");
                         Intent intent3=new Intent(Intent.ACTION_VIEW,uri);
                         if(intent3.resolveActivity(getPackageManager())!=null)
                         {
                             startActivity(intent3);
                         }
                     }
                 });
                cb3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri=Uri.parse("https://goo.gl/maps/DALqs1gDzNcN3mrJ6");
                        Intent intent1=new Intent(Intent.ACTION_VIEW,uri);
                        if(intent1.resolveActivity(getPackageManager())!=null)
                        {
                            startActivity(intent1);
                        }
                    }
                });
                cb4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri=Uri.parse("https://goo.gl/maps/ZgnR22mgMdjCPBqL6");
                        Intent intent1=new Intent(Intent.ACTION_VIEW,uri);
                        if(intent1.resolveActivity(getPackageManager())!=null)
                        {
                            startActivity(intent1);
                        }
                    }
                });




            }

        });

        }
    public void onc(View v) {
        Uri uri=Uri.parse("https://www.justdial.com/Hyderabad/Hyderabad-Tourism-City-Guide-Gulzar-House/040PXX40-XX40-090810185915-K6C9_BZDET");
        Intent intent5=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent5);


    }
    }
