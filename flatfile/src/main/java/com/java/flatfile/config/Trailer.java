package com.java.flatfile.config;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record
public class Trailer {
	
    @Field(length = 1, literal = "T")
    private String recordType;

	@Field(length = 15, at =14,  literal = "FLAT_FILE")
    private String fileType;

    // Other trailer fields
}
