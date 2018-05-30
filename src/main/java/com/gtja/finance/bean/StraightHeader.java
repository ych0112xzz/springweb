package com.gtja.finance.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("header")
public class StraightHeader implements Header {
    @Value("${color}")
    private String color;
    @Value("${size}")
    private int size;

    /*public StraightHeader(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public StraightHeader(Map<String, String> map) {
        this.color = map.get("color");
        this.size = Integer.parseInt(map.get("size"));
    }*/


    @Override
    public void dowork() {
        System.out.println("now,let's do work");
    }

    @Override
    public String getInfo() {
        return "StraightHeader"+"color:" + color + "\tsize:" + size;
    }
}
