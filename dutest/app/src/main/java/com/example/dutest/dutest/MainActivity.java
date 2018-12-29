package com.example.dutest.dutest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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


