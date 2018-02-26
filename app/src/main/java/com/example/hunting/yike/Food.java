package com.example.hunting.yike;

import java.util.ArrayList;
import java.util.List;


public class Food {

    private String name;
    private int imageId;
    private String desc;

    public Food(String name,int imageId,String desc){
        this.name=name;
        this.imageId=imageId;
        this.desc=desc;
    }

    public static List<Food> getALLFoods(){
        List<Food> foods= new ArrayList<Food>();
        foods.add(new Food("油焖虾",R.drawable.youmenxia,"好吃"));
        foods.add(new Food("玫瑰扁食",R.drawable.rosedumpling,"好看"));

        return foods;
    }
    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getImageId(){
        return imageId;
    }

    public void setImageId(int imageId){
        this.imageId=imageId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
