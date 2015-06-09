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
		private String ultimatrocaac;		
		private String ultimafiltro;			
		private String ultimafreio;				
		private String ultimamangueira;		
		private String ultimageral;		
		

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
			ultimatrocaac = in.readString();			
			ultimafiltro = in.readString();			
			ultimafreio = in.readString();			
			ultimamangueira = in.readString();			
			ultimageral = in.readString();
			
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
		 * @return the ultimatrocaac
		 */
		public String getUltimatrocaac() {
			return ultimatrocaac;
		}

		/**
		 * @param ultimatrocaac the ultimatrocaac to set
		 */
		public void setUltimatrocaac(String ultimatrocaac) {
			this.ultimatrocaac = ultimatrocaac;
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
			
			dest.writeString(ultimatrocaac);
			
			dest.writeString(ultimafiltro);
			
			dest.writeString(ultimafreio);
			
			dest.writeString(ultimamangueira);
			
			dest.writeString(ultimageral);
			
			
			
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
