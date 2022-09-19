package br.com.start.conf;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfigurations {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
		}
}

