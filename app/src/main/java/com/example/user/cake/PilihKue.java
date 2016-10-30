package com.example.user.cake;

import android.app.Fragment;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.id.list;

public class PilihKue extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_kue);

        final String[] itemname ={
                    "Pisang Goreng",
                    "Lemper",
                    "Pisang Cokelat",
                    "Gehu Pedas",
                    "Bala - Bala",
                    "Tempe Goreng",
                    "Rengginang",
                    "Kurupuk"
        };
        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.cake,
                R.id.Itemname,itemname));

        ListView lv = getListView();
        lv.setTextFilterEnabled(true);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), DetailPesanan.class);
                intent.putExtra("cake", itemname[i]);
                startActivity(intent);
            }
        });

    }


}
