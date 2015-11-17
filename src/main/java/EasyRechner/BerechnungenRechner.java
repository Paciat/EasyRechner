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
    private double summeMittel = 0;
    private double summeVarianz = 0;
    private final int ANZAHL = 10;

    public double mittelwert(ArrayList array)
    {
        if(array.size()==10){
            for(int i =0; i<array.size(); i++)
            {
                summeMittel = summeMittel + (double) array.get(i);
            }
        }
        mittelwert = summeMittel/ANZAHL;
        return mittelwert=summeMittel/ANZAHL;
    }

    public double varianz(ArrayList array)
    {
        if(array.size()==10){
            for(int i =0; i<array.size(); i++)
            {
                double a = (double) array.get(i);
                double b = mittelwert;
                double c = Math.pow((a-b),2);
                summeVarianz = summeVarianz + c;
            }
            
            if (summeVarianz < 0)
            {
                varianz=summeVarianz/ANZAHL*-1;
            }
                    
            else
            {
                varianz=summeVarianz/ANZAHL;
            }
        }
        return varianz;
    }
    
    
    public double standardabweichung()
    {
        standardabweichung = Math.sqrt(varianz);
        return standardabweichung = Math.sqrt(varianz);
    }

}