package org.ici.facades;

import org.ici.assemblers.CurrencyAssembler;
import org.ici.daos.CurrencyDAO;
import org.ici.dtos.CurrencyDTO;
import org.ici.entities.SxCurrencies;

import java.util.ArrayList;
import java.util.List;

public class CurrencyFacade {

	public List<CurrencyDTO> getAll() {
		
		CurrencyDAO dao = new CurrencyDAO();
		List<CurrencyDTO> dtoList = new ArrayList<CurrencyDTO>();
		CurrencyDTO dto = null;
		
		List<SxCurrencies> entityList = dao.getAll();
		
		if(!entityList.isEmpty()){
			for(SxCurrencies entity : entityList){
				dto = CurrencyAssembler.getDTOFromEntity(entity);
				dtoList.add(dto);
			}
		}
		
		return dtoList;
		
		
	}
			
}
