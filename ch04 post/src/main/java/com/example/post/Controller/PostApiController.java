package com.example.post.Controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

//    @PostMapping("/post")
//    public void post(@RequestBody Map<String,Object> requestData){
//        requestData.forEach((key, value) -> {
//            System.out.println("key : " + key);
//            System.out.println("value : " + value);
//        });
//    }
    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
        System.out.println(requestData);

    }
}

//정리
//RequestBody 어노테이션을 통해 Json 데이터를 파싱 할 수 있다.
//이를 위해 데이터 클래스 즉, 객체를 정의해야 함. - 기본은 camel case
//snake case 에는 파싱이 안되기 때문에 @JsonProperty를 통해 특정 변수(이름)에 할당시켜줘야 함.
//다른 다양한 방법도 있음.

//PathVariable 은 GET방식과 동일
//JsonNaming: 일괄적으로 클래스에 설정가능(camel, snake..)  Response 학습할때 배울 것.
