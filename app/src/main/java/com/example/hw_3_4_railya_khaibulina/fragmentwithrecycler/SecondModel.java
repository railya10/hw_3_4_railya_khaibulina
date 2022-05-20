package com.example.hw_3_4_railya_khaibulina.fragmentwithrecycler;

import android.widget.TextView;

import java.io.Serializable;

public class SecondModel implements Serializable {
    private String textView;
    private String singer;
    private int number;
    private String time;

    public SecondModel(String textView, String singer, int number, String time) {
        this.textView = textView;
        this.singer = singer;
        this.number = number;
        this.time = time;

    }


    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}




