package com.nugget.hios.old;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

import com.nugget.hios.R;

public class NoInternetDialog extends Dialog {
    public NoInternetDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.no_internet_dialog_layout);

        //final AppCompatButton retryBtn = findViewById(R.id.retry_btn);

        //retryBtn.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //code goes gere...

                //dismiss();
            //}
        //});
    }
}
