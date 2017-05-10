package com.example.bai11_hoso;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txthoten, txtBangCap, txtSoThich, txtBoSung;
	Button btn;
	CheckBox ckdocbao,ckdocsach,ckdoccoding;
	RadioButton rdtrungcap,rdcd,rddh;
	EditText edthoten,edtcmnd,edtbosung;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txthoten= (TextView) findViewById(R.id.txthoten);
        txtBangCap=(TextView) findViewById(R.id.txtBangCap);
        txtSoThich=(TextView) findViewById(R.id.txtSoThich);
        txtBoSung=(TextView) findViewById(R.id.txtbosung);
        rdtrungcap=(RadioButton) findViewById(R.id.rdtrungcap);
        rdcd=(RadioButton) findViewById(R.id.rdcd);
        rddh=(RadioButton) findViewById(R.id.rddh);
        
        ckdocbao=(CheckBox) findViewById(R.id.ckdocbao);
        ckdocsach=(CheckBox) findViewById(R.id.ckdocsach);
        ckdoccoding=(CheckBox) findViewById(R.id.ckdoccode);
        
        edthoten= (EditText) findViewById(R.id.edthoten);
        edtcmnd=(EditText) findViewById(R.id.edtcmnd);
        edtbosung=(EditText) findViewById(R.id.edtbosung);
        
        btn = (Button) findViewById(R.id.btngui);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String hoten = edthoten.getText().toString();
				String cmnd = edtcmnd.getText().toString();
				String bosung = edtbosung.getText().toString();
				String bangcap="";
				if(rdtrungcap.isChecked())
				{
					bangcap=rdtrungcap.getText().toString();
				}
				if (rdcd.isChecked())
				{
					bangcap=rdcd.getText().toString();
				}
				if(rddh.isChecked())
				{
					bangcap=rddh.getText().toString();
				}
				String sothich="";
				if( ckdocbao.isChecked())
				{
					bangcap+=ckdocbao.getText().toString()+" ";
				}
				if( ckdocsach.isChecked())
				{
					bangcap+=ckdocsach.getText().toString()+ " ";
				}
				if( ckdoccoding.isChecked())
				{
					bangcap+=ckdoccoding.getText().toString()+ " ";
				}
				txthoten.setText(hoten+cmnd);
				txtBangCap.setText(bangcap);
				txtSoThich.setText(sothich);
				txtBoSung.setText(bosung);
				}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
