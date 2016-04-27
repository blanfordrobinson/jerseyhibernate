package com.euroscripting.common;

import com.sun.jersey.api.wadl.config.WadlGeneratorConfig;
import com.sun.jersey.api.wadl.config.WadlGeneratorDescription;
import com.sun.jersey.server.wadl.generators.WadlGeneratorJAXBGrammarGenerator;

import java.util.List;

/**
 * 
 *
 * This class will cause Jersey (version 1.9+)  to associate an xsd with the generated WADL.
 * The XSD is created based on the JAXB annotated DTOs.
 *
 * For more information:
 * http://kingsfleet.blogspot.com/2011/07/automatic-xml-shema-generation-for.hmtl
 */
public class SchemaGenConfig extends WadlGeneratorConfig {

	/* (non-Javadoc)
	 * @see com.sun.jersey.api.wadl.config.WadlGeneratorConfig#configure()
	 */
	@Override
	public List<WadlGeneratorDescription> configure() {
		
			return generator(WadlGeneratorJAXBGrammarGenerator.class).descriptions();
		
	}

}

