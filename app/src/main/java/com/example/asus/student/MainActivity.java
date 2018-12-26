package com.example.asus.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtName,txtcourse,txtscore;
    Button btninsert,btndelete,btnquery,btnupdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName=findViewById(R.id.edtTxt_course_name);
        txtcourse=findViewById(R.id.edtTxt_course_course);
        txtscore=findViewById(R.id.edtTxt_course_score);
        btninsert=findViewById(R.id.btn_insert);
        btndelete=findViewById(R.id.btn_delete);
        btnquery=findViewById(R.id.btn_query);
        btnupdate=findViewById(R.id.btn_update);
        findViewById(R.id.btn_insert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=txtName.getText().toString().trim();
                String id=txtcourse.getText().toString().trim();
                Long phone=Long.valueOf(txtscore.getText().toString().trim());
                Student student=new Student();
                student.getName(name);
                student.getId(id);
                student.getPhone(phone);


            }
        });
    }
}
