package gestion.incident.service.mapper;

import java.util.ArrayList;
import java.util.List;

import gestion.incident.service.dto.FicheIncidentDto;
import jpa.vehicule.dao.FicheIncident;

/**
* Mapper pour la conversion entre l'entité FicheIncident et son DTO
FicheIncidentDto.
*/

public class FicheIncidentMapper {
	
	public static FicheIncidentDto FicheIncidentToFicheIncidentDto(FicheIncident ficheIncident)
	{
		FicheIncidentDto ficheIncidentDto = new  FicheIncidentDto();
		ficheIncidentDto.setDescriptionIncident(ficheIncident.getDescriptionIncident());
		ficheIncidentDto.setIncidentCritique(ficheIncident.isIncidentCritique());
		ficheIncidentDto.setLieuIncident(ficheIncident.getLieuIncident());
		ficheIncidentDto.setNombreVoyageur(ficheIncident.getNombreVoyageur());
		ficheIncidentDto.setNumeroFiche(ficheIncident.getNumeroFiche());
		ficheIncidentDto.setDateIncident(ficheIncident.getDateIncident());
		ficheIncidentDto.setVehicule(ficheIncident.getVehicule());
		return ficheIncidentDto;
		}
	
	public static FicheIncident FicheIncidentDtoToFicheIncident(FicheIncidentDto ficheIncidentDto)
	{
		FicheIncident ficheIncident = new FicheIncident();
		ficheIncident.setDescriptionIncident(ficheIncidentDto.getDescriptionIncident());
		ficheIncident.setIncidentCritique(ficheIncidentDto.isIncidentCritique());
		ficheIncident.setLieuIncident(ficheIncidentDto.getLieuIncident());
		ficheIncident.setNombreVoyageur(ficheIncidentDto.getNombreVoyageur());
		ficheIncident.setNumeroFiche(ficheIncidentDto.getNumeroFiche());
		ficheIncident.setVehicule(ficheIncidentDto.getVehicule());
		return ficheIncident;
		}
	public static List<FicheIncidentDto> FicheIncidentToFicheIncidentlistDto (List<FicheIncident> ficheIncident) {
		List<FicheIncidentDto>  ficheIncidentDto = new ArrayList<>();
		for (FicheIncident fiche : ficheIncident) {
			ficheIncidentDto.add(FicheIncidentMapper.FicheIncidentToFicheIncidentDto(fiche));
		}
		return ficheIncidentDto;
	}
		}


