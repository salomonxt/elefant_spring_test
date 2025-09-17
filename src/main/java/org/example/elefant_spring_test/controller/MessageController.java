package org.example.elefant_spring_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//aufgabe

@RestController
public class MessageController {

    @GetMapping("/api/messages")
    public List<Message> getMessages() {
       return Arrays.asList(
                new Message("1", "Johner Doooooooe", "meineID"),
                new Message("2", "Jane Dooo", "meine ID2")
        );
    }
}











//oh, habs doppelt

//    @PostMapping
//    public String printValue (@RequestBody Student value) {
//        return "Hallo, " +value.firstName()+ " " +value.lastName() +"!";

/*
        //postmapping für POST-Request
        @PostMapping
            public String printValue(@RequestBody Student value) { //@R..Body= Student ist im body der anfrage
                return "Hallo "+value.firstName()+" "+value.lastName();

        }

        @GetMapping("/{id}") // " {id} " ist Pfadparameter der in Anfrage kommt kam ub /user/123,dann ist es "123"
        public String printValue(@PathVariable String id){ //PathVariable zum extrahieren d. Werte von id
            return "Hi your ID is: " +id;

        }

        @GetMapping("/search")
        public String printquery(@RequestParam String query) { //RequestParam=Sagt, Zeug kommt von außen
            return "Deine Anfrage ist: " +query;

        }


}

*/