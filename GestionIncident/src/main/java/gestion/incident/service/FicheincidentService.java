package gestion.incident.service;

import java.util.List;

import gestion.incident.service.dto.FicheIncidentDto;

public interface FicheincidentService {
	
	public void creerFicheincident(FicheIncidentDto ficheincidentDto);

	
	public void SupprimerFicheincident(String NumeroFiche );
	
	public FicheIncidentDto getFicheincidentParNumFiche(String NumeroFiche );
	
	public void ModifierFicheincident(FicheIncidentDto ficheincidentDto);
	
	public FicheIncidentDto getFicheincidentParImmat(long id);

	List<FicheIncidentDto> getTousLesFiches();

}
