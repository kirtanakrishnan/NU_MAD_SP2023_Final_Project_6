package com.example.project.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.project.Interfaces.IProfileToMain;
import com.example.project.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // Request code will be used to verify if result comes from the login activity. Can be set to any integer.
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button buttonConnectSpotify;
    private IProfileToMain profileToMain;

    public ProfileFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        buttonConnectSpotify = view.findViewById(R.id.buttonConnectToSpotify);
        buttonConnectSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileToMain.connectToSpotifyButtonClicked();
                buttonConnectSpotify.setClickable(false);
                buttonConnectSpotify.setVisibility(View.GONE);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof IProfileToMain){
            this.profileToMain = (IProfileToMain) context;
        }else{
            throw new RuntimeException(context.toString()+ "must implement IProfileToMain");
        }
    }
}