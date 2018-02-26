package com.example.hunting.yike;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AVOSCloud.initialize(this, "MN1c6wWL0NSifRqIfayFkDTx-gzGzoHsz", "b8GERSv31BN4xo7dGkc2fdPC");
        AVOSCloud.setDebugLogEnabled(true);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> foodAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Food.getALLFoods());
        ListView listView = findViewById(R.id.food_listView);
        listView.setAdapter(foodAdapter);

        // 测试 SDK 是否正常工作的代码
        AVObject testObject = new AVObject("TestObject");
        testObject.put("words", "Hello World!");
        testObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(AVException e) {
                if (e == null) {
                    Log.d("saved", "success!");
                }
            }
        });
    }
}