package com.mycompany.eleicao.dateBase;

import com.mycompany.eleicao.modelsControllers.*;

public class DataBase {
    // Fields - All
    private User[] user = new User[] {};
    private Company[] company = new Company[] {};
    private Election[] election = new Election[] {};
    private Proposal[] proposal = new Proposal[] {};
    private Vote[] vote = new Vote[] {};

    // Methods - Getters and Setters 
        
    // Methods - Construct
    /**
     * Creates new data base
    */
    public DataBase() {
    }
    
    // Methods - Other
    // Proposal
    public void createProposal(Proposal[] proposal) {
        Proposal[] proposalCreate = new Proposal[this.proposal.length+proposal.length];
        
        System.arraycopy(this.proposal, 0, proposalCreate, 0, this.proposal.length);
        System.arraycopy(proposal, 0, proposalCreate, this.proposal.length, proposal.length);

        this.proposal = proposalCreate;
    }
    
    public void createProposal(Proposal proposal) {
        Proposal[] proposalCreate = new Proposal[this.proposal.length+1];
        
        System.arraycopy(this.proposal, 0, proposalCreate, 0, this.proposal.length);
        proposalCreate[this.proposal.length] = proposal;

        this.proposal = proposalCreate;
    }
    
    public Proposal[] readProposal(int[] id) {
        int i;
        Proposal[] proposalRead = new Proposal[id.length]; 
        if ((id.length > 0) && (id.length <= this.proposal.length)) {
            for(i=0; i<= id.length-1;i++) {
                proposalRead[i] = this.proposal[id[i]-1];
            }
        } else if (id.length == 0) {
            proposalRead = this.proposal;
        } else {
            proposalRead = null;
        }
        return proposalRead;
    }
    
    public Proposal readProposal(int id) {
        return this.proposal[id-1];
    }
    
    public void updateProposal(int[] id, Proposal[] proposal) {
    }
    
    public void deleteProposal(int[] id) {
    }
    
    // User
    public void createUser(User[] user) {
        User[] userCreate = new User[this.user.length+user.length];
        
        System.arraycopy(this.user, 0, userCreate, 0, this.user.length);
        System.arraycopy(user, 0, userCreate, this.user.length, user.length);

        this.user = userCreate;
    }
    
    public void createUser(User user) {
        User[] clientUser = new User[this.user.length+1];
        
        System.arraycopy(this.user, 0, clientUser, 0, this.user.length);
        clientUser[this.user.length] = user;

        this.user = clientUser;
    }
    
    public User[] readUser(int[] id) {
        int i;
        User[] userRead = new User[id.length]; 
        if ((id.length > 0) && (id.length <= this.user.length)) {
            for(i=0; i<= id.length-1;i++) {
                userRead[i] = this.user[id[i]-1];
            }
        } else if (id.length == 0) {
            userRead = this.user;
        } else {
            userRead = new User[] {};
        }
        return userRead;
    }
    
    public User readUser(int id) {
        return this.user[id-1];
    }
    
    public void updateUser(int[] id, User[] user) {
    }
    
    public void deleteUser(int[] id) {
    }
    
    // Company
    public void createCompany(Company[] company) {
        Company[] companyCreate = new Company[this.company.length+company.length];
        
        System.arraycopy(this.company, 0, companyCreate, 0, this.company.length);
        System.arraycopy(company, 0, companyCreate, this.company.length, company.length);

        this.company = companyCreate;
    }
    
    public void createCompany(Company company) {
        Company[] companyCreate = new Company[this.company.length+1];
        
        System.arraycopy(this.company, 0, companyCreate, 0, this.company.length);
        companyCreate[this.company.length] = company;

        this.company = companyCreate;
    }
    
    public Company[] readCompany(int[] id) {
        int i;
        Company[] companyRead = new Company[id.length]; 
        if ((id.length > 0) && (id.length <= this.company.length)) {
            for(i=0; i<= id.length-1;i++) {
                companyRead[i] = this.company[id[i]-1];
            }
        } else if (id.length == 0) {
            companyRead = this.company;
        } else {
            companyRead = new Company[] {};
        }
        return companyRead;
    }
    
    public Company readCompany(int id) {
        return this.company[id-1];
    }
    
    public void updateCompany(int[] id, Company[] company) {
    }
    
    public void deleteCompany(int[] id) {
    }
    
    // Election
    public void createElection(Election[] election) {
        Election[] electionCreate = new Election[this.election.length+election.length];
        
        System.arraycopy(this.election, 0, electionCreate, 0, this.election.length);
        System.arraycopy(election, 0, electionCreate, this.election.length, election.length);

        this.election = electionCreate;
    }
    
    public void createElection(Election election) {
        Election[] electionCreate = new Election[this.election.length+1];
        
        System.arraycopy(this.election, 0, electionCreate, 0, this.election.length);
        electionCreate[this.election.length] = election;

        this.election = electionCreate;
    }
    
    public Election[] readElection(int[] id) {
        int i;
        Election[] electionRead = new Election[id.length]; 
        if ((id.length > 0) && (id.length <= this.election.length)) {
            for(i=0; i<= id.length-1;i++) {
                electionRead[i] = this.election[id[i]-1];
            }
        } else if (id.length == 0) {
            electionRead = this.election;
        } else {
            electionRead = new Election[] {};
        }
        return electionRead;
    }
    
    public Election readElection(int id) {
        return this.election[id-1];
    }
    
    public void updateElection(int[] id, Election[] election) {
    }
    
    public void deleteElection(int[] id) {
    }
    
    // Vote
    public void createVote(Vote[] vote) {
        Election[] voteCreate = new Election[this.vote.length+vote.length];
        
        System.arraycopy(this.vote, 0, voteCreate, 0, this.vote.length);
        System.arraycopy(vote, 0, voteCreate, this.vote.length, vote.length);

        this.election = voteCreate;
    }
    
    public void createVote(Vote vote) {
        Vote[] voteCreate = new Vote[this.vote.length+1];
        
        System.arraycopy(this.vote, 0, voteCreate, 0, this.vote.length);
        voteCreate[this.vote.length] = vote;

        this.vote = voteCreate;
    }
    
    public Vote[] readVote(int[] id) {
        int i;
        Vote[] voteRead = new Vote[id.length]; 
        if ((id.length > 0) && (id.length <= this.vote.length)) {
            for(i=0; i<= id.length-1;i++) {
                voteRead[i] = this.vote[id[i]-1];
            }
        } else if (id.length == 0) {
            voteRead = this.vote;
        } else {
            voteRead = new Vote[] {};
        }
        return voteRead;
    }
    
    public Vote readVote(int id) {
        return this.vote[id-1];
    }
    
    public void updateVote(int[] id, Election[] election) {
    }
    
    public void deleteVote(int[] id) {
    }
}
