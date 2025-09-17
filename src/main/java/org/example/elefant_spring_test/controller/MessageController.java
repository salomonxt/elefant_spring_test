package org.example.elefant_spring_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//aufgabe

@RestController


public class MessageController {

    @GetMapping("/api/messages")
    public List<Message> getMessages() {
       return Arrays.asList
               (
                new Message("1", "Johner Doors", "DoorsID"),
                new Message("2", "Janest Dorry", "JaneID")
               );
    }


    private final List<Message> messages = new ArrayList<>();

    @PostMapping("/api/messages")
    public Message createMessage(@RequestBody Message message) {
        messages.add(message);
        return message;
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