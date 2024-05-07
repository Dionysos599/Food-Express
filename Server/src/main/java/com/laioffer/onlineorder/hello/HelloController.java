package com.laioffer.onlineorder.hello;

import net.datafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HelloController {

    // Redirect to /hello
//    @GetMapping("/")
//    public RedirectView redirectToHello() {
//        return new RedirectView("/hello");
//    }

    @GetMapping("/hello")
    public Person sayHello(@RequestParam(required = false) String name) {
        Faker faker = new Faker();
        if (name == null) {
            name = "Guest";
        } else {
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();

        return new Person(name, company, new Address(street, city, state, null), new Book(bookTitle, bookAuthor));
    }

    @GetMapping("/bye")
    public String sayGoodbye() {
        return "Goodbye World!";
    }
}
