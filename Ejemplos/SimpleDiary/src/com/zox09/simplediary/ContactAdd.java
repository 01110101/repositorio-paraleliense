package com.zox09.simplediary;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;

public class ContactAdd extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_add);
		
		// Obtenemos en las variables "nombre" y "btnAdd" los elementos
		// de la interfaz
		final EditText nombre = (EditText)findViewById(R.id.nombre);
		final EditText apellidos = (EditText)findViewById(R.id.apellidos);
		final EditText numeroTelefono = (EditText)findViewById(R.id.numeroTelefono);
		final Button btnAdd = (Button)findViewById(R.id.btnAdd);
		
		// Utilizamos un listener para ver cuándo el usuario pulsa el botón
		btnAdd.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//Creamos un intent para el posterior envío de información
				//a la segunda activity
				Intent comunicacion = new Intent(ContactAdd.this, ContactoFinal.class);
				
				//Creamos la información a pasar entre las activities
				Bundle info = new Bundle();
				info.putString("NOMBRE", nombre.getText().toString());
				
				Bundle infoApellidos = new Bundle();
				infoApellidos.putString("APELLIDOS", apellidos.getText().toString());
				
				Bundle infoNumeroTelefono = new Bundle();
				infoNumeroTelefono.putString("NUMERO", numeroTelefono.getText().toString());
				
				//Añadimos la información al Intent "comunicacion"
				comunicacion.putExtras(info);
				comunicacion.putExtras(infoApellidos);
				comunicacion.putExtras(infoNumeroTelefono);
				
				//Iniciamos la activity
				startActivity(comunicacion);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_add, menu);
		return true;
	}

}
