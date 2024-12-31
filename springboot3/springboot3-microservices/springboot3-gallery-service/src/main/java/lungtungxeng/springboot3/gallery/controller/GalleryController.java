package lungtungxeng.springboot3.gallery.controller;

import lungtungxeng.springboot3.gallery.entities.Gallery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GalleryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GalleryController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/gall")
    public Gallery getGallery() {
        LOGGER.info("Creating gallery object ... ");

        // create gallery object
        Gallery gallery = new Gallery();
//        gallery.setId(id);
        gallery.setId(100);

        // get list of available images
        // @SuppressWarnings("unchecked")    // we'll throw an exception from image service to simulate a failure
//        List<Object> images = restTemplate.getForObject("http://spring-image-service:8082/images/", List.class);
        List<Object> images = restTemplate.getForObject("http://springboot3-image-service/images", List.class);
        gallery.setImages(images);

        return gallery;
    }
}
