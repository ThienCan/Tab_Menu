package com.example.intern.tabmenu;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by intern on 18/01/2017.
 */

public class FragmentOne extends Fragment {
    public FragmentOne(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void onClickButtonFragmentOneDetail(View view){
        Intent intent = new Intent(getActivity(),DetailFragmentOne.class);
        getActivity().startActivity(intent);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fragment_one,container,false);

    }
}
