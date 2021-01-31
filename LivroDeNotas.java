
package com.mycompany.usjt_ccp1an_pla_poo_livro_de_notas;

public class LivroDeNotas {
    
    //(construtor)
    public LivroDeNotas (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }  
    
    private String nomeDisciplina; //variavel de instancia

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }        
    
    public void exibirMensagem(String nomeDisciplina){
        System.out.println("Bem vindo ao livro de notas" + nomeDisciplina);
    }        
}
