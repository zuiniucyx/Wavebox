package com.wavebox.UI.activity;

import android.app.Activity;
import android.os.Bundle;
import com.wavebox.R;

public class MainActivity extends Activity {

    private String waveMusicURL = "http://www.wavebox.net";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebViewActivity.loadUrl(this, waveMusicURL, false);
    }
}
