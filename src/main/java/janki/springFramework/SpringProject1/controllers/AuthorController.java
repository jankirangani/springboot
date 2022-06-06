package janki.springFramework.SpringProject1.controllers;

import janki.springFramework.SpringProject1.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AuthorController {

    private final AuthorRepository AR;

    public AuthorController(AuthorRepository AR) {
        this.AR = AR;
    }

    public String getauthors(Model model){
        model.addAttribute("authors",AR.findAll());

        return "authors/list";
    }
}
