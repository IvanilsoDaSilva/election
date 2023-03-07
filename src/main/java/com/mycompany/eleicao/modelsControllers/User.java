package com.mycompany.eleicao.modelsControllers;

public abstract class User {
    // Fields - All
    protected String name, email, cpf, indetification, password, type;
    
    // Methods - Getters and Setters
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param indetification the indetification to set
     */
    public void setIndetification(String indetification) {
        this.indetification = indetification;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the type
     */
    public String getPassword() {
        return this.type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    // Methods - Construct
    /**
     * Creates new user
     * 
     * @param name the name to set
     * @param email the email to set
     * @param cpf the cpf to set
     * @param indetification the indetification to set
     * @param password the password to set
     * @param type the type to set
     */
    public User(String name, String email, String cpf, String indetification, String password, String type) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.indetification = indetification;
        this.password = password;
        this.type = type;
    }
    
    /**
     * Creates new user
     */
    public User(){
    }
    
    // Methods - Other
    /**
     * Log in a user
     */
    public void logIn() {
        System.out.println("LogOut");
        System.out.println(this.indetification);
        System.out.println(this.password);
    }
    
    /**
     * Log out of a user
     */
    public void logOut() {
        System.out.println("LogOut");
    }
    
    /**
     * Show dashboard
     */
    public abstract void showDashboard();
}
