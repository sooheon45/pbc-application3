package application.domain;

import application.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "manufacturings",
    path = "manufacturings"
)
public interface ManufacturingRepository
    extends PagingAndSortingRepository<Manufacturing, Long> {}
