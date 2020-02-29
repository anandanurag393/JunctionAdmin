package com.omada.junctionAdmin;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.omada.junctionAdmin.MainActivity;
import com.omada.junctionAdmin.R;

public class Booking extends Fragment {

    View view;
    Button b;
public interface onBooked{
    public void call();
}
void setOnBookedListener()
{}
 public static Booking newInstance() {
        Bundle args = new Bundle();
        Booking fragment = new Booking();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_booking, container, false);
        b=view.findViewById(R.id.next);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //call 2nd fragment
                ((MainActivity)getActivity()).changeFragment(1);
            }
        });
        return view;
    }
}
