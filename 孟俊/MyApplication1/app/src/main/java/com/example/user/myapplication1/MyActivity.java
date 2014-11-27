package com.example.user.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.Buffer;


public class MyActivity extends Activity {
Button cal;
EditText cm;
EditText kg;
TextView bmiText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        cal =(Button)findViewById(R.id.button);
        cm =(EditText)findViewById(R.id.editText);
        kg =(EditText)findViewById(R.id.editText2);
        bmiText =(TextView)findViewById(R.id.textView2);
        cal.setOnClickListener(calBMI);

            }
    private View.OnClickListener calBMI=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double height = Double.parseDouble(cm.getText().toString())/100;
            double weight = Double.parseDouble(kg.getText().toString());
            double bmi=weight/height/height;
            //cal.getText().toString();
            bmiText.setText(Double.toString(bmi));
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
