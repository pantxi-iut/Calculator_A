package com.pantxi.calculator;

import java.util.HashSet;
import java.util.Set;
public class Calculator {
    public int add(int opG, int opD) throws Exception {

        double somme = (double) opG + (double) opD;
        if ((somme > Integer.MAX_VALUE) || (somme < Integer.MIN_VALUE))
        {
            throw new RuntimeException("somme en dehors des valeurs du type int");
        }
        return (int) somme;
    }
    /*
    public Rationnel add (Rationnel opG, Rationnel opD) {
        Rationnel somme = opG.additionner(opD);
        return somme;
    }
    */

    public int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("division par zero");
        }
        return opG / opD;
    }
    public void longCalcul(int ms) {
        // attendre ms millisecondes
        try { 	Thread.sleep(ms);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> entiers = new HashSet<Integer>(); // ensemble d'entiers vide
        String chaineDuNombre = String.valueOf(pNombre); 	// équivalent du nbre en châine de caractères

        // Parcours de la chaîne et ajout de chaque élément dans l'ensemble
        for (int i=0; i<chaineDuNombre.length(); i++) {
            if (chaineDuNombre.charAt(i) != '-')
            {
                entiers.add(Integer.parseInt(chaineDuNombre, i, i+1, 10));
				/* retourne l'équivalent en entier de la portion de chaîne comprise dans l'intervalle [i, i+1[.
				   Lève une exception si la conversion en entier n'est pas possible.
				*/
            }
        }
        return entiers;
    }
}
