package com.tallerjava.tallerjavataller1.web.controller;

import com.tallerjava.tallerjavataller1.domain.dto.Office;
import com.tallerjava.tallerjavataller1.domain.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/offices")
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    @GetMapping("/alls")
    public List<Office>getAll(){
        return officeService.getAll();
    }
    @GetMapping("/{idOf}")
    public Optional<Office> getOffice(@PathVariable("idOf") Integer officeId){
            return officeService.getOffice(officeId);
    }

}
