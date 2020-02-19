package com.auntor.alartdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    AlertDialog.Builder alertDialogBulder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.exitBtn);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        alertDialogBulder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBulder.setTitle("Alart");
        alertDialogBulder.setMessage("Do You Want To Exit?");
        alertDialogBulder.setIcon(R.drawable.what);
        alertDialogBulder.setCancelable(false);

        alertDialogBulder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             //exit
                finish();
            }
        });

        alertDialogBulder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
dialog.cancel();
            }
        });


        alertDialogBulder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You click on Cancel",Toast.LENGTH_SHORT).show();

            }
        });



        AlertDialog alertDialog = alertDialogBulder.create();
        alertDialog.show();


    }
}
