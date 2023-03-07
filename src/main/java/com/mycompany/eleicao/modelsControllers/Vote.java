package com.mycompany.eleicao.modelsControllers;

import java.util.Date;

public class Vote {
    // Fields - All
    private final String hash, ipAddress;
    private final Date date;
    
    // Methods - Getters and Setters
    /**
     * @return the hash
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * @return the ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return this.date;
    }
       
    // Methods - Construct
    /**
     * Create a user client
     * 
     * @param hash the hash to set
     * @param ipAddress the ipAddress to set
     * @param date the date to set
     */
    public Vote(String hash, String ipAddress, Date date) {
        this.hash = hash;
        this.ipAddress = ipAddress;
        this.date = date;
    }
    
    // Methods - Other
}
