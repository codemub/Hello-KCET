package com.manomar.gpacalculator.BioTech;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


import com.manomar.gpacalculator.R;
import com.manomar.gpacalculator.ResultActivity;

import io.github.muddz.styleabletoast.StyleableToast;

public class BT_sem8 extends AppCompatActivity {


    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10;
    Button cal_gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt_sem8);

        cal_gpa = findViewById(R.id.btn_bt_gpa_sem8);
        getSupportActionBar().setTitle("BioTech Semester 8");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        spinner1 = findViewById(R.id.bt_sem8_spin1);
        spinner2 = findViewById(R.id.bt_sem8_spin2);


        cal_gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateGPA();
            }

        });
    }

    public void calculateGPA() {

        String subject1 = spinner1.getSelectedItem().toString();
        String subject2 = spinner2.getSelectedItem().toString();

        if (subject1.equals("Your grade") || subject2.equals("Your grade")) {
            StyleableToast.makeText(this, "Some fields are empty", R.style.errotToast).show();
        } else {

            int total_credits = 11;

            // ---------------------------------------------
            int sub1 = 0;

            if (subject1.equals("O - Outstanding")) {
                sub1 = 3 * 10;
            } else if (subject1.equals("A+ - Excellent")) {
                sub1 = 3 * 9;
            } else if (subject1.equals("A - Very Good")) {
                sub1 = 3 * 8;
            } else if (subject1.equals("B+ - Good")) {
                sub1 = 3 * 7;
            } else if (subject1.equals("B - Average")) {
                sub1 = 3 * 6;
            } else if (subject1.equals("RA - Re-appear")) {
                sub1 = 3 * 0;
            } else if (subject1.equals("SA - Shortage attendence")) {
                sub1 = 3 * 0;
            } else if (subject1.equals("WH - Malpractice")) {
                sub1 = 3 * 0;
            }

            //--------------------------------------------------------------------
            int sub2 = 0;

            if (subject2.equals("O - Outstanding")) {
                sub2 = 8 * 10;
            } else if (subject2.equals("A+ - Excellent")) {
                sub2 = 8 * 9;
            } else if (subject2.equals("A - Very Good")) {
                sub2 = 8 * 8;
            } else if (subject2.equals("B+ - Good")) {
                sub2 = 8 * 7;
            } else if (subject2.equals("B - Average")) {
                sub2 = 8 * 6;
            } else if (subject2.equals("RA - Re-appear")) {
                sub2 = 8 * 0;
            } else if (subject2.equals("SA - Shortage attendence")) {
                sub2 = 8 * 0;
            } else if (subject2.equals("WH - Malpractice")) {
                sub2 = 8 * 0;
            }


            // -----------------------------------------------------------------------


            float total_sem8 = sub1 + sub2;
            double gpa_sem8 = total_sem8 / total_credits;


            cal_gpa.setClickable(true);
            Intent intent = new Intent(BT_sem8.this, ResultActivity.class);
            intent.putExtra("gpa", gpa_sem8);
            startActivity(intent);


        }
    }

}
