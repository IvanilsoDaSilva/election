package com.mycompany.eleicao.modelsControllers;

import java.util.Date;

public class Election {
    // Fields - All
    private String name, description;
    private boolean enablePassword, enableElection;
    private Date dateStart, dateFinish;
    private User[] users;
    private Company company;
    private Proposal proposal;
   
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
     * @return the proposal
     */
    public Proposal getProposal() {
        return this.proposal;
    }

    /**
     * @param proposal the proposal to set
     */
    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    /**
     * @return if the password of election is active 
     */
    public boolean isEnablePassword() {
        return enablePassword;
    }

    /**
     * @param enablePassword if the password of election is active to set
     */
    public void setEnablePassword(boolean enablePassword) {
        this.enablePassword = enablePassword;
    }

    /**
     * @return if the election is active 
     */
    public boolean isEnableElection() {
        return enableElection;
    }

    /**
     * @param enableElection if the election is active to set
     */
    public void setEnableElection(boolean enableElection) {
        this.enableElection = enableElection;
    }

    /**
     * @return the start date of the election
     */
    public Date getDateStart() {
        return dateStart;
    }

    /**
     * @param dateStart the start date of the election to set
     */
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * @return the end date of the election
     */
    public Date getDateFinish() {
        return dateFinish;
    }

    /**
     * @param dateFinish the end date of the election to set
     */
    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    /**
     * @return the users
     */
    public User[] getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(User[] users) {
        this.users = users;
    }

    /**
     * @return the company
     */
    public Company getCompany() {
        return company;
    }
    
    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }
   
    // Methods - Construct
    /**
     * Creates new election
     * 
     * @param name the name to set
     * @param description the description to set
     * @param proposal the proposal to set
     * @param enablePassword the enablePassword to set
     * @param enableElection the enableElection to set
     * @param dateStart the dateStart to set
     * @param finishDate the finishDate to set
     * @param users the users to set
     * @param company the company to set
     */
    public Election(String name, String description, Proposal proposal, boolean enablePassword, boolean enableElection, Date dateStart, Date finishDate, User[] users, Company company) {
        this.name = name;
        this.description = description;
        this.proposal = proposal;
        this.enablePassword = enablePassword;
        this.enableElection = enableElection;
        this.dateStart = dateStart;
        this.dateFinish = finishDate;
        this.users = users;
        this.company = company;
    }
    
    /**
     * Creates new election
    */
    public Election() {
    }
    
    // Methods - Other
}