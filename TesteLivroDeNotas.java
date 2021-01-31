
package com.mycompany.usjt_ccp1an_pla_poo_livro_de_notas;

public class TesteLivroDeNotas {
    
    public static void main(String[] args) {
        
        //LivroDeNotas livroDeNotas = new LivroDeNotas();
        
        //livroDeNotas.setNomeDisciplina("PSC");
        
        //com o contrutor, ao invés do codigo comentado acima(linha 10 e 8)
        //eu uso o codigo abaixo na linha 16 usando o PSC direto na construção do objeto
        //ao invés de usar o codigo set
        
        LivroDeNotas livroDeNotas = new LivroDeNotas("PSC");
        
        String nome = livroDeNotas.getNomeDisciplina();
        
        System.out.println(nome);
        
        LivroDeNotas livro1 = new LivroDeNotas("Modelagem");
        LivroDeNotas livro2 = new LivroDeNotas("Matemática");
    }    
}
