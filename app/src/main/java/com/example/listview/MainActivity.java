package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected ListView lvContact;
    protected List<ContactModel> listContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);

        ContactAdapter contactAdapter = new ContactAdapter(listContact, this);
        lvContact.setAdapter(contactAdapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel contactModel = listContact.get(position);
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        ContactModel contact = new ContactModel("Minh 1", "123456789", R.drawable.avatar_1);
        listContact.add(contact);
        contact = new ContactModel("Minh 2", "123456789", R.drawable.avatar_1);
        listContact.add(contact);
        contact = new ContactModel("Minh 3", "123456789", R.drawable.avatar_1);
        listContact.add(contact);
    }

}
