package ProductApiService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;

@SpringBootApplication
@EnableDiscoveryClient
@EnableOAuth2Resource
public class ProductApiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApiServiceApplication.class, args);
    }
}
