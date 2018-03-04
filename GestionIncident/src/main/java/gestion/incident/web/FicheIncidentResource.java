package gestion.incident.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import gestion.incident.service.FicheincidentService;
import gestion.incident.service.dto.FicheIncidentDto;

@RestController
@RequestMapping("/api")
public class FicheIncidentResource {

	private final FicheincidentService ficheIncidentService;
	
	@Autowired
	public FicheIncidentResource(FicheincidentService ficheIncidentService) {
		this.ficheIncidentService = ficheIncidentService;
	}
	
	@RequestMapping(value = "/fiches/{NumeroFiche}", method =RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody FicheIncidentDto getFicheIncidentId(@PathVariable String NumeroFiche) {
		FicheIncidentDto ficheIncidentDTO =this.ficheIncidentService.getFicheincidentParNumFiche(NumeroFiche);
	return ficheIncidentDTO;
	}
	@CrossOrigin
	@RequestMapping(value = "/fiches", method =RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody List<FicheIncidentDto> getFicheIncidents() {
		List<FicheIncidentDto> ficheIncidentDTO =this.ficheIncidentService.getTousLesFiches();
		System.out.println(ficheIncidentDTO);
		return ficheIncidentDTO;
	}
	@CrossOrigin
	@RequestMapping(value = "/fiches/voiture/{id}", method =RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody FicheIncidentDto getFicheincidentParImmat(@PathVariable long id) {
		FicheIncidentDto ficheIncidentDTO =this.ficheIncidentService.getFicheincidentParImmat(id);
	return ficheIncidentDTO;
	}
	@CrossOrigin
	@RequestMapping(value = "/fiches", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody FicheIncidentDto creerFicheIncident(@RequestBody FicheIncidentDto ficheIncidentfv) {
	     ficheIncidentService.creerFicheincident(ficheIncidentfv);
		System.out.println("# Ficheincident créé: " );
		return ficheIncidentfv;
	}
	@CrossOrigin
	@RequestMapping(value = "/fiches/{NumeroFiche}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody void supprimeeFicheIncident(@PathVariable String NumeroFiche ) {
		ficheIncidentService.SupprimerFicheincident(NumeroFiche);
		
	}
	@CrossOrigin
	@RequestMapping(value = "/fiches", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody FicheIncidentDto modifiereFicheIncident(@RequestBody FicheIncidentDto ficheIncidentfv) {
	     ficheIncidentService.ModifierFicheincident(ficheIncidentfv);
		System.out.println("# Ficheincident modifiee: " );
		return ficheIncidentfv;
	}
}

