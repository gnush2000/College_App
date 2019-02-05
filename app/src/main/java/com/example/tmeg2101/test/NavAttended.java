package com.example.tmeg2101.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;



public class NavAttended extends android.support.v4.app.Fragment{

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_attended, container, false);

        Button addSchool = (Button) view.findViewById(R.id.addSchool);
        final LinearLayout layout = (LinearLayout) view.findViewById(R.id.layout);

        final LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        addSchool.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = new TextView(NavAttended.this.getActivity());
                textView.setText("Name of school");
                layout.addView(textView, p);
                EditText firstName = new EditText(NavAttended.this.getActivity());
                firstName.setHint("Name of school");
                layout.addView(firstName, p);
                EditText lastName = new EditText(NavAttended.this.getActivity());
                lastName.setHint("Grades attended");
                layout.addView(lastName, p);

            }
        });

        return view;
    }
}