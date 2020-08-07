package com.example.piggybank.controllers;

import com.example.piggybank.modules.Coin;
import com.example.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinController {
    @Autowired
    CoinRepository coinrepos;

//    endpoint http://localhost:2019/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAllCoins(){
        List<Coin> myList = new ArrayList<>();
        coinrepos.findAll().iterator().forEachRemaining(myList::add);
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
