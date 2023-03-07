package com.mycompany.eleicao.modelsControllers;

import java.util.Date;

public class Proposal {
    // Fields - All
    private String proposalNumber, description;
    private Date date;
    
    // Methods - Getters and Setters
    /**
     * @return the proposalNumber
     */
    public String getProposalNumber() {
        return proposalNumber;
    }

    /**
     * @param proposalNumber the proposalNumber to set
     */
    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    // Methods - Construct
    /**
     * Creates new permission
     * 
     * @param proposalNumber the proposal number to set
     * @param description the description to set
     * @param date the date to set
     */
    public Proposal(String proposalNumber, String description, Date date) {
        this.proposalNumber = proposalNumber;
        this.description = description;
        this.date = date;
    }
    
    /**
     * Creates new permission
     */
    public Proposal() {
    }
    
    // Methods - Other
}
