package application.common;

import application.ManufacturingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ManufacturingApplication.class })
public class CucumberSpingConfiguration {}
