 package com.example.abc;
import android.graphics.Bitmap;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {
    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview= (WebView)findViewById(R.id.webview);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("http://binimoyhub.com");
        mywebview.setWebViewClient(new myWebClient());


    }

     @Override
     public void onBackPressed(){

         if(mywebview.canGoBack()){
             mywebview.goBack();
         }
         else{
             super.onBackPressed();

         }
     }
     public class myWebClient extends WebViewClient implements com.example.abc.myWebClient {

         @Override
         public void onPageStarted (WebView view, String url, Bitmap favicon){
             super.onPageStarted(view, url, favicon);
         }
         @Override
         public boolean shouldOverrideUrlLoading(WebView view, String url){

             view.loadUrl(url);
             return true;
         }
     }



}
