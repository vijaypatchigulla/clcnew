package com.ctcnew.ctcnew;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controllerCTC {
    @PostMapping("/getflightlist")

    public String paxlistRetrivel(String  request) throws Exception {

        final String uri = "https://jsonplaceholder.typicode.com/comments?postId=1";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);

        return  result;
    }

    @GetMapping("/getflightlist")

    public String paxlistRetrivel1(String  request) throws Exception {

        final String uri = "https://jsonplaceholder.typicode.com/comments?postId=1";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);

        return  result;
    }

}
