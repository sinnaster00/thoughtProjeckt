package com.geektech.thoughtprojeckt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private String operation;
    private boolean isFirstVarClick;
    private boolean operationClick;
    private Integer firstVariable, secondVariable;
    private Button btnSendResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.tv_result);
        btnSendResult = findViewById(R.id.btn_send_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("1");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("1");
                }
                if (isFirstVarClick) {
                    result.setText("1");
                }
                isFirstVarClick = false;
                break;
            case R.id.two:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("2");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("2");
                }
                if (isFirstVarClick) {
                    result.setText("2");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_thought:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("3");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("3");
                }
                if (isFirstVarClick) {
                    result.setText("3");
                }
                isFirstVarClick = false;
                break;
            case R.id.btn_for:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("4");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("4");
                }
                if (isFirstVarClick) {
                    result.setText("4");
                }

                isFirstVarClick = false;
                break;
            case R.id.five:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("5");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("5");
                }
                if (isFirstVarClick) {
                    result.setText("5");
                }

                isFirstVarClick = false;
                break;
            case R.id.sixs:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("6");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("6");
                }
                if (isFirstVarClick) {
                    result.setText("6");
                }

                isFirstVarClick = false;
                break;
            case R.id.seven:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("7");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("7");
                }
                if (isFirstVarClick) {
                    result.setText("7");
                }

                isFirstVarClick = false;
                break;
            case R.id.eght:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("8");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("8");
                }
                if (isFirstVarClick) {
                    result.setText("8");
                }

                isFirstVarClick = false;
                break;
            case R.id.nine:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("9");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("9");
                }
                if (isFirstVarClick) {
                    result.setText("9");
                    break;
                }
            case R.id.btn_null:
                if (result.getText().toString().equals("0") || operationClick) {
                    result.setText("0");
                    operationClick = false;
                    btnSendResult.setVisibility(View.INVISIBLE);
                } else {
                    result.append("0");
                }
                if (isFirstVarClick) {
                    result.setText("0");
                }

                isFirstVarClick = false;
                break;
        }
    }


    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.ace:
                result.setText("0");
                break;

            case R.id.plus:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(result.getText().toString());
                operation = "+";
                result.setText(firstVariable + operation);
                break;

            case R.id.minus:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(result.getText().toString());
                operation = "-";
                result.setText(firstVariable + operation);
                break;

            case R.id.x:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(result.getText().toString());
                operation = "*";
                result.setText(firstVariable + operation);
                break;

            case R.id.delenie:
                isFirstVarClick = true;
                firstVariable = Integer.parseInt(result.getText().toString());
                operation = "/";
                result.setText(firstVariable + operation);
                break;

            case R.id.ravno:
                operationClick = true;
                btnSendResult.setVisibility(View.VISIBLE);
                if (result.getText().toString().equals("0")) {
                    result.setText("0");

                } else if (operation.equals("+")) {
                    String text = result.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer equalResult = firstVariable + secondVariable;

                    result.setText(firstVariable + operation + secondVariable + " = " + equalResult.toString());
                    isFirstVarClick = false;

                } else if (operation.equals("-")) {
                    String text = result.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer equalResult = firstVariable - secondVariable;
                    result.setText(firstVariable + operation + secondVariable + " = " + equalResult.toString());
                    isFirstVarClick = false;

                } else if (operation.equals("*")) {
                    String text = result.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer equalResult = firstVariable * secondVariable;
                    result.setText(firstVariable + operation + secondVariable + " = " + equalResult.toString());
                    isFirstVarClick = false;

                } else if (operation.equals("/")) {
                    String text = result.getText().toString();
                    secondVariable = Integer.parseInt(text);
                    Integer equalResult = firstVariable / secondVariable;
                    result.setText(firstVariable + operation + secondVariable + " = " + equalResult.toString());
                    isFirstVarClick = false;

                }
        }
    }

    public void sendResult(View view) {
        String allResult = result.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("allResult", allResult);
        startActivity(intent);
    }

}
