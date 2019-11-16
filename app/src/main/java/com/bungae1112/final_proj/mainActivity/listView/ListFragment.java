/*
Author: 20181683 임중혁
Last Modification date: 19.11.16
Function: Floating List View that showing Pub Items
 */


package com.bungae1112.final_proj.mainActivity.listView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.bungae1112.final_proj.R;

import java.util.ArrayList;

public class ListFragment extends Fragment
{
    View fragView;

    ArrayList<ItemData> itemList;
    ListView listView;
    ItemAdapter itemAdapter;

    @ Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState )
    {
        fragView = inflater.inflate(R.layout.list_fragment, container, false);

        listView = (ListView) fragView.findViewById(R.id.list_listView_lv);
        InitItems();

        itemAdapter = new ItemAdapter(fragView.getContext(), itemList);

        listView.setAdapter(itemAdapter);

        itemAdapter.notifyDataSetChanged();

        return fragView;
    }

    public void InitItems(){
        itemList = new ArrayList<ItemData>();

        // Test Data
        itemList.add( new ItemData("test", "Orandakan", "restaurant", "20", "50") );
        itemList.add( new ItemData("test", "Orandakan", "restaurant", "20", "50") );
    }

}
