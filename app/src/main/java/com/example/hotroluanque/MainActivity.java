package com.example.hotroluanque;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);

        ArrayList listNamo = new ArrayList();
        listNamo.add("Nammo Đại Nhật Như Lai");
        listNamo.add("Nammo Chuẩn Đề Phật Mẫu Đại Như Lai");
        listNamo.add("Nammo Dược Sư Đại Như Lai");
        listNamo.add("Nammo Đại Phật Nhiên Đăng");
        listNamo.add("Nammo Kim Cang Tát Tỏa Bồ Tát");
        listNamo.add("Nammo A Di Đà Phật");
        listNamo.add("Nammo Văn Thụ Bồ Tát");
        listNamo.add("Nammo Vô Tận Ý Bồ Tát");
        listNamo.add("Nammo Nhật Quang Bồ Tát");
        listNamo.add("Nammo Di Lạc Đại Như Lai");
        listNamo.add("Nammo Kim Thụ Đại Như Lai");
        listNamo.add("Nammo Nam Hải Đại Như Lai");
        listNamo.add("Nammo Diệu Thiện Đại Như Lai");        
        listNamo.add("Nammo Thiên Đỉnh Đại Như Lai");
        listNamo.add("Nammo Bạch Ngọc Đại Như Lai");        
        listNamo.add("Nammo Thanh Vân Đại Như Lai");
        listNamo.add("Nammo Tế Công Đại Như Lai");
        listNamo.add("Nammo Đại Phương Lục Mẫu");
        listNamo.add("Nammo Thanh Vân Đại Như Lai");
        listNamo.add("Nammo Thanh Vân Đại Như Lai");

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int intRand = rand.nextInt(18);


                Snackbar.make(view, listNamo.get(intRand).toString(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
