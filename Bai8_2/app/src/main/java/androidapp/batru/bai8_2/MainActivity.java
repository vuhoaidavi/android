package androidapp.batru.bai8_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtInput;
    private TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInput = (EditText) findViewById(R.id.numberInput);
        tvKetQua = (TextView) findViewById(R.id.ketQuaText);
    }

    public void chuyenDoi(View v) {
        int namDuong = Integer.parseInt(edtInput.getText().toString());
        String canStr = "", chiStr = "";
        switch (namDuong % 10) {
            case 0:
                canStr = "Canh";
                break;
            case 1:
                canStr = "Tân";
                break;
            case 2:
                canStr = "Nhâm";
                break;
            case 3:
                canStr = "Quý";
                break;
            case 4:
                canStr = "Giáp";
                break;
            case 5:
                canStr = "Ất";
                break;
            case 6:
                canStr = "Bính";
                break;
            case 7:
                canStr = "Đinh";
                break;
            case 8:
                canStr = "Mậu";
                break;
            case 9:
                canStr = "Tý";
                break;
            default:
                break;
        }
        switch (namDuong % 12) {
            case 0:
                chiStr = "Thân";
                break;
            case 1:
                chiStr = "Dậu";
                break;
            case 2:
                chiStr = "Tức";
                break;
            case 3:
                chiStr = "Hợi";
                break;
            case 4:
                chiStr = "Tý";
                break;
            case 5:
                chiStr = "Sửu";
                break;
            case 6:
                chiStr = "Dần";
                break;
            case 7:
                chiStr = "Mẹo";
                break;
            case 8:
                chiStr = "Thìn";
                break;
            case 9:
                chiStr = "Tỵ";
                break;
            case 10:
                chiStr = "Ngọ";
                break;
            case 11:
                chiStr = "Mùi";
                break;
            default:
                break;
        }
        String namAm = canStr + " " + chiStr;
        tvKetQua.setText(namAm);
    }
}
