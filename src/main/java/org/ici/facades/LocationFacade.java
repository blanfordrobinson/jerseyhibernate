package org.ici.facades;

import org.ici.assemblers.LocationAssembler;
import org.ici.daos.LocationDAO;
import org.ici.dtos.LocationDTO;
import org.ici.entities.SxCities;

import java.util.ArrayList;
import java.util.List;

public class LocationFacade {

	public List<LocationDTO> getAll() {
		
		LocationDAO dao = new LocationDAO();
		List<LocationDTO> dtoList = new ArrayList<LocationDTO>();
		LocationDTO dto = null;
		
		List<SxCities> entityList = dao.getAll();
		
		if(!entityList.isEmpty()){
			for(SxCities entity : entityList){
				dto = LocationAssembler.getDTOFromEntity(entity);
				dtoList.add(dto);
			}
		}
		
		return dtoList;
		
		
	}
			
}
