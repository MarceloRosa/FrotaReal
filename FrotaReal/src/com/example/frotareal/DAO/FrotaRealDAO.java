package com.example.frotareal.DAO;

import java.util.ArrayList;
import java.util.List;




import com.example.frotareal.bean.FrotaRealBean;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class FrotaRealDAO extends SQLiteOpenHelper {
	
	
	

		public static final int VERSAO = 20;
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
					+ "'modelo' TEXT"
					+ ", 'ano' TEXT"
					+ ", 'placa' TEXT "
					+ ",'proprietario' TEXT"
					+ ",'contratante' TEXT"
					+ ",'kminicial' TEXT"
					+ ",'ultimatrocaoil' TEXT"
					+ ",'proximatrocaoil' TEXT"
					+ ",'ultimatrocaac' TEXT"
					+ ",'proximatrocaac' TEXT"
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
			carregaDados(db);
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
		public void informacoesManutencao(FrotaRealBean maquina){

			ContentValues valores = new ContentValues();

			
			valores.put("modelo", maquina.getModelo().toString());
			valores.put("kminicial",maquina.getKminicial().toString());
			valores.put("ultimatrocaoil",maquina.getUltimatrocaoil().toString());
			valores.put("proximatrocaoil",maquina.getProximatrocaoil().toString());
			valores.put("ultimatrocaac",maquina.getUltimatrocaac().toString());
			valores.put("proximatrocaac",maquina.getProximatrocaac().toString());
			valores.put("ultimafiltro",maquina.getUltimafiltro().toString());
			valores.put("proximafiltro",maquina.getProximafiltro().toString());
			valores.put("ultimafreio",maquina.getUltimafreio().toString());
			valores.put("proximafreio",maquina.getProximafreio().toString());
			valores.put("ultimamangueira",maquina.getUltimamangueira().toString());
			valores.put("proximamangueira",maquina.getProximamangueira().toString());
			valores.put("ultimageral",maquina.getUltimageral().toString());
			valores.put("proximageral",maquina.getProximageral().toString());
			valores.put("ultimapneu",maquina.getUltimapneu().toString());
			valores.put("proximapneu",maquina.getProximapneu().toString());
			valores.put("nomeoperador",maquina.getNomeoperador().toString());




			String[] args = new String[]{Long.toString(maquina.getId())};

			getWritableDatabase().update(TABELA, valores, "id=?", args);

			Log.i(TAG_I, "Manutenção atualizada: "+ maquina.getModelo());
			
			

		}
		

		public void atualizarRegistroMaquinas(FrotaRealBean maquina){

			ContentValues valores = new ContentValues();

			
			valores.put("modelo", maquina.getModelo().toString());
			valores.put("ano", maquina.getAno().toString());
			valores.put("placa", maquina.getPlaca().toString());
			valores.put("proprietario", maquina.getProprietario().toString());
			valores.put("contratante", maquina.getContratante().toString());
			
			String[] args = new String[]{Long.toString(maquina.getId())};

			getWritableDatabase().update(TABELA, valores, "id=?", args);

			Log.i(TAG_I, "Paciente atualizado: "+ maquina.getModelo());

		}
		

		public List<FrotaRealBean> recuperarRegistros(){

			List<FrotaRealBean> listaMaquinas = new ArrayList<FrotaRealBean>();

			String sql = "Select * from frota";

			Cursor cursor = getReadableDatabase().rawQuery(sql, null);

			try{
				while(cursor.moveToNext()){

					FrotaRealBean maquina = new FrotaRealBean();

					maquina.setId(cursor.getLong(0));
					maquina.setModelo(cursor.getString(1));
					maquina.setAno(cursor.getString(2));
					maquina.setPlaca(cursor.getString(3));
					maquina.setProprietario(cursor.getString(4));
					maquina.setContratante(cursor.getString(5));
					maquina.setKminicial(cursor.getString(6));
					maquina.setUltimatrocaoil(cursor.getString(7));
					maquina.setProximatrocaoil(cursor.getString(8));
					maquina.setUltimatrocaac(cursor.getString(9));
					maquina.setProximatrocaac(cursor.getString(10));
					
					maquina.setUltimafiltro(cursor.getString(11));
					maquina.setProximafiltro(cursor.getString(12));
					maquina.setUltimafreio(cursor.getString(13));
					maquina.setProximafreio(cursor.getString(14));
					maquina.setUltimamangueira(cursor.getString(15));
					maquina.setProximamangueira(cursor.getString(16));
					maquina.setUltimageral(cursor.getString(17));
					maquina.setProximageral(cursor.getString(18));
					maquina.setUltimapneu(cursor.getString(19));
					maquina.setProximapneu(cursor.getString(20));
					maquina.setNomeoperador(cursor.getString(21));

					listaMaquinas.add(maquina);
					cursor.close();
				}
			}catch(SQLException sqle){
				Log.e(TAG_L, sqle.getMessage());
			}finally{
				cursor.close();
			}

			return listaMaquinas;
		}
		
		

		public void removerRegistroMaquina(FrotaRealBean maquina){
			String [] args = {maquina.getId().toString()};

			getWritableDatabase().delete(TABELA, "id=?", args);

			Log.i(TAG_R, "Maquina removida: "+ maquina.getModelo());
		}
		public void carregaDados(SQLiteDatabase db)
		{
		//Query de INSERT com os dados iniciais a serem carregados para o Banco de Dados
		String sql = "INSERT INTO "+TABELA
		+" ("
		+"modelo,"
		+" ano,"
		+" placa,"
		+" proprietario,"
		+" contratante"
		+")"
		+" VALUES('Retro escavadeira','2012','OCG 1110','Marcelo','Adois Construções')"
		+",('Pá mecânica','2015','ABC 123','Fernando','Pirilampo')"
		;       
		//Executa a Query de INSERT
		db.execSQL(sql);
		
			
		}

}
