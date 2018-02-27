/*
 * This code is sample code, provided as-is, and we make NO 
 * warranties as to its correctness or suitability for any purpose.
 * 
 * We hope that it's useful to you. Enjoy. 
 * Copyright LearningPatterns Inc.
 */
 
package com.javatunes.config;


import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatunes.persistence.ItemRepository;
import com.javatunes.service.Catalog;
import com.javatunes.service.CatalogImpl;

// TODO: Declare as a configuration class
@Configuration
public class SpringServicesConfig {
	
	// TODO: Inject the repository
	@Inject
	ItemRepository repository;

	// TODO: Declare the catalog bean definition
	@Bean
	//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Catalog itemCatalog() {
		CatalogImpl ci = new CatalogImpl();
		ci.setItemRepository(repository);
		return ci;
	}

}