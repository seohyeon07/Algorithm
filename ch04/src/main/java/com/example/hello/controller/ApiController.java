package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 class는 REST API 처리하는 Controller라고 등록 하는 것 (@ : 어노테이션 이용)
@RequestMapping("/api") //RequestMapping : URI를 지정해주는 Annotation

public class ApiController {

    //get메소드를 통해 response 내려주기
    @GetMapping("/hello") //http://localhost:8080/api/hello 라고 주소 Mapping.(get방식으로 동작할것이다.) //getMapping으로 주소할당.
    public String hello(){ //문자열 내려줄거라서 String
        return "hello spring boot!";  //위의 해당 주소로 get방식으로 요청 들어오면 hello spring boot!가 리턴.
    }
}
// 오늘의 기억!
//spring 에 controller를 작성하기 위해서 클래스를 만들고 RestController라는 어노테이션@ 붙여줘야함.(작성)
//주소로 할당해 주기 위해서는 RequestMapping 사용해야 한다.
//Get 방식으로 api라는 이름의 API 열어 주기 위해서 GetMapping 사용 - 가로 안에는 주소가 들어가야 한다라고 생각. 다른 옵션값도 있지만 후에 학습.
//API = Application Programming Interface - 서버와 클라이언트의 통신
// URL은 통신하는 주소 (명시적인 위치.주소)
//스타벅스 : localhost:8080
//커피,티,프라프치노 : api
//아메리카노 : hello
//더 내려가면 hot,ice