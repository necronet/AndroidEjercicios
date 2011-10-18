package com.ejemplo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class ListaRelacionActivity extends ListActivity {

	private final static int REQUEST_ADD=1; 
	private PersonaAdapter personaAdapter;
	private List<Persona> personas;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		personas=new ArrayList<Persona>();
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
				Log.d("Ejercicio1","Requested Add "+data.getStringExtra("nombre"));
				String nombre=data.getStringExtra("nombre");
				String apellido=data.getStringExtra("apellido");
				String relacion=data.getStringExtra("relacion");
				
				Persona persona =new Persona();
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setRelacion(relacion);
				personas.add(persona);
				
				personaAdapter=new PersonaAdapter(this,R.layout.lista_persona_item,personas);
				setListAdapter(personaAdapter);
				
				break;
			}
			
		}
		
	}
	
}
