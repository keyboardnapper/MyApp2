package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.harsh.MyApp.MSG";
    public static final String MSG2 = "com.harsh.MyApp.MSG2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void launchNext (View view){
        Intent intent = new Intent(this, verify.class);
        EditText editText1 = findViewById(R.id.name);
        EditText editText2 = findViewById(R.id.ID);
        EditText editText3 = findViewById(R.id.pwd);
        String message ="Welcome " + editText1.getText().toString();
        String message2 ="Your ID is " + editText2.getText().toString();
        intent.putExtra(MSG, message);
        intent.putExtra(MSG2, message2);
        startActivity(intent);
    }

}