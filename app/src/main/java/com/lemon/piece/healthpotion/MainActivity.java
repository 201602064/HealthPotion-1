package com.lemon.piece.healthpotion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.startSearch);
        button.setOnClickListener(this);


    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.startSearch:
                Intent intent = new Intent(this, CategoryActivity.class);
                startActivity(intent);
        }

    }
}
