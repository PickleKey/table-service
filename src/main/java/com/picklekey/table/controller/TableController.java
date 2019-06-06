package com.picklekey.table.controller;

import com.picklekey.table.model.Table;
import com.picklekey.table.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/table")
public class TableController {

    @Autowired
    TableRepository tableRepository;

    @GetMapping("/list")
    public List<Table> getAllTables() {

        System.out.println("controller getting tableList");
        List<Table> tableList = tableRepository.findAll();

        return tableList;
    }

    @PostMapping("/reserveTable")
    public String reserveTable(@RequestParam("table_num") int num) {

        Table table = new Table(num);

        // get inventory from service
        System.out.println("Add to tabel_reserve");
        tableRepository.save(table);

        return "saved to database";
    }


}
