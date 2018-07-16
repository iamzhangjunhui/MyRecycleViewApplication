package com.example.kaylee.myrecycleviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> data = new ArrayList<>();
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        data.add("8");
        data.add("9");
        data.add("10");
        data.add("11");
        data.add("12");
        data.add("13");
        data.add("14");
        data.add("15");
        data.add("16");
        data.add("17");
        data.add("18");
        data.add("19");
        data.add("20");
        data.add("21");
        data.add("22");
        data.add("23");
        data.add("24");
        data.add("25");
        data.add("26");
        data.add("27");
        data.add("28");
        final LinearLayout view = findViewById(R.id.containter);
        for (int i = 0; i < data.size(); i++) {
            final View itemView= LayoutInflater.from(MainActivity.this).inflate(R.layout.item,view,false);
            final TextView textView =itemView.findViewById(R.id.text);
            textView.setText(view.getChildCount()+"");
            Button btn=itemView.findViewById(R.id.btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=-1;
                    for (int j=0;j<view.getChildCount();j++){
                        if (view.getChildAt(j)==itemView) {
                            position=j;
                            view.removeView(itemView);
                            break;
                        }

                    }
                    for (int k=position;k<view.getChildCount();k++){
                        TextView textView1= (TextView) ((LinearLayout)view.getChildAt(k)).getChildAt(0);

                        if (textView1!=null){
                            textView1.setText((Integer.parseInt(textView1.getText().toString())-1)+"");
                        }
                    }
                }
            });
            view.addView(itemView);
        }

    }


}
