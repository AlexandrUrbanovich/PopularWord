package ru.mail.urbanovichalexandr.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.mail.urbanovichalexandr.services.ShowWord;

import java.util.List;


@Controller
@RequestMapping("/words")
public class WordController {

    private ShowWord showWord;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public @ResponseBody
    List<String> getWord(){
        return getWord();
    }

}
