package com.example.frotareal.atividades;

import com.example.frotareal.atividades.*;
import com.example.frotareal.bean.*;
import com.example.frotareal.DAO.*;
import com.example.frotareal.Helper.*;

import com.example.frotareal.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class TelaAlteraCadastro extends Activity {
	private EdicaoHelper edicaoHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_altera_cadastro);
		FrotaRealBean frotarealBean = getIntent().getParcelableExtra("maquina");

		edicaoHelper =  new EdicaoHelper(this,frotarealBean);
		edicaoHelper.getButtonTelaAlteraCadastro().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				FrotaRealBean frotarealBean =  edicaoHelper.getMaquina();
				FrotaRealDAO frotaRealDAO = new FrotaRealDAO(TelaAlteraCadastro.this);
				frotaRealDAO.atualizarRegistroMaquinas(frotarealBean);
				frotaRealDAO.close();
				finish();
			}
		});
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_altera_cadastro, menu);
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
