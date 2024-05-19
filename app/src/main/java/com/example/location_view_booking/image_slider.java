package com.example.location_view_booking;

import android.app.Dialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class image_slider extends AppCompatActivity {

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_slide_1);

        imageSlider = findViewById(R.id.imageSlider);

        //List of Images//

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://malayancollegesmindanaoo365-my.sharepoint.com/:i:/g/personal/myganas_mcm_edu_ph/EZCTrWWDA0xFoq3HtC9aAawBUi9osjs_uJfVkF1NbeXXmA?e=tRJb1Uv", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://malayancollegesmindanaoo365-my.sharepoint.com/:i:/g/personal/myganas_mcm_edu_ph/EYkEVlNP-SdCqD5Edj6MEhYBFb2D52HxMor2pU2ECjNL3A?e=MIxTev", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://malayancollegesmindanaoo365-my.sharepoint.com/:i:/g/personal/myganas_mcm_edu_ph/EbYW_md0581MhfACRzsvkJcBgL4MjvHx2dDSpx3x4oCg-Q?e=fYKlv7", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://malayancollegesmindanaoo365-my.sharepoint.com/:i:/g/personal/myganas_mcm_edu_ph/EaewZjJvYrBIv-AU5qJ6S8MB-bn_qAdbkQpcvBoIRnsYjQ?e=lLnEvl", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://malayancollegesmindanaoo365-my.sharepoint.com/:i:/g/personal/myganas_mcm_edu_ph/ETbC2qQdIblGuvRBeDIYFfQBZ8ojg2WWiUQ9Nm9ZCd3l5Q?e=tE1QBN", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://malayancollegesmindanaoo365-my.sharepoint.com/:i:/g/personal/myganas_mcm_edu_ph/Eec5FgrmhiNLgL2mtYFg1soBnQJ_3Zusqpa13vGjKnN76g?e=dQcDBp", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


    }
}
