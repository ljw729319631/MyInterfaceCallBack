package com.example.jiawei.myapplication;

/**
 * Created by jiawei on 2018/5/29.
 */

public class ToastMsg {
    SendMsgIm sendMsgIm;
    public ToastMsg(){
    }
    public void setSendMsgListener(SendMsgIm sendMsgIm){
        this.sendMsgIm = sendMsgIm;
        String str = "哈哈";
        sendMsgIm.onMsg(str);
    }

//    public ToastMsg(SendMsgIm sendMsgIm){
//        this.sendMsgIm = sendMsgIm;
//        String str = "哈哈";
//        sendMsgIm.onMsg(str);
//    }
}
