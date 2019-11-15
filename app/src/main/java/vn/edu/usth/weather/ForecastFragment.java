package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {
    public ForecastFragment(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
       // Inflate layout
        View Nv = new View(getContext());
        Nv.setBackgroundColor(0xFFFF0000);
        return Nv;
        //Lab 4
        TextView day_text = new TextView(getActivity());
        day_text.setText("Thursday");
        day_text.setBackgroundColor(0xffffff00);
        day_text.setPadding(0, 10, 0, 10);

        ImageView weatherIcon = new ImageView(getActivity());
        weatherIcon.setImageResource(R.drawable.sunny_01);
        weatherIcon.setScaleType(ImageView.ScaleType.FIT_CENTER);
        weatherIcon.setScaleX((float) 0.5);
        weatherIcon.setScaleY((float) 0.5);
        weatherIcon.setAdjustViewBounds(true);
        weatherIcon.setBackgroundColor(0x0000ffff);

        RelativeLayout.LayoutParams textViewParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        textViewParam.addRule(RelativeLayout.CENTER_IN_PARENT);
        RelativeLayout.LayoutParams imageViewParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        View v = inflater.inflate(R.layout.fragment_forecast, container, false);
        v.setBackgroundColor(0xffff0000);
        LinearLayout linearLayout = v.findViewById(R.id.linearlayout1);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);
        linearLayout.addView(day_text, textViewParam);
        linearLayout.addView(weatherIcon, imageViewParam);

        return v;
        //return inflater.inflate(R.layout.fragment_forecast, container, false);
    }
}
