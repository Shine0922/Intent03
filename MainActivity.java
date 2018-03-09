package com.example.win7.exintent03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  取得介面元件
        Button btnPage2=(Button)findViewById(R.id.btnPage2);
        //  設定 Button 的 Listener
        btnPage2.setOnClickListener(btnPage2Listener);
    }

    private Button.OnClickListener btnPage2Listener = new Button.OnClickListener()
    {
        public void onClick(View v)
        {
            //  使用Intent　切換畫面
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Main2Activity.class);

            String name = "Zack";
            int age = 25;
            Double tall = 174.3;

            //  打包資料
            Bundle bundle = new Bundle();
            bundle.putString("NAME",name);
            bundle.putInt("AGE",age);
            bundle.putDouble("TALL",tall);
            intent.putExtras(bundle);

            //  執行附帶資料的 Intent
            startActivity(intent);
        }
    };
}
