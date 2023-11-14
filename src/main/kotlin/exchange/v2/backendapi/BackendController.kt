package exchange.v2.backendapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

data class RequestData(
    val text : String
);

@RestController
@RequestMapping("/backend-test")
class BackendController {

    @PostMapping("/post-data")
    fun postData(@RequestBody request: RequestData): String = "POST Success : " + request.text;

    @GetMapping("/hello")
    fun hello() : String {
        val current = LocalDateTime.now()
        return "HelloWorld : "+ current.toString();
    }




}
