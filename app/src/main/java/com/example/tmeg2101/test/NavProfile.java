package com.example.tmeg2101.test;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;




public class NavProfile extends android.support.v4.app.Fragment{
    private Button Submit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_profile, container, false);
        Submit = (Button) findViewById(R.id.submitProfileButton);
        Submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        return view;
    }
}
