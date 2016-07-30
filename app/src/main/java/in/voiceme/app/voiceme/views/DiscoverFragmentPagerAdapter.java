package in.voiceme.app.voiceme.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import in.voiceme.app.voiceme.fragments.DiscoverLatestFragment;
import in.voiceme.app.voiceme.fragments.DiscoverPopularFragment;
import in.voiceme.app.voiceme.fragments.DiscoverTrendingFragment;

/**
 * Created by Harish on 7/29/2016.
 */
public class DiscoverFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Latest", "Trending", "Popular" };

    public DiscoverFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return DiscoverLatestFragment.newInstance(0);
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return DiscoverTrendingFragment.newInstance(1);
            case 2: // Fragment # 1 - This will show SecondFragment
                return DiscoverPopularFragment.newInstance(2);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
