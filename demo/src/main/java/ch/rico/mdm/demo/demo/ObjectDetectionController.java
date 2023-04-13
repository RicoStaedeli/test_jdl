package ch.rico.mdm.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectDetectionController {

    private ObjectDetection detection = new ObjectDetection();

    @GetMapping("/object")
    public String predict() throws Exception {
        detection.predict();
        return "Running";
    }
}
