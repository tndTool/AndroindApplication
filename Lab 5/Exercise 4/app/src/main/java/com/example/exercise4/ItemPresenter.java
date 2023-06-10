package com.example.exercise4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.leanback.widget.Presenter;
import com.bumptech.glide.Glide;

public class ItemPresenter extends Presenter {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {

        android.view.View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);

        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = getWidthInPercent(parent.getContext(), 12);
        params.height = getHeightInPercent(parent.getContext(), 32);

        return new ViewHolder(view);

    }

    public int getWidthInPercent(Context context, int percent) {
        int width = context.getResources().getDisplayMetrics().widthPixels;
        return (width * percent) / 100;
    }

    public int getHeightInPercent(Context context, int percent) {
        int height = context.getResources().getDisplayMetrics().heightPixels;
        return (height * percent) / 100;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {

        DataModel.Result.Detail content = (DataModel.Result.Detail) item;

        ImageView imageView = viewHolder.view.findViewById(R.id.poster_image);

        String url = "https://www.themoviedb.org/t/p/w500" + content.getPoster_path();
        Glide.with(viewHolder.view.getContext())
                .load(url)
                .into(imageView);

    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {
    }
}
