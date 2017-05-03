package com.example.dhawaljoshi.imagegrid;

/**
 * Created by Dhawal Joshi on 5/2/2017.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public ImageAdapter(Context c){
        context = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
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

        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.gridview_activity, null);
        }

        ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(R.id.textView);

        //imageView1.setLayoutParams(new GridView.LayoutParams(185, 185));
        imageView1.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView1.setImageResource(mThumbIds[i]);
        textView.setText(titles[i]);

        return view;
    }

    private Integer[] mThumbIds = {
            R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecreamsandwich, R.drawable.jellybean,
            R.drawable.kitkat, R.drawable.lollipop,
    };

    private String[] titles = {
            "Gingerbread", "Honeycomb", "IceCream Sandwich", "Jellybean", "Kitkat", "Lollipop"
    };
}

