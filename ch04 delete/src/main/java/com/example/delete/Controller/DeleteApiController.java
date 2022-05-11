package com.example.delete.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);


        //delete 자체가 -> 리소스 삭제 //이미 리소스가 없는 상태여도 200 ok (멱등성)

        //delete는 요청하는 값 자체가 작고 제한적이기 때문 따로 dto를 만들어서 받는 것 보다는
        // pathVariable 이나 queryparametar 을 일일이 지정해서 받는  권장.
    }
}