package com.example.android.homework3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editTextPersonName;
    EditText editTextMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewForText);
        editTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextMail = findViewById(R.id.editTextTextEmailAddress);
        Button OkSubscriptionButton = findViewById(R.id.buttonOK);
        Button clearButton = findViewById(R.id.buttonClear);

        OkSubscriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources res = getResources();
                String text = String.format(res.getString(R.string.text),
                        editTextPersonName.getText().toString(), editTextMail.getText().toString());
                textView.setText(text);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                editTextPersonName.getText().clear();
                editTextMail.getText().clear();
            }
        });
    }
}