package com.example.frotareal.Helper;
/*
* 
* @author 	Marcelo Rosa 
* 			Jorge Lousada
* 			
* @version 1.0
* Classe ManutencaoHelper: Ajuda na inserção de dados da manutenção.
* 
*/

import android.widget.Button;
import android.widget.EditText;

import com.example.frotareal.atividades.*;
import com.example.frotareal.bean.FrotaRealBean;
import com.example.frotareal.R;

public class RegistroHelper {
	
	
		private EditText editTextModeloE;
		private EditText editTextAnoFab;
		private EditText editTextPlaca;
		private EditText editTextProprietario;
		private EditText editTextObraContrat;
		
		private FrotaRealBean maquina;
		
		public RegistroHelper(TeladCadastro atividade){

			this.editTextModeloE = (EditText) atividade.findViewById(R.id.editTextModeloE);
			this.editTextAnoFab = (EditText) atividade.findViewById(R.id.editTextAnoFab);
			this.editTextPlaca = (EditText) atividade.findViewById(R.id.editTextPlaca);
			this.editTextProprietario = (EditText) atividade.findViewById(R.id.editTextProprietario);
			this.editTextObraContrat = (EditText) atividade.findViewById(R.id.editTextObraContrat);
			
			this.maquina = this.getMaquina();
		}
		

		public FrotaRealBean getMaquina(){
			FrotaRealBean maquina = new FrotaRealBean();		
			
			maquina.setModelo(editTextModeloE.getText().toString());
			maquina.setAno(editTextAnoFab.getText().toString());
			maquina.setPlaca(editTextPlaca.getText().toString());
			maquina.setProprietario(editTextProprietario.getText().toString());
			maquina.setContratante(editTextObraContrat.getText().toString());
			
			return maquina;
		}

	


}
