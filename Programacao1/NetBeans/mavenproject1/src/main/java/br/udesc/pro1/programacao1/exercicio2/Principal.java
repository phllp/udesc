package br.udesc.pro1.programacao1.exercicio2;

public class Principal {

	public static void main(String[] args) {
            Pais brasil = new Pais("Brasil", "Brasilia", 1000);
            Pais paraguai = new Pais("Paraguai", "Assunção", 200);
            Pais argentina = new Pais("Argentina", "Buenos Aires", 700);
            
            brasil.addPaisVizinho(argentina);
            brasil.addPaisVizinho(paraguai);
            
            brasil.listarVizinhos();
            

	}

}
