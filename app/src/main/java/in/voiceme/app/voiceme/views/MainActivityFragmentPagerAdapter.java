package in.voiceme.app.voiceme.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import in.voiceme.app.voiceme.fragments.ActivityInteractionFragment;
import in.voiceme.app.voiceme.fragments.ActivityYourFeedFragment;

/**
 * Created by Harish on 7/30/2016.
 */
public class MainActivityFragmentPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> pages = new ArrayList<>();

    final int PAGE_COUNT = 2;
    private String tabTitles2[] = new String[] { "Your Feed", "Interactions"};

    public MainActivityFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return ActivityYourFeedFragment.newInstance(0);
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return ActivityInteractionFragment.newInstance(1);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    //add a page
    public void addPage(Fragment fragment){
        pages.add(fragment);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles2[position];
    }
}
