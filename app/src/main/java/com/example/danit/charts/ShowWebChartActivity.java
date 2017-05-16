package com.example.danit.charts;



        import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.webkit.JavascriptInterface;
        import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class ShowWebChartActivity extends ActionBarActivity {
    int tabla[] = {0, 3, 0,10,0,3,0 };
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_web_chart);


        webView = (WebView)findViewById(R.id.web);
        webView.addJavascriptInterface(new WebAppInterface(), "Android");

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/chart.html");

    }

    public class WebAppInterface {
        @JavascriptInterface
        public int getWeb(){

            return 0;

        }
        @JavascriptInterface
        public int getLength(){
            return tabla.length;
        }
        @JavascriptInterface
        public int getTabla(int i){
            return tabla[i];
        }

    }

}