package com.bungae1112.final_proj.mainActivity.itemView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class item {
    private String StoreName;
    private String StoreAddress;
    private String imgURL;
    private String StorePhoneNum;
    private ArrayList<String> StoreMenu;

    //데이터 베이스에서 받아올 형식================================================================
    String str = "[" +
            "{'name' : '덤', " +
            "'phoneNum' : 123, " +
            "'image' : 'image', " +
            "'address' : 'eeeee', " +
            "'menu': [{'name':'고기',price':18000},{'name' : '술','price' : 200000]" +
            "}]";
    JSONArray Store;
    {
        try {
            Store = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    //=============================================================================================


    public item(String name, String address, String imgURL){
        this.StoreName = name;
        this.imgURL = imgURL;
        this.StoreAddress = address;
    }


    public void inititem(String name){
        try {
            JSONObject object;
            for(int i =0;i<Store.length();i++){
                object = Store.getJSONObject(i);
                String id = object.getString("name");
                StoreName = object.getString("address");
                StorePhoneNum = object.getString("phoneNum");

                if(id == name) break;
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public String getStoreName(){
        return StoreName;
    }
    public String getStoreAddress(){
        return StoreAddress;
    }
    public String getImgURL(){
        return imgURL;
    }
    public String getStorePhoneNum(){
        return StorePhoneNum;
    }

}

