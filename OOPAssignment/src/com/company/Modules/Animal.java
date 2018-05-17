package com.company.Modules;

import com.company.Interfaces.IAnimal;

public class Animal  implements IAnimal
{
    public Animal(String name, _animalType type)
    {
        this.Type = type;
        this.Name = name;

    }

    private String Name;
    private _animalType Type;



    public String WriteInfo(){
        return("\n Animal : " + Name + "\n Type: " + Type);
    }
}
