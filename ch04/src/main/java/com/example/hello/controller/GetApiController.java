package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //명시적으로 지정해줌.(path="") //(/hello) => default로 넣으면 가로 안에가 value값으로 지정되면서 path로 동작함.
    //http:localhost8080/api/get/hello
    public String Hello() {
        return "get hello";
    }

    //@RequestMapping("/hi") // get/ post/ put/ delete 모든 메소드가 동작하게 된다.  //get 메소드만 원한다면 명시적으로 지정 해야한다. 아래 라인 참
    @RequestMapping(path = "/hi", method = RequestMethod.GET) //http:localhost:8080/api/get/hi
    // 옛날에 쓰던 방식 요즘에는 GetMapping 이용
    public String hi() {
        return "hi";
    }

    //http:localhost:8080/api/get/path-variable/{name}  //(name=)변화하는 값을 받을 것이다. java,swift,..
    // 주소에 대문자 사용x, 가독성을 위해 - 사용
    @GetMapping("/path-variable/{id}") //{변화하는 값} 메소드의 변수 이름(=String id)과 {id}동일 해야 함!! 아니면 지정해주는 방법!
    public String pathVariable(@PathVariable(name = "id") String kk) { //변수명이 다른 코드. kk라고 변수명을 지정하면, name="getMapping에 작성한 {}변수명" 라고 지정.
        System.out.println("PathVariable : " + kk);
        return kk;
    }
//    public String pathVariable(@PathVariable String id){ // 동일하게 작성한 코드.
//        System.out.println("PathVariable : "+id);
//        return id;
//    }

    //Query Parameter
    // search?q = intellij
    // &oq = int
    // &aqs = chrome.2.69i57j0i433i512j69i59j46i199i433i465i512j0i433i512l2j0i131i433i512j0i433i512j0i131i433i512j46i512.2108j0j15
    // &sourceid = chrome
    // &ie = UTF-8
    // ?로 시작. 검색을 할 때 여러가지 매개변수 인자.
    // key = value로 이뤄져 있고 연결해주기 위해 &연산자가 필요
    // ?ket=value&key2=value2...

    //http://localhost::8080/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) { // @RequestParam 설정후 작성  //Map으로 받으면 뭐가 들어올지 모름 모든 키 받을 수 있다. 하지만 코딩할때 불편한 점 발생. queryParam.get("name")..등 하나씩 다 지정해야 함.
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(  //명시적으로 변수로 받기 - 변수 앞에 어노테이션 붙여주기.  => 문제점 : 변수가 많아지면 계속 명시적으로 작성하기에는 많다. - 해결: DTO 형태로 맵팽(협업에서 가장 많이 사용, 추천!)
                                 @RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " " + email + " " + age;
    }


    //?user=steve&email=steve@gmail.com&age=30
    //파라미터로 객체가 들어오면 쿼리파라미터에 들어있는 주소들(즉, ?뒤에 있는 값)을 springboot에서 판단 - 해당객체에서 이름 매칭을 함.
    @GetMapping("/query-param03")
    public String queryParam03(UserRequest userRequest) {  //!주의!! requestparam 어노테이션 붙이지 않는다.
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
