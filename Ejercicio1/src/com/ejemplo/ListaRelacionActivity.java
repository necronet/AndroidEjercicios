package com.ejemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class ListaRelacionActivity extends Activity {

	private final static int REQUEST_ADD=1; 
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lista_persona);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		
		getMenuInflater().inflate(R.menu.menu_lista, menu);
		return super.onCreateOptionsMenu(menu);
		
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		
		int id=item.getItemId();
		switch(id){
		
		case R.id.menuAgregar:
			//Aqui llamo a la actividad
			Intent intent=new Intent(this,Ejercicio1Activity.class);
			startActivityForResult(intent,REQUEST_ADD);
			break;
			
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data){
		
		if(resultCode==Activity.RESULT_OK){
			
			switch(requestCode){
			case REQUEST_ADD:
				//Aqui deberia agregar elementos a la lista
				Log.d("Ejercicio1","Requested Add");
				break;
			}
			
		}
		
	}
	
}
