package com.bungae1112.final_proj.mainActivity.itemView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bungae1112.final_proj.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import androidx.appcompat.app.AppCompatActivity;

public class itemView extends AppCompatActivity {
    EditText EditText_StoreName = (EditText) findViewById(R.id.StoreName);

    //데이터 베이스에서 받아올 형식

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cursor cur;


        ImageView StoreImage = (ImageView) findViewById(R.id.imageView_Store);
        Button btnReservation = (Button) findViewById(R.id.btnReservation);
        Button btnSeat = (Button) findViewById(R.id.btnSeat) ;

//        EditText_StoreName = cur.getColumnName(1)

//        StoreImage.setImageURI();


        //예약하기 클릭 시
        btnReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent =new Intent(getApplicationContext(), ReservationActivity.class);
//                startActivity(intent);
            }
        });

        //좌석 수 클릭 시
        btnSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //팝업 창 이미지 (코딩)

                //뒷배경 흐리기
//                WindowManager.LayoutParams layoutParams= new WindowManager.LayoutParams();
//
//                layoutParams.flags= WindowManager.LayoutParams.FLAG_DIM_BEHIND;
//
//                layoutParams.dimAmount= 0.7f;getWindow().setAttributes(layoutParams);
//
//                setContentView(R.layout.layout_name);
            }
        });





//        ===== DB
    }

    private void setStoreName(String a) {

        try{
            JSONObject object = new JSONObject(str);
            for(int i = 0; i < Store.length();i++){
                if (Store.getString(i) == a){
                    EditText_StoreName.setText(a);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

}
