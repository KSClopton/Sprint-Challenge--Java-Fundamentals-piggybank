package com.example.piggybank.repositories;

import com.example.piggybank.modules.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long> {
}
