package com.cantarino.casa.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cantarino.casa.Domain.Propriedade;


@Repository
@EnableJpaRepositories
public interface PropridadeRepository extends
PagingAndSortingRepository<Propriedade, String>{

	@Query("Select c from Propriedade c where c.nome like %:filtro% order by categoria,subcategoria,nome")
	public List<Propriedade> findByFilter(@Param("filtro") String filtro);
		
	
	
	
	
	
}
