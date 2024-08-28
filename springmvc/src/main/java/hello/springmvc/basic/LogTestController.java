package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 개발 서버는 debug 부터
 * 운영 서버는 info 부터 log 출력
 */
@RestController
//@Slf4j
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass()); // @Slf4j 사용시 생략 가능

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        //로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행됨, 이런 방식 X
        log.debug("String concat log=" + name);
        return "ok";
    }
}
