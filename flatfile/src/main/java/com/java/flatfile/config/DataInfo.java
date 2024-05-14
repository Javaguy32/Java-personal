package com.java.flatfile.config;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

import lombok.Data;

@Record
@Data
public class DataInfo {

	@Field(length = 14, at = 20, keepPadding = true, literal = "D")
	String reference_no;

	@Field(length = 16, at = 40, keepPadding = true, literal = "D")
	String amount;
}