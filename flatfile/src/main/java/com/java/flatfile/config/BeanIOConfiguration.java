package com.java.flatfile.config;
import org.beanio.spring.BeanIOFlatFileItemWriter;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class BeanIOConfiguration {

    @Bean
    public ItemWriter<Object> flatFileItemWriter() {
        BeanIOFlatFileItemWriter<Object> writer = new BeanIOFlatFileItemWriter<>();
        writer.setResource(new ClassPathResource("output.txt"));
        writer.setStreamMapping(new ClassPathResource("datainfo.xml"));
        return writer;
    }
}

