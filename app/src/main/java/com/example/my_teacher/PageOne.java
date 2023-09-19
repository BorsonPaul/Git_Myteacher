package com.example.my_teacher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class PageOne extends AppCompatActivity {
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
        getSupportActionBar().hide();
        imageSlider = (ImageSlider) findViewById(R.id.imgSliders);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://subhagswami.com/sites/default/files/styles/sac_1200x630/public/images/cover/his_holines_subhag_swami_maharaj_2.jpg?itok=JpSuGgKL", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://subhagswami.com/sites/default/files/styles/sac_1200x630/public/images/gallery/042017/subhag_swami_maharaj_sadhu_sanga_7.jpg?itok=XTvjxgHx", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://subhagswami.com/sites/default/files/images/gallery/042017/subhag_swami_maharaj_sadhu_sanga_26.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://subhagswami.com/sites/default/files/styles/sac_1200x630/public/images/gallery/042017/subhag_swami_maharaj_prabhupada_sanga_6.jpg?itok=IkOz0FYI", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }

    public void biography(View view) {
        startActivity(new Intent(this, Biography.class));
    }

    public void Video(View view) {
        startActivity(new Intent(this, VideoPage.class));
    }

    public void facebook(View view) {
        startActivity(new Intent(new Intent(this, Facebook.class)));
    }

    public void Image(View view) {
        startActivity(new Intent(this, photos.class));
    }

    public void mpranam(View view) {
        startActivity(new Intent(this, PranamMantra.class));
    }

    public void Quotes(View view) {
        startActivity(new Intent(this, Quotes.class));
    }

    public void Audio(View view) {
        startActivity(new Intent(this, Audio.class));
    }

    public void pravupad(View view) {
        startActivity(new Intent(this, pravupad.class));
    }

    public void message(View view) {
        startActivity(new Intent(this, Message.class));
    }
}