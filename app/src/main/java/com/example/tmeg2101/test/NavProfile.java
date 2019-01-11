package com.example.tmeg2101.test;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;




public class NavProfile extends android.support.v4.app.Fragment {
    private Button Submit;
    private static final String TAG =
            NavProfile.class.getName();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_profile, container, false);
        super.onCreate(savedInstanceState);
        Submit = (Button) view.findViewById(R.id.submitProfileButton);
        //text
        final EditText first = (EditText) view.findViewById(R.id.editName);
        final EditText last = (EditText) view.findViewById(R.id.editLast);
        final EditText dob = (EditText) view.findViewById(R.id.editDOB);
        final EditText study = (EditText) view.findViewById(R.id.editStudy);
        final EditText address = (EditText) view.findViewById(R.id.editAddress);



        Submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "First name is: " + first.getText().toString());
            }
        });
        return view;
    }
}
