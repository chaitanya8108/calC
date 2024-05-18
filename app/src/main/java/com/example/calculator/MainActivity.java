package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private EditText editText;
    private EditText editText2;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView3 = findViewById(R.id.textView3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String a = editText.getText().toString();
                    double b = Integer.parseInt(a);
                    String c = editText2.getText().toString();
                    double d = Integer.parseInt(c);

                    double result = b + d;
                    textView3.setText("Addition is : " +String.valueOf(result));
                } catch (NumberFormatException e) {
                    // Handle the error here, e.g. display an error message to the user
                    Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String a = editText.getText().toString();
                    double b = Integer.parseInt(a);
                    String c = editText2.getText().toString();
                    double d = Integer.parseInt(c);

                    double result = b - d;
                    textView3.setText("Subtraction is : " +String.valueOf(result));
                } catch (NumberFormatException e) {
                    // Handle the error here, e.g. display an error message to the user
                    Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String a = editText.getText().toString();
                    double b = Integer.parseInt(a);
                    String c = editText2.getText().toString();
                    double d = Integer.parseInt(c);

                    double result = b / d;
                    textView3.setText("Division is : " +String.valueOf(result));
                } catch (NumberFormatException e) {
                    // Handle the error here, e.g. display an error message to the user
                    Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String a = editText.getText().toString();
                    double b = Integer.parseInt(a);
                    String c = editText2.getText().toString();
                    double d = Integer.parseInt(c);

                    double result = b * d;
                    textView3.setText("Multiplication is : " +String.valueOf(result));
                } catch (NumberFormatException e) {
                    // Handle the error here, e.g. display an error message to the user
                    Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                editText2.setText("");
                textView3.setText("");
            }
        });
    }
}