package com.example.listviewassignment;

import androidx.annotation.NonNull;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageListViewDialog extends Dialog {
    private ListAdapter listAdapter;
    ArrayList<ListData> imgList = new ArrayList<ListData>();
    private TextView title;
    private ListView listView;
    private Button btnOK;

    public ImageListViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_image_list_view_dialog);
        title = findViewById(R.id.titleImageListViewDialog);
        listView = findViewById(R.id.imageListView);
        btnOK = findViewById(R.id.btnDialogOK);

        imgList.add(new ListData(R.drawable.img1, "Scene 1"));
        imgList.add(new ListData(R.drawable.img2, "Scene 2"));
        imgList.add(new ListData(R.drawable.img3, "Scene 3"));
        imgList.add(new ListData(R.drawable.img4, "Scene 4"));
        imgList.add(new ListData(R.drawable.img5, "Scene 5"));

        listAdapter = new ListAdapter(context, imgList);
        listView.setAdapter(listAdapter);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

    }
}