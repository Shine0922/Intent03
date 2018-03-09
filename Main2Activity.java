package com.example.win7.exintent03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //  取得介面元件
        TextView txtShow = (TextView)findViewById(R.id.txtShow);
        Button btnHome = (Button)findViewById(R.id.btnHome);

        //  設定 Button 的 Listener
        btnHome.setOnClickListener(btnHomeListener);

        //  取得Bundle
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        String name =bundle.getString("NAME");
        int age = bundle.getInt("AGE");
        Double tall = bundle.getDouble("TALL");

        String s =   "姓名:   " + name + "\n" +
                     "年齡:   " + age  + " 歲" + "\n" +
                     "身高:   " + tall + " 公分" ;
        txtShow.setText(s);
    }

    private Button.OnClickListener btnHomeListener = new Button.OnClickListener()
    {
        public void onClick(View v)
        {
            //  使用Intent　切換畫面
            Intent intent = new Intent();
            intent.setClass(Main2Activity.this,MainActivity.class);
            //  執行 Intent
            startActivity(intent);

        }
    };
}
