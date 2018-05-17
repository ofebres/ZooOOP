package com.company.Interfaces;

public interface IAnimal {

    String name = "";

    int landRequirementsMsq = 0;
    int waterRequirementsMcu = 0;

    enum _animalType {
        mammal,
        bird,
        fish,
        reptile,
        amphibian;

    }
}