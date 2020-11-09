/**
 * 
 */
package br.tec.marco.travelapplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author marcoyf
 *
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("/webjars/")
//                .resourceChain(false);
//        registry.setOrder(1);
//    }

}
