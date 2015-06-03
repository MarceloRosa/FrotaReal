package com.example.frotareal.bean;


import android.os.Parcel;
import android.os.Parcelable;

public class FrotaRealBean implements Parcelable {
	
	
		private Long id;
		private String modelo;
		private String ano;
		private String placa;
		private String proprietario;
		private String contratante;
		private String kminicial;
		private String ultimatrocaoil;
		private String proximatrocaoil;
		private String ultimafiltro;		
		private String proximafiltro;
		private String ultimafreio;		
		private String proximafreio;
		private String ultimamangueira;
		private String proximamangueira;
		private String ultimageral;
		private String proximageral;
		private String ultimapneu;
		private String proximapneu;
		private String nomeoperador;

		public FrotaRealBean() {
			// TODO Auto-generated constructor stub
		}

		public FrotaRealBean(Parcel in) {  
			readFromParcelable(in);  
		}  

		private void readFromParcelable(Parcel in) {
			id = in.readLong();
			modelo = in.readString();
			ano = in.readString();
			placa = in.readString();
			proprietario = in.readString();
			contratante = in.readString();
			kminicial = in.readString();
			ultimatrocaoil = in.readString();
			proximatrocaoil = in.readString();
			ultimafiltro = in.readString();
			proximafiltro = in.readString();
			ultimafreio = in.readString();
			proximafreio = in.readString();
			ultimamangueira = in.readString();
			proximamangueira = in.readString();
			ultimageral = in.readString();
			proximageral = in.readString();
			ultimapneu = in.readString();
			proximapneu = in.readString();
			nomeoperador = in.readString();
		}

				@Override
		public String toString() {
			return "Modelo:" + this.modelo +" Placa:" + this.placa ;
		}
		@Override
		public int describeContents() {
			// TODO Auto-generated method stub
			return 0;
		}
		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the modelo
		 */
		public String getModelo() {
			return modelo;
		}

		/**
		 * @param modelo the modelo to set
		 */
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		/**
		 * @return the ano
		 */
		public String getAno() {
			return ano;
		}

		/**
		 * @param ano the ano to set
		 */
		public void setAno(String ano) {
			this.ano = ano;
		}

		/**
		 * @return the placa
		 */
		public String getPlaca() {
			return placa;
		}

		/**
		 * @param placa the placa to set
		 */
		public void setPlaca(String placa) {
			this.placa = placa;
		}

		/**
		 * @return the proprietario
		 */
		public String getProprietario() {
			return proprietario;
		}

		/**
		 * @param proprietario the proprietario to set
		 */
		public void setProprietario(String proprietario) {
			this.proprietario = proprietario;
		}

		/**
		 * @return the contratante
		 */
		public String getContratante() {
			return contratante;
		}

		/**
		 * @param contratante the contratante to set
		 */
		public void setContratante(String contratante) {
			this.contratante = contratante;
		}

		/**
		 * @return the kminicial
		 */
		public String getKminicial() {
			return kminicial;
		}

		/**
		 * @param kminicial the kminicial to set
		 */
		public void setKminicial(String kminicial) {
			this.kminicial = kminicial;
		}

		/**
		 * @return the ultimatrocaoil
		 */
		public String getUltimatrocaoil() {
			return ultimatrocaoil;
		}

		/**
		 * @param ultimatrocaoil the ultimatrocaoil to set
		 */
		public void setUltimatrocaoil(String ultimatrocaoil) {
			this.ultimatrocaoil = ultimatrocaoil;
		}

		/**
		 * @return the proximatrocaoil
		 */
		public String getProximatrocaoil() {
			return proximatrocaoil;
		}

		/**
		 * @param proximatrocaoil the proximatrocaoil to set
		 */
		public void setProximatrocaoil(String proximatrocaoil) {
			this.proximatrocaoil = proximatrocaoil;
		}

		/**
		 * @return the ultimafiltro
		 */
		public String getUltimafiltro() {
			return ultimafiltro;
		}

		/**
		 * @param ultimafiltro the ultimafiltro to set
		 */
		public void setUltimafiltro(String ultimafiltro) {
			this.ultimafiltro = ultimafiltro;
		}

		/**
		 * @return the proximafiltro
		 */
		public String getProximafiltro() {
			return proximafiltro;
		}

		/**
		 * @param proximafiltro the proximafiltro to set
		 */
		public void setProximafiltro(String proximafiltro) {
			this.proximafiltro = proximafiltro;
		}

		/**
		 * @return the ultimafreio
		 */
		public String getUltimafreio() {
			return ultimafreio;
		}

		/**
		 * @param ultimafreio the ultimafreio to set
		 */
		public void setUltimafreio(String ultimafreio) {
			this.ultimafreio = ultimafreio;
		}

		/**
		 * @return the proximafreio
		 */
		public String getProximafreio() {
			return proximafreio;
		}

		/**
		 * @param proximafreio the proximafreio to set
		 */
		public void setProximafreio(String proximafreio) {
			this.proximafreio = proximafreio;
		}

		/**
		 * @return the ultimamangueira
		 */
		public String getUltimamangueira() {
			return ultimamangueira;
		}

		/**
		 * @param ultimamangueira the ultimamangueira to set
		 */
		public void setUltimamangueira(String ultimamangueira) {
			this.ultimamangueira = ultimamangueira;
		}

		/**
		 * @return the proximamangueira
		 */
		public String getProximamangueira() {
			return proximamangueira;
		}

		/**
		 * @param proximamangueira the proximamangueira to set
		 */
		public void setProximamangueira(String proximamangueira) {
			this.proximamangueira = proximamangueira;
		}

		/**
		 * @return the ultimageral
		 */
		public String getUltimageral() {
			return ultimageral;
		}

		/**
		 * @param ultimageral the ultimageral to set
		 */
		public void setUltimageral(String ultimageral) {
			this.ultimageral = ultimageral;
		}

		/**
		 * @return the proximageral
		 */
		public String getProximageral() {
			return proximageral;
		}

		/**
		 * @param proximageral the proximageral to set
		 */
		public void setProximageral(String proximageral) {
			this.proximageral = proximageral;
		}

		/**
		 * @return the ultimapneu
		 */
		public String getUltimapneu() {
			return ultimapneu;
		}

		/**
		 * @param ultimapneu the ultimapneu to set
		 */
		public void setUltimapneu(String ultimapneu) {
			this.ultimapneu = ultimapneu;
		}

		/**
		 * @return the proximapneu
		 */
		public String getProximapneu() {
			return proximapneu;
		}

		/**
		 * @param proximapneu the proximapneu to set
		 */
		public void setProximapneu(String proximapneu) {
			this.proximapneu = proximapneu;
		}

		/**
		 * @return the nomeoperador
		 */
		public String getNomeoperador() {
			return nomeoperador;
		}

		/**
		 * @param nomeoperador the nomeoperador to set
		 */
		public void setNomeoperador(String nomeoperador) {
			this.nomeoperador = nomeoperador;
		}

		/**
		 * @return the creator
		 */
		public static Parcelable.Creator getCreator() {
			return CREATOR;
		}

		@Override
		public void writeToParcel(Parcel dest, int flags) {
			dest.writeLong(id);
			dest.writeString(modelo);
			dest.writeString(ano);
			dest.writeString(placa);
			dest.writeString(proprietario);
			dest.writeString(contratante);
			dest.writeString(kminicial);
			dest.writeString(ultimatrocaoil);
			dest.writeString(proximatrocaoil);
			dest.writeString(ultimafiltro);
			dest.writeString(proximafiltro);
			dest.writeString(ultimafreio);
			dest.writeString(proximafreio);
			dest.writeString(ultimamangueira);
			dest.writeString(proximamangueira);
			dest.writeString(ultimageral);
			dest.writeString(proximageral);
			dest.writeString(ultimapneu);
			dest.writeString(proximapneu);
			dest.writeString(nomeoperador);
			
			
		}

		@SuppressWarnings("rawtypes")
		public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {  
			public FrotaRealBean createFromParcel(Parcel in) {  
				return new FrotaRealBean(in);  
			}  

			public FrotaRealBean[] newArray(int size) {  
				return new FrotaRealBean[size];  
			}  
		};  

}
