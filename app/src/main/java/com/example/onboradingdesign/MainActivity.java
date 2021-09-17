package com.example.onboradingdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private OnboardingAdapter onboardingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetUpOnboardingItems();
        ViewPager2 onboardingViewPager = findViewById(R.id.onboarding_viewpager);
        onboardingViewPager.setAdapter(onboardingAdapter);
    }


    private void SetUpOnboardingItems(){

        List<onboarding> onboardingList = new ArrayList<>();

        onboarding itemPayOnline = new onboarding();
        itemPayOnline.setTitle("Free Delivery");
        itemPayOnline.setDescription("24 hour service at the 7 days");
        itemPayOnline.setImage(R.drawable.a1);


        onboarding itemfast = new onboarding();
        itemfast.setTitle("Fast Delivery");
        itemfast.setDescription("24 hour service at the 7 days");
        itemfast.setImage(R.drawable.a2);


        onboarding itemspeed = new onboarding();
        itemspeed.setTitle("Within One Day");
        itemspeed.setDescription("24 hour service at the 7 days");
        itemspeed.setImage(R.drawable.a3);


        onboardingList.add(itemPayOnline);
        onboardingList.add(itemfast);
        onboardingList.add(itemspeed);

        onboardingAdapter = new OnboardingAdapter(onboardingList);

    }
}