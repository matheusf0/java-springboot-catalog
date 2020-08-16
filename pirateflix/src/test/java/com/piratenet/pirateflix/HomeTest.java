package com.piratenet.pirateflix;

import com.piratenet.pirateflix.controller.HomeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import java.util.Optional;


@SpringBootTest
public class HomeTest {
    @Test
    public void homeTest() {
        Assertions.assertEquals(ResponseEntity.of(Optional.of("Hello")).getBody(), new HomeController().homeTest().getBody());
    }
}
