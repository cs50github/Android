package com.example.a1.pro1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<film> f=new ArrayList<>();
        film f1=new film();
        f1.setPic1("https://www.bleedingcool.com/wp-content/uploads/2017/05/18198201_1305343799560849_1174691762453026571_n.png");
         f1.setPic2("https://upload.wikimedia.org/wikipedia/en/1/15/Dunkirk_Film_poster.jpg");
        f1.setDate("Jul 05th,2017");
        f1.setRate(3.70);
        f1.setVotes(2038);
        f1.setP("Allied soldiers from Belgium, the British Empire and France are surrounded by the German army and evacuated during a fierce battle in World War II. ");
        f.add(f1);
        ImageView p1;
        ImageView p2;
        TextView d;
        TextView r;
        TextView v;
        TextView p;



        p1 = (ImageView) findViewById(R.id.topp);

        p2 = (ImageView) findViewById(R.id.sidep);


        d = (TextView) findViewById(R.id.date);
        r = (TextView) findViewById(R.id.rate);
        v = (TextView) findViewById(R.id.votes);
        p = (TextView) findViewById(R.id.para);

        Picasso.with(p1.getContext()).load(f1.getPic1()).into(p1);
        Picasso.with(p2.getContext()).load(f1.getPic2()).into(p2);
        d.setText(f1.getDate());
        r.setText(String.format(Locale.getDefault(), "%.2f", f1.getRate()));
        p.setText(f1.getP());
        v.setText(String.format(Locale.getDefault(), "%d", f1.getVotes()));

    }
}
