package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0; // 数字按钮
    Button jia, jian, cheng, chu, dian, sum, clear, back, power, root, pi, e;// +号
    EditText edit; // 显示文本
    TextView jump;

    private String ss = "";//设置一个String类型的变量
    private String ss1 = "1 + ";
    private String sss = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取页面上的控件
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        jia = findViewById(R.id.jia);
        jian = findViewById(R.id.jian);
        cheng = findViewById(R.id.cheng);
        chu = findViewById(R.id.chu);
        sum = findViewById(R.id.calculation);
        dian = findViewById(R.id.dian);
        clear = findViewById(R.id.clear);
        edit = findViewById(R.id.edit);
        back = findViewById(R.id.back);
        power = findViewById(R.id.power);
        root = findViewById(R.id.root);
        pi = findViewById(R.id.pi);
        e = findViewById(R.id.e);
        jump = findViewById(R.id.jump);

        // 按钮的单击事件
        btn1.setOnClickListener(new Click());
        btn2.setOnClickListener(new Click());
        btn3.setOnClickListener(new Click());
        btn4.setOnClickListener(new Click());
        btn5.setOnClickListener(new Click());
        btn6.setOnClickListener(new Click());
        btn7.setOnClickListener(new Click());
        btn8.setOnClickListener(new Click());
        btn9.setOnClickListener(new Click());
        btn0.setOnClickListener(new Click());
        jia.setOnClickListener(new Click());
        jian.setOnClickListener(new Click());
        cheng.setOnClickListener(new Click());
        chu.setOnClickListener(new Click());
        sum.setOnClickListener(new Click());
        dian.setOnClickListener(new Click());
        clear.setOnClickListener(new Click());
        edit.setOnClickListener(new Click());
        back.setOnClickListener(new Click());
        power.setOnClickListener(new Click());
        root.setOnClickListener(new Click());
        pi.setOnClickListener(new Click());
        e.setOnClickListener(new Click());

        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"写完啦写完啦哈哈哈\n发现彩蛋！好耶！\n好运来！高分快快来！",Toast.LENGTH_LONG).show();
            }
        });
    }


    // 设置按钮点击后的监听
    class Click implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {                //switch循环获取点击按钮后的值
                case R.id.clear: {
                    ss = "";
                    sss = "";
                    edit.setText(ss);//在edittext里面显示字符串ss
                }
                break;

                case R.id.btn0: {
                    ss += "0";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] == '0') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.btn1: {
                    ss += "1";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.btn2: {
                    ss += "2";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;

                case R.id.btn3: {
                    ss += "3";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.btn4: {
                    ss += "4";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.btn5: {
                    ss += "5";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;

                case R.id.btn6: {
                    ss += "6";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.btn7: {
                    ss += "7";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.btn8: {
                    ss += "8";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.btn9: {
                    ss += "9";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.pi: {
                    ss += "3.141592653589793";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.e: {
                    ss += "2.718281828459045";
                    char[] letters = ss.toCharArray();
                    if (letters.length > 1) {
                        if (letters[0] == '0' && letters[1] != '.') {
                            for (int letter = 0; letter < letters.length - 1; letter++) {
                                letters[letter] = letters[letter + 1];
                            }
                            ss = String.valueOf(letters).substring(0, letters.length - 1).trim();
                        }
                    }
                    edit.setText(ss);
                }
                break;
                case R.id.dian: {
                    if (ss.length() == 0) {
                        break;
                    } else {
                        ss += ".";
                        edit.setText(ss);
                    }
                }
                break;
                case R.id.jia: {
                    if (sss.length() != 0 && ss.length() == 0){
                        ss = sss;
                    }
                    if (ss.length() == 0) {
//                        edit.setText("0 + ");
//                        ss = "0 + ";
                        break;
                    }
                    if (ss.contains(" ")) {
                        if (ss.indexOf(" ") == ss.length() - 3)
                            break;
                        getResult();
                    }

                    ss += " + ";
                    edit.setText(ss);
                }
                break;
                case R.id.jian: {
                    if (sss.length() != 0 && ss.length() == 0){
                        ss = sss;
                    }
                    if (ss.length() == 0) {
                        edit.setText("0 - ");
                        ss = "0 - ";
                        break;
                    }
                    if (ss.contains(" ")) {
                        if (ss.indexOf(" ") == ss.length() - 3 )
                            break;
                        getResult();
                    }

                    ss += " - ";
                    edit.setText(ss);
                }
                break;
                case R.id.cheng: {
                    if (sss.length() != 0 && ss.length() == 0){
                        ss = sss;
                    }
                    if (ss.length() == 0) {
                        edit.setText("0 × ");
                        ss = "0 × ";
                        break;
                    }
                    if (ss.contains(" ")) {
                        if (ss.indexOf(" ") == ss.length() - 3)
                            break;
                        getResult();
                    }

                    ss += " × ";
                    edit.setText(ss);
                }
                break;
                case R.id.chu: {
                    if (sss.length() != 0 && ss.length() == 0){
                        ss = sss;
                    }
                    if (ss.length() == 0) {
                        edit.setText("0 / ");
                        ss = "0 / ";
                        break;
                    }
                    if (ss.contains(" ")) {
                        if (ss.indexOf(" ") == ss.length() - 3)
                            break;
                        getResult();
                    }

                    ss += " / ";
                    edit.setText(ss);
                }
                break;
                case R.id.calculation:
                    getResult();
                    sss = ss;
                    ss = "";
                    break;
                case R.id.back: {
                    if (ss.contains(" ")){
                        if (ss.indexOf(" ") == ss.length() - 3) {
                            ss = ss.substring(0, ss.length() - 3);
                            edit.setText(ss);
                            break;
                        }
                    }

                    ss = ss.substring(0, ss.length() - 1);
                    edit.setText(ss);
                    break;
                }
                case R.id.power: {
                    if (sss.length() != 0 && ss.length() == 0){
                        ss = sss;
                    }
                    if (ss.length() == 0) {
                        edit.setText("0 ^ ");
                        ss = "0 ^ ";
                        break;
                    }
                    if (ss.contains(" ")) {
                        if (ss.indexOf(" ") == ss.length() - 3)
                            break;
                        getResult();
                    }

                    ss += " ^ ";
                    edit.setText(ss);
                }
                break;
                case R.id.root: {
                    if (sss.length() != 0 && ss.length() == 0){
                        ss = sss;
                    }
                    if (ss.length() == 0) {
                        edit.setText("0 √ ");
                        ss = "0 √ ";
                        break;
                    }
                    if (ss.contains(" ")) {
                        if (ss.indexOf(" ") == ss.length() - 3)
                            break;
                        getResult();
                    }

                    ss += " √ ";
                    edit.setText(ss);
                }
                break;
            }
        }


    }

    private void getResult() {

        double result = 0;
        if (ss == null || ss.equals("")) return;
        if (!ss.contains(" ")) return;
        String s1 = ss.substring(0, ss.indexOf(" "));
        String op = ss.substring(ss.indexOf(" ") + 1, ss.indexOf(" ") + 2);
        String s2 = ss.substring(ss.indexOf(" ") + 3);

        if (!s1.equals("") && !s2.equals("")) {
//            float d1 = Float.parseFloat(s1);
//            float d2 = Float.parseFloat(s2);
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            switch (op) {
                case "+":
                    result = d1 + d2;
                    break;
                case "-":
                    result = d1 - d2;
                    break;
                case "×":
                    result = d1 * d2;
                    break;
                case "/": {
                    if (d2 == 0) {
                        Toast.makeText(MainActivity.this, "不能除以零", Toast.LENGTH_SHORT).show();
                        break;

                    }
                    result = d1 / d2 * 1.0;
                }
                break;
                case "^": {
                    result = 1;
                    for (int i = 0; i < d2; i++) {
                        result = result * d1;
                    }
                }
                break;
                case "√":
                    result = Math.pow(d1, 1.0/d2);
                    break;
            }
//            edit.setText(result + "");
//            ss = "" + result;
            int r = (int) result;
            if (r == result) {
                edit.setText("" + r);
                ss = "" + r;
            } else {
                ss = "" + result; //将double类型的result转成string类型的数据存储在ss中
                ss = ss.substring(0,ss.length());
//                edit.setText(result+ "");
                edit.setText(ss);
            }

        }


    }

}