/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author pierr
 */
public class gameSession {
    
    /**
     * méthode qui permet de renvoyer un nombre random entre 0 et 100
     * @return la valeur du nombre entre 0 et 100
     */
    public static int nbRandom() {
        return (int) (Math.random()*(100-0));
    }
    
    /*
    * Méthode qui retourne le nombre d'essai
    */
    public static int nbEssai(int essaiPrec) {
        int nbEssai = essaiPrec + 1;
        return nbEssai;
    }
    
    /**
     * Méthode qui permet de trouver le résultat
     * @param nbToFind
     * @param valUser
     * @return 
     */
    public static String guessNumber(int nbToFind, int valUser){
        String result = "";
        if (valUser > nbToFind ) {       
            result = " : Trop haut";
        } else if (valUser < nbToFind) {
            result = " : Trop bas";
        } else {
            result = " : Bonne réponse";
        }
        return result;
    }
    
}
