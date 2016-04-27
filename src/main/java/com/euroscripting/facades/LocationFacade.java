package com.euroscripting.facades;

import com.euroscripting.assemblers.LocationAssembler;
import com.euroscripting.daos.LocationDAO;
import com.euroscripting.dtos.LocationDTO;
import com.euroscripting.entities.SxCities;

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
