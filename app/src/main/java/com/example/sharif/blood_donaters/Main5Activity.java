package com.example.sharif.blood_donaters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
   EditText editText;
   Button button;
   int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        editText=findViewById(R.id.t1);
        button=findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Database database=new Database(Main5Activity.this);
                a= database.Delete(editText.getText().toString());
                if(a>0){
                    Toast.makeText(Main5Activity.this,"delete",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Main5Activity.this," not delete",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
