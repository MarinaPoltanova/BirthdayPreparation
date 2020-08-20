package com.example.homeworkprepearingtobirthday;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxQadrocopter;
    private CheckBox checkBoxFishingSuit;
    private CheckBox checkBoxNewSmartphone;
    private CheckBox checkBoxUnderwearingSuit;
    private CheckBox checkBoxMoney;
    private CheckBox checkBoxLawnMover;
    private SeekBar seekBarLawnMover;
    private SeekBar seekBarQadrocopter;

    private StringBuilder builderGifts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxQadrocopter = findViewById(R.id.checkBoxQadroCopter);
        checkBoxFishingSuit = findViewById(R.id.checkBoxFishingSuit);
        checkBoxNewSmartphone = findViewById(R.id.checkBoxNewSmartphone);
        checkBoxUnderwearingSuit = findViewById(R.id.checkBoxUnderwearingSuit);
        checkBoxMoney = findViewById(R.id.checkBoxMoney);
        checkBoxLawnMover = findViewById(R.id.checkBoxLawnMover);
        seekBarLawnMover = findViewById(R.id.seekBarLawnMover);
        seekBarQadrocopter = findViewById(R.id.seekBarQadrocopter);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    public void onClickOrderGift(View view) {
        builderGifts = new StringBuilder();
        if (!checkBoxQadrocopter.isChecked() && !checkBoxLawnMover.isChecked() && !checkBoxMoney.isChecked() && !checkBoxNewSmartphone.isChecked() && !checkBoxFishingSuit.isChecked() && !checkBoxUnderwearingSuit.isChecked()) {
            Toast.makeText(this, "Должен быть выбран минимум один подарок", Toast.LENGTH_SHORT).show();
        } else {
            builderGifts.setLength(0);

            if (checkBoxQadrocopter.isChecked()) {
                builderGifts.append(getString(R.string.check_box_qadrocopter)).append(" ");
            }
            if (checkBoxLawnMover.isChecked()) {
                builderGifts.append(getString(R.string.checkBoxLawnMower)).append(" ");
            }
            if (checkBoxMoney.isChecked()) {
                builderGifts.append(getString(R.string.checkBoxMoney)).append(" ");
            }
            if (checkBoxUnderwearingSuit.isChecked()) {
                builderGifts.append(getString(R.string.checkBoxUnderwearingSuit)).append(" ");
            }
            if (checkBoxNewSmartphone.isChecked()) {
                builderGifts.append(getString(R.string.checkBoxNewSmartphone)).append(" ");
            }
            if (checkBoxFishingSuit.isChecked()) {
                builderGifts.append(getString(R.string.checkBoxFishingSuit)).append(" ");
            }
            String giftsOrder = null;
            if (builderGifts.length() > 0) {
                giftsOrder = builderGifts.toString();
            }
            Intent intent = new Intent(this, ListGuests.class);
            intent.putExtra("order", giftsOrder);
            startActivity(intent);
        }
    }
}