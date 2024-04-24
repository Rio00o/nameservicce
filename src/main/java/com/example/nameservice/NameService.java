package com.example.nameservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService {

    private final NameMapper nameMapper;

    public NameService(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    public List<Name> findNamesStartingWith(String prefix) {
        return nameMapper.findByNameStartingWith(prefix);
    }


    public Name findName(int id) {
        return nameMapper.findById(id).get();
    }

}
