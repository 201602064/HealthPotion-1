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
        Class temp = null;
        switch (view.getId()){
            case R.id.weight:
                temp = WeightSurvey.class;
                break;
            case R.id.eat:
                temp = EatSurvey.class;
                break;
            case R.id.drink:
                temp = DrinkSurvey.class;
                break;
            case R.id.smoke:
                temp = SmokeSurvey.class;
                break;
            case R.id.mental:
                temp = MentalSurvey.class;
                break;
            case R.id.teeth:
                temp = TeethSurvey.class;
                break;

        }
        intent = new Intent(this,temp);
        startActivity(intent);

    }
}
