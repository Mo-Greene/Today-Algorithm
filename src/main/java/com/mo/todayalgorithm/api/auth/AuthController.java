package com.mo.todayalgorithm.api.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@Slf4j
@RestController
public class AuthController {

    @GetMapping("/login/oauth2/code/github")
    public ResponseEntity<?> authLogin(@RequestParam String code,
                                       @RequestParam String state) {

        log.info("code : {}", code);
        log.info("state : {}", state);

        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }
}
