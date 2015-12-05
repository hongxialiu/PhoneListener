package com.andrew.systemservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void start(View view){
        //开启服务
        Intent intent = new Intent(this,SystemService.class);
        startService(intent);
    }

    public void stop(View view){
        //停止服务
        Intent intent = new Intent(this,SystemService.class);
        stopService(intent);
    }

}
