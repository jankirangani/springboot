package janki.springFramework.SpringProject1.repositories;

import janki.springFramework.SpringProject1.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
