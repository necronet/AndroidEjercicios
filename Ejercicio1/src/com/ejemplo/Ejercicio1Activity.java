package com.ejemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Ejercicio1Activity extends Activity {
    
	private String[] relaciones={"Amigos","Amigos cercanos","Conocidos","Desconocidos"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar);
        
        final Spinner spinnerRelacion=(Spinner)findViewById(R.id.spinnerRelacion);
        ArrayAdapter spinnerAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,relaciones);
        spinnerRelacion.setAdapter(spinnerAdapter);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        Button btnAgregar=(Button)findViewById(R.id.buttonAgregar);
        //CamelCase
        btnAgregar.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				
				EditText editNombre=(EditText)findViewById(R.id.editNombre);
				EditText editApellido=(EditText)findViewById(R.id.editApellido);
				
				String relacion=(String)spinnerRelacion.getSelectedItem();
				String nombre=editNombre.getText().toString();
				String apellido=editApellido.getText().toString();	
				
				Toast.makeText(Ejercicio1Activity.this, "TExt depurado "+nombre +" "+ apellido+" relacion:"+relacion, Toast.LENGTH_LONG).show();
				
				Log.d("Ejercicio1","Depurando evento");
				
				Intent datas=new Intent();
				
				datas.putExtra("nombre", nombre);
				datas.putExtra("apellido", apellido);
				datas.putExtra("relacion", relacion);
				
				setResult(RESULT_OK,datas);
				finish();
			}
        	
        });  
        
        
        
    }
    
    
    
}