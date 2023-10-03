
public class TestaLivro {
    public static void main(String[] args) {
        // Criando instâncias dos livros
        Livro livro1 = new Livro("The Da Vinci Code", "Dan Brown", 2003, "Doubleday");
        Livro livro2 = new Livro("Título do Segundo Livro", "Autor do Segundo Livro", 2022, "Editora do Segundo Livro");
        Livro livro3 = new Livro("Título do Terceiro Livro", "Autor do Terceiro Livro", 2021, "Editora do Terceiro Livro");

        // Exibindo o estado das instâncias
        System.out.println("Informações do Primeiro Livro:");
        System.out.println(livro1);

        System.out.println("\nInformações do Segundo Livro:");
        System.out.println(livro2);

        System.out.println("\nInformações do Terceiro Livro:");
        System.out.println(livro3);
    }
}
