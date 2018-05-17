package com.company.Pens;

import com.company.Modules.Animal;
import com.company.Modules.Pen;

import java.util.List;



public class AquariumPen extends Pen {

    String Name = "";
    int Length;
    int Width;
    int temp;
    int Volume;
    List<Animal> AquariumList;
    int height;


    public AquariumPen(String Name, List<Animal> animalList) {
        super(Name, animalList);


    }
}