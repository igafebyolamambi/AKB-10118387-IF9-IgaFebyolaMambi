//13082021_10118387_IF-9_IgaFebyolaMambi
package com.example.uts_akb_10118387_if_9_igafebyolamambi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataEdukasi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_edukasi);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Kebun Binatang Bandung","Dinas Perpustakaan dan Kearsipan Kota Bandung","Farmhouse Lembang Bandung","Taman Bunga Begonia Lembang", "De Ranch","Padepokan Dayang Sumbi","Jendela Alam","Saung Angklung Udjo","Trans Studio Bandung","Kebun Strawberry Ciwidey Bandung","Taman Lalu Lintas","Bandung Science Centre"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), KebunBinatang.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Pustaka.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });

    }
}