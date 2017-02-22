package com.it355.model;

/**
 *
 * @author Nikola Kuburovic 1095
 */
public class Asistent {
    
    private String ime;
    private String prezime;
    private String oblast;
    
    public Asistent(){
        
    }
    
    public Asistent(String ime, String prezime, String oblast){
        this.ime = ime;
        this.prezime = prezime;
        this.oblast = oblast;
    }

    /**
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * @return the prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * @param prezime the prezime to set
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /**
     * @return the oblast
     */
    public String getOblast() {
        return oblast;
    }

    /**
     * @param oblast the oblast to set
     */
    public void setOblast(String oblast) {
        this.oblast = oblast;
    }
    
}
