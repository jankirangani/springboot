package janki.springFramework.SpringProject1.Bootstrap;

import janki.springFramework.SpringProject1.domain.Author;
import janki.springFramework.SpringProject1.domain.Publisher;
import janki.springFramework.SpringProject1.domain.book;
import janki.springFramework.SpringProject1.repositories.AuthorRepository;
import janki.springFramework.SpringProject1.repositories.PublisherRepository;
import janki.springFramework.SpringProject1.repositories.bookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private final AuthorRepository AR;
    private final bookRepository BR;
    private final PublisherRepository PR;

    public Bootstrap(AuthorRepository AR, bookRepository BR,PublisherRepository PR) {
        this.AR = AR;
        this.BR = BR;
        this.PR = PR;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher=new Publisher();
        publisher.setName("abhinandan publishing");
        publisher.setAddLine1("33, baroda,");
        publisher.setCity("surat");
        publisher.setState("gujarat");
        publisher.setZip("989809");

        PR.save(publisher);

        Author chetan = new Author("Chetan","Bhagat");
        book HG = new book("HalfGirlfriend","123123");
        chetan.getBooks().add(HG);
        HG.getAuthors().add(chetan);
        HG.setPublisher(publisher);
        publisher.getBooks().add(HG);

        AR.save(chetan);
        BR.save(HG);
        PR.save(publisher);

        Author jules = new Author("Jules","Verne");
        book journey = new book("Journey to the center of the earth","121212");
        jules.getBooks().add(journey);
        journey.getAuthors().add(jules);
        journey.setPublisher(publisher);
        publisher.getBooks().add(journey);

        AR.save(jules);
        BR.save(journey);
        PR.save(publisher);

        System.out.println("this is bootstrap file.");
        System.out.println("No. of books: "+ BR.count());
        System.out.println("No of books of publishers:"+publisher.getBooks().size());


    }
}
