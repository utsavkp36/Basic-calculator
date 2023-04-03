package in.bitcode.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtScreen;
    private Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,
            btnDoubleZero,btnPoint,btnPlus,btnMinus,btnMultiply,btnDivide,btnClear,btnEqual;
    private double num1=Double.NaN;
    private double num2=Double.NaN;

    private char operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setUpListeners();
    }

    private void setUpListeners(){
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("0");
            }
        });

        btnDoubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.append("00");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtScreen.getText().toString().equals("")){
                    txtScreen.setText("0.");
                } else if (!txtScreen.getText().toString().contains(".")) {
                    txtScreen.append(".");
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator='+';
                if(!Double.isNaN(num1)){
                    num2=Double.parseDouble(txtScreen.getText().toString());
                    calculate();
                }
                num1=Double.parseDouble(txtScreen.getText().toString());
                txtScreen.setText("");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator='-';
                if(!Double.isNaN(num1)){
                    num2=Double.parseDouble(txtScreen.getText().toString());
                    calculate();
                }
                num1=Double.parseDouble(txtScreen.getText().toString());
                txtScreen.setText("");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator='*';
                if(!Double.isNaN(num1)){
                    num2=Double.parseDouble(txtScreen.getText().toString());
                    calculate();
                }
                num1=Double.parseDouble(txtScreen.getText().toString());
                txtScreen.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator='/';
                if(!Double.isNaN(num1)){
                    num2=Double.parseDouble(txtScreen.getText().toString());
                    calculate();
                }
                num1=Double.parseDouble(txtScreen.getText().toString());
                txtScreen.setText("");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.setText("");
                num1=Double.NaN;
                num2=Double.NaN;
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2=Double.parseDouble(txtScreen.getText().toString());
                calculate();
            }
        });
    }
    private void initViews(){
        txtScreen=findViewById(R.id.txtScreen);
        btnOne=findViewById(R.id.digit1);
        btnTwo=findViewById(R.id.digit2);
        btnThree=findViewById(R.id.digit3);
        btnFour=findViewById(R.id.digit4);
        btnFive=findViewById(R.id.digit5);
        btnSix=findViewById(R.id.digit6);
        btnSeven=findViewById(R.id.digit7);
        btnEight=findViewById(R.id.digit8);
        btnNine=findViewById(R.id.digit9);
        btnZero=findViewById(R.id.digit0);
        btnDoubleZero=findViewById(R.id.digit00);
        btnPoint=findViewById(R.id.point);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnClear=findViewById(R.id.btnClear);
        btnEqual=findViewById(R.id.btnEqualTo);

    }

    private void calculate(){
        if((!Double.isNaN(num1)) && (!Double.isNaN(num2))){
            double result=0.0;
            switch (operator){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;
            }
            txtScreen.setText(result+"");
            num1=result;
            num2=Double.NaN;
        }
    }

}