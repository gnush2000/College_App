package com.example.tmeg2101.test;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jaiselrahman.filepicker.activity.FilePickerActivity;
import com.jaiselrahman.filepicker.config.Configurations;
import com.jaiselrahman.filepicker.model.MediaFile;

import java.io.File;
import java.util.ArrayList;

public class NavEssay extends android.support.v4.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_essay, container, false);
        Button Submit = (Button) view.findViewById(R.id.essayUpload);

        Submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("Submit"," click");

                Intent intent = new Intent(NavEssay.this.getActivity(), FilePickerActivity.class);
                int FILE_REQUEST_CODE = 42;
                startActivityForResult(intent, FILE_REQUEST_CODE);

                switch (FILE_REQUEST_CODE) {
                    case 42:
                        ArrayList<MediaFile> files = data.getParcelableArrayListExtra(FilePickerActivity.MEDIA_FILES);
                        //Do something with files
                        break;
                }

            }
        });

        return view;

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        try {
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == FILE_REQUEST_CODE  && resultCode  == RESULT_OK) {

                String requiredValue = data.getStringExtra("key");
            }
        } catch (Exception ex) {
            Toast.makeText(Activity.this, ex.toString(),
                    Toast.LENGTH_SHORT).show();
        }

    }
}
