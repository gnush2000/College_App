package com.example.tmeg2101.test;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FamilyFragment extends android.support.v4.app.Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.family_fragment, container, false);

        Button addParent = (Button) view.findViewById(R.id.addParent);
        Button addSibling = (Button) view.findViewById(R.id.addSibling);

        final LinearLayout layout = (LinearLayout) view.findViewById(R.id.layout);

        final LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        final LinearLayout.LayoutParams vertical = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.HORIZONTAL
        );

        //add parent
        addParent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = new TextView(FamilyFragment.this.getActivity());
                textView.setText("First Name");
                layout.addView(textView, p);
                LinearLayout addParent = new LinearLayout(FamilyFragment.this.getActivity());
                layout.addView(addParent, vertical);
                EditText firstName = new EditText(FamilyFragment.this.getActivity());
                firstName.setHint("Name");
                addParent.addView(firstName, vertical);
                EditText lastName = new EditText(FamilyFragment.this.getActivity());
                lastName.setHint("Last Name");
                addParent.addView(lastName, vertical);
            }
        });

        //add sibling
        addSibling.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText text = new EditText(FamilyFragment.this.getActivity());
                text.setHint("Name");
                layout.addView(text, p);
            }
        });

        return view;
    }
}
