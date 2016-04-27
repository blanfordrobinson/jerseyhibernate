package com.euroscripting.assemblers;

import com.euroscripting.dtos.CurrencyDTO;
import com.euroscripting.entities.SxCurrencies;

public class CurrencyAssembler {

	public static CurrencyDTO getDTOFromEntity(SxCurrencies entity) {
		if (entity == null)
			return null;

		CurrencyDTO dto = new CurrencyDTO();
		
		dto.setSxCurrencyId(entity.getSxCurrencyId());
		dto.setSxCurrencyDesc(entity.getSxCurrencyName() + " (" + entity.getSxCurrencySymbol() + ")");
		
		return dto;
		
	}
}
