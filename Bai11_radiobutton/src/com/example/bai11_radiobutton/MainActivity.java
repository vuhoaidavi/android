package com.example.bai11_radiobutton;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txt;
	Button btn;
	RadioButton rdratthich,rdhoithich,rdkolunglay,rdghet,rdcongan;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txtkq);
        rdratthich =(RadioButton) findViewById(R.id.rdratthich);
        rdhoithich=(RadioButton) findViewById(R.id.rdhoithich);
        rdkolunglay=(RadioButton) findViewById(R.id.rdkolunglay);
        rdghet=(RadioButton) findViewById(R.id.rdghet);
        rdcongan=(RadioButton) findViewById(R.id.rdcongan);
        btn= (Button) findViewById(R.id.btnchon);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String binhchon="";
				if(rdratthich.isChecked())
				{
					binhchon=rdratthich.getText().toString();
					
				}
				if(rdhoithich.isChecked())
				{
					binhchon=rdhoithich.getText().toString();
					
				}
				if(rdkolunglay.isChecked())
				{
					binhchon=rdkolunglay.getText().toString();
					
				}
				if(rdghet.isChecked())
				{
					binhchon=rdghet.getText().toString();
					
				}
				if(rdcongan.isChecked())
				{
					binhchon=rdcongan.getText().toString();
					
				}
				txt.setText(binhchon);
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
