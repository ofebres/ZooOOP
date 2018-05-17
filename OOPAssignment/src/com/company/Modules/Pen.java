package com.company.Modules;
import com.company.Interfaces.IPen;

import java.util.List;

public abstract class Pen implements IPen
{
      String Name;
      List<Animal> AnimalsInPen;

    public Pen(String Name , List<Animal> animalList) {
        this.Name = Name;
        this.AnimalsInPen = animalList;

    }

    //public void CalculateAreasq();

    public void CalculateArea() {}

    public void WhatsInPen() {
        System.out.println(Name + " contains: ");
        for (Animal ani: AnimalsInPen ) {
        System.out.println(ani.WriteInfo());

        }

    }




}

