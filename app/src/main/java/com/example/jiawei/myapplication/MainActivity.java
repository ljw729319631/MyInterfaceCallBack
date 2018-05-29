package com.example.jiawei.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //比如button的点击事件完成下面这一个操作
        ToastMsg toastMsg = new ToastMsg();
        toastMsg.setSendMsgListener(new SendMsgIm() {
            @Override
            public void onMsg(String str) {
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }
        });


//        new ToastMsg(new SendMsgIm(){
//
//            @Override
//            public void onMsg(String str) {
//                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
