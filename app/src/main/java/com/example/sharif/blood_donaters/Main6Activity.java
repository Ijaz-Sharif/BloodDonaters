package com.example.sharif.blood_donaters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Main6Activity extends AppCompatActivity {
   String blood[]={"Selcect your BLood Group","A+","A-","B+","B-","AB+","AB-","O+","O-"};
   Spinner spinner;
   String a;
   EditText name,num,cini;
   ArrayAdapter<String> arrayAdapter;
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        spinner=findViewById(R.id.spinner);
        button=findViewById(R.id.reg1);
        name=findViewById(R.id.u_name1);
        num=findViewById(R.id.u_cnic1);
        cini=findViewById(R.id.u_num1);
        arrayAdapter=new ArrayAdapter<String>(Main6Activity.this,android.R.layout.simple_list_item_1,blood);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position>0){
                    a=parent.getItemAtPosition(position).toString();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Donete donete=new Donete(name.getText().toString(),num.getText().toString(),cini.getText().toString(),a);
             Database datbase=new Database(Main6Activity.this);
             datbase.AddData(donete);
             num.setText("");
             name.setText("");
             cini.setText("");
             spinner.setAdapter(arrayAdapter);
         }
     });
    }
}
