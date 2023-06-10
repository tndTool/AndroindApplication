package com.example.exercise4;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.*;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class ListFragment extends RowsSupportFragment {

    private Function1<DataModel.Result.Detail, Unit> itemSelectedListener;
    private ArrayObjectAdapter rootAdapter = new ArrayObjectAdapter(new ListRowPresenter(FocusHighlight.ZOOM_FACTOR_MEDIUM));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        setAdapter(rootAdapter);
        setOnItemViewSelectedListener(new ItemViewSelectedListener());

        return view;
    }

    public void bindData(DataModel dataList) {
        for (DataModel.Result result : dataList.getResult()) {
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ItemPresenter());
            for (DataModel.Result.Detail detail : result.getDetails()) {
                arrayObjectAdapter.add(detail);
            }

            HeaderItem headerItem = new HeaderItem(result.getTitle());
            ListRow listRow = new ListRow(headerItem, arrayObjectAdapter);
            rootAdapter.add(listRow);
        }
    }

    public void setOnContentSelectedListener(Function1<DataModel.Result.Detail, Unit> listener) {
        this.itemSelectedListener = listener;
    }

    private class ItemViewSelectedListener implements OnItemViewSelectedListener {
        @Override
        public void onItemSelected(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row) {
            if (item instanceof DataModel.Result.Detail) {
                itemSelectedListener.invoke((DataModel.Result.Detail) item);
            }
        }
    }
}