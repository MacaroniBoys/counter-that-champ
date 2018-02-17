package main.models;

/*
    This is an Enum in Java.  This is where we will list out every champion and their name.  They should be listed
    in alphabetical order. Replace spaces in name with _
    This will make it easy to select a champion when needed. For example...

    If we wanted to select Aatrox, we could just call Champ.AATROX to access information on that champion.
    For now we will just use this to access their name, but we could expand it further if we wanted to.
 */


import java.util.ArrayList;

public enum Champ {
    AATROX("Aatrox"),
    ANIVIA("Anivia"),
    /*
    .
    .
    .
     */
    LEE_SIN("Lee Sin")
    ;


    public final String name;

    Champ(String name) {
        this.name = name;
    }


    public static ArrayList<String> getChampionNames() {
        ArrayList<String> names = new ArrayList<>();
        /*  Write a method that loops through the array of Champs (google how to get all values of an Enum in Java)
            and add the name to the list (google how to add an element to a list in Java)

            You'll know it is working if you run the program and the drop
            down lists the champion names.
        */


        return names;
    }

}
