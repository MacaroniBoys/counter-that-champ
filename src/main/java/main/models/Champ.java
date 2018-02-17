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
    AHRI("Ahri"),
    AKALI("Akali"),
    ALISTAR("Alistar"),
    ANIVIA("Anivia"),
    AMUMU("Amumu"),
    LEE_SIN("Lee Sin")
    ;


    public final String name;

    Champ(String name) {
        this.name = name;
    }


    public static ArrayList<String> getChampionNames() {
        ArrayList<String> names = new ArrayList<>();
        Champ[] Array = Champ.values();
        for(int i =0 ; i < Array.length; i++){
            names.add(Array[i].name);
        }


        {
            return names;
        }
    }

}
