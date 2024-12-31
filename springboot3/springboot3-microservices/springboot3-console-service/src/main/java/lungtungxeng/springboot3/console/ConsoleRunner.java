package lungtungxeng.springboot3.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ConsoleRunner implements CommandLineRunner {
    @Value("${student.name}")
    private String studentName;
    @Value("${student.email}")
    private String studentEmail;


    @Override
    public void run(String... args) throws Exception {
        log.info("========Spring Boot 3x ConsoleRunner=========" + studentName);
        log.info("========studentEmail: " + studentEmail);
    }
}
