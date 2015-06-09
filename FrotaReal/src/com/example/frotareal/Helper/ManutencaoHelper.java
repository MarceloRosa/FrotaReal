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


//  FALTA ALTERAR MUITO AINDA
public class ManutencaoHelper {
	
	
		private EditText editTextModeloE;
		private EditText editTextUltimaTrocaOleoF;		
		private EditText editTextUltimaTrocaAC;		
		private EditText editTextUltimaTrocaFreio;		
		private EditText editTextUltimaTrocaMangueira;	
		private EditText editTextUltimaRevisaoGeral;		
		public Button buttonProximoManutencao1;
		public Button buttonProximoManutencao3;
		private Long Idm;

		private FrotaRealBean maquina ;
		
		public ManutencaoHelper(DadosParaManutencao atividade,FrotaRealBean extras){

			this.editTextModeloE = (EditText) atividade.findViewById(R.id.editTextModeloE);
			this.editTextUltimaTrocaOleoF = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaOleoF);
			this.editTextUltimaTrocaAC = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaAC);
			this.editTextUltimaTrocaFreio = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaFreio);
			this.editTextUltimaTrocaMangueira = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaMangueira);
			this.editTextUltimaRevisaoGeral = (EditText) atividade.findViewById(R.id.editTextUltimaRevisaoGeral2);
			
			
						
			this.buttonProximoManutencao1 = (Button) atividade.findViewById(R.id.buttonProximoManutencao1);
			
			this.buttonProximoManutencao3 = (Button) atividade.findViewById(R.id.buttonProximoManutencao3);

			Idm = extras.getId();
			
			editTextModeloE.setText(extras.getModelo());
			editTextUltimaTrocaOleoF.setText(extras.getUltimatrocaoil());
			
			editTextUltimaTrocaAC.setText(extras.getUltimatrocaac());
			
			editTextUltimaTrocaFreio.setText(extras.getUltimafreio());
			
			
			editTextUltimaTrocaMangueira.setText(extras.getUltimamangueira());
			
			editTextUltimaRevisaoGeral.setText(extras.getUltimamangueira());
			
			
			
			
			maquina = this.getMaquina();


		}
		
		public FrotaRealBean getMaquina() {

			FrotaRealBean maquina = new FrotaRealBean();
			maquina.setId(Idm);
			
			maquina.setModelo(editTextModeloE.getText().toString());
			maquina.setUltimatrocaoil(editTextUltimaTrocaOleoF.getText().toString());
			
			maquina.setUltimatrocaac(editTextUltimaTrocaAC.getText().toString());
			
			maquina.setUltimafreio(editTextUltimaTrocaFreio.getText().toString());
			
			
			maquina.setUltimamangueira(editTextUltimaTrocaMangueira.getText().toString());
			
			maquina.setUltimageral(editTextUltimaRevisaoGeral.getText().toString());
			
			return maquina;
		}

		/**
		 * @return the editTextModeloE
		 */
		public EditText getEditTextModeloE() {
			return editTextModeloE;
		}

		/**
		 * @param editTextModeloE the editTextModeloE to set
		 */
		public void setEditTextModeloE(EditText editTextModeloE) {
			this.editTextModeloE = editTextModeloE;
		}

		/**
		 * @return the editTextUltimaTrocaOleoF
		 */
		public EditText getEditTextUltimaTrocaOleoF() {
			return editTextUltimaTrocaOleoF;
		}

		/**
		 * @param editTextUltimaTrocaOleoF the editTextUltimaTrocaOleoF to set
		 */
		public void setEditTextUltimaTrocaOleoF(EditText editTextUltimaTrocaOleoF) {
			this.editTextUltimaTrocaOleoF = editTextUltimaTrocaOleoF;
		}

		/**
		 * @return the editTextUltimaTrocaAC
		 */
		public EditText getEditTextUltimaTrocaAC() {
			return editTextUltimaTrocaAC;
		}

		/**
		 * @param editTextUltimaTrocaAC the editTextUltimaTrocaAC to set
		 */
		public void setEditTextUltimaTrocaAC(EditText editTextUltimaTrocaAC) {
			this.editTextUltimaTrocaAC = editTextUltimaTrocaAC;
		}

		/**
		 * @return the editTextUltimaTrocaFreio
		 */
		public EditText getEditTextUltimaTrocaFreio() {
			return editTextUltimaTrocaFreio;
		}

		/**
		 * @param editTextUltimaTrocaFreio the editTextUltimaTrocaFreio to set
		 */
		public void setEditTextUltimaTrocaFreio(EditText editTextUltimaTrocaFreio) {
			this.editTextUltimaTrocaFreio = editTextUltimaTrocaFreio;
		}

		/**
		 * @return the editTextUltimaTrocaMangueira
		 */
		public EditText getEditTextUltimaTrocaMangueira() {
			return editTextUltimaTrocaMangueira;
		}

		/**
		 * @param editTextUltimaTrocaMangueira the editTextUltimaTrocaMangueira to set
		 */
		public void setEditTextUltimaTrocaMangueira(
				EditText editTextUltimaTrocaMangueira) {
			this.editTextUltimaTrocaMangueira = editTextUltimaTrocaMangueira;
		}

		/**
		 * @return the editTextUltimaRevisaoGeral
		 */
		public EditText getEditTextUltimaRevisaoGeral() {
			return editTextUltimaRevisaoGeral;
		}

		/**
		 * @param editTextUltimaRevisaoGeral the editTextUltimaRevisaoGeral to set
		 */
		public void setEditTextUltimaRevisaoGeral(EditText editTextUltimaRevisaoGeral) {
			this.editTextUltimaRevisaoGeral = editTextUltimaRevisaoGeral;
		}

		/**
		 * @return the buttonProximoManutencao1
		 */
		public Button getButtonProximoManutencao1() {
			return buttonProximoManutencao1;
		}

		/**
		 * @param buttonProximoManutencao1 the buttonProximoManutencao1 to set
		 */
		public void setButtonProximoManutencao1(Button buttonProximoManutencao1) {
			this.buttonProximoManutencao1 = buttonProximoManutencao1;
		}

		/**
		 * @return the buttonProximoManutencao3
		 */
		public Button getButtonProximoManutencao3() {
			return buttonProximoManutencao3;
		}

		/**
		 * @param buttonProximoManutencao3 the buttonProximoManutencao3 to set
		 */
		public void setButtonProximoManutencao3(Button buttonProximoManutencao3) {
			this.buttonProximoManutencao3 = buttonProximoManutencao3;
		}

		/**
		 * @return the idm
		 */
		public Long getIdm() {
			return Idm;
		}

		/**
		 * @param idm the idm to set
		 */
		public void setIdm(Long idm) {
			Idm = idm;
		}

		/**
		 * @param maquina the maquina to set
		 */
		public void setMaquina(FrotaRealBean maquina) {
			this.maquina = maquina;
		}
		
}
