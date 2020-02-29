package com.omada.junctionAdmin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.TimePicker;

import com.omada.junctionAdmin.R;

public class BookingQueue extends Fragment {
    View view;
    TextView year,month,day;
    TextView from,to;
    CalendarView calendarView;
    TimePicker timePicker;
    boolean state;

    public static BookingQueue newInstance() {
        Bundle args = new Bundle();
        BookingQueue fragment = new BookingQueue();
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
        // Inflate the layout for this fragment
        //initialising year,month,day,fromTime,toTime
        view= inflater.inflate(R.layout.fragment_booking_queue, container, false);
        year=view.findViewById(R.id.year_text);
        month=view.findViewById(R.id.month_text);
        day=view.findViewById(R.id.day_text);
        calendarView=view.findViewById(R.id.calender);
        timePicker=view.findViewById(R.id.time_picker);
        from=view.findViewById(R.id.from_time);
        to=view.findViewById(R.id.to_time);
       //setting on datelistener
       calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           @Override
           public void onSelectedDayChange(@NonNull CalendarView view, int y, int m, int d) {
               year.setText(String.valueOf(y));
               month.setText(String.valueOf(m+1));
               day.setText(String.valueOf(d));
           }
       });

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                if(from.isFocused())
                {
                    from.setText(String.valueOf(hourOfDay)+":"+String.valueOf(minute));
                }
                if(to.isFocused())
                {
                    to.setText(String.valueOf(hourOfDay)+":"+String.valueOf(minute));
                }
            }
        });

        return  view;
    }

}
