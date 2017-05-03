package androidapp.batru.bai8_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private EditText edtA, edtB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.resultText);
        edtA = (EditText) findViewById(R.id.numberA);
        edtB = (EditText) findViewById(R.id.numberB);
    }

    public void tinhTong(View v){
        float a = Float.parseFloat(edtA.getText().toString());
        float b = Float.parseFloat(edtB.getText().toString());

        txtResult.setText((a + b) + "");
    }
}
