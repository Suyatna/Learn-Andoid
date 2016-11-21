package com.example.zuyat.fragmentworkshop;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnFrament1;
    private  Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnFrament1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });
        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });
    }

    private void initView() {
        btnFrament1 = (Button)findViewById(R.id.button_fragment1);
        btnFragment2 = (Button)findViewById(R.id.button_fragment2);
    }
    private void changeFragment(View view) {
        Fragment fragment = null;

        if (view == findViewById(R.id.button_fragment1)) {
            fragment = new Fragment1();

        }

        if (view == findViewById(R.id.button_fragment2)) {
            fragment = new Fragment2();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_fragment, fragment).commit();
    }
}
