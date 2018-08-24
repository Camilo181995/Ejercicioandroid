package com.example.vivelabtunja25.ejercicioandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dos extends AppCompatActivity {
    TextView tv;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        tv=(TextView)findViewById(R.id.TextView);
        btn1=(Button)findViewById((R.id.Button));


        Bundle bundle=getIntent().getExtras();
        String nom = bundle.getString("nombre");
        tv.setText(nom);

btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent it=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(it);

    }
});
    }
}
