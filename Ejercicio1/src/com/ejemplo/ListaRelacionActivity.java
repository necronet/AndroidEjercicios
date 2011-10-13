package com.ejemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ListaRelacionActivity extends Activity {

	
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
			startActivity(intent);
			break;
			
		}
		
		return super.onOptionsItemSelected(item);
	}
}
