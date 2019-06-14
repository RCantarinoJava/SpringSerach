package com.cantarino.casa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cantarino.casa.Domain.Propriedade;
import com.cantarino.casa.Repository.PropridadeRepository;

@RestController
@RequestMapping("/api")
public class PropriedadeController {

	
	@Autowired
	private PropridadeRepository repository;
	
	
	@RequestMapping(value="/find/{filtro}" , method = RequestMethod.GET)
	List<Propriedade> findByFilter(@PathVariable("filtro") String filter)
	{
		return repository.findByFilter(filter);
		
	}
	
	
	
}
