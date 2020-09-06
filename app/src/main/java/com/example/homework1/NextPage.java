package com.example.homework1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.homework1.model.Check;

public class NextPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);

        Button checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText = findViewById(R.id.number13_edit_text);
                Check num13Text = new Check(numberEditText.getText().toString());
                if(num13Text.checkLength()){
                    Toast t = Toast.makeText(
                            NextPage.this,
                            "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",
                            Toast.LENGTH_LONG);
                    t.show();

                }
                else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(NextPage.this);
                    dialog.setTitle("ผลการตวรจสอบสิทธิเลือกตั้ง");
                    dialog.setMessage(num13Text.checkNum());
                    dialog.setPositiveButton("OK", null);
                    dialog.show();
                }
            }
        });
    }
}