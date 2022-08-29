package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity {
    EditText et_chieucao,et_cannang;
    RadioButton gt_nam,gt_nu;
    Button btn_tinh;
    TextView txtChiso,txtnhanxet;
    Double chiso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_chieucao = findViewById(R.id.et_chieucao);
        et_cannang = findViewById(R.id.et_cannang);
        gt_nam = findViewById(R.id.gt_nam);
        gt_nu = findViewById(R.id.gt_nu);
        btn_tinh=findViewById(R.id.btn_tinh);
        txtChiso=findViewById(R.id.txtketqua);
        txtnhanxet=findViewById(R.id.txtnhanxet);
        btn_tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double chieuCao = Double.parseDouble(et_chieucao.getText().toString())/100;
                double canNang = Double.parseDouble(et_cannang.getText().toString());
                chiso = Math.round(canNang/Math.pow(chieuCao,2)*10.0)/10.0;

                if(gt_nam.isChecked()){
                    if( chiso<18.5){
                        txtChiso.setText(String.valueOf(chiso));
                        txtnhanxet.setText("Cần bổ sung thêm dinh dưỡng");
                    }
                    else if( chiso>=18.5 && chiso<=24.9){
                        txtChiso.setText(String.valueOf(chiso));
                        txtnhanxet.setText("Chỉ số BMI bình thường");
                    }
                   else if( chiso==25){
                        txtChiso.setText(String.valueOf(chiso));
                        txtnhanxet.setText("Bị thừa cân");
                    }
                    else if( chiso > 25 && chiso<=29.9){
                        txtChiso.setText(String.valueOf(chiso));
                        txtnhanxet.setText("Béo phì mức thấp");
                    }
                    else if( chiso >=30 && chiso <=34.9){
                        txtChiso.setText(String.valueOf(chiso));
                        txtnhanxet.setText("Béo phì cấp 1");
                    }
                    else if( chiso >=35 && chiso <=39.9){
                        txtChiso.setText(String.valueOf(chiso));
                        txtnhanxet.setText("Béo phì cấp 2");
                    }
                    else if( chiso ==40){
                        txtChiso.setText(String.valueOf(chiso));
                        txtnhanxet.setText("Béo phì cấp 3");
                    }
                }
                else if(gt_nu.isChecked()){
                if( chiso<18.5){
                    txtChiso.setText(String.valueOf(chiso));
                    txtnhanxet.setText("Cần bổ sung thêm dinh dưỡng");
                }
                else if( chiso>=18.5 && chiso<=24.9){
                    txtChiso.setText(String.valueOf(chiso));
                    txtnhanxet.setText("Chỉ số BMI bình thường");
                }
                else if( chiso==25){
                    txtChiso.setText(String.valueOf(chiso));
                    txtnhanxet.setText("Bị thừa cân");
                }
                else if( chiso > 25 && chiso<=29.9){
                    txtChiso.setText(String.valueOf(chiso));
                    txtnhanxet.setText("Béo phì mức thấp");
                }
                else if( chiso >=30 && chiso <=34.9){
                    txtChiso.setText(String.valueOf(chiso));
                    txtnhanxet.setText("Béo phì cấp 1");
                }
                else if( chiso >=35 && chiso <=39.9){
                    txtChiso.setText(String.valueOf(chiso));
                    txtnhanxet.setText("Béo phì cấp 2");
                }
                else if( chiso ==40){
                    txtChiso.setText(String.valueOf(chiso));
                    txtnhanxet.setText("Béo phì cấp 3");
                }
            }
                else{
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn giới tính!",Toast.LENGTH_LONG).show();
                }
            }


        });
    }
}