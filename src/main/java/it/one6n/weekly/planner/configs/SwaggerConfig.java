package it.one6n.weekly.planner.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Value("${app.name}")
	private String appName;
	@Value("${app.version}")
	private String appVersion;
	@Value("${app.description}")
	private String appDescription;

	@Value("${springdoc.custom.contact.name}")
	private String contactName;
	@Value("${springdoc.custom.contact.url}")
	private String contactUrl;

	@Bean
	OpenAPI springShopOpenAPI() {
		Contact contact = new Contact();
		contact.setName(contactName);
		contact.setUrl(contactUrl);

		return new OpenAPI()
				.info(new Info().title(appName).contact(contact).description(appDescription).version(appVersion));
	}
}
