package com.mycompany.eleicao.modelsControllers;

import java.util.Date;
import java.text.SimpleDateFormat;  

public class Elector extends User {
    // Fields - All
    private Vote vote;
    
    // Methods - Getters and Setters
    /**
     * @return the vote
     */
    public Vote getVote() {
        return this.vote;
    }
    
    // Methods - Construct
    /**
     * Create a user client
     * 
     * @param name the name to set
     * @param email the email to set
     * @param cpf the cpf to set
     * @param indetification the indetification to set
     * @param password the password to set
     * @param type the type to set
     */
    public Elector(String name, String email, String cpf, String indetification, String password, String type) {
        super(name, email, cpf ,indetification, password, type);
    }
    
    /**
     * Creates new user client
    */
    public Elector() {
        super();
    }
    
    // Methods - Other
    /**
     * Vote for candidate
    */
    public void vote() {  
        if (this.vote != null) {
            String ipAddress = "198.168.1.1";
            Date date = new Date();
            String hash = ipAddress+new SimpleDateFormat("dd/mm/yyy - hh:mm:ss").format(date);
            this.vote = new Vote(hash, ipAddress, date);
        }
    }
    
    /**
     * Inssue receipt
    */
    public void inssueReceipt() {
    }
    
    /**
     * Show elector dashboard
    */
    @Override
    public void showDashboard() {
        System.out.print("Dashboard de Eleitor");
    }
}
