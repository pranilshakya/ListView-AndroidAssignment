package com.example.listviewassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import android.widget.TextView;

import java.util.ArrayList;

public class GridViewDialog extends Dialog {
    private GridImageAdapter gridImageAdapter;
    private TextView title;
    private GridView gridView;
    private Button btnOK;

    ArrayList<ListData> imgList = new ArrayList<ListData>();

    public GridViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_grid_view_dialog);
        title = findViewById(R.id.titleGridViewDialog);
        gridView = findViewById(R.id.gridView);
        btnOK = findViewById(R.id.btnDialogOK);

        imgList.add(new ListData(R.drawable.img1, "Scene 1"));
        imgList.add(new ListData(R.drawable.img2, "Scene 2"));
        imgList.add(new ListData(R.drawable.img3, "Scene 3"));
        imgList.add(new ListData(R.drawable.img4, "Scene 4"));
        imgList.add(new ListData(R.drawable.img5, "Scene 5"));

        gridImageAdapter = new GridImageAdapter(context, imgList);
        gridView.setAdapter(gridImageAdapter);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

    }
}