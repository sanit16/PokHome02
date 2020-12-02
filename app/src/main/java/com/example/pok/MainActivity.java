package com.example.pok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextpage2 =(Button) this.findViewById(R.id.floor1);
        nextpage2.setOnClickListener(new View.OnClickListener()
            {
                @Override
              public void onClick(View view)
                {
                    Intent i = new Intent(MainActivity.this,ActivityPage02.class);
                    startActivity(i);
                }
            }
        );

        Button nextpage3 =(Button) this.findViewById(R.id.floor2);
        nextpage3.setOnClickListener(new View.OnClickListener()
            {
                @Override
              public void onClick(View view)
                {
                    Intent ii = new Intent(MainActivity.this,ActivityPage03.class);
                    startActivity(ii);
                }
            }
        );



    }

















}
