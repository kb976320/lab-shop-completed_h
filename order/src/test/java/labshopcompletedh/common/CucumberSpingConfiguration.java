package labshopcompletedh.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopcompletedh.OrderApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
