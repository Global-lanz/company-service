package lanz.global.companyservice;

import lanz.global.companyservice.api.config.ServiceConfig;
import lanz.global.libraryservice.converter.config.ConverterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(ServiceConfig.class)
@Import(ConverterConfig.class)
public class CompanyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyServiceApplication.class, args);
    }

}
