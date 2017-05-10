package com.example.bai11_checkbox1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txt ;
	Button btn;
	CheckBox ckbongda,ckkiemhiep,ckdulich,cktuki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt= (TextView) findViewById(R.id.textView2);
       ckbongda =(CheckBox) findViewById(R.id.ckxembd);
       ckkiemhiep =(CheckBox) findViewById(R.id.ckxemphim);
       ckdulich =(CheckBox) findViewById(R.id.ckdulich);
       cktuki =(CheckBox) findViewById(R.id.cktuki);
       btn = (Button) findViewById(R.id.btvote);
       btn.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String sothich= "";
			if(ckbongda.isChecked())
			{
				sothich+=ckbongda.getText().toString()+"  ----";
			}
			if(ckkiemhiep.isChecked())
			{
				
				sothich+=ckkiemhiep.getText().toString()+"  ";
			}
			if(ckdulich.isChecked())
			{
				sothich+=ckdulich.getText().toString()+"  ";
			}
			if(cktuki.isChecked())
			{
				sothich+=cktuki.getText().toString()+"   ";
			}
			txt.setText(sothich);	
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
