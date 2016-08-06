package in.voiceme.app.voiceme.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import in.voiceme.app.voiceme.R;
import in.voiceme.app.voiceme.fragments.ActivityInteractionFragment;
import in.voiceme.app.voiceme.fragments.ActivityYourFeedFragment;
import in.voiceme.app.voiceme.fragments.DiscoverLatestFragment;
import in.voiceme.app.voiceme.fragments.DiscoverPopularFragment;
import in.voiceme.app.voiceme.fragments.DiscoverTrendingFragment;
import in.voiceme.app.voiceme.views.MainActivityFragmentPagerAdapter;
import in.voiceme.app.voiceme.views.MainNavDrawer;

public class MainActivity extends BaseAuthenticatedActivity {

    @Override
    protected void onVoicemeCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Activity");
        setNavDrawer(new MainNavDrawer(this));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_main_activity);
        this.addPages(viewPager);

        // Give the PagerSlidingTabStrip the ViewPager
        SmartTabLayout tabsStrip = (SmartTabLayout) findViewById(R.id.tabs_main_activity);
        // Attach the view pager to the tab strip
        tabsStrip.setViewPager(viewPager);

    }

    //add all pages
    private void addPages(ViewPager pager){
        MainActivityFragmentPagerAdapter adapter = new MainActivityFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new ActivityYourFeedFragment());
        adapter.addPage(new ActivityInteractionFragment());

        //set adapter to pager
        pager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
