package com.example.ux32vd.simplifiedcampocadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.ux32vd.simplifiedcampocadmin.helper.Model;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class MenuAdmin extends AppCompatActivity {

    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;
    ImageButton createbutton, updatebutton, deletebutton;
    ListView listViewLocation;

    //a list to store all the artist from firebase database
    List<Model> locations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);

        ImageButton CreateButton = (ImageButton) findViewById(R.id.createbutton);
        ImageButton UpdateButton = (ImageButton) findViewById(R.id.updatebutton);
        ImageButton DeleteButton = (ImageButton) findViewById(R.id.deletebutton);

        CreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAdmin.this, MenuCreate.class);
                startActivity(intent);
            }
        });
    }
}
