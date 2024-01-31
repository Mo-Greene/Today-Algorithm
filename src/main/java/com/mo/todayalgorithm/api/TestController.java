package com.mo.todayalgorithm.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.mo.todayalgorithm.api
 * fileName       : TestController
 * author         : Jang Hyun Suk
 * date           : 2024-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-31      Jang Hyun Suk       최초 생성
 */
@RestController
public class TestController {

    @GetMapping("")
    public String versionCheck() {
        return "Jenkins Test : Version 0.0.5";
    }
}
