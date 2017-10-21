package com.example.zfyao.hellozfy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //得到按钮实例
        Button helloBtn=(Button) findViewById(R.id.helloButton );
        //设置监听按钮点击事件
        helloBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //得到实例
                TextView helloTv=(TextView) findViewById(R.id.helloTextView);
                //弹出Toast提示按钮被点击了
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
                helloTv.setText(R.string.interact_message);
            }
        });

    }
}
