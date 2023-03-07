package com.mycompany.eleicao.modelsControllers;

public class Candidate extends Elector {
    // Fields - All
    private int votes;
    
    // Methods - Getters and Setters
    /**
     * @return the votes
     */
    public int getVotes() {
        return this.votes;
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
     */
    public Candidate(String name, String email, String cpf, String indetification, String password, String type) {
        super(name, email, cpf, indetification, password, type);
        this.votes = 0;
    }
    
    /**
     * Creates new user client
    */
    public Candidate() {
        super();
    }
    
    // Methods - Other
}
