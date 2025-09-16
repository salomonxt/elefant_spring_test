package org.example.elefant_spring_test.controller;
import org.example.elefant_spring_test.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController //controller fuer alles mögliche
@RequestMapping("/api/hello") //da ist er und wartet auf anfragen
public class HelloController {

    //wenn ich was vom server holen möchte nimm @GetMapping - ist einzigartig
    @GetMapping //für GET Request
        public String sayHallo() {
            return "Hallo Welt!";
        }


        @PostMapping
            public String printValue(@RequestBody Student value) { //student ist im body der anfrage
                return "Hallo "+value.firstName()+" "+value.lastName();


        }


}

