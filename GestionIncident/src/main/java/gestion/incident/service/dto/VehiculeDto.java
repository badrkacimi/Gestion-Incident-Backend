package gestion.incident.service.dto;
/**
* Un DTO représentant un véhicule
*/
public class VehiculeDto {
private String codeInterne;
private String immatriculation;
public VehiculeDto() {
}
public String getCodeInterne() {
return this.codeInterne;
}
public void setCodeInterne(String codeInterne) {
this.codeInterne = codeInterne;
}
public String getImmatriculation() {
return this.immatriculation;
}
public void setImmatriculation(String immatriculation) {
this.immatriculation = immatriculation;
}
}