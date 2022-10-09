package com.example.apptonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private List<Item> itemList;
    private int layout;
    private Context context;

    public ItemAdapter(Context context, int layout, List<Item> itemList) {
        this.itemList = itemList;
        this.layout = layout;
        this.context = context;
    }

    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        Item item = itemList.get(i);

        ImageView imageAX = (ImageView) view.findViewById(R.id.imageItem);
        TextView nameAX = (TextView) view.findViewById(R.id.nameItemTV);
        TextView dateAX = (TextView) view.findViewById(R.id.dateTV);

        imageAX.setImageResource(item.getImage());
        nameAX.setText(item.getName());
        dateAX.setText(item.getDate());

        return view;
    }
}
