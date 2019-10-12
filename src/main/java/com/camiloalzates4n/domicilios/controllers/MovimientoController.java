package com.camiloalzates4n.domicilios.controllers;

import com.camiloalzates4n.domicilios.services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class MovimientoController implements IMovimientoController {

    @Autowired
    private MovimientoService movimientoService;


    @RequestMapping("/")
    public String moveDrone() throws FileNotFoundException {
        return movimientoService.moveDron();
    }
}
