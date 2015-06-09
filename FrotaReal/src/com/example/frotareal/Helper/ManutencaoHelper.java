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
		private EditText editTextQTDProximaOleoF;
		private EditText editTextUltimaTrocaAC;
		private EditText editTextProximaTrocaFiltroAC;
		private EditText editTextUltimaTrocaFreio;
		
		private EditText editTextProximaTroFreio;
		private EditText editTextUltimaTrocaMangu;
		private EditText editTextProximaTrocaMang;
		private EditText editTextUltimaRevisaoGeral;
		private EditText editTextProximRevisaoG;
		//private EditText editTextUltimaTrocaPneu;
		
		//private EditText editTextProximaTrocaPneus;
		private EditText editTextNomeOperado;
				
		
		public Button buttonProximoManutencao1;
		public Button buttonProximoManutencao2;
		public Button buttonProximoManutencao3;
		private Long Idm;

		private FrotaRealBean maquina ;
		
		public ManutencaoHelper(DadosParaManutencao atividade,FrotaRealBean extras){

			this.editTextModeloE = (EditText) atividade.findViewById(R.id.editTextModeloE);
			this.editTextUltimaTrocaOleoF = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaOleoF);
			this.editTextQTDProximaOleoF = (EditText) atividade.findViewById(R.id.editTextQTDProximaOleoF);
			this.editTextUltimaTrocaAC = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaAC);
			this.editTextProximaTrocaFiltroAC = (EditText) atividade.findViewById(R.id.editTextProximaTrocaFiltroAC);
			this.editTextUltimaTrocaFreio = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaFreio);
			
			this.editTextProximaTroFreio = (EditText) atividade.findViewById(R.id.editTextProximaTroFreio);
			this.editTextUltimaTrocaMangu = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaMangu);
			this.editTextProximaTrocaMang = (EditText) atividade.findViewById(R.id.editTextProximaTrocaMang);
			this.editTextUltimaRevisaoGeral = (EditText) atividade.findViewById(R.id.editTextUltimaRevisaoGeral);
			this.editTextProximRevisaoG = (EditText) atividade.findViewById(R.id.editTextProximRevisaoG);
			//this.editTextUltimaTrocaPneu = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaPneu);
			
			//this.editTextProximaTrocaPneus = (EditText) atividade.findViewById(R.id.editTextProximaTrocaPneus);
			this.editTextNomeOperado = (EditText) atividade.findViewById(R.id.editTextNomeOperado);
			
			this.buttonProximoManutencao1 = (Button) atividade.findViewById(R.id.buttonProximoManutencao1);
			this.buttonProximoManutencao2 = (Button) atividade.findViewById(R.id.buttonProximoManutencao2);
			this.buttonProximoManutencao3 = (Button) atividade.findViewById(R.id.buttonProximoManutencao3);

			Idm = extras.getId();
			
			editTextModeloE.setText(extras.getModelo());
			editTextUltimaTrocaOleoF.setText(extras.getUltimatrocaoil());
			editTextQTDProximaOleoF.setText(extras.getProximatrocaoil());
			editTextUltimaTrocaAC.setText(extras.getUltimatrocaac());
			editTextProximaTrocaFiltroAC.setText(extras.getProximatrocaac());
			editTextUltimaTrocaFreio.setText(extras.getUltimafreio());
			
			editTextProximaTroFreio.setText(extras.getProximafreio());
			editTextUltimaTrocaMangu.setText(extras.getUltimamangueira());
			editTextProximaTrocaMang.setText(extras.getProximamangueira());
			editTextUltimaRevisaoGeral.setText(extras.getUltimamangueira());
			editTextProximRevisaoG.setText(extras.getProximageral());
			//editTextUltimaTrocaPneu.setText(extras.getUltimapneu());
			
			//editTextProximaTrocaPneus.setText(extras.getProximapneu());
			editTextNomeOperado.setText(extras.getNomeoperador());
			
			maquina = this.getMaquina();


		}
		public ManutencaoHelper(DadosParaManutencao2 atividade,FrotaRealBean extras){

			this.editTextModeloE = (EditText) atividade.findViewById(R.id.editTextModeloE);
			
			this.editTextProximaTroFreio = (EditText) atividade.findViewById(R.id.editTextProximaTroFreio);
			this.editTextUltimaTrocaMangu = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaMangu);
			this.editTextProximaTrocaMang = (EditText) atividade.findViewById(R.id.editTextProximaTrocaMang);
			this.editTextUltimaRevisaoGeral = (EditText) atividade.findViewById(R.id.editTextUltimaRevisaoGeral);
			this.editTextProximRevisaoG = (EditText) atividade.findViewById(R.id.editTextProximRevisaoG);
			//this.editTextUltimaTrocaPneu = (EditText) atividade.findViewById(R.id.editTextUltimaTrocaPneu);
			
			//this.editTextProximaTrocaPneus = (EditText) atividade.findViewById(R.id.editTextProximaTrocaPneus);
			
			
			this.buttonProximoManutencao2 = (Button) atividade.findViewById(R.id.buttonProximoManutencao2);
			
			Idm = extras.getId();
			
			editTextModeloE.setText(extras.getModelo());
			
			editTextProximaTroFreio.setText(extras.getProximafreio());
			editTextUltimaTrocaMangu.setText(extras.getUltimamangueira());
			editTextProximaTrocaMang.setText(extras.getProximamangueira());
			editTextUltimaRevisaoGeral.setText(extras.getUltimamangueira());
			editTextProximRevisaoG.setText(extras.getProximageral());
			
			maquina = this.getMaquina();


		}
		public FrotaRealBean getMaquina() {

			FrotaRealBean maquina = new FrotaRealBean();
			maquina.setId(Idm);
			
			maquina.setModelo(editTextModeloE.getText().toString());
			maquina.setUltimatrocaoil(editTextUltimaTrocaOleoF.getText().toString());
			maquina.setProximatrocaoil(editTextQTDProximaOleoF.getText().toString());
			maquina.setUltimatrocaac(editTextUltimaTrocaAC.getText().toString());
			maquina.setProximatrocaac(editTextProximaTrocaFiltroAC.getText().toString());
			maquina.setUltimafreio(editTextUltimaTrocaFreio.getText().toString());
			
			maquina.setProximafreio(editTextProximaTroFreio.getText().toString());
			maquina.setUltimamangueira(editTextUltimaTrocaMangu.getText().toString());
			maquina.setProximamangueira(editTextProximaTrocaMang.getText().toString());
			maquina.setUltimageral(editTextUltimaRevisaoGeral.getText().toString());
			maquina.setProximageral(editTextProximRevisaoG.getText().toString());
			//maquina.setUltimapneu(editTextUltimaTrocaPneu.getText().toString());
		
			//maquina.setProximapneu(editTextProximaTrocaPneus.getText().toString());
			maquina.setNomeoperador(editTextNomeOperado.getText().toString());
			
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
		 * @return the editTextQTDProximaOleoF
		 */
		public EditText getEditTextQTDProximaOleoF() {
			return editTextQTDProximaOleoF;
		}
		/**
		 * @param editTextQTDProximaOleoF the editTextQTDProximaOleoF to set
		 */
		public void setEditTextQTDProximaOleoF(EditText editTextQTDProximaOleoF) {
			this.editTextQTDProximaOleoF = editTextQTDProximaOleoF;
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
		 * @return the editTextProximaTrocaFiltroAC
		 */
		public EditText getEditTextProximaTrocaFiltroAC() {
			return editTextProximaTrocaFiltroAC;
		}
		/**
		 * @param editTextProximaTrocaFiltroAC the editTextProximaTrocaFiltroAC to set
		 */
		public void setEditTextProximaTrocaFiltroAC(
				EditText editTextProximaTrocaFiltroAC) {
			this.editTextProximaTrocaFiltroAC = editTextProximaTrocaFiltroAC;
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
		 * @return the editTextProximaTroFreio
		 */
		public EditText getEditTextProximaTroFreio() {
			return editTextProximaTroFreio;
		}
		/**
		 * @param editTextProximaTroFreio the editTextProximaTroFreio to set
		 */
		public void setEditTextProximaTroFreio(EditText editTextProximaTroFreio) {
			this.editTextProximaTroFreio = editTextProximaTroFreio;
		}
		/**
		 * @return the editTextUltimaTrocaMangu
		 */
		public EditText getEditTextUltimaTrocaMangu() {
			return editTextUltimaTrocaMangu;
		}
		/**
		 * @param editTextUltimaTrocaMangu the editTextUltimaTrocaMangu to set
		 */
		public void setEditTextUltimaTrocaMangu(EditText editTextUltimaTrocaMangu) {
			this.editTextUltimaTrocaMangu = editTextUltimaTrocaMangu;
		}
		/**
		 * @return the editTextProximaTrocaMang
		 */
		public EditText getEditTextProximaTrocaMang() {
			return editTextProximaTrocaMang;
		}
		/**
		 * @param editTextProximaTrocaMang the editTextProximaTrocaMang to set
		 */
		public void setEditTextProximaTrocaMang(EditText editTextProximaTrocaMang) {
			this.editTextProximaTrocaMang = editTextProximaTrocaMang;
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
		 * @return the editTextProximRevisaoG
		 */
		public EditText getEditTextProximRevisaoG() {
			return editTextProximRevisaoG;
		}
		/**
		 * @param editTextProximRevisaoG the editTextProximRevisaoG to set
		 */
		public void setEditTextProximRevisaoG(EditText editTextProximRevisaoG) {
			this.editTextProximRevisaoG = editTextProximRevisaoG;
		}
		/**
		 * @return the editTextUltimaTrocaPneu
		 *
		public EditText getEditTextUltimaTrocaPneu() {
			return editTextUltimaTrocaPneu;
		}
		/**
		 * @param editTextUltimaTrocaPneu the editTextUltimaTrocaPneu to set
		 *
		public void setEditTextUltimaTrocaPneu(EditText editTextUltimaTrocaPneu) {
			this.editTextUltimaTrocaPneu = editTextUltimaTrocaPneu;
		}
		/**
		 * @return the editTextProximaTrocaPneus
		 *
		public EditText getEditTextProximaTrocaPneus() {
			return editTextProximaTrocaPneus;
		}
		/**
		 * @param editTextProximaTrocaPneus the editTextProximaTrocaPneus to set
		 *
		public void setEditTextProximaTrocaPneus(EditText editTextProximaTrocaPneus) {
			this.editTextProximaTrocaPneus = editTextProximaTrocaPneus;
		}
		/**
		 * @return the editTextNomeOperado
		 */
		public EditText getEditTextNomeOperado() {
			return editTextNomeOperado;
		}
		/**
		 * @param editTextNomeOperado the editTextNomeOperado to set
		 */
		public void setEditTextNomeOperado(EditText editTextNomeOperado) {
			this.editTextNomeOperado = editTextNomeOperado;
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
		 * @return the buttonProximoManutencao2
		 */
		public Button getButtonProximoManutencao2() {
			return buttonProximoManutencao2;
		}
		/**
		 * @param buttonProximoManutencao2 the buttonProximoManutencao2 to set
		 */
		public void setButtonProximoManutencao2(Button buttonProximoManutencao2) {
			this.buttonProximoManutencao2 = buttonProximoManutencao2;
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
