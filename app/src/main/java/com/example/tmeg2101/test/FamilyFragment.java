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

        final LinearLayout.LayoutParams horizontal = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.HORIZONTAL
        );

        //add parent
        addParent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = new TextView(FamilyFragment.this.getActivity());
                textView.setText("First/Last Name/Occupation");
                layout.addView(textView, p);
                LinearLayout addParent = new LinearLayout(FamilyFragment.this.getActivity());
                layout.addView(addParent, horizontal);
                EditText firstName = new EditText(FamilyFragment.this.getActivity());
                firstName.setHint("First Name");
                addParent.addView(firstName, horizontal);
                EditText lastName = new EditText(FamilyFragment.this.getActivity());
                lastName.setHint("Last Name");
                addParent.addView(lastName, horizontal);

                EditText occupation = new EditText(FamilyFragment.this.getActivity());
                occupation.setHint("Parent's Occupation");
                addParent.addView(occupation, horizontal);

            }
        });

        //add sibling
        addSibling.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = new TextView(FamilyFragment.this.getActivity());
                textView.setText("First/Last Name/Age");
                layout.addView(textView, p);

                LinearLayout addParent = new LinearLayout(FamilyFragment.this.getActivity());
                layout.addView(addParent, horizontal);
                EditText firstName = new EditText(FamilyFragment.this.getActivity());
                firstName.setHint("First Name");
                addParent.addView(firstName, horizontal);
                EditText lastName = new EditText(FamilyFragment.this.getActivity());
                lastName.setHint("Last Name");
                addParent.addView(lastName, horizontal);

                EditText age = new EditText(FamilyFragment.this.getActivity());
                age.setHint("Sibling's Age");
                addParent.addView(age, horizontal);




              //  EditText text = new EditText(FamilyFragment.this.getActivity());
               // text.setHint("Name");
                //layout.addView(text, p);
            }
        });

        return view;
    }
}
