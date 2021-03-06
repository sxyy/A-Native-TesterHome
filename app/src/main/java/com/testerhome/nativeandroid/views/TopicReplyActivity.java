package com.testerhome.nativeandroid.views;

import android.os.Bundle;

import com.testerhome.nativeandroid.R;
import com.testerhome.nativeandroid.fragments.TopicReplyFragment;
import com.testerhome.nativeandroid.views.base.BackBaseActivity;

/**
 * Created by cvtpc on 2015/10/16.
 */
public class TopicReplyActivity extends BackBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_base);
        setCustomTitle("回帖列表");
        setupView();
    }

    private void setupView() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                TopicReplyFragment.newInstance(String.valueOf(getIntent().getIntExtra("topic_id", 0))))
                .commit();
    }





}
