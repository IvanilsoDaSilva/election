package com.mycompany.eleicao;

import com.mycompany.eleicao.view.*;
import com.mycompany.eleicao.dateBase.*;
import com.mycompany.eleicao.modelsControllers.*;
import java.util.Date;

public class Eleicao {
    public static void main(String[] args) {
        // Fields - All
        DataBase dataBase = new DataBase();
        
        // Methods - Getters and Setters
        
        // Methods - Construct
        
        // Methods - Other
        
        // Tests
        dataBase.createUser(
            new Administrator("Administrador1","Administrador1@gmail.com","000.000.000-01", "Administrador1@gmail.com","123","administrador")
        );
        
        dataBase.createUser(
            new Administrator("Administrador2","Administrador2@gmail.com","000.000.000-02", "Administrador2@gmail.com","123","administrador")
        );
        
        dataBase.createUser(new User[] {
            new Elector("Votante1","votante1@gmail.com","000.000.000-03","votante1@gmail.com","123","eleitor"),
            new Candidate("Candidato1","candidato1@gmail.com","000.000.000-04","candidato1@gmail.com","123","candidato"),
            new Moderator("Moderador1","moderador1@gmail.com","000.000.000-05","moderador1@gmail.com","123","moderador"),
            
            new Elector("Votante2","votante2@gmail.com","000.000.000-06","votante2@gmail.com","123","eleitor"),
            new Candidate("Candidato2","candidato2@gmail.com","000.000.000-07","candidato12gmail.com","123","candidato"),
            new Moderator("Moderador2","moderador2@gmail.com","000.000.000-08","moderador2@gmail.com","123","moderador "),
        });
        
        dataBase.createProposal(new Proposal[] {
            new Proposal("2023001", "Eleição1", new Date()),
            new Proposal("2023002", "Eleição2", new Date()),
        });
        
        dataBase.createCompany(new Company[] {
            new Company("Empresa1","Empresa1 Ltda.","00.000.000/0001-00","Descrição da empresa","(00)0000-0001","empresa1@ficticia.com"),
        });
        
        dataBase.createElection(new Election[] {
            new Election("Eleição de CIPA", "Eleição 2022", dataBase.readProposal(new int[] {1})[0], true, true, new Date(), new Date(), dataBase.readUser(new int[] {1,3,4,5}), dataBase.readCompany(new int[] {1})[0]), // Juntar os usuarios tanto de Client quanto Administrator em array
            new Election("Eleição de PPR", "Eleição 2022", dataBase.readProposal(new int[] {2})[0], false, true, new Date(), new Date(), dataBase.readUser(new int[] {2,6,7,8}), dataBase.readCompany(new int[] {1})[0]), // Juntar os usuarios tanto de Client quanto Administrator em array
        });

        System.out.println();
        System.out.println(dataBase.readElection(2).getUsers()[0].getName());
        
//        LogIn.open();
        // Como vou obter os metodos da classe filha apartidar da classe pai?
        // Integrar ao JFrame
        
        // apprenticeship
        // Como pegar todos objetos de uma classe?
            // R: Não tem como.. Apenas colocandoas em um BD ou em arrays.
        // Para que serve o super() dentro do construtor? Chama o construtor da classe pai! Pode ser instanciada com ou sem parametros dependendo do construtor da classe pai.
            // R: Exemplo na classe Administrator.java
        // Subclasses extendidas por uma mesma superclasse podem ser colocadas na mesma instancia se for do tipo de sua classe pai.
            // Exemplo abaixo
            // User[] user = new User[] {
            //     new Administrator("Ivanilso","ivanilso.silva@g8online.com","000.000.000-01", dataBase.readRole(new int[] {1})[0], "ivanilso.silva@g8online.com","G8IvA66@#i"),
            //     new Client("Guilherme","guilherme.ferreira@g8online.com","000.000.000-03", dataBase.readRole(new int[] {2})[0],"guilherme.ferreira@g8online.com","G8GuI66@#g", false, false),
            // };
            // System.out.println(user[0].getName());
            // System.out.println(user[1].getName());
        
        // Sticky notes
        // - Adicionar comentarios com os parametros nos construtores e outras funções
        // - Adicionar sistema de log in no LogIn.java.
        // - Ajeitar usuarios pos falta variavel de contagem de votos e função votar(no cliente pode dar ruin))
        //adicionar sistema de banco de dados por class
    }
}
