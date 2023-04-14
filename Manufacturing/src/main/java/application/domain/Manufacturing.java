package application.domain;

import application.ManufacturingApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Manufacturing_table")
@Data
public class Manufacturing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static ManufacturingRepository repository() {
        ManufacturingRepository manufacturingRepository = applicationContext()
            .getBean(ManufacturingRepository.class);
        return manufacturingRepository;
    }

    public static ApplicationContext applicationContext() {
        return ManufacturingApplication.applicationContext;
    }
}
