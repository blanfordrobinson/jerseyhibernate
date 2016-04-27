package org.ici.assemblers;

import org.ici.dtos.CurrencyDTO;
import org.ici.entities.SxCurrencies;

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
