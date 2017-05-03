package androidapp.batru.bai8_5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtA, edtB, edtC;
    private Button btnTiepTuc, btnGiai, btnThoat;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = (EditText) findViewById(R.id.aInput);
        edtB = (EditText) findViewById(R.id.bInput);
        edtC = (EditText) findViewById(R.id.cInput);
        btnTiepTuc = (Button) findViewById(R.id.tiepTucButton);
        btnGiai = (Button) findViewById(R.id.giaiButton);
        btnThoat = (Button) findViewById(R.id.thoatButton);
        tvResult = (TextView) findViewById(R.id.textViewResult);

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });

        btnTiepTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtA.setText("");
                edtB.setText("");
                edtC.setText("");
                tvResult.setText("");
            }
        });

        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float a = Float.parseFloat(edtA.getText().toString());
                    float b = Float.parseFloat(edtB.getText().toString());
                    float c = Float.parseFloat(edtC.getText().toString());
                    String kq = "";
                    if (a == 0) {
                        if (b == 0) {
                            if (c == 0) {
                                kq = "Phuong trinh vo so nghiem!";
                            } else {
                                kq = "Phuong trinh vo nghiem!";
                            }
                        } else {
                            kq = "Phuong trinh co 1 nghiem = " + (-c / b);
                        }
                    } else {
                        float delta = b * b - 4 * a * c;
                        if (delta < 0) {
                            kq = "PT vo nghiem!";
                        } else if (delta == 0) {
                            kq = "Phuong trinh co nghiem kep = " + (-b / (2 * a));
                        } else {
                            kq = "Phuong trinh co 2 nghiem. x1 = " + (-b - Math.sqrt(delta) / (2 * a)) + "; x2 = " + (-b + Math.sqrt(delta) / (2 * a));
                        }
                    }
                    tvResult.setText(kq);
                } catch (Exception e) {

                }
            }
        });
    }
}
