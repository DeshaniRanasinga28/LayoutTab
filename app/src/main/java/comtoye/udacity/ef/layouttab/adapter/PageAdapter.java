package comtoye.udacity.ef.layouttab.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import comtoye.udacity.ef.layouttab.R;
import comtoye.udacity.ef.layouttab.fragment.Tab1Fragment;
import comtoye.udacity.ef.layouttab.fragment.Tab2Fragment;

/**
 * Created by EF on 22-Jan-18.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> tabList = new ArrayList<>();
    private final List<String> tabTitle = new ArrayList<>();

    public PageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return tabList.get(position);
    }

    @Override
    public int getCount() {
        return tabList.size();
    }

    public void addFragment(Fragment fragment, String title){
        tabList.add(fragment);
        tabTitle.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitle.get(position);
    }

}
