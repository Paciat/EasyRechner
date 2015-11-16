/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyRechner;

import java.util.ArrayList;

/**
 *
 * @author Patricia
 */
public class BerechnungenRechner {

    private double mittelwert;
    private double varianz;
    private double standardabweichung;
    private double summe;
    private final int ANZAHL = 10;

    public double mittelwert(ArrayList array)
    {
        if(array.size()==10){
            for(int i =0; i<array.size(); i++)
            {
                //System.out.println(array.get(i));
                summe = summe + (double) array.get(i);
            }
        }
        mittelwert = summe/ANZAHL;
        return mittelwert=summe/ANZAHL;
    }

    public double varianz(ArrayList array)
    {
        if(array.size()==10){
            for(int i =0; i<array.size(); i++)
            {
                double a = (double) array.get(i);
                double b = mittelwert;
                double c = Math.pow((a-b),2);
                summe = summe + c;
                System.out.println(summe);
            }
            
            if (summe < 0)
            {
                varianz=summe/ANZAHL*-1;
                System.out.println(varianz);
            }
                    
            else
            {
                varianz=summe/ANZAHL;
                System.out.println(varianz);
            }
        }
        return varianz;
    }
    
    
    public double standardabweichung(double varianz)
    {
       return standardabweichung = Math.sqrt(varianz);
    }

}