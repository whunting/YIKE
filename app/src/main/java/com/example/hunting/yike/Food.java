package com.example.hunting.yike;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whunting
 * @date 2018-3-6
 *
 * Food类
 * name: 食物名称
 * imageId: 图片ID
 * desc: 描述文本
 */
public class Food {

    private String name;
    private int imageId;
    private String desc;

    private Food(String name,int imageId,String desc){
        this.name=name;
        this.imageId=imageId;
        this.desc=desc;
    }

    private static List<Food> getALLFoods(){
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
