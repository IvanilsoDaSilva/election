package com.mycompany.eleicao.modelsControllers;

public class Moderator extends User {
     // Fields - All
    
    // Methods - Getters and Setters
    
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
    public Moderator(String name, String email, String cpf, String indetification, String password, String type) {
        super(name, email, cpf ,indetification, password, type);
    }
    
    /**
     * Creates new user client
    */
    public Moderator() {
        super();
    }
    
    // Methods - Other
    /**
     * Inssue report
    */
    public void inssueReport() {   
    }
    
    /**
     * Show moderator dashboard
    */
    @Override
    public void showDashboard() {
        System.out.print("Dashboard de Moderador");
    }
}
