package gestion.incident.service.dto;

import java.util.Date;

import jpa.vehicule.dao.Vehicule;

public class FicheIncidentDto {
	@Override
	public String toString() {
		return "FicheIncidentDto [NumeroFiche=" + NumeroFiche + ", DateIncident=" + DateIncident + ", IncidentCritique="
				+ IncidentCritique + ", LieuIncident=" + LieuIncident + ", NombreVoyageur=" + NombreVoyageur
				+ ", DescriptionIncident=" + DescriptionIncident + "]";
	}
	private String NumeroFiche;
	private Date DateIncident;
	private boolean IncidentCritique;
	private String LieuIncident;
	private int NombreVoyageur;
	private String DescriptionIncident;
	private Vehicule vehicule;
		
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public FicheIncidentDto() {
		super();
	}
	
	public Date getDateIncident() {
		return DateIncident;
	}
	public void setDateIncident(Date dateIncident) {
		DateIncident = dateIncident;
	}
	
	
	public String getNumeroFiche() {
		return NumeroFiche;
	}
	public void setNumeroFiche(String numeroFiche) {
		NumeroFiche = numeroFiche;
	}
	public boolean isIncidentCritique() {
		return IncidentCritique;
	}
	public void setIncidentCritique(boolean incidentCritique) {
		IncidentCritique = incidentCritique;
	}
	public String getLieuIncident() {
		return LieuIncident;
	}
	public void setLieuIncident(String lieuIncident) {
		LieuIncident = lieuIncident;
	}
	public int getNombreVoyageur() {
		return NombreVoyageur;
	}
	public void setNombreVoyageur(int nombreVoyageur) {
		NombreVoyageur = nombreVoyageur;
	}
	public String getDescriptionIncident() {
		return DescriptionIncident;
	}
	public void setDescriptionIncident(String descriptionIncident) {
		DescriptionIncident = descriptionIncident;
	}


}
