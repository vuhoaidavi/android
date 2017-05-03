package androidapp.batru.bai8_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtName, edtChieuCao, edtCanNang, editBmi, edtChanDoan;
    private Button btnChanDoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.nameInput);
        edtCanNang = (EditText) findViewById(R.id.canNangInput);
        edtChieuCao = (EditText) findViewById(R.id.chieuCaoInput);
        edtChanDoan = (EditText) findViewById(R.id.changDoanView);
        editBmi = (EditText) findViewById(R.id.BMIview);

        btnChanDoan = (Button) findViewById(R.id.BMIbutton);

        btnChanDoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float W = Float.parseFloat(edtCanNang.getText().toString());
                float H = Float.parseFloat(edtChieuCao.getText().toString());
                float BMI = W / (H * H);
                String kq = "";
                if (BMI < 18) {
                    kq = "gầy";
                } else if (BMI >= 18 && BMI <= 24.9) {
                    kq = "bình thường";
                } else if (BMI >= 25 && BMI <= 29.9) {
                    kq = "béo phì độ I";
                } else if (BMI >= 30 && BMI <= 34.9) {
                    kq = "béo phì độ II";
                } else {
                    kq = "béo phì độ III";
                }
                edtChanDoan.setText("Ban " + kq);
                editBmi.setText(BMI + "");

            }
        });
    }
}
