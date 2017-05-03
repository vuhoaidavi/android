package androidapp.batru.bai8_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtFah, edtCel;
    private Button btnFah, btnCel, btnClear;
    float cel, fah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFah = (EditText) findViewById(R.id.fahrenheitInput);
        edtCel = (EditText) findViewById(R.id.celiusInput);
        btnCel = (Button) findViewById(R.id.celsiusbutton);
        btnFah = (Button) findViewById(R.id.fahrenheitButton);
        btnClear = (Button) findViewById(R.id.clearButton);

        btnClear.setOnClickListener(this);
        btnFah.setOnClickListener(this);
        btnCel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.celsiusbutton:
                try {
                    fah = Float.parseFloat(edtFah.getText().toString());
                    cel = (fah - 32) * 5 / 9;
                    edtCel.setText(cel + "");
                } catch (Exception e) {
                }
                break;
            case R.id.fahrenheitButton:
                try {
                    cel = Float.parseFloat(edtCel.getText().toString());
                    fah = cel * 9 / 5 + 32;
                    edtFah.setText(fah + "");
                } catch (Exception e) {

                }
                break;
            case R.id.clearButton:
                edtCel.setText("");
                edtFah.setText("");
                break;
            default:
                break;
        }
    }
}
