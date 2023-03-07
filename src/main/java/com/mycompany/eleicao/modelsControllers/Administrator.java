package com.mycompany.eleicao.modelsControllers;

public class Administrator extends User {
    // Fields - All
    
    // Methods - Getters and Setters
    
    // Methods - Construct
    /**
     * Creates new user administrator
     * 
     * @param name the name to set
     * @param email the email to set
     * @param cpf the cpf to set
     * @param indetification the indetification to set
     * @param password the password to set
     * * @param type the type to set
     */
    public Administrator(String name, String email, String cpf, String indetification, String password, String type) {
        super(name, email, cpf ,indetification, password, type);
    }
    
    /**
     * Creates new user administrator
    */
    public Administrator() {
        super();
    }
    
    // Methods - Other
    /**
     * Show administrator dashboard
    */
    @Override
    public void showDashboard() {
        System.out.print("Dashboard de Administrador");
    }
}
