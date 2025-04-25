package views;

import models.Persona;

public class ViewConsole {
    public void printarray(Persona[] personas){
        for(int i = 0 ; i<personas.length ; i++){
            System.out.println(personas[i]);
        }
        System.out.println();
    }
}
