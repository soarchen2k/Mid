package com.qizhou.mid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_left;
    TextView tv_operation;
    TextView tv_right;
    TextView tv_result;

    Switch aSwitch;
    RadioGroup radioGroup;

    RadioButton rb_add;
    RadioButton rb_sub;
    RadioButton rb_multi;
    RadioButton rb_div;

    Button bt_1;
    Button bt_2;
    Button bt_3;
    Button bt_4;
    Button bt_5;
    Button bt_6;
    Button bt_7;
    Button bt_8;
    Button bt_9;
    Button bt_0;
    Button bt_clear;
    Button bt_equal;
    Button bt_change_field;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void onChangeBackground(View view) {
        if (aSwitch.isChecked()) {
            constraintLayout.setBackgroundColor(Color.DKGRAY);
            aSwitch.setTextColor(Color.WHITE);
            rb_add.setTextColor(Color.WHITE);
            rb_div.setTextColor(Color.WHITE);
            rb_multi.setTextColor(Color.WHITE);
            rb_sub.setTextColor(Color.WHITE);
            tv_left.setTextColor(Color.WHITE);
            tv_operation.setTextColor(Color.WHITE);
            tv_right.setTextColor(Color.WHITE);
            tv_result.setTextColor(Color.WHITE);
            ((TextView) findViewById(R.id.textView_equal)).setTextColor(Color.WHITE);
        } else {
            constraintLayout.setBackgroundColor(Color.WHITE);
            aSwitch.setTextColor(Color.BLACK);
            rb_add.setTextColor(Color.BLACK);
            rb_div.setTextColor(Color.BLACK);
            rb_multi.setTextColor(Color.BLACK);
            rb_sub.setTextColor(Color.BLACK);
            tv_left.setTextColor(Color.BLACK);
            tv_operation.setTextColor(Color.BLACK);
            tv_right.setTextColor(Color.BLACK);
            tv_result.setTextColor(Color.BLACK);
            ((TextView) findViewById(R.id.textView_equal)).setTextColor(Color.BLACK);
        }
    }

    public void onAdd(View view) {
        tv_operation.setText("+");
    }

    public void onSubs(View view) {
        tv_operation.setText("-");
    }

    public void onMulti(View view) {
        tv_operation.setText("*");
    }

    public void onDivide(View view) {
        tv_operation.setText("/");
    }

    public void on0Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "0");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "0");
        }
    }

    public void on1Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "1");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "1");
        }
    }

    public void on2Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "2");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "2");
        }
    }

    public void on3Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "3");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "3");
        }
    }

    public void on4Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "4");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "4");
        }
    }

    public void on5Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "5");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "5");
        }
    }

    public void on6Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "6");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "6");
        }
    }

    public void on7Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "7");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "7");
        }
    }

    public void on8Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "8");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "8");
        }
    }

    public void on9Clicked(View view) {
        String field = bt_change_field.getText().toString();
        if (field.equals("LEFT")) {
            String number = tv_left.getText().toString().replaceAll("Left Operand", "");
            tv_left.setText(number + "9");
        } else {
            String number = tv_right.getText().toString().replaceAll("Right Operand", "");
            tv_right.setText(number + "9");
        }
    }

    private void initViews() {
        tv_left = findViewById(R.id.textView_left);
        tv_operation = findViewById(R.id.textView_operation);
        tv_right = findViewById(R.id.textView_right);
        tv_result = findViewById(R.id.textView_result);

        aSwitch = findViewById(R.id.switch_night_mode);
        radioGroup = findViewById(R.id.radioGroup);

        rb_add = findViewById(R.id.rb_add);
        rb_sub = findViewById(R.id.rb_sub);
        rb_multi = findViewById(R.id.rb_multi);
        rb_div = findViewById(R.id.rb_div);

        bt_1 = findViewById(R.id.bt_1);
        bt_2 = findViewById(R.id.bt_2);
        bt_3 = findViewById(R.id.bt_3);
        bt_4 = findViewById(R.id.bt_4);
        bt_5 = findViewById(R.id.bt_5);
        bt_6 = findViewById(R.id.bt_6);
        bt_7 = findViewById(R.id.bt_7);
        bt_8 = findViewById(R.id.bt_8);
        bt_9 = findViewById(R.id.bt_9);
        bt_0 = findViewById(R.id.bt_0);
        bt_clear = findViewById(R.id.bt_clear);
        bt_equal = findViewById(R.id.bt_equal);
        bt_change_field = findViewById(R.id.bt_change_field);
        constraintLayout = findViewById(R.id.main_activity);

        tv_left.setText("Left Operand");
        tv_right.setText("Right Operand");
        bt_change_field.setText("LEFT");
        tv_result.setText("Result");
    }

    public void onClearClicked(View view) {
        tv_left.setText("Left Operand");
        tv_right.setText("Right Operand");
        tv_result.setText("Result");
    }

    public void onChangeFieldClicked(View view) {
        String s = bt_change_field.getText().toString();
        if (s.equals("LEFT")) {
            bt_change_field.setText("RIGHT");
        } else {
            bt_change_field.setText("LEFT");
        }
    }

    public void onEqualClicked(View view) {
        Context context = getApplicationContext();
        if (tv_left.getText().toString().equals("Left Operand") || tv_right.getText().toString().equals("Right Operand")) {
            Toast.makeText(context, "The operand cannot be empty", Toast.LENGTH_SHORT).show();
        } else {
            int left = Integer.parseInt(tv_left.getText().toString());
            int right = Integer.parseInt(tv_right.getText().toString());
            String operation = tv_operation.getText().toString();
            if (operation.isEmpty()) {
                Toast.makeText(context, "The operation cannot be empty", Toast.LENGTH_SHORT).show();
            } else {
                switch (operation) {
                    case "+":
                        tv_result.setText(String.valueOf(left + right));
                        break;
                    case "-":
                        tv_result.setText(String.valueOf(left - right));
                        break;
                    case "*":
                        tv_result.setText(String.valueOf(left * right));
                        break;
                    case "/":
                        if (right == 0) {
                            Toast.makeText(context, "Can't divide by zero", Toast.LENGTH_SHORT).show();
                        } else {
                            tv_result.setText(String.valueOf((double) left / (double) right).substring(0, 8));
                        }
                        break;
                }
            }
        }
    }
}