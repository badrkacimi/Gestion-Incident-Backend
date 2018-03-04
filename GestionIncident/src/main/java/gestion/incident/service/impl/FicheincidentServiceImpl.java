package gestion.incident.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import gestion.incident.service.FicheincidentService;
import gestion.incident.service.dto.FicheIncidentDto;
import gestion.incident.service.mapper.FicheIncidentMapper;
import jpa.vehicule.dao.FicheIncident;
import jpa.vehicule.dao.FicheIncidentDao;
import jpa.vehicule.dao.FicheIncidentDaoFactory;

/**
 * Classe Service pour gérer les Ficheincidents.
 */
@Service
public class FicheincidentServiceImpl implements FicheincidentService {

	@Override
	public void creerFicheincident(FicheIncidentDto ficheincidentDto) {
		// Récupérer une instance de la DAO
		FicheIncidentDao ficheincidentDao = FicheIncidentDaoFactory.getFicheIncident(FicheIncidentDaoFactory.JPA_DAO);
		// Convertir le DTO VehiculeDto en entité FicheIncident pour lepasser à la DAO
		FicheIncident ficheIncident = FicheIncidentMapper.FicheIncidentDtoToFicheIncident(ficheincidentDto);
		// Appeler la méthode de la DAO pour créer l'entité FicheIncident
		ficheincidentDao.insererFicheIncidentVoyage(ficheIncident);

	}



	@Override
	public void SupprimerFicheincident(String NumeroFiche) {
		FicheIncidentDao ficheincidentDao = FicheIncidentDaoFactory.getFicheIncident(FicheIncidentDaoFactory.JPA_DAO);
		 ficheincidentDao.supprimerFicheIncidentVoyage(NumeroFiche);
	}

	@Override
	public void ModifierFicheincident(FicheIncidentDto ficheincidentDto) {
		// Récupérer une instance de la DAO
		FicheIncidentDao ficheincidentDao = FicheIncidentDaoFactory.getFicheIncident(FicheIncidentDaoFactory.JPA_DAO);
		// Convertir le DTO VehiculeDto en entité FicheIncident pour lepasser à la DAO
		FicheIncident ficheIncident = FicheIncidentMapper.FicheIncidentDtoToFicheIncident(ficheincidentDto);
		// Appeler la méthode de la DAO pour créer l'entité FicheIncident
		ficheincidentDao.modifierFicheIncidentVoyage(ficheIncident);

	}

	@Override
	public FicheIncidentDto getFicheincidentParImmat(long id) {
		FicheIncidentDao ficheincidentDao = FicheIncidentDaoFactory.getFicheIncident(FicheIncidentDaoFactory.JPA_DAO);
		// Appeler la méthode de la DAO pour chercher le FicheIncident par Id
		FicheIncident ficheincident = ficheincidentDao.rechercherFicheIncidentVoyageParImma(id);
		// Convertir l'entité Vehicule récupérer en DTO VehiculeDto
		FicheIncidentDto ficheIncidentDto = FicheIncidentMapper.FicheIncidentToFicheIncidentDto(ficheincident);
		// Retourner le Dto
		return ficheIncidentDto;
	}

	@Override
	public List<FicheIncidentDto> getTousLesFiches() {
		// Récupérer une instance de la DAO
		FicheIncidentDao ficheincidentDao = FicheIncidentDaoFactory.getFicheIncident(FicheIncidentDaoFactory.JPA_DAO);
		// Appeler la méthode de la DAO pour chercher la liste des Fiches
		List listeFiche = ficheincidentDao.rechercherTousLesFicheIncidentVoyages();
		// Convertir l'entité Fiche récupérer en DTO FicheIncident
		List listeFicheDto = FicheIncidentMapper.FicheIncidentToFicheIncidentlistDto(listeFiche);
		// Retourner le Dto
		return listeFicheDto;
	}

	@Override
	public FicheIncidentDto getFicheincidentParNumFiche(String NumeroFiche) {
		
	FicheIncidentDao ficheincidentDao = FicheIncidentDaoFactory.getFicheIncident(FicheIncidentDaoFactory.JPA_DAO);
	// Appeler la méthode de la DAO pour chercher le FicheIncident par Id
	FicheIncident ficheincident = ficheincidentDao.rechercherFicheIncidentVoyageParNumeroFiche(NumeroFiche);
	// Convertir l'entité Vehicule récupérer en DTO VehiculeDto
	FicheIncidentDto ficheIncidentDto = FicheIncidentMapper.FicheIncidentToFicheIncidentDto(ficheincident);
	// Retourner le Dto
	return ficheIncidentDto;}
	
	

}
