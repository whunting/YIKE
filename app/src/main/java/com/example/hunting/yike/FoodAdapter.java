package com.example.hunting.yike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by hunting on 2018/3/18.
 */

public class FoodAdapter extends ArrayAdapter<Food> {
    public FoodAdapter(Context context, int resource, List<Food> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //获取数据
        Food food=getItem(position);

        //创建布局
        View onefoodView= LayoutInflater.from(getContext()).inflate(R.layout.food_item,parent,false);

        //获取ImageView和TextView
        ImageView imageView=(ImageView)onefoodView.findViewById(R.id.food_small_imageView);
        TextView textView = (TextView) onefoodView.findViewById(R.id.food_name_textView);

        // 展现
        imageView.setImageResource(food.getImageId());
        textView.setText(food.getName());

        return  onefoodView;
    }
}
