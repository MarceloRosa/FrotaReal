package com.example.frotareal.atividades;

import com.example.frotareal.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TelaInicialFrota extends Activity {
	
	private Button botaoCadastrar;
	private Button botaoListar;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_inicial_frota);
		
		this.botaoCadastrar = (Button) findViewById(R.id.buttonCadastrar);
		this.botaoListar = (Button) findViewById(R.id.buttonListarEquipamento);
		
		botaoCadastrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent =  new Intent(TelaInicialFrota.this,TeladCadastro.class);
				startActivity(intent);
			}
		});
		
		botaoListar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent =  new Intent(TelaInicialFrota.this,ListaEquipamentos.class);
				startActivity(intent);
			}
		});
				
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_inicial_frota, menu);
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
