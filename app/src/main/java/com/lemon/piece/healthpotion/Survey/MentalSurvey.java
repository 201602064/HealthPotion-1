package com.lemon.piece.healthpotion.Survey;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.lemon.piece.healthpotion.R;

public class MentalSurvey extends AppCompatActivity {

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_survey);
        Button buttonNext  = (Button)findViewById(R.id.next_mental);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 1;
                changeView(count);

            }
        });
        Button buttonBefore  = (Button)findViewById(R.id.before_mental);
        buttonBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count - 1;
                changeView(count);

            }
        });
        changeView(count);
    }
    private void changeView(int index){
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        FrameLayout frame = (FrameLayout)findViewById(R.id.search_mental);
        if (frame.getChildCount() > 0) {
            // FrameLayout에서 뷰 삭제.
            frame.removeViewAt(0);
        }

        // XML에 작성된 레이아웃을 View 객체로 변환.
        View view = null ;
        switch (index) {
            case 0 :
                view = inflater.inflate(R.layout.mental1, frame, false) ;
                break ;
            case 1 :
                view = inflater.inflate(R.layout.mental2, frame, false) ;
                break ;
            case 2 :
                view = inflater.inflate(R.layout.mental3, frame, false) ;
                break ;
            case 3 :
                view = inflater.inflate(R.layout.mental4, frame, false) ;
                break ;
            case 4 :
                view = inflater.inflate(R.layout.mental5, frame, false) ;
                break ;
            case 5 :
                view = inflater.inflate(R.layout.mental6, frame, false) ;
                break ;
        }

        // FrameLayout에 뷰 추가.
        if (view != null) {
            frame.addView(view) ;
        }
    }

}
