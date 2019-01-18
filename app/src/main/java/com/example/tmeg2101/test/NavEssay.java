package com.example.tmeg2101.test;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jaiselrahman.filepicker.activity.FilePickerActivity;
import com.jaiselrahman.filepicker.config.Configurations;
import com.jaiselrahman.filepicker.model.MediaFile;

import java.io.File;
import java.util.ArrayList;

import static com.backendless.rt.RTTypes.log;

public class NavEssay extends android.support.v4.app.Fragment{
    int FILE_REQUEST_CODE = 42;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_essay, container, false);
        Button Submit = (Button) view.findViewById(R.id.essayUpload);

        Submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("Submit"," click");

                Intent intent = new Intent(NavEssay.this.getActivity(), FilePickerActivity.class);
                intent.putExtra(FilePickerActivity.CONFIGS, new Configurations.Builder()
                        .setMaxSelection(1)
                        .enableImageCapture(true)
                        .build());

                startActivityForResult(intent, FILE_REQUEST_CODE);

            }
        });

        return view;

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        try {
            super.onActivityResult(requestCode, resultCode, data);
            ArrayList<MediaFile> files = data.getParcelableArrayListExtra(FilePickerActivity.MEDIA_FILES);

            Log.i("selected file: ", files.get(0).getName());

        } catch (Exception ex) {
            Toast.makeText(NavEssay.this.getActivity(), ex.toString(),
                    Toast.LENGTH_SHORT).show();
        }

    }
}
