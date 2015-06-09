package com.example.frotareal.atividades;

/*
* 
* @author 	Marcelo Rosa 
* 			Jorge Lousada
* 			
* @version 1.0
* Classe DadosParaManutencao2: Activity para dados manuten��o2.
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


public class DadosParaManutencao2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dados_para_manutencao2);
		
		public static final String TAG_S = "SELECAO_MAQUINA";
		

		private ManutencaoHelper manutencaoHelper2;
		//private Button salvar;


		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_dados_para_manutencao);
			
			FrotaRealBean frotarealBean = getIntent().getParcelableExtra("maquina");

			manutencaoHelper2 = new ManutencaoHelper(this,frotarealBean);
			manutencaoHelper2.getButtonProximoManutencao2().setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					AlertDialog.Builder builder = new AlertDialog.Builder(DadosParaManutencao2.this);
					builder.setMessage("Voc� realmente deseja confirmar dados inseridos? ");

					builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							FrotaRealBean frotarealBean =  manutencaoHelper2.getMaquina();
							FrotaRealDAO frotaRealDAO = new FrotaRealDAO(DadosParaManutencao2.this);
							frotaRealDAO.informacoesManutencao(frotarealBean);
							frotaRealDAO.close();
							
							finish();

							
						}

					
					});

					builder.setNegativeButton("N�O", null);
					AlertDialog dialog = builder.create();
					dialog.setTitle("Confirmar opera��o");
					dialog.show();
								
					
		
					
				}
			});
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dados_para_manutencao2, menu);
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
