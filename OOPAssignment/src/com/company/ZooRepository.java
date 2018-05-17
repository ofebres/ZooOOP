package com.company;

import com.company.Interfaces.IAnimal;
import com.company.Interfaces.IPen;
import com.company.Modules.Animal;
import com.company.Modules.Pen;
import com.company.Modules.Zookeeper;
import com.company.Pens.*;

import java.util.Arrays;
import java.util.List;

public class ZooRepository {


    public void MockData()
    {
        //Animal Lists

        var ani1 = new Animal("bat" , IAnimal._animalType.mammal );
        var ani2 = new Animal("snake", IAnimal._animalType.reptile);
        List<Animal> animalList = Arrays.asList( ani1 , ani2);
        //Pens
        var DryPen = new DryPen("Dry" , animalList);
        var AquariumPen = new AquariumPen("Aquarium", animalList);
        var MixedPen = new MixedPen("Mixed" , animalList);
        var AviaryPen = new AviaryPen("Aviary", animalList);
        var PettingPen = new PettingPen("Petting" , animalList);

        //Zoo Keepers
        var zk1 = new Zookeeper("Hardip" , DryPen , AviaryPen);
        var zk2 = new Zookeeper( "Alex" , AquariumPen , MixedPen);
        var zk3 = new Zookeeper("Farhad" , AviaryPen , AquariumPen);
        var zk4 = new Zookeeper( "Alan" , DryPen , PettingPen);
    }
}
