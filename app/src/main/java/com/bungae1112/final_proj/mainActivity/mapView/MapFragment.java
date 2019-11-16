package com.bungae1112.final_proj.mainActivity.mapView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.bungae1112.final_proj.R;

public class MapFragment extends Fragment
{

    @ Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState )
    {
        return inflater.inflate(R.layout.map_fragment, container, false);
    }

}
