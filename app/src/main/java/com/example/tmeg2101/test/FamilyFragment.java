package com.example.tmeg2101.test;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class FamilyFragment extends android.support.v4.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.family_fragment, container, false);

        Button addMember = (Button) view.findViewById(R.id.addMember);


        final LinearLayout layout = (LinearLayout) view.findViewById(R.id.layout);

        addMember.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


        EditText text = new EditText(FamilyFragment.this.getActivity());
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layout.addView(text, p);
            }
        });

        return view;
    }
}
