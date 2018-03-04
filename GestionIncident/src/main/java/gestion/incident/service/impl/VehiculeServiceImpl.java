package gestion.incident.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import gestion.incident.service.VehiculeService;
import gestion.incident.service.dto.VehiculeDto;
import gestion.incident.service.mapper.VehiculeMapper;
import jpa.vehicule.dao.Vehicule;
import jpa.vehicule.dao.VehiculeDao;
import jpa.vehicule.dao.VehiculeDaoFactory;
/**
* Classe Service pour gérer les véhicules.
*/
@Service
public class VehiculeServiceImpl implements VehiculeService {
public VehiculeServiceImpl() {
}
@Override
public void creerVehicule(VehiculeDto vehiculeDto) {
// Récupérer une instance de la DAO
VehiculeDao vehiculeDao =VehiculeDaoFactory.getVehiculeDao(VehiculeDaoFactory.JPA_DAO);
// Convertir le DTO VehiculeDto en entité Vehicule pour lepasser à la DAO
Vehicule vehicule =VehiculeMapper.vehiculeDtoToVehicule(vehiculeDto);
// Appeler la méthode de la DAO pour créer l'entité Vehicule
vehiculeDao.insererVehicule(vehicule);
}
@Override
public VehiculeDto getVehiculeParImmatriculation(String
immatriculation) {
// Récupérer une instance de la DAO
VehiculeDao vehiculeDao =VehiculeDaoFactory.getVehiculeDao(VehiculeDaoFactory.JPA_DAO);
// Appeler la méthode de la DAO pour chercher le véhicule parimmatriculation
Vehicule vehicule =vehiculeDao.rechercherVehiculeParImmatriculation(immatriculation);
// Convertir l'entité Vehicule récupérer en DTO VehiculeDto
VehiculeDto vehiculeDto =VehiculeMapper.vehiculeToVehiculeDto(vehicule);
// Retourner le Dto
return vehiculeDto;
}
@Override
public List<VehiculeDto> getTousLesVehicules() {
	VehiculeDao vehiculeDao =VehiculeDaoFactory.getVehiculeDao(VehiculeDaoFactory.JPA_DAO);
	// Appeler la méthode de la DAO pour chercher le véhicule parimmatriculation
	List<Vehicule> vehicule =vehiculeDao.rechercherTousLesVehicules();
	// Convertir l'entité Vehicule récupérer en DTO VehiculeDto
	List<VehiculeDto> vehiculeDTOs =VehiculeMapper.VehiculeToVehiculelistDto(vehicule);
	// Retourner le Dto
	return vehiculeDTOs;
}
}