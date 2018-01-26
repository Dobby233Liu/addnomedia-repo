package com.github.dobby233liu.addnomedia;

import android.app.*;
import android.os.*;
import android.widget.*;
import java.io.*;
import android.view.*;
import com.github.dobby233liu.addnomedialib.addNomedia;
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Button Addbutto=(Button)findViewById(R.id.addButton);
		Addbutto.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View view_itself){
		    EditText textbox = (EditText)findViewById(R.id.path);
			String value = textbox.getText().toString();
			Boolean bool = addNomedia.addNomedia(value);
			if(bool){
				Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_LONG).show();
			}else{
			Toast.makeText(MainActivity.this, "got error/file exists", Toast.LENGTH_LONG).show();
			
			}
			}
       });
}}
