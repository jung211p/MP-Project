package com.bungae1112.final_proj.mainActivity.itemView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bungae1112.final_proj.R;

import androidx.appcompat.app.AppCompatActivity;

public class itemView extends AppCompatActivity {


    EditText itemInfo_StoreName = (EditText) findViewById(R.id.itemInfo_storeName);
    EditText itemInfo_StoreAddress = (EditText) findViewById(R.id.itemInfo_address);
    EditText itemInfo_StorePhoneNum = (EditText) findViewById(R.id.itemInfo_phoneNum);


    item Store;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cursor cur;


        ImageView StoreImage = (ImageView) findViewById(R.id.itemInfo_img);
        Button btnReservation = (Button) findViewById(R.id.btnReservation);
        Button btnSeat = (Button) findViewById(R.id.btnSeat) ;

        //예약하기 클릭 시
        btnReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //좌석 수 클릭 시
        btnSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void setInit(){
        Store.inititem("덤");
        itemInfo_StoreName.setText(Store.getStoreName());
        itemInfo_StoreAddress.setText(Store.getStoreAddress());
        itemInfo_StorePhoneNum.setText(Store.getStorePhoneNum());

    }







}
