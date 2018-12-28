package com.example.dutest.dutest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Application;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import android.content.Context;
import java.util.*;
import java.io.*;
import java.net.*;

public class MainActivity extends AppCompatActivity {
    EditText name;   //用户名
    EditText pass;    //密码
    private static TestResource mResource = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        if(mResource == null){
            mResource = new TestResource();
            mResource = new TestResource();
            mResource = new TestResource();
            mResource = new TestResource();

        }

        name = (EditText) findViewById(R.id.name);  //获取用户名
        pass = (EditText) findViewById(R.id.pass);  //获取密码
    }


//    public void givenConnection_whenUnclosed_thenOutOfMemory()
//            throws IOException, URISyntaxException {
//
//        URL url = new URL("ftp://speedtest.tele2.net");
//        URLConnection urlc = url.openConnection();
//        InputStream is = urlc.getInputStream();
//        String str = "";
//
//    }


    public void Check(View view) {
        String mname = "du";
        String mpass = "du";
        String user = name.getText().toString().trim();
        String pwd = pass.getText().toString().trim();
        if (user.equals(mname) && pwd.equals(mpass)) {
            Toast.makeText(this,
                    "恭喜，通过", Toast.LENGTH_SHORT).show();
            if(mResource == null){
                mResource = new TestResource();
            }
        } else {
            Toast.makeText(this,
                    "很遗憾，继续努力", Toast.LENGTH_SHORT).show();
//            if(mResource == null){
//                mResource = new TestResource();
//            }
//            if(mResource == null){
//                mResource = new TestResource();
//            }

        }
    }
    class TestResource {
       //
    }


}


