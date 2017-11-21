package com.example.admin.fragmentsdeldimoni;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.admin.fragmentsdeldimoni.FragmentPrincipal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFragmentInteraction(Uri uri){}

}
