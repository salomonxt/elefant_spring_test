package org.example.elefant_spring_test.controller;
import org.example.elefant_spring_test.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController //controller fuer alles mögliche
@RequestMapping("/api/hello") //da ist er und wartet auf anfragen
public class HelloController {

    //wenn ich was vom server holen möchte : @GetMapping - ABER nur 1x, ist einzigartig
    @GetMapping //für GET Request
        public String sayHallo() {
            return "Hallo Welt!";
        }

        //postmapping für POST-Request
        @PostMapping
            public String printValue(@RequestBody Student value) { //@R..Body= Student ist im body der anfrage
                return "Hallo "+value.firstName()+" "+value.lastName();

        }

        @GetMapping("/{id}") // " {id} " ist Pfadparameter der in Anfrage kommt kam ub /user/123,dann ist es "123"
        public String printValue(@PathVariable String id){ //PathVariable zum extrahieren d. Werte von id
            return "Hi your ID is: " +id;

        }

        @GetMapping("api/search")
        public String printquery(@RequestParam String query) { //RequestParam=Sagt, Zeug kommt von außen
            return "Deine Anfrage ist: " +query;


        }

}