package com.victor.paint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class GridViewAdapter extends BaseAdapter {
    private Context mContext;

    public GridViewAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return itemImages.length;
    }

    public Object getItem(int position) {
        return itemImages[position];
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View grid = inflater.inflate(R.layout.grid_item, parent, false);

        ImageView imageView = (ImageView) grid.findViewById(R.id.img_v);
        TextView textView = (TextView) grid.findViewById(R.id.txt_v);
        imageView.setImageResource(itemImages[position]);
        textView.setText(itemNames[position]);

        return grid;
    }

    // references to our images
    public Integer[] itemImages = {R.drawable.ic_pencil_24dp, R.drawable.line, R.drawable.multi_line, R.drawable.ic_eraser_24dp,
            R.drawable.circle, R.drawable.circle_fill,
            R.drawable.oval, R.drawable.oval_fill,
            R.drawable.square, R.drawable.square_fill,
            R.drawable.rectpng, R.drawable.rect_fill,
            R.drawable.ic_edit, R.drawable.ic_copy_36dp,
            R.drawable.ic_text_24dp, R.drawable.hand_mode};
    public String[] itemNames = {"Pencil", "Line", "Polygonal line", "Eraser", "Circle", "Filled Circle",
            "Oval", "Filled Oval", "Square", "Filled Square", "Rectangle", "Filled Rectangle", "Edit", "Copy", "Text", "Hand mode"};
}
