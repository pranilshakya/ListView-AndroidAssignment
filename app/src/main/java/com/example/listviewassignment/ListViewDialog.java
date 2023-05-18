package com.example.listviewassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewDialog extends Dialog {
    private TextView title;
    private ListView listView;
    private Button btnOK;

    String listItems[] = {
            "First List Item",
            "Second List Item",
            "Third List Item",
            "Fourth List Item",
            "Fifth List Item",
            "Sixth List Item",
    };

    public ListViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_list_view_dialog);
        title = findViewById(R.id.titleListViewDialog);
        listView = findViewById(R.id.listView);
        btnOK = findViewById(R.id.btnDialogOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        ArrayAdapter<String> arrayAdapter
                = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listItems);

        listView.setAdapter(arrayAdapter);


        //ArrayAdapter<String> rameAdapter = new ArrayAdapter<>(ListViewDialog.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, listItems);
        //listView.setAdapter(rameAdapter);
    }

}