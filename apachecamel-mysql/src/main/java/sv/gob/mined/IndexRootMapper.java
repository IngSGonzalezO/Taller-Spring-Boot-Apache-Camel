package sv.gob.mined;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Clase que mantiene la configuración para el uso de los EndPoint de la API.
 */
@Configuration
@ComponentScan
public class IndexRootMapper implements WebMvcConfigurer{

	/**
	 * Metodo centrado en realizar la redireccion de ruta.
	 * @param registry Instancia para redirecciones sin tener que crear clases de controlador completas.
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/rest-http-index.html");
	}
	
}
