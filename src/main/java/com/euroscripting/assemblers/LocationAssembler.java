package com.euroscripting.assemblers;

import com.euroscripting.dtos.LocationDTO;
import com.euroscripting.entities.SxCities;

public class LocationAssembler {

	public static LocationDTO getDTOFromEntity(SxCities entity) {
		if (entity == null)
			return null;

		LocationDTO dto = new LocationDTO();
		
		dto.setSxCityId(entity.getSxCityId());
		dto.setLocationDesc(
				entity.getSxRegions().getSxCountries().getSxCountryName() + " - " +
				entity.getSxRegions().getSxRegionName() + " - " +
				entity.getSxCityName()
		);
		
		return dto;
		
	}
	
}
