package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name="userId") Long id){ //RequestBody로 어노테이션!
        //System.out.println(requestDto);
        System.out.println(id);
        return requestDto; //@RestController 인 경우에는 object 자체를 리턴 시키면
                           //springboot 자체에 이 object를 가지고 또 object mapper를 통해 Json 으로 바꿔줌.
    }
}
