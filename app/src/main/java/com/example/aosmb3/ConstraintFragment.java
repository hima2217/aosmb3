package com.example.aosmb3;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ConstraintFragment extends Fragment {

    public ConstraintFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.constraintleyout, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            TextView textView = (TextView) view.findViewById(R.id.textView4);
            textView.setText(bundle.getString("key2"));
        }
        return view;
    }
}