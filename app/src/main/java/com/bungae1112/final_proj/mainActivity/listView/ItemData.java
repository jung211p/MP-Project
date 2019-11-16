/*
Author: 20181683 임중혁
Last Modification date: 19.11.16
Function: Container of Item's data
 */


package com.bungae1112.final_proj.mainActivity.listView;

public class ItemData
{
    private String imgURL;
    private String name;
    private String category;
    private String remain, max;

    public ItemData(String imgURL, String name, String category, String remain, String max) {
        this.imgURL = imgURL;
        this.name = name;
        this.category = category;
        this.remain = remain;
        this.max = max;
    }

    public String getImgURL() {
        return imgURL;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getRemain() {
        return remain;
    }

    public String getMax() {
        return max;
    }
}
