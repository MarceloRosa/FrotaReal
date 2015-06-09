package com.example.frotareal.Helper;

/*
* 
* @author 	Marcelo Rosa / Jorge Lousada* 			
* 			
* @version 1.0
*Classe EdicaoHelper: Para auxiliar na edição dos dados.
* 
*/


import android.widget.Button;
import android.widget.EditText;

import com.example.frotareal.atividades.*;
import com.example.frotareal.bean.FrotaRealBean;
import com.example.frotareal.R;


public class EdicaoHelper {

	
	private EditText editTextModeloE;
	private EditText editTextAnoFab;
	private EditText editTextPlaca;
	private EditText editTextProprietario;
	private EditText editTextObraContrat;
	
	public Button buttonTelaAlteraCadastro;
	private Long Idp;

	private FrotaRealBean maquina ;

	public EdicaoHelper(TelaAlteraCadastro atividade,FrotaRealBean extras){

		this.editTextModeloE = (EditText) atividade.findViewById(R.id.editTextModeloE);
		this.editTextAnoFab = (EditText) atividade.findViewById(R.id.editTextAnoFab);
		this.editTextPlaca = (EditText) atividade.findViewById(R.id.editTextPlaca);
		this.editTextProprietario = (EditText) atividade.findViewById(R.id.editTextProprietario);
		this.editTextObraContrat = (EditText) atividade.findViewById(R.id.editTextObraContrat);		
		this.buttonTelaAlteraCadastro = (Button) atividade.findViewById(R.id.buttonTeladCadastro);
		

		Idp = extras.getId();
		editTextModeloE.setText(extras.getModelo());
		editTextAnoFab.setText(extras.getAno());
		editTextPlaca.setText(extras.getPlaca());
		editTextProprietario.setText(extras.getProprietario());
		editTextObraContrat.setText(extras.getContratante());

		maquina = this.getMaquina();

	}
	

	public FrotaRealBean getMaquina() {

		FrotaRealBean maquina = new FrotaRealBean();

		maquina.setId(Idp);
		maquina.setModelo(editTextModeloE.getText().toString());
		maquina.setAno(editTextAnoFab.getText().toString());
		maquina.setPlaca(editTextPlaca.getText().toString());
		maquina.setProprietario(editTextProprietario.getText().toString());
		maquina.setContratante(editTextObraContrat.getText().toString());
		
		
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
	 * @return the editTextAnoFab
	 */
	public EditText getEditTextAnoFab() {
		return editTextAnoFab;
	}


	/**
	 * @param editTextAnoFab the editTextAnoFab to set
	 */
	public void setEditTextAnoFab(EditText editTextAnoFab) {
		this.editTextAnoFab = editTextAnoFab;
	}


	/**
	 * @return the editTextPlaca
	 */
	public EditText getEditTextPlaca() {
		return editTextPlaca;
	}


	/**
	 * @param editTextPlaca the editTextPlaca to set
	 */
	public void setEditTextPlaca(EditText editTextPlaca) {
		this.editTextPlaca = editTextPlaca;
	}


	/**
	 * @return the editTextProprietario
	 */
	public EditText getEditTextProprietario() {
		return editTextProprietario;
	}


	/**
	 * @param editTextProprietario the editTextProprietario to set
	 */
	public void setEditTextProprietario(EditText editTextProprietario) {
		this.editTextProprietario = editTextProprietario;
	}


	/**
	 * @return the editTextObraContrat
	 */
	public EditText getEditTextObraContrat() {
		return editTextObraContrat;
	}


	/**
	 * @param editTextObraContrat the editTextObraContrat to set
	 */
	public void setEditTextObraContrat(EditText editTextObraContrat) {
		this.editTextObraContrat = editTextObraContrat;
	}


	/**
	 * @return the buttonTelaAlteraCadastro
	 */
	public Button getButtonTelaAlteraCadastro() {
		return buttonTelaAlteraCadastro;
	}


	/**
	 * @param buttonTelaAlteraCadastro the buttonTelaAlteraCadastro to set
	 */
	public void setButtonTelaAlteraCadastro(Button buttonTelaAlteraCadastro) {
		this.buttonTelaAlteraCadastro = buttonTelaAlteraCadastro;
	}


	/**
	 * @return the idp
	 */
	public Long getIdp() {
		return Idp;
	}


	/**
	 * @param idp the idp to set
	 */
	public void setIdp(Long idp) {
		Idp = idp;
	}


	/**
	 * @param maquina the maquina to set
	 */
	public void setMaquina(FrotaRealBean maquina) {
		this.maquina = maquina;
	}
	
	


}
