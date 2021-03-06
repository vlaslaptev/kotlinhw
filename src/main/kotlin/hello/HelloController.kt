package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("main/kotlin/hello")
class HelloController {

    @GetMapping("/string")
    fun helloString() = "Hello string!"

    @GetMapping("/data")
    fun helloData() = Hello("Hello data!")
}
