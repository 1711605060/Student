package com.example.asus.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText txtName, txtid, txtphone;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.edtTxt_course_name);
        txtid = findViewById(R.id.edtTxt_course_id);
        txtphone = findViewById(R.id.edtTxt_course_phone);

        textView = findViewById(R.id.tvshow);
        findViewById(R.id.btn_insert).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String name = txtName.getText().toString().trim();
                String id = txtid.getText().toString().trim();
//                Long phone = Long.valueOf(txtphone.getText().toString().trim());
                Student student = new Student();
                student.setName(name);
                student.setId(id);
          //      student.setPhone(phone);
                MySQLiteAdapter adapter = new MySQLiteAdapter(getApplicationContext());
                adapter.insert(student);

            }
        });
       /* findViewById(R.id.btn_query).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySQLiteAdapter adapter= new MySQLiteAdapter(getApplicationContext());
                List<Student> list=adapter.queryAll(txtName.getText().toString());

                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < list.size(); i++) {
                    sb.append("姓名： "+list.get(i).getName()+"\n");
                }
                textView.setText(sb.toString());

            }
        });*/
        findViewById(R.id.btn_query).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySQLiteAdapter adapter= new MySQLiteAdapter(getApplicationContext());
                List<Student> list=adapter.queryAll(txtName.getText().toString());

                textView.setText(txtName.toString());
            }
        });
        findViewById(R.id.btn_delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=txtName.getText().toString().trim();
                MySQLiteAdapter adapter=new MySQLiteAdapter(getApplicationContext());
                int num=0;
                num=adapter.deleteByName(name);
                textView.setText("删除记录条数："+String.valueOf(num));
                Toast.makeText(getApplicationContext(),"删除记录条数"+String.valueOf(num),Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student=new Student();
                String name=txtName.getText().toString().trim();
                student.setName(name);
           Long phone=Long.valueOf(txtid.getText().toString().trim());
               student.setPhone(phone);
                MySQLiteAdapter adapter=new MySQLiteAdapter(getApplicationContext());
                int num=adapter.update(student);
                textView.setText("更新记录条数："+String.valueOf(num));


            }
        });
    }
}