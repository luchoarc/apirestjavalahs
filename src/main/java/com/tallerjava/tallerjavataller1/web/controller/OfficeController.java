package com.tallerjava.tallerjavataller1.web.controller;

import com.tallerjava.tallerjavataller1.domain.dto.Office;
import com.tallerjava.tallerjavataller1.domain.service.OfficeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @ApiOperation("Metodo que brinda todos los registros de las Oficinas de Atención al Ciudadano")
    @GetMapping("/alls")
    public List<Office>getAll(){
        return officeService.getAll();
    }

    @ApiOperation("Metodo que brinda la informacion del ID de las Oficinas de Atención al Ciudadano requerida")
    @GetMapping("/{idOf}")
    public Optional<Office> getOffice(@ApiParam(value = "Identificador de cada Oficina", required = true, example = "30") @PathVariable("idOf") Integer officeId){
            return officeService.getOffice(officeId);
    }

}
