package com.example.atulsachdeva.pndlec9assign;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserDetailsFragment extends Fragment {

    ImageView ivFace;
    TextView tvName, tvDob, tvEmail;

    public UserDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_user_details, container, false);
        ivFace = rootView.findViewById(R.id.ivFace);
        tvName = rootView.findViewById(R.id.tvName);
        tvEmail = rootView.findViewById(R.id.tvEmail);
        tvDob = rootView.findViewById(R.id.tvDob);

        ivFace.setImageResource(getArguments().getInt("FaceID"));  // not working
        tvName.setText(getArguments().getString("Name"));
        tvDob.setText(getArguments().getString("Dob"));
        tvEmail.setText(getArguments().getString("Email"));

        return rootView;
    }

}
