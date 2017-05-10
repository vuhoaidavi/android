package com.example.thuchanh1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btncong,btntru,btnnhan,btnchia,btnptram,btnbang,btnxoa;
	TextView txtkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn0=(Button) findViewById(R.id.btn0);
        
        btncong=(Button) findViewById(R.id.btncong);
        btntru=(Button) findViewById(R.id.btntru);
        btnnhan=(Button) findViewById(R.id.btnnhan);
        btnchia=(Button) findViewById(R.id.btnchia);
        btnptram=(Button) findViewById(R.id.btnptram);
        btnbang=(Button) findViewById(R.id.btnbang);
        btnxoa=(Button) findViewById(R.id.btnxoa);
        
        txtkq=(TextView) findViewById(R.id.txtkq);
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
