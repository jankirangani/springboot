package janki.springFramework.SpringProject1.controllers;

import janki.springFramework.SpringProject1.repositories.PublisherRepository;
import janki.springFramework.SpringProject1.repositories.bookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bookController {

    private final bookRepository bookRepository;

    public bookController(bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books/")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }
}
