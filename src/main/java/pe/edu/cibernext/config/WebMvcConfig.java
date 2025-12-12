package pe.edu.cibernext.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;
import org.springframework.http.CacheControl;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Mapea /imagenes/** a classpath:/static/imagenes/
        registry.addResourceHandler("/imagenes/**")
                .addResourceLocations("classpath:/static/imagenes/")
                .setCacheControl(CacheControl.maxAge(7, TimeUnit.DAYS));

        // También aseguramos documentos si los necesitas
        registry.addResourceHandler("/documentos/**")
                .addResourceLocations("classpath:/static/documentos/")
                .setCacheControl(CacheControl.noCache());
    }
}

