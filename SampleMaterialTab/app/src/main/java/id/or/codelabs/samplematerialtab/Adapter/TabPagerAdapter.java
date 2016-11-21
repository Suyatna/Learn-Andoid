package id.or.codelabs.samplematerialtab.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.or.codelabs.samplematerialtab.Fragment.Fragment_Dua;
import id.or.codelabs.samplematerialtab.Fragment.Fragment_Satu;

/**
 * Created by bayu on 24/11/15.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {

    private String[] tittle= new String[]{"Tab 1","Tab 2"};

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = new Fragment_Satu();
                break;
            case 1:
                fragment = new Fragment_Dua();
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tittle[position];
    }

    @Override
    public int getCount() {
        return tittle.length;
    }
}
