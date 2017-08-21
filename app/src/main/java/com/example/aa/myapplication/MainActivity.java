package com.example.aa.myapplication;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


import com.donkingliang.labels.LabelsView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private LabelsView labelsView;
    private EditText editText;

    String S;
    private String[] tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelsView = (LabelsView) findViewById(R.id.labels);
        editText = (EditText) findViewById(R.id.tv);
        //测试的数据
        ArrayList<String> label = new ArrayList<>();
        tv = new String[10];
        label.add("Android");
        label.add("IOS");
        label.add("前端");
        label.add("后台");
        label.add("微信开发");
        label.add("游戏开发");
        label.add("Java");
        label.add("JavaScript");
        label.add("C++");
        label.add("PHP");
        labelsView.setLabels(label);
        labelsView.setOnLabelSelectChangeListener(new LabelsView.OnLabelSelectChangeListener() {
            @Override
            public void onLabelSelectChange(View label, String labelText, boolean isSelect, int position) {
                StringBuilder sb = new StringBuilder();
                if (isSelect){
                    tv[position]=labelText;
                }else {
                    tv[position]=null;
                }
                for (String s : tv) {
                    if (s!=null){
                        sb.append(String.valueOf(s));
                    }
                }
                Log.e("aa",sb.toString());
                editText.setText(sb.toString());


            }
        });
    }
}
