package com.example.frotareal.DAO;

import java.util.ArrayList;
import java.util.List;



import com.example.frotareal.bean.FrotaRealBean;

import br.unifor.programacao.paciente.bean.PacienteBean;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class FrotaRealDAO extends SQLiteOpenHelper {
	
	
	

		public static final int VERSAO = 1;
		public static final String TABELA = "frota";
		public static final String DATABASE = "BD_FROTA";

		private static final String TAG_I = "INSERIR_MAQUINAS";
		private static final String TAG_L = "LISTAR_MAQUINAS";
		private static final String TAG_R = "REMOVER_MAQUINAS";

		public FrotaRealDAO(Context context) {
			super(context, DATABASE, null, VERSAO);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			String sql = "CREATE TABLE " + TABELA 
					+ "('id' INTEGER PRIMARY KEY NOT NULL , "
					+ "'modelo' TEXT NOT NULL"
					+ ",'ano' TEXT NOT NULL"
					+ ",'placa' TEXT NOT NULL "
					+ ",'proprietario' TEXT NOT NULL"
					+ ",'contratante' TEXT NOT NULL"
					+ ",'kminicial' TEXT NOT NULL"
					+ ",'ultimatrocaoil' TEXT NOT NULL"
					+ ",'proximatrocaoil' TEXT"
					+ ",'ultimafiltro' TEXT"
					+ ",'proximafiltro' TEXT"
					+ ",'ultimafreio' TEXT"
					+ ",'proximafreio' TEXT"
					+ ",'ultimamangueira' TEXT"
					+ ",'proximamangueira' TEXT"
					+ ",'ultimageral' TEXT"
					+ ",'proximageral' TEXT"
					+ ",'ultimapneu' TEXT"
					+ ",'proximapneu' TEXT"
					+ ",'nomeoperador' TEXT)";
			db.execSQL(sql);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

			String sql = "DROP TABLE IF EXISTS "+ TABELA;
			db.execSQL(sql);
			onCreate(db);
		}

		public void registrarMaquina(FrotaRealBean maquina){

			ContentValues valores = new ContentValues();

			valores.put("modelo", maquina.getModelo().toString());
			valores.put("ano", maquina.getAno().toString());
			valores.put("placa", maquina.getPlaca().toString());
			valores.put("proprietario", maquina.getProprietario().toString());
			valores.put("contratante", maquina.getContratante().toString());
			

			getWritableDatabase().insert(TABELA, null, valores);

			Log.i(TAG_I, "Registro realizado: "+ maquina.getModelo());

		}
		public void inserirInformacoesAdicionais(PacienteBean paciente){

			ContentValues valores = new ContentValues();

			
			valores.put("nome", paciente.getNome().toString());
			valores.put("endereco",paciente.getEndereco().toString());
			valores.put("celular",paciente.getCelular().toString());
			valores.put("telefoneRes",paciente.getTelefoneRes().toString());
			valores.put("enderecoEle",paciente.getEnderecoEle().toString());
			valores.put("contatoUrg",paciente.getContatoUrg().toString());

			String[] args = new String[]{Long.toString(paciente.getId())};

			getWritableDatabase().update(TABELA, valores, "id=?", args);

			Log.i(TAG_I, "Dados Adicionais atualizados: "+ paciente.getNome());
			
			

		}
		

		public void atualizarRegistroPaciente(PacienteBean paciente){

			ContentValues valores = new ContentValues();

			
			valores.put("nome", paciente.getNome().toString());
			valores.put("pressao", paciente.getPressao().toString());
			valores.put("leito", paciente.getLeito().toString());
			valores.put("bpm", paciente.getBPM().toString());
			valores.put("temperatura",paciente.getTemperatura().toString());
			valores.put("internacao",paciente.getMotivoInternacao().toString());
			valores.put("tipo_sangue",paciente.getSanguineo().toString());

			String[] args = new String[]{Long.toString(paciente.getId())};

			getWritableDatabase().update(TABELA, valores, "id=?", args);

			Log.i(TAG_I, "Paciente atualizado: "+ paciente.getNome());

		}
		

		public List<PacienteBean> recuperarRegistros(){

			List<PacienteBean> listaPacientes = new ArrayList<PacienteBean>();

			String sql = "Select * from pacientes";

			Cursor cursor = getReadableDatabase().rawQuery(sql, null);

			try{
				while(cursor.moveToNext()){

					PacienteBean paciente = new PacienteBean();

					paciente.setId(cursor.getLong(0));
					paciente.setNome(cursor.getString(1));
					paciente.setPressao(cursor.getString(2));
					paciente.setLeito(cursor.getString(3));
					paciente.setBPM(cursor.getString(4));
					paciente.setTemperatura(cursor.getString(5));
					paciente.setMotivoInternacao(cursor.getString(6));
					paciente.setTipoSanguineo(cursor.getString(7));
					paciente.setEndereco(cursor.getString(8));
					paciente.setCelular(cursor.getString(9));
					paciente.setTelefoneRes(cursor.getString(10));
					paciente.setEnderecoEle(cursor.getString(11));
					paciente.setContatoUrg(cursor.getString(12));

					listaPacientes.add(paciente);
					cursor.close();
				}
			}catch(SQLException sqle){
				Log.e(TAG_L, sqle.getMessage());
			}finally{
				cursor.close();
			}

			return listaPacientes;
		}
		
		

		public void removerRegistroPaciente(PacienteBean paciente){
			String [] args = {paciente.getId().toString()};

			getWritableDatabase().delete(TABELA, "id=?", args);

			Log.i(TAG_R, "Paciente removido: "+ paciente.getNome());
		}

	}


}
