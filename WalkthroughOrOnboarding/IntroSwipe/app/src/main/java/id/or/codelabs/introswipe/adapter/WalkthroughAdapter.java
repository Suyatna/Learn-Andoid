package id.or.codelabs.introswipe.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import id.or.codelabs.introswipe.R;
import id.or.codelabs.introswipe.WalkthroughFragment;

/**
 * Created by BayuWPP on 4/6/2016.
 */
public class WalkthroughAdapter extends FragmentStatePagerAdapter {


    public WalkthroughAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return WalkthroughFragment.newInstance(R.drawable.eagle);
            case 1:
                return WalkthroughFragment.newInstance(R.drawable.horse);
            case 2:
                return WalkthroughFragment.newInstance(R.drawable.wolf);
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
