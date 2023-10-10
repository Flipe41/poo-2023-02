
public class TestaLivro {
    public static void main(String[] args) {
        // Criando instâncias dos livros
        Livro livro1 = new Livro("A Vila dos Tecidos (A Vila dos Tecidos – Livro 1)", "Anne Jacobs", 2023, "Editora Arqueiro");
        Livro livro2 = new Livro("Arrume a sua cama: Pequenas coisas que podem mudar a sua vida... E talvez o mundo", "William H. Mcraven", 2017, "Editora Academia");
        Livro livro3 = new Livro("A coragem de não agradar: Como a filosofia pode ajudar você a se libertar da opinião dos outros, superar suas limitações e se tornar a pessoa que deseja", "Ichiro Kishimi", 2021, "Editora Sextante");

        // Exibindo o estado das instâncias
        System.out.println("Informações do Primeiro Livro:");
        System.out.println(livro1);

        System.out.println("\nInformações do Segundo Livro:");
        System.out.println(livro2);

        System.out.println("\nInformações do Terceiro Livro:");
        System.out.println(livro3);
    }
}
