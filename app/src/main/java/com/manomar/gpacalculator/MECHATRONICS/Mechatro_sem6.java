package com.manomar.gpacalculator.MECHATRONICS;

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

public class Mechatro_sem6 extends AppCompatActivity {


    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10;
    Button cal_gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechatro_sem6);

        cal_gpa = findViewById(R.id.btn_mtr_gpa_sem6);

        getSupportActionBar().setTitle("Mechatronics Semester 6");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        spinner1 = findViewById(R.id.mtr_sem6_spin1);
        spinner2 = findViewById(R.id.mtr_sem6_spin2);
        spinner3 = findViewById(R.id.mtr_sem6_spin3);
        spinner4 = findViewById(R.id.mtr_sem6_spin4);
        spinner5 = findViewById(R.id.mtr_sem6_spin5);
        spinner6 = findViewById(R.id.mtr_sem6_spin6);
        spinner7 = findViewById(R.id.mtr_sem6_spin7);
        //spinner8 = findViewById(R.id.mtr_sem6_spin8);

        // spinner9 = findViewById(R.id.mtr_sem6_spin9);
        //spinner10 = findViewById(R.id.mtr_sem6_spin10);

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
        String subject3 = spinner3.getSelectedItem().toString();
        String subject4 = spinner4.getSelectedItem().toString();
        String subject5 = spinner5.getSelectedItem().toString();
        String subject6 = spinner6.getSelectedItem().toString();
        String subject7 = spinner7.getSelectedItem().toString();
        //String subject8 = spinner8.getSelectedItem().toString();
        //String subject9 = spinner9.getSelectedItem().toString();
        //String subject10 = spinner10.getSelectedItem().toString();

        if (subject1.equals("Your grade") || subject2.equals("Your grade") || subject3.equals("Your grade")
                || subject4.equals("Your grade") || subject5.equals("Your grade") || subject6.equals("Your grade")
                || subject7.equals("Your grade")) {
            StyleableToast.makeText(this, "Some fields are empty", R.style.errotToast).show();
        } else {
            int total_credits = 22;

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
                sub2 = 4 * 10;
            } else if (subject2.equals("A+ - Excellent")) {
                sub2 = 4 * 9;
            } else if (subject2.equals("A - Very Good")) {
                sub2 = 4 * 8;
            } else if (subject2.equals("B+ - Good")) {
                sub2 = 4 * 7;
            } else if (subject2.equals("B - Average")) {
                sub2 = 4 * 6;
            } else if (subject2.equals("RA - Re-appear")) {
                sub2 = 4 * 0;
            } else if (subject2.equals("SA - Shortage attendence")) {
                sub2 = 4 * 0;
            } else if (subject2.equals("WH - Malpractice")) {
                sub2 = 4 * 0;
            }

            // --------------------------------------------------------------

            int sub3 = 0;
            if (subject3.equals("O - Outstanding")) {
                sub3 = 4 * 10;
            } else if (subject3.equals("A+ - Excellent")) {
                sub3 = 4 * 9;
            } else if (subject3.equals("A - Very Good")) {
                sub3 = 4 * 8;
            } else if (subject3.equals("B+ - Good")) {
                sub3 = 4 * 7;
            } else if (subject3.equals("B - Average")) {
                sub3 = 4 * 6;
            } else if (subject3.equals("RA - Re-appear")) {
                sub3 = 4 * 0;
            } else if (subject3.equals("SA - Shortage attendence")) {
                sub3 = 4 * 0;
            } else if (subject3.equals("WH - Malpractice")) {
                sub3 = 4 * 0;
            }


            //-----------------------------------------------------------------------
            int sub4 = 0;

            if (subject4.equals("O - Outstanding")) {
                sub4 = 3 * 10;
            } else if (subject4.equals("A+ - Excellent")) {
                sub4 = 3 * 9;
            } else if (subject4.equals("A - Very Good")) {
                sub4 = 3 * 8;
            } else if (subject4.equals("B+ - Good")) {
                sub4 = 3 * 7;
            } else if (subject4.equals("B - Average")) {
                sub4 = 3 * 6;
            } else if (subject4.equals("RA - Re-appear")) {
                sub4 = 3 * 0;
            } else if (subject4.equals("SA - Shortage attendence")) {
                sub4 = 3 * 0;
            } else if (subject4.equals("WH - Malpractice")) {
                sub4 = 3 * 0;
            }

            // --------------------------------------------------------------
            int sub5 = 0;

            if (subject5.equals("O - Outstanding")) {
                sub5 = 3 * 10;
            } else if (subject5.equals("A+ - Excellent")) {
                sub5 = 3 * 9;
            } else if (subject5.equals("A - Very Good")) {
                sub5 = 3 * 8;
            } else if (subject5.equals("B+ - Good")) {
                sub5 = 3 * 7;
            } else if (subject5.equals("B - Average")) {
                sub5 = 3 * 6;
            } else if (subject5.equals("RA - Re-appear")) {
                sub5 = 3 * 0;
            } else if (subject5.equals("SA - Shortage attendence")) {
                sub5 = 3 * 0;
            } else if (subject5.equals("WH - Malpractice")) {
                sub5 = 3 * 0;
            }


            //--------------------------------------------------------------------
            int sub6 = 0;
            if (subject6.equals("O - Outstanding")) {
                sub6 = 3 * 10;
            } else if (subject6.equals("A+ - Excellent")) {
                sub6 = 3 * 9;
            } else if (subject6.equals("A - Very Good")) {
                sub6 = 3 * 8;
            } else if (subject6.equals("B+ - Good")) {
                sub6 = 3 * 7;
            } else if (subject6.equals("B - Average")) {
                sub6 = 3 * 6;
            } else if (subject6.equals("RA - Re-appear")) {
                sub6 = 3 * 0;
            } else if (subject6.equals("SA - Shortage attendence")) {
                sub6 = 3 * 0;
            } else if (subject6.equals("WH - Malpractice")) {
                sub6 = 3 * 0;
            }

            // -----------------------------------------------------------------------

            int sub7 = 0;

            if (subject7.equals("O - Outstanding")) {
                sub7 = 2 * 10;
            } else if (subject7.equals("A+ - Excellent")) {
                sub7 = 2 * 9;
            } else if (subject7.equals("A - Very Good")) {
                sub7 = 2 * 8;
            } else if (subject7.equals("B+ - Good")) {
                sub7 = 2 * 7;
            } else if (subject7.equals("B - Average")) {
                sub7 = 2 * 6;
            } else if (subject7.equals("RA - Re-appear")) {
                sub7 = 2 * 0;
            } else if (subject7.equals("SA - Shortage attendence")) {
                sub7 = 2 * 0;
            } else if (subject7.equals("WH - Malpractice")) {
                sub7 = 2 * 0;
            }


            // -----------------------------------------------------------------------

            float total_sem6 = sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7;
            double gpa_sem6 = total_sem6 / total_credits;


            cal_gpa.setClickable(true);
            Intent intent = new Intent(Mechatro_sem6.this, ResultActivity.class);
            intent.putExtra("gpa", gpa_sem6);
            startActivity(intent);


        }
    }
}
