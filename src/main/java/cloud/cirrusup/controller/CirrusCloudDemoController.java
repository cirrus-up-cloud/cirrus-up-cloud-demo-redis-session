package cloud.cirrusup.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@Configuration
@ImportResource(locations = "classpath:spring-config/applicationContext.xml")
@PropertySource("classpath:properties/config-${spring.profiles.active}.properties")
public class CirrusCloudDemoController {

    private static final Logger LOG = LoggerFactory.getLogger(CirrusCloudDemoController.class);

    @GetMapping("/get")
    public ResponseEntity<String> get(HttpSession session) {

        LOG.info("GET /get request.");
        return ResponseEntity.ok("OK");
    }
}
