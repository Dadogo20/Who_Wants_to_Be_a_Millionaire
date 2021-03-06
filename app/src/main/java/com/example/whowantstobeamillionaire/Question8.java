package com.example.whowantstobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Question8 extends AppCompatActivity {
    private java.text.NumberFormat Q8_PRIZE_DISPLAY_FORMAT;
    private AlertDialog.Builder Q8_ALERT;
    private AlertDialog Q8_ALERT_CONTROL;
    private Button Q8_Answer_Button, Q8_Withdraw_Button;
    private TextView Q8_Prize_Money;
    private RadioGroup Q8_Answers;
    private RadioButton A8_A, A8_B, A8_C, A8_D, Q8_Pick;
    private int Q8_Answer_Setup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide(); //hide the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_question8);
        Q8_Prize_Money = findViewById(R.id.Q8_SCORE);
        Q8_Answers = findViewById(R.id.Q8_ANSWERS);
        A8_A = findViewById(R.id.A8_A);
        A8_B = findViewById(R.id.A8_B);
        A8_C = findViewById(R.id.A8_C);
        A8_D = findViewById(R.id.A8_D);
        Q8_Answer_Button = findViewById(R.id.Q8_answer_button);
        Q8_Withdraw_Button = findViewById(R.id.Q8_withdraw_button);
        //To indicate the current Activity
        LogIn.current_question = 8;
        LogIn.app_data(Question8.this).edit().putInt("current question", LogIn.current_question).apply();
        //To display the score as US dollars
        Q8_PRIZE_DISPLAY_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
        Q8_PRIZE_DISPLAY_FORMAT.setCurrency(Currency.getInstance("USD"));
        Q8_Prize_Money.setText(Q8_PRIZE_DISPLAY_FORMAT.format(LogIn.current_prize).replaceFirst(".00$", ""));
        //To randomized the location of the answers
        Q8_Answer_Setup = ThreadLocalRandom.current().nextInt(1,25);
        switch (Q8_Answer_Setup){
            case 1:
                A8_A.setText(R.string.A8_A);
                A8_B.setText(R.string.A8_B);
                A8_C.setText(R.string.A8_C);
                A8_D.setText(R.string.A8_D);
                break;
            case 2:
                A8_A.setText(R.string.A8_B);
                A8_B.setText(R.string.A8_A);
                A8_C.setText(R.string.A8_C);
                A8_D.setText(R.string.A8_D);
                break;
            case 3:
                A8_A.setText(R.string.A8_B);
                A8_B.setText(R.string.A8_C);
                A8_C.setText(R.string.A8_A);
                A8_D.setText(R.string.A8_D);
                break;
            case 4:
                A8_A.setText(R.string.A8_B);
                A8_B.setText(R.string.A8_C);
                A8_C.setText(R.string.A8_D);
                A8_D.setText(R.string.A8_A);
                break;
            case 5:
                A8_A.setText(R.string.A8_A);
                A8_B.setText(R.string.A8_C);
                A8_C.setText(R.string.A8_B);
                A8_D.setText(R.string.A8_D);
                break;
            case 6:
                A8_A.setText(R.string.A8_C);
                A8_B.setText(R.string.A8_A);
                A8_C.setText(R.string.A8_B);
                A8_D.setText(R.string.A8_D);
                break;
            case 7:
                A8_A.setText(R.string.A8_C);
                A8_B.setText(R.string.A8_B);
                A8_C.setText(R.string.A8_A);
                A8_D.setText(R.string.A8_D);
                break;
            case 8:
                A8_A.setText(R.string.A8_C);
                A8_B.setText(R.string.A8_B);
                A8_C.setText(R.string.A8_D);
                A8_D.setText(R.string.A8_A);
                break;
            case 9:
                A8_A.setText(R.string.A8_A);
                A8_B.setText(R.string.A8_C);
                A8_C.setText(R.string.A8_D);
                A8_D.setText(R.string.A8_B);
                break;
            case 10:
                A8_A.setText(R.string.A8_C);
                A8_B.setText(R.string.A8_A);
                A8_C.setText(R.string.A8_D);
                A8_D.setText(R.string.A8_B);
                break;
            case 11:
                A8_A.setText(R.string.A8_C);
                A8_B.setText(R.string.A8_D);
                A8_C.setText(R.string.A8_A);
                A8_D.setText(R.string.A8_B);
                break;
            case 12:
                A8_A.setText(R.string.A8_C);
                A8_B.setText(R.string.A8_D);
                A8_C.setText(R.string.A8_B);
                A8_D.setText(R.string.A8_A);
                break;
            case 13:
                A8_A.setText(R.string.A8_A);
                A8_B.setText(R.string.A8_D);
                A8_C.setText(R.string.A8_C);
                A8_D.setText(R.string.A8_B);
                break;
            case 14:
                A8_A.setText(R.string.A8_D);
                A8_B.setText(R.string.A8_A);
                A8_C.setText(R.string.A8_C);
                A8_D.setText(R.string.A8_B);
                break;
            case 15:
                A8_A.setText(R.string.A8_D);
                A8_B.setText(R.string.A8_C);
                A8_C.setText(R.string.A8_A);
                A8_D.setText(R.string.A8_B);
                break;
            case 16:
                A8_A.setText(R.string.A8_D);
                A8_B.setText(R.string.A8_C);
                A8_C.setText(R.string.A8_B);
                A8_D.setText(R.string.A8_A);
                break;
            case 17:
                A8_A.setText(R.string.A8_A);
                A8_B.setText(R.string.A8_B);
                A8_C.setText(R.string.A8_D);
                A8_D.setText(R.string.A8_C);
                break;
            case 18:
                A8_A.setText(R.string.A8_B);
                A8_B.setText(R.string.A8_A);
                A8_C.setText(R.string.A8_D);
                A8_D.setText(R.string.A8_C);
                break;
            case 19:
                A8_A.setText(R.string.A8_B);
                A8_B.setText(R.string.A8_D);
                A8_C.setText(R.string.A8_A);
                A8_D.setText(R.string.A8_C);
                break;
            case 20:
                A8_A.setText(R.string.A8_B);
                A8_B.setText(R.string.A8_D);
                A8_C.setText(R.string.A8_C);
                A8_D.setText(R.string.A8_A);
                break;
            case 21:
                A8_A.setText(R.string.A8_A);
                A8_B.setText(R.string.A8_D);
                A8_C.setText(R.string.A8_B);
                A8_D.setText(R.string.A8_C);
                break;
            case 22:
                A8_A.setText(R.string.A8_D);
                A8_B.setText(R.string.A8_A);
                A8_C.setText(R.string.A8_B);
                A8_D.setText(R.string.A8_C);
                break;
            case 23:
                A8_A.setText(R.string.A8_D);
                A8_B.setText(R.string.A8_B);
                A8_C.setText(R.string.A8_A);
                A8_D.setText(R.string.A8_C);
                break;
            case 24:
                A8_A.setText(R.string.A8_D);
                A8_B.setText(R.string.A8_B);
                A8_C.setText(R.string.A8_C);
                A8_D.setText(R.string.A8_A);
                break;
        }
        //To provide a positive or negative outcome once the user has chosen the answer
        Q8_Answer_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q8_Pick = findViewById(Q8_Answers.getCheckedRadioButtonId());
                if (Q8_Pick == null){
                    Toast.makeText(Question8.this, "You did not pick any answer!", Toast.LENGTH_SHORT).show();
                }
                else if (Q8_Pick.getText().toString().equals(getString(R.string.A8_A))){
                    LogIn.current_prize = 8000;
                    LogIn.app_data(Question8.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question8.this, "That was correct!", Toast.LENGTH_SHORT).show();
                    Intent to_question3 = new Intent(Question8.this, Question9.class);
                    startActivity(to_question3);
                }
                else {
                    LogIn.current_prize = 1000;
                    LogIn.app_data(Question8.this).edit().putInt("current prize", LogIn.current_prize).apply();
                    Toast.makeText(Question8.this, "That was incorrect!", Toast.LENGTH_SHORT).show();
                    Intent to_loser = new Intent(Question8.this, Loser.class);
                    startActivity(to_loser);
                }
            }
        });
        //To provide the player the option to safely quit the game
        Q8_Withdraw_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q8_ALERT = new AlertDialog.Builder(Question8.this);
                Q8_ALERT.setTitle("WITHDRAW");
                Q8_ALERT.setMessage("Are you sure you want to quit and keep your earned prize?");
                Q8_ALERT.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Q8_ALERT_CONTROL.cancel();
                    }
                });
                Q8_ALERT.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent to_winner = new Intent(Question8.this, Winner.class);
                        startActivity(to_winner);
                    }
                });
                Q8_ALERT_CONTROL = Q8_ALERT.create();
                Q8_ALERT_CONTROL.show();
            }
        });
    }
}