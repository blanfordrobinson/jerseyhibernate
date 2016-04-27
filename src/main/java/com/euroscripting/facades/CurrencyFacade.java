package com.euroscripting.facades;

import com.euroscripting.assemblers.CurrencyAssembler;
import com.euroscripting.daos.CurrencyDAO;
import com.euroscripting.dtos.CurrencyDTO;
import com.euroscripting.entities.SxCurrencies;

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
