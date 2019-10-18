package com.example.tecsup.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    int cant_tabs;
    Context context;

    public TabAdapter(FragmentManager fm, int cant_tabs, Context context) {
        super(fm);
        this.cant_tabs = cant_tabs;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new CategoriasFragment();
        }else{
            return new ProveedoresFragment();
        }
    }

    @Override
    public int getCount() {
        return cant_tabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        Drawable drawable = context.getResources().getDrawable(R.drawable.ic_launcher_background);
        Spann

        return "Pagina "+(position+1);
    }

}
