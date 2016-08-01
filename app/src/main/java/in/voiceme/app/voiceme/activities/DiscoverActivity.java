package in.voiceme.app.voiceme.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.fragments.DiscoverLatestFragment;
import in.voiceme.app.voiceme.fragments.DiscoverPopularFragment;
import in.voiceme.app.voiceme.fragments.DiscoverTrendingFragment;
import in.voiceme.app.voiceme.views.DiscoverFragmentPagerAdapter;
import in.voiceme.app.voiceme.views.MainNavDrawer;


public class DiscoverActivity extends BaseAuthenticatedActivity {
    private static final int REQUEST_VIEW_MESSAGE = 1;

    @Override
    protected void onVoicemeCreate(Bundle savedState) {
        setContentView(R.layout.activity_discover);
        getSupportActionBar().setTitle("Discover");
        setNavDrawer(new MainNavDrawer(this));

       // ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        // viewPager.setAdapter(new DiscoverFragmentPagerAdapter(getSupportFragmentManager()));

        ViewPager viewPager = (ViewPager) findViewById(R.id.mViewPgaer_ID);
        this.addPages(viewPager);

        // Give the PagerSlidingTabStrip the ViewPager
        SmartTabLayout tabsStrip = (SmartTabLayout) findViewById(R.id.mTAB_ID);
        // Attach the view pager to the tab strip
        tabsStrip.setViewPager(viewPager);
    }

    //add all pages
    private void addPages(ViewPager pager){
        DiscoverFragmentPagerAdapter adapter = new DiscoverFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new DiscoverLatestFragment());
        adapter.addPage(new DiscoverPopularFragment());
        adapter.addPage(new DiscoverTrendingFragment());

        //set adapter to pager
        pager.setAdapter(adapter);
    }


}
