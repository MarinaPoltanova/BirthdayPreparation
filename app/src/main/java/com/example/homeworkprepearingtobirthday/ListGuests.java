package com.example.homeworkprepearingtobirthday;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class ListGuests extends AppCompatActivity {
    private CheckBox checkBoxMama;
    private CheckBox checkBoxPapa;
    private CheckBox checkBoxTetyaTanya;
    private CheckBox checkBoxKatyaMarkova;
    private CheckBox checkBoxKolyaMarkov;
    private CheckBox checkBoxDasha;
    private CheckBox checkBoxKsusha;
    private CheckBox checkBoxDimaPoltanov;
    private CheckBox checkBoxAnyaPoltanova;
    private CheckBox checkBoxVeronika;
    private CheckBox checkBoxDanil;
    private CheckBox checkBoxNastya;
    private CheckBox checkBoxSashaPetuhov;
    private CheckBox checkBoxMarinaPetuhova;
    private CheckBox checkBoxBaikov;
    private CheckBox checkBoxFarida;
    private CheckBox checkBoxZhenyaShevnin;
    private CheckBox checkBoxKatyaTortik;
    private CheckBox checkBoxKolyaKarpov;
    private CheckBox checkBoxTronina;
    private CheckBox checkBoxTihonov;
    private CheckBox checkBoxTihonova;
    private CheckBox checkBoxSharif;
    private CheckBox checkBoxMishaMonashev;
    private CheckBox checkBoxYanaMonasheva;
    private CheckBox checkBoxSashaPozdeev;
    private CheckBox checkBoxMarinaPozdeeva;
    private CheckBox checkBoxMishaFedorov;
    private CheckBox checkBoxMashaFedorova;
    private CheckBox checkBoxMarina;

    private ArrayList<String> listGuests;
    private String giftsOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_guests);
        checkBoxMama = findViewById(R.id.checkBoxMama);
        checkBoxPapa = findViewById(R.id.checkBoxPapa);
        checkBoxTetyaTanya = findViewById(R.id.checkBoxTetyaTanya);
        checkBoxKatyaMarkova = findViewById(R.id.checkBoxKatya);
        checkBoxKolyaMarkov = findViewById(R.id.checkBoxKolya);
        checkBoxDasha = findViewById(R.id.checkBoxDasha);
        checkBoxKsusha = findViewById(R.id.checkBoxKsusha);
        checkBoxDimaPoltanov = findViewById(R.id.checkBoxDima);
        checkBoxAnyaPoltanova = findViewById(R.id.checkBoxAnya);
        checkBoxVeronika = findViewById(R.id.checkBoxVeronika);
        checkBoxDanil = findViewById(R.id.checkBoxDanil);
        checkBoxNastya = findViewById(R.id.checkBoxNastya);
        checkBoxSashaPetuhov = findViewById(R.id.checkBoxPetuhovSasha);
        checkBoxMarinaPetuhova = findViewById(R.id.checkBoxPetuhovaMarina);
        checkBoxBaikov = findViewById(R.id.checkBoxBaikov);
        checkBoxFarida = findViewById(R.id.checkBoxFarida);
        checkBoxZhenyaShevnin = findViewById(R.id.checkBoxZhenyaShevnin);
        checkBoxKatyaTortik = findViewById(R.id.checkBoxKatyaTortik);
        checkBoxKolyaKarpov = findViewById(R.id.checkBoxKolyaKarpov);
        checkBoxTronina = findViewById(R.id.checkBoxTronina);
        checkBoxTihonov = findViewById(R.id.checkBoxVolodyaTihonov);
        checkBoxTihonova = findViewById(R.id.checkBoxTihonova);
        checkBoxSharif = findViewById(R.id.checkBoxSharif);
        checkBoxMishaMonashev = findViewById(R.id.checkBoxMonashevMisha);
        checkBoxYanaMonasheva = findViewById(R.id.checkBoxMonashevaYana);
        checkBoxSashaPozdeev = findViewById(R.id.checkBoxSashaPozdeev);
        checkBoxMarinaPozdeeva = findViewById(R.id.checkBoxMarinaPozdeeva);
        checkBoxMishaFedorov = findViewById(R.id.checkBoxFedorovMisha);
        checkBoxMashaFedorova = findViewById(R.id.checkBoxFedorovaMasha);
        checkBoxMarina = findViewById(R.id.checkBoxMarina);

        Intent intent = getIntent();

        if(intent.hasExtra("order")){
            giftsOrder = intent.getStringExtra("order");
        }else{
            giftsOrder = getString(R.string.quadrokopter_on_default);
        }

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @SuppressLint("StringFormatMatches")
    public void onClickSetListGuests(View view) {
        if (!checkBoxMama.isChecked() && !checkBoxPapa.isChecked() && !checkBoxMarina.isChecked() &&
                !checkBoxTetyaTanya.isChecked() && !checkBoxKatyaMarkova.isChecked() &&
                !checkBoxKolyaMarkov.isChecked() && !checkBoxDasha.isChecked() &&
                !checkBoxKsusha.isChecked() && !checkBoxDimaPoltanov.isChecked() &&
                !checkBoxAnyaPoltanova.isChecked() && !checkBoxVeronika.isChecked() &&
                !checkBoxDanil.isChecked() && !checkBoxNastya.isChecked() &&
                !checkBoxSashaPetuhov.isChecked() && !checkBoxMarinaPetuhova.isChecked() &&
                !checkBoxMishaMonashev.isChecked() && !checkBoxYanaMonasheva.isChecked() &&
                !checkBoxBaikov.isChecked() && !checkBoxMishaFedorov.isChecked() &&
                !checkBoxMashaFedorova.isChecked() && !checkBoxFarida.isChecked() &&
                !checkBoxZhenyaShevnin.isChecked() && !checkBoxKatyaTortik.isChecked() &&
                !checkBoxKolyaKarpov.isChecked() && !checkBoxSharif.isChecked() &&
                !checkBoxTronina.isChecked() && !checkBoxSashaPozdeev.isChecked() &&
                !checkBoxMarinaPozdeeva.isChecked() && !checkBoxTihonov.isChecked() &&
                !checkBoxTihonova.isChecked()) {
            Toast.makeText(this, "Хотя бы один гость должен быть приглашен", Toast.LENGTH_SHORT).show();
        } else {
            listGuests = new ArrayList<>();

            if (checkBoxMarina.isChecked()) {
                listGuests.add(getString(R.string.guest_marina));
            }
            if (checkBoxMama.isChecked()) {
                listGuests.add(getString(R.string.guest_mama));
            }
            if (checkBoxPapa.isChecked()) {
                listGuests.add(getString(R.string.guest_papa));
            }
            if (checkBoxTetyaTanya.isChecked()) {
                listGuests.add(getString(R.string.guest_tetya_tanya));
            }
            if (checkBoxKatyaMarkova.isChecked()) {
                listGuests.add(getString(R.string.guest_katya_markova));
            }
            if (checkBoxKolyaMarkov.isChecked()) {
                listGuests.add(getString(R.string.guest_kolya_markov));
            }
            if (checkBoxDasha.isChecked()) {
                listGuests.add(getString(R.string.guest_dasha));
            }
            if (checkBoxKsusha.isChecked()) {
                listGuests.add(getString(R.string.guest_ksusha));
            }
            if (checkBoxDimaPoltanov.isChecked()) {
                listGuests.add(getString(R.string.guest_dima_poltanov));
            }
            if (checkBoxAnyaPoltanova.isChecked()) {
                listGuests.add(getString(R.string.guest_anya_poltanova));
            }
            if (checkBoxNastya.isChecked()) {
                listGuests.add(getString(R.string.guest_nastya));
            }
            if (checkBoxVeronika.isChecked()) {
                listGuests.add(getString(R.string.guest_veronika));
            }
            if (checkBoxDanil.isChecked()) {
                listGuests.add(getString(R.string.guest_danil));
            }
            if (checkBoxSashaPetuhov.isChecked()) {
                listGuests.add(getString(R.string.guest_sasha_petuhov));
            }
            if (checkBoxMarinaPetuhova.isChecked()) {
                listGuests.add(getString(R.string.guest_marina_petuhova));
            }
            if (checkBoxMishaFedorov.isChecked()) {
                listGuests.add(getString(R.string.guest_misha_fidorov));
            }
            if (checkBoxMashaFedorova.isChecked()) {
                listGuests.add(getString(R.string.guest_masha_fidorova));
            }
            if (checkBoxMishaMonashev.isChecked()) {
                listGuests.add(getString(R.string.guest_misha_monashev));
            }
            if (checkBoxYanaMonasheva.isChecked()) {
                listGuests.add(getString(R.string.guest_yana_monasheva));
            }
            if (checkBoxBaikov.isChecked()) {
                listGuests.add(getString(R.string.guest_zhenia_baikov));
            }
            if (checkBoxSashaPozdeev.isChecked()) {
                listGuests.add(getString(R.string.guest_sasha_pozdeev));
            }
            if (checkBoxMarinaPozdeeva.isChecked()) {
                listGuests.add(getString(R.string.guest_marina_pozdeeva));
            }
            if (checkBoxFarida.isChecked()) {
                listGuests.add(getString(R.string.guest_farida));
            }
            if (checkBoxZhenyaShevnin.isChecked()) {
                listGuests.add(getString(R.string.guest_zhenia_shevnin));
            }
            if (checkBoxKatyaTortik.isChecked()) {
                listGuests.add(getString(R.string.guest_katya_karpova));
            }
            if (checkBoxKolyaKarpov.isChecked()) {
                listGuests.add(getString(R.string.guest_kolya_karpov));
            }
            if (checkBoxTronina.isChecked()) {
                listGuests.add(getString(R.string.guest_tronina));
            }
            if (checkBoxTihonov.isChecked()) {
                listGuests.add(getString(R.string.guest_volodia_tihonov));
            }
            if (checkBoxTihonova.isChecked()) {
                listGuests.add(getString(R.string.guest_bella_tihonova));

            }
            if (checkBoxSharif.isChecked()) {
                listGuests.add(getString(R.string.guest_sharif));
            }
            String total;
            total = null;
            if (listGuests.size() > 0) {
                int numberGuests = listGuests.size();
                total = String.format(getString(R.string.text_view_list_guests), numberGuests, giftsOrder);
                Intent intent = new Intent(this, CelebrationReport.class);
                intent.putExtra("listGuests", total);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Должен быть выбран минимум один гость", Toast.LENGTH_SHORT).show();
            }

        }

    }
}
