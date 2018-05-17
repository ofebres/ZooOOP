package com.company.Modules;

import com.company.Interfaces.IAnimal;
import com.company.Interfaces.IPen;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zookeeper {

    public Zookeeper(){}

    public Zookeeper( String name , List<Pen> pen1 , List<Object> pen2){
        this.Name = name;
        this.ResponsibleForO1 = pen1;
        this.ResponsibleForO2 = pen2;
    }

    String Name;

    List<Object> ResponsibleForO1;
    List<Pen> ResponsibleForO2;



    public void PrintAllData() {
        System.out.println();
    }

}
