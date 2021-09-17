package com.example.onboradingdesign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OnboardingAdapter extends RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>{


    private List<onboarding> onboardings;

    public OnboardingAdapter(List<onboarding> onboardings) {
        this.onboardings = onboardings;
    }

    @NonNull
    @Override
    public OnboardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OnboardingViewHolder(

                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_onboarding,parent,false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull OnboardingViewHolder holder, int position) {
        holder.setOnboarding(onboardings.get(position));
    }

    @Override
    public int getItemCount() {
        return onboardings.size();
    }

    class OnboardingViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewtitle;
        private TextView textViewdescription;
        private ImageView imageonboarding;

        public OnboardingViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewtitle = itemView.findViewById(R.id.texttitle);
            textViewdescription = itemView.findViewById(R.id.textdescription);
            imageonboarding = itemView.findViewById(R.id.imageonboarding);
        }

        void setOnboarding(onboarding onboardingItem){
            textViewtitle.setText(onboardingItem.getTitle());
            textViewdescription.setText(onboardingItem.getDescription());
            imageonboarding.setImageResource(onboardingItem.getImage());
        }
    }
}
