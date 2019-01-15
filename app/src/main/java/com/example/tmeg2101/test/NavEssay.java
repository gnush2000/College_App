package com.example.tmeg2101.test;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class NavEssay extends android.support.v4.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_essay, container, false);
        Button Submit = (Button) view.findViewById(R.id.essayUpload);

        Submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new FileSelector(activity).setFileListener(new FileSelectedListener() {
                    @Override public void fileSelected(final File file) {
                        // do something with the file
                    }).showDialog();
            }
        });
        return view;
    }
}
