package com.example.frotareal.atividades;

/*
* 
* @author 	Marcelo Rosa / Jorge Lousada* 			
* 			
* @version 1.0
* Classe DadosParaManutencao: Activity para dados manutenção.
* 
*/


import com.example.frotareal.DAO.FrotaRealDAO;
import com.example.frotareal.Helper.*;
import com.example.frotareal.bean.FrotaRealBean;
import com.example.frotareal.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class DadosParaManutencao extends Activity {
	
	public static final String TAG_S = "SELECAO_MAQUINA";
	

	private ManutencaoHelper manutencaoHelper;
	//private Button salvar;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dados_para_manutencao);
		
		/*FrotaRealBean frotarealBean = getIntent().getParcelableExtra("modelo");

		manutencaoHelper = new ManutencaoHelper(this,frotarealBean);
		manutencaoHelper.getButtonProximoManutencao1().setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder = new AlertDialog.Builder(DadosParaManutencao.this);
				builder.setMessage("Você realmente deseja confirmar dados inseridos? ");

				builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						FrotaRealBean frotarealBean =  manutencaoHelper.getMaquina();
						FrotaRealDAO frotaRealDAO = new FrotaRealDAO(DadosParaManutencao.this);
						frotaRealDAO.informacoesManutencao(frotarealBean);
						frotaRealDAO.close();
						
						finish();

						
					}

				
				});

				builder.setNegativeButton("NÃO", null);
				AlertDialog dialog = builder.create();
				dialog.setTitle("Confirmar operação");
				dialog.show();
							
				
	
				
			}
		});*/
	}
	
	

	/**
	 * @return the manutencaoHelper
	 */
	public ManutencaoHelper getManutencaoHelper() {
		return manutencaoHelper;
	}



	/**
	 * @param manutencaoHelper the manutencaoHelper to set
	 */
	public void setManutencaoHelper(ManutencaoHelper manutencaoHelper) {
		this.manutencaoHelper = manutencaoHelper;
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dados_para_manutencao, menu);
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
