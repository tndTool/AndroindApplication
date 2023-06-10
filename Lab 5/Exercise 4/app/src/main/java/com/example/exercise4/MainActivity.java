package com.example.exercise4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends FragmentActivity {

    private TextView txtTitle;
    private TextView txtSubTitle;
    private TextView txtDescription;

    private ImageView imgBanner;
    private ListFragment listFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBanner = findViewById(R.id.img_banner);
        txtTitle = findViewById(R.id.title);
        txtSubTitle = findViewById(R.id.subtitle);
        txtDescription = findViewById(R.id.description);

        listFragment = new ListFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.list_fragment, listFragment).commit();

        Gson gson = new Gson();
        try {
            InputStream i = getAssets().open("movies.json");
            BufferedReader br = new BufferedReader(new InputStreamReader(i));
            DataModel dataList = gson.fromJson(br, DataModel.class);
            listFragment.bindData(dataList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        listFragment.setOnContentSelectedListener(new Function1<DataModel.Result.Detail, Unit>() {
            @Override
            public Unit invoke(DataModel.Result.Detail detail) {
                updateBanner(detail);
                return null;
            }
        });
    }

    private void updateBanner(DataModel.Result.Detail dataList) {
        txtTitle.setText(dataList.getTitle());
        txtDescription.setText(dataList.getOverview());

        String url = "https://www.themoviedb.org/t/p/w780" + dataList.getBackdrop_path();
        Glide.with(this).load(url).into(imgBanner);
    }
}
