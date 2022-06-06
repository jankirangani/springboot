package janki.springFramework.SpringProject1.repositories;
import janki.springFramework.SpringProject1.domain.book;
import org.springframework.data.repository.CrudRepository;

public interface bookRepository extends CrudRepository<book,Long> {
}
