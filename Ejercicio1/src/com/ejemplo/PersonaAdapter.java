package com.ejemplo;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PersonaAdapter extends ArrayAdapter<Persona> {

	private List<Persona> personas;
	private Context context;
	
	public PersonaAdapter(Context context, int textViewResourceId,
			List<Persona> personas) {
		super(context, textViewResourceId, personas);
		this.context=context;
		this.personas=personas;
	}
	//The World of ListView
	@Override
	public View getView(int position,View convertView,ViewGroup viewGroup){
		
		LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView=inflater.inflate(R.layout.lista_persona_item, null);
		
		TextView textNombre=(TextView)convertView.findViewById(R.id.textNombre);
		TextView textApellido=(TextView)convertView.findViewById(R.id.textApellido);
		TextView textRelacion=(TextView)convertView.findViewById(R.id.textRelacion);
		
		Persona persona=personas.get(position);
		textNombre.setText(persona.getNombre());
		textApellido.setText(persona.getApellido());
		textRelacion.setText(persona.getRelacion());
		
		return convertView;
	}

}
