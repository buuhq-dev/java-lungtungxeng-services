package lungtungxeng.springboot3.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r
                        .path("/image/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://springboot3-image-service"))

                .route(r -> r
                        .path("/gallery/**")
                        .filters(f -> f.stripPrefix(1))
//                        .filters(f -> f.requestRateLimiter(c -> c.setRateLimiter(redisRateLimiter()).setStatusCode(HttpStatus.TOO_MANY_REQUESTS)))
                        .uri("lb://springboot3-gallery-service/"))
                .build();
    }
}
*/