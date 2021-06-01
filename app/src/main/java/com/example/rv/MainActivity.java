package com.example.rv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(new Adapter(getData()));

    }

    private ArrayList<DataObject> getData() {
      ArrayList<DataObject> data=new ArrayList<>();
         /* data.add(new DataObject("angana","how are you","come sooooooon",R.drawable.image2));
        data.add(new DataObject("adrita","how allq you","come oon",R.drawable.imag3));
        data.add(new DataObject("moni","how aake you","come hell",R.drawable.image4));
        data.add(new DataObject("gitee","how armamae you","come bye",R.drawable.image2));
        data.add(new DataObject("pradip","how aasnjare you","come bruh",R.drawable.image1));
        data.add(new DataObject("koka","how amamskre you","come bruh",R.drawable.imag3));*/

        data.add(new DataObject("angana","Report of jan","The below attachment consist of the summary of the report",R.drawable.image2));
        data.add(new DataObject("adrita","Requesting for leave","Grant me leave for 10 days as I have an emergency",R.drawable.imag3));
        data.add(new DataObject("moni","Requesting update of february","Please send me th update of performances of the employees of last month",R.drawable.image4));
        data.add(new DataObject("gitee","Finance Details","PFA documents of finance",R.drawable.image2));
        data.add(new DataObject("pradip","Employee Details","PFA documents of updated employee document",R.drawable.image1));
        data.add(new DataObject("kamakhya","TODO for march","Please review the TODO prepared for the month of march ",R.drawable.imag3));
        return data;
    }
}