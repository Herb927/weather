package com.coolweather.android;

/**
 * Created by hebo on 2017/2/16.
 */
public class Set {
    private String name;
    private int imageId;
    public Set(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
