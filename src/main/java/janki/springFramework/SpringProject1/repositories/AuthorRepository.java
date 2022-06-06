package janki.springFramework.SpringProject1.repositories;

import janki.springFramework.SpringProject1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
