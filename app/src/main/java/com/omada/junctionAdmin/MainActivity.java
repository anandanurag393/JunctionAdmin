package com.omada.junctionAdmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Fragment booking;
    private Fragment bookingQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        booking = Booking.newInstance();
        bookingQueue = BookingQueue.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,booking,null).disallowAddToBackStack().commit();

    }

    public void changeFragment(int fragmentId){
        switch(fragmentId){
            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,booking,null).commit();
                break;
            case 1:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,bookingQueue,null).commit();
                break;
            case 2:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,null,null).commit();
                break;
        }
    }

}
