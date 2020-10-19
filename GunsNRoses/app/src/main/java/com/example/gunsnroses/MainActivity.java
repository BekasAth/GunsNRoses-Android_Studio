package com.example.gunsnroses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;
import java.util.Spliterator;

public class MainActivity extends AppCompatActivity {

    private static ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn  = (Button) findViewById(R.id.button);

        final ImageView img = (ImageView) findViewById(R.id.imageView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Loading...",Toast.LENGTH_SHORT).show();

                Picasso.get().load(getPic()).into(img);

            }
        });
    }

    static {
        list.add("https://images-na.ssl-images-amazon.com/images/I/51W5RUw6IaL._AC_.jpg");
        list.add("https://laistassets.scprdev.org/i/d209ed114d5699684f140f7910a0a07d/5b2c36474488b300092713af-original.jpg");
        list.add("https://i.pinimg.com/originals/54/34/78/543478c04b6167c3459b9a5a2b16eb16.jpg");
        list.add("https://images.unsplash.com/photo-1519330377309-9ee1c6783348?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
    }

    private static String getPic(){
        Random r = new Random();
        return list.get(r.nextInt(list.size()));
    }

}