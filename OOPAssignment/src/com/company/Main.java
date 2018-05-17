package com.company;

import com.company.Interfaces.IAnimal;
import com.company.Interfaces.IPen;
import com.company.Modules.Animal;
import com.company.Modules.Pen;
import com.company.Modules.Zookeeper;
import com.company.Pens.AquariumPen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var ani1 = new Animal("bat" , IAnimal._animalType.mammal );
        var ani2 = new Animal("snake", IAnimal._animalType.reptile);
        List<Animal> animalList = Arrays.asList( ani1 , ani2);

       var test = new AquariumPen( " aquariumPen" , animalList);
        var zoo = new ZooRepository();
        zoo.MockData();

        test.WhatsInPen();
    }
}
