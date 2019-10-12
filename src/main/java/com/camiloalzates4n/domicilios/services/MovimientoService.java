package com.camiloalzates4n.domicilios.services;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Scanner;

@Service
public class MovimientoService implements IMovimientoService{

    @Override
    public String moveDron() throws FileNotFoundException {

        File file = new File("./src/main/resources/static/in.txt");

        System.out.println("File path:" + file.getPath());

        Scanner readFile = new Scanner(file);

        while(readFile.hasNextLine()) {
            System.out.println("Text Line :" + readFile.nextLine());
        }

        return "Hola Camilo";
    }

}
