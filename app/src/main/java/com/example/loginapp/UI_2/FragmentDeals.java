package com.example.loginapp.UI_2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.fragment.app.Fragment;

import com.example.loginapp.R;

public class FragmentDeals extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_deals, container, false);


        ImageView imageView20 = v.findViewById(R.id.imageView20);

        imageView20.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {

                @SuppressLint("RestrictedApi") MenuBuilder menuBuilder =new MenuBuilder(getActivity());
                MenuInflater inflater = new MenuInflater(getActivity());
                inflater.inflate(R.menu.popup_menu, menuBuilder);
                @SuppressLint("RestrictedApi") MenuPopupHelper optionsMenu = new MenuPopupHelper(getActivity(), menuBuilder, v);
                optionsMenu.setForceShowIcon(true);

                // Set Item Click Listener
//                menuBuilder.setCallback(new MenuBuilder.Callback() {
//                    @Override
//                    public boolean onMenuItemSelected(MenuBuilder menu, MenuItem item) {
//                        switch (item.getItemId()) {
//                            case R.id.opt1: // Handle option1 Click
//                                return true;
//                            case R.id.opt2: // Handle option2 Click
//                                return true;
//                            default:
//                                return false;
//                        }
//                    }
//
//                    @Override
//                    public void onMenuModeChange(MenuBuilder menu) {}
//                });


                // Display the menu
                optionsMenu.show();









//                PopupMenu popup = new PopupMenu(getActivity(),imageView20);
//                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());    //create menu res 'popup_menu'
//
////                PopupMenu popup = new PopupMenu(getActivity(), v);
////
////                popup.getMenu().add("Buy only");
////                popup.getMenu().add("Sell only");
////                popup.getMenu().add("Buy and Sell only");
////                popup.getMenu().add("All");
////                popup.getMenu().add("FragMain1_Deals by dates");
////
////                popup.show();
//
//                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    public boolean onMenuItemClick(MenuItem item) {
//                        Toast.makeText(getActivity(), "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                        return true;
//                    }
//                });
//
//                popup.show();
            }
        });

        return v;
    }

}