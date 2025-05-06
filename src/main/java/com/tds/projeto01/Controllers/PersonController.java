package com.tds.projeto01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    String newPerson() {
        return "<html>" +
                "<h2>Olá</h2>" +
                "<p>Meu nome é João</p>" +
                "<span>Tenho 22 Anos</span>" +
                "</html>";
    }
}
