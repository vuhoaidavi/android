package com.example.bai12_tinhtien;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txtkhach,txtsoluong,txtthanhtien,txttongkh,txtkhvip,txtdoanhthu,txttinhtien;
	Button btntinhtt,btntiep,btnthongke;
	CheckBox ckvip;
	EditText edtten,edtsoluong,edtkhachhang,edttongkh,edtkhvip,edtdoanhthu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ckvip=(CheckBox) findViewById(R.id.ckVIP);
        
        txtkhach=(TextView) findViewById(R.id.txtkhach);
        txtsoluong=(TextView) findViewById(R.id.txtsoluong);
        txtthanhtien=(TextView) findViewById(R.id.txtthanhtien);
        txttongkh=(TextView) findViewById(R.id.txttongkh);
        txtkhvip=(TextView) findViewById(R.id.txtkhvip);
        txtdoanhthu=(TextView) findViewById(R.id.txtdoanhthu);
        txttinhtien=(TextView) findViewById(R.id.txttinhtien);
        
        edtten=(EditText) findViewById(R.id.edtten);
        edtsoluong=(EditText) findViewById(R.id.edtsoluong);
        edtten=(EditText) findViewById(R.id.edtten);
        edtten=(EditText) findViewById(R.id.edtten);
        edtten=(EditText) findViewById(R.id.edtten);
        edtten=(EditText) findViewById(R.id.edtten);
        
        btntinhtt=(Button) findViewById(R.id.btntinhtt);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
