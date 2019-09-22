package com.lemon.piece.healthpotion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lemon.piece.healthpotion.Survey.DrinkSurvey;
import com.lemon.piece.healthpotion.Survey.EatSurvey;
import com.lemon.piece.healthpotion.Survey.MentalSurvey;
import com.lemon.piece.healthpotion.Survey.SmokeSurvey;
import com.lemon.piece.healthpotion.Survey.TeethSurvey;
import com.lemon.piece.healthpotion.Survey.WeightSurvey;

public class CategoryActivity extends AppCompatActivity implements Button.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Button button_weight = (Button)findViewById(R.id.weight);
        button_weight.setOnClickListener(this);
        Button button_eat = (Button)findViewById(R.id.eat);
        button_eat.setOnClickListener(this);
        Button button_mental = (Button)findViewById(R.id.mental);
        button_mental.setOnClickListener(this);
        Button button_smoke = (Button)findViewById(R.id.smoke);
        button_smoke.setOnClickListener(this);
        Button button_teeth = (Button)findViewById(R.id.teeth);
        button_teeth.setOnClickListener(this);
        Button button_drink = (Button)findViewById(R.id.drink);
        button_drink.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.weight:
                intent = new Intent(this, WeightSurvey.class);
                startActivity(intent);
                break;
            case R.id.eat:
                intent = new Intent(this, EatSurvey.class);
                startActivity(intent);
                break;
            case R.id.drink:
                intent = new Intent(this, DrinkSurvey.class);
                startActivity(intent);
                break;
            case R.id.smoke:
                intent = new Intent(this, SmokeSurvey.class);
                startActivity(intent);
                break;
            case R.id.mental:
                intent = new Intent(this, MentalSurvey.class);
                startActivity(intent);
                break;
            case R.id.teeth:
                intent = new Intent(this, TeethSurvey.class);
                startActivity(intent);
                break;

        }

    }
}
