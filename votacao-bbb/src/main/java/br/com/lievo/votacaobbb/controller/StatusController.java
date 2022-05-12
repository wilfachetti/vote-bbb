package br.com.lievo.votacaobbb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api") mais de um método  
public class StatusController {
    
    //@GetMapping("/status") mais de um método
    @GetMapping("/api/status")
    public ResponseEntity<String> status(){
        return ResponseEntity.ok("online");
    }

}
