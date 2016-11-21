package id.or.codelabs.introswipe;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import id.or.codelabs.introswipe.adapter.WalkthroughAdapter;
import id.or.codelabs.introswipe.utility.CirclePageIndicator;

public class WalkthroughActivity extends AppCompatActivity {
    WalkthroughAdapter adapter;
    ViewPager viewPager;
    private ImageButton btnNext;
    private Button btnSkip;
    CirclePageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        initView();
        adapter = new WalkthroughAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);

        indicator.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(final int position) {
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (position == 2) {
                            Intent i = new Intent(WalkthroughActivity.this, RegistLoginActivity.class);
                            startActivity(i);
                            finish();
                        } else {
                            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
                        }

                    }
                });
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WalkthroughActivity.this, RegistLoginActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
            }
        });
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewpager_intro);
        btnNext = (ImageButton) findViewById(R.id.button_next_intro);
        btnSkip = (Button) findViewById(R.id.button_skip_intro);
        indicator = (CirclePageIndicator) findViewById(R.id.indicator_get_started);
    }

}
