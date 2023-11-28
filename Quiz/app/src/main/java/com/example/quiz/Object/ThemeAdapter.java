package com.example.quiz.Object;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quiz.R;

import java.util.ArrayList;

public class ThemeAdapter  extends BaseAdapter {
    ArrayList<Theme> themes;

    @Override
    public int getCount() {
        return themes.size();
    }

    @Override
    public Object getItem(int position) {
        return themes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View resultView;

        if(view != null)
            resultView = view;
        else
            resultView = View.inflate(viewGroup.getContext(), R.layout.item_view, null);

        Theme theme = themes.get(i);

        ((TextView)resultView.findViewById(R.id.txtName)).setText(theme.getName());
        ((TextView)resultView.findViewById(R.id.txtInfomation)).setText(theme.getInformation());
        ((ImageView) resultView.findViewById(R.id.imgTheme)).setImageResource(theme.getPicture());
        return resultView;
    }
}
