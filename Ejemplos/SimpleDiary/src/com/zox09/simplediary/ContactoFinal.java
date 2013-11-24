package com.zox09.simplediary;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ContactoFinal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacto_final);
		
		//Localizamos el TextView a modificar
		TextView nombreFinal = (TextView)findViewById(R.id.nombreFinal);
		TextView apellidosFinal = (TextView)findViewById(R.id.apellidosFinal);
		TextView numeroTelefonoFinal = (TextView)findViewById(R.id.numeroTelefonoFinal);
		
		//Extraemos la información que hemos comunicado
		Bundle bundle = this.getIntent().getExtras();
		
		//Mostramos el nombre
		nombreFinal.setText("Nombre: " + bundle.getString("NOMBRE"));
		apellidosFinal.setText("Apellidos: " + bundle.getString("APELLIDOS"));
		numeroTelefonoFinal.setText("Nº de teléfono: " + bundle.getString("NUMERO"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contacto_final, menu);
		return true;
	}

}
