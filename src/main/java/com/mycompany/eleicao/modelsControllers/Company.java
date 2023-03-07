package com.mycompany.eleicao.modelsControllers;

public class Company {
    // Fields - All
    private String name, corporateName, cnpj, description, telephone, email;
    
    // Methods - Getters and Setters
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the corporateName
     */
    public String getCorporateName() {
        return this.corporateName;
    }

    /**
     * @param corporateName the corporateName to set
     */
    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * @param telephone the contact to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the contact to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Methods - Construct
    /**
     * Creates new company
     * 
     * @param name the name to set
     * @param corporateName the corporate name to set
     * @param cnpj the cnpj to set
     * @param description the description to set
     * @param telephone the telephone to set
     * @param email the email to set
     */
    public Company(String name, String corporateName, String cnpj, String description, String telephone, String email) {
        this.name = name;
        this.corporateName = corporateName;
        this.cnpj = cnpj;
        this.description = description;
        this.telephone = telephone;
        this.email = email;
    }
    
    /**
     * Creates new company
    */
    public Company() {
    }
    
    // Methods - Other
}
