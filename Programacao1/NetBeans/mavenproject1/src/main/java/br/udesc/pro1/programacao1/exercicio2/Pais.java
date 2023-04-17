package br.udesc.pro1.programacao1.exercicio2;

import java.util.ArrayList;

public class Pais {

    private String nome;
    private String capital;
    private double dimensao;
    private ArrayList<Pais>paisesVizinhos;

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.paisesVizinhos =  new ArrayList(1);
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    
    public String getCapital() {
        return capital;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Pais> getPaisesVizinhos() {
        return paisesVizinhos;
    }
    
    public void listarVizinhos() {
        for (int i = 0; i < this.paisesVizinhos.size(); i ++) {
            System.out.println(this.paisesVizinhos.get(i).nome);
        }
    }

    /**
     * Verifica se um país é igual à outro, considerando que um país é igual a 
     * outro quando ambos possuem o mesmo nome e a mesma capital
     * @param outro 
     * @return boolean 
     */
    public boolean equals(Pais outro) {
        return (this.nome.equals(outro.nome)) && (this.capital.equals(outro.capital));
    }
    
    public void addPaisVizinho(Pais paisVizinho) {
       if (!this.equals(paisVizinho)) {
           this.paisesVizinhos.add(paisVizinho);
       }
    }
    
    
}
