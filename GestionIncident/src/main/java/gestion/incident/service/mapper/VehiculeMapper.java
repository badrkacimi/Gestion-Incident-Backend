package gestion.incident.service.mapper;
import java.util.ArrayList;
import java.util.List;

import gestion.incident.service.dto.VehiculeDto;
import jpa.vehicule.dao.Vehicule;
/**
* Mapper pour la conversion entre l'entité Vehicule et son DTO
VehiculeDto.
*/
public class VehiculeMapper {
public static VehiculeDto vehiculeToVehiculeDto(Vehicule vehicule)
{
VehiculeDto vehiculeDto = new VehiculeDto();
vehiculeDto.setCodeInterne(vehicule.getCodeInterne());
vehiculeDto.setImmatriculation(vehicule.getImmatriculation());
return vehiculeDto;
}
public static Vehicule vehiculeDtoToVehicule(VehiculeDto vehiculeDto) {
	Vehicule vehicule = new Vehicule();
	vehicule.setCodeInterne(vehiculeDto.getCodeInterne());
	vehicule.setImmatriculation(vehiculeDto.getImmatriculation());
	return vehicule;
	}
public static List<VehiculeDto> VehiculeToVehiculelistDto (List<Vehicule> Vehicule) {
	List<VehiculeDto>  VehiculeDto = new ArrayList<>();
	for (Vehicule vehicule : Vehicule) {
		VehiculeDto.add(VehiculeMapper.vehiculeToVehiculeDto(vehicule));
	}
	return VehiculeDto;
}
	}