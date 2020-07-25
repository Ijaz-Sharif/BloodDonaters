package com.example.sharif.blood_donaters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText=findViewById(R.id.pass);
        button=findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=editText.getText().toString();
                if(a.equals("717273")){
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Main2Activity.this,"Wrong password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
