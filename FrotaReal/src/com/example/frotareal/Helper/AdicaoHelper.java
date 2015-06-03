package com.example.frotareal.Helper;
/*
* 
* @author 	Marcelo Rosa 
* 			Jorge Lousada
* 			
* @version 1.0
* Classe AdicaoHelper: Ajuda na inserção de dados da manutenção.
* 
*/

import android.widget.Button;
import android.widget.EditText;

import com.example.frotareal.atividades.*;
import com.example.frotareal.bean.FrotaRealBean;
import com.example.frotareal.R;


//  FALTA ALTERAR MUITO AINDA
public class AdicaoHelper {
	
	
		private EditText editTextModeloE;
		private EditText editTextDadosAdEndereco;
		private EditText editTextDadosAdCelular;
		private EditText editTextDadosAdTelefoneRes;
		private EditText editTextDadosAdEnderecoEle;
		private EditText editTextDadosAdContatoUrg;
		public Button buttonDadosAdConfirmarDados;
		private Long Idm;

		private FrotaRealBean maquina ;
		
		public AdicaoHelper(DadosParaManutencao atividade,FrotaRealBean extras){

			this.editTextModeloE = (EditText) atividade.findViewById(R.id.editTextModeloE);
			/*this.editTextDadosAdEndereco = (EditText) atividade.findViewById(R.id.editTextDadosAdEndereco);
			this.editTextDadosAdCelular = (EditText) atividade.findViewById(R.id.editTextDadosAdCelular);
			this.editTextDadosAdTelefoneRes = (EditText) atividade.findViewById(R.id.editTextDadosAdTelefoneRes);
			this.editTextDadosAdEnderecoEle = (EditText) atividade.findViewById(R.id.editTextDadosAdEnderecoEle);
			this.editTextDadosAdContatoUrg = (EditText) atividade.findViewById(R.id.editTextDadosAdContatoUrg);
			
			this.buttonDadosAdConfirmarDados = (Button) atividade.findViewById(R.id.buttonDadosAdConfirmarDados);

			Idm = extras.getId();
			
			editTextModeloE.setText(extras.getModelo());
			editTextDadosAdEndereco.setText(extras.getEndereco());
			editTextDadosAdCelular.setText(extras.getCelular());
			editTextDadosAdTelefoneRes.setText(extras.getTelefoneRes());
			editTextDadosAdEnderecoEle.setText(extras.getEnderecoEle());
			editTextDadosAdContatoUrg.setText(extras.getContatoUrg());

			maquina = this.getMaquina();


		}
		public FrotaRealBean getMaquina() {

			FrotaRealBean maquina = new FrotaRealBean();
			maquina.setId(Idm);
			
			maquina.setNome(editTextModeloE.getText().toString());
			maquina.setEndereco(editTextDadosAdEndereco.getText().toString());
			maquina.setCelular(editTextDadosAdCelular.getText().toString());
			maquina.setTelefoneRes(editTextDadosAdTelefoneRes.getText().toString());
			maquina.setEnderecoEle(editTextDadosAdEnderecoEle.getText().toString());
			maquina.setContatoUrg(editTextDadosAdContatoUrg.getText().toString());
			
			return maquina;*/
		}
}
