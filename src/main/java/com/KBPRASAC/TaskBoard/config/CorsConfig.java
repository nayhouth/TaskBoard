package com.KBPRASAC.TaskBoard.config;

import com.corebackend.service.CoreSysConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    private final CoreSysConfigService coreSysConfigService;

    public CorsConfig(CoreSysConfigService coreSysConfigService) {
        this.coreSysConfigService = coreSysConfigService;
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {

                String allowedOrigins =
                        coreSysConfigService.getConfigValue(
                                "CORS",
                                "ALLOWED_ORIGINS"
                        );

                if (allowedOrigins == null
                        || allowedOrigins.isBlank()) {
                    return;
                }

                String[] origins = Arrays.stream(
                                allowedOrigins
                                        .replace("[", "")
                                        .replace("]", "")
                                        .replace("\"", "")
                                        .split(",")
                        )
                        .map(String::trim)
                        .filter(origin -> !origin.isBlank())
                        .toArray(String[]::new);

                registry.addMapping("/**")
                        .allowedOrigins(origins)
                        .allowedMethods(
                                "GET",
                                "POST",
                                "PUT",
                                "DELETE",
                                "PATCH",
                                "OPTIONS"
                        )
                        .allowedHeaders("*");
            }
        };
    }
}