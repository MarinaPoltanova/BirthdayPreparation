package com.example.homeworkprepearingtobirthday;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CelebrationReport extends AppCompatActivity {
    private TextView textViewTotalListGuests;
    private Button onClickToSendInvation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebration_report);
        onClickToSendInvation= findViewById(R.id.buttonSendSms);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        textViewTotalListGuests = findViewById(R.id.textViewChoiceDetail);
        Intent intent = getIntent();
        if(intent.hasExtra("listGuests")){
            String listGuests=intent.getStringExtra("listGuests");
            textViewTotalListGuests.setText(listGuests);
        }else{
            Intent backToGiftsOrder = new Intent(this, MainActivity.class);
            startActivity(backToGiftsOrder);
        }
    }

    public void onClicktoSendInvation(View view) {
        String invation="Дорогие друзья, приглашаем вас на День рождения, который состоится 24 августа в кафе 'Город'";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,invation);
        startActivity(intent);
    }
}