package com.example.frotareal.atividades;

import java.util.List;
import com.example.frotareal.R;
import com.example.frotareal.DAO.FrotaRealDAO;
import com.example.frotareal.bean.FrotaRealBean;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

public class ListaEquipamentos extends Activity {
	
	public static final String TAG_S = "SELECAO_MAQUINA";
	// Criação de uma classe FrotaRealBean para utilizar com o DAO.
	private FrotaRealBean maquinaSelecionada;
	// Criar o ListView de Maquinas da Interface Grafica
	private ListView ListViewMaquinas;
	// Criar Lista de Maquinas (objetos Java)
	private List<FrotaRealBean> listaMaquinasBean;
	// Criar o Array Adaptar para conversão de informação dos objetos
	// do ListView para o Java
	private ArrayAdapter<FrotaRealBean> adaptador;
	// Criar o tipo de layout a ser utilizado nos itens do ListView
	private int adaptadorLayout;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_equipamentos);
		
		
		// Recupera a instancia por meio da classe R.java
				// Associa o ListView com o item definido no layout.xml
				ListViewMaquinas =  (ListView) findViewById(R.id.Listagem);
				// Recupera a instancia de PacienteDAO
				FrotaRealDAO frotarealDAO =  new FrotaRealDAO(ListaEquipamentos.this);
				// Recupera a lista de PacientesBean que foi recupera do registo
				// do banco de dados SQLite
				listaMaquinasBean = frotarealDAO.recuperarRegistros();

				if (listaMaquinasBean.isEmpty()){
					AlertDialog.Builder builder = new AlertDialog.Builder(this);
					AlertDialog dialog = builder.create();
					dialog.setTitle("N�O Existem Maquinas Cadastradas");
					dialog.show();

				}else{
					adaptadorLayout = android.R.layout.simple_expandable_list_item_1;
					adaptador = new ArrayAdapter<FrotaRealBean> (this,adaptadorLayout, listaMaquinasBean);

					ListViewMaquinas.setAdapter(adaptador);

					registerForContextMenu(ListViewMaquinas);

					// Criacao um evento de clique curto
					ListViewMaquinas.setOnItemClickListener(new OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> parent, View view,
								int position, long id) {
							Intent intent = new Intent(ListaEquipamentos.this, TelaInicialFrota.class);
							Parcelable parceable = (Parcelable) ListViewMaquinas.getItemAtPosition(position);
							
							//verificar se � modelo mesmo abaixo tb
							intent.putExtra("modelo",parceable);
							startActivity(intent);
						}		
					});
					// Criação do evento longo que utiliza o MenuContext
					ListViewMaquinas.setOnItemLongClickListener(new OnItemLongClickListener(){
						@Override
						public boolean onItemLongClick(AdapterView<?> parent, View view,
								int posicao, long id) {
							maquinaSelecionada = (FrotaRealBean) adaptador.getItem(posicao);

							Log.i(TAG_S, "Maquina Selecionada ListView.longClick"
									+ maquinaSelecionada.getModelo());
							return false;
						}
					});
				}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_equipamentos, menu);
		return true;
	}
	
	public boolean onContextItemSelected(MenuItem item){
		Intent intent = null;
		switch (item.getItemId()) {
		
		case R.id.itemRemoverMaquina:
			
			//TODO Método privado que removeo registro de pacientes
			removerRegistroMaquina();
			break;
			
		case R.id.itemRelatorioManutencao:
			//TODO Método privado que atualiza registro de pacientes
			exibirRelatorio(intent);
			break;

			//Intents Implicitas
		case R.id.itemAtualizar:
			//TODO Método privado que habilita ligação para familiar
			atualizarRegistroMaquina(intent);
			break;

		case R.id.itemCancelar:
			//TODO Método privado que habilita SMS para responsável do paciente
			finish();
			break;
			
					
		default:
			break;
		}
		return super.onContextItemSelected(item);
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
	
	public void removerRegistroMaquina(){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Voc� deseja realmente remover a Maquina de modelo: "+ maquinaSelecionada.getModelo());

		builder.setPositiveButton("SIM", new OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				FrotaRealDAO frotaRealDAO = new FrotaRealDAO(ListaEquipamentos.this);
				frotaRealDAO.removerRegistroMaquina(maquinaSelecionada);
				frotaRealDAO.close();
				frotaRealDAO.recuperarRegistros();

				listaMaquinasBean.remove(maquinaSelecionada);
				maquinaSelecionada = null;
				adaptador.notifyDataSetChanged();
			}
		});

		builder.setNegativeButton("N�O", null);
		AlertDialog dialog = builder.create();
		dialog.setTitle("Confirmar opera��o");
		dialog.show();
	}
	public void atualizarRegistroMaquina(Intent intent){

		intent = new Intent(ListaEquipamentos.this, DadosParaManutencao.class);
		Parcelable parceable = (Parcelable) this.maquinaSelecionada;
		
		//verificar modelo
		intent.putExtra("modelo",parceable);
		startActivity(intent);
	}
	public void exibirRelatorio(Intent intent){
		intent = new Intent(ListaEquipamentos.this, RelatorioManutencao.class);
		Parcelable parceable = (Parcelable) this.maquinaSelecionada;
		
		//verificar modelo
		intent.putExtra("modelo",parceable);
		startActivity(intent);
		
		
		
	}
	
}
