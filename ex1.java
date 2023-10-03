public class Pessoa {
    private String nome;
    public int idade;
    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //metodos 
    public void saudação() {
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + "anos.");
    }
    //metodo publico para acessar o atributo privado nome
    public String getNome() {
        return nome;
    }
    
    //método publico para modifivcar o atributo privado nome
    public void setNome(String novoNome) {
        nome = novoNome;
    }
    
}

public class ExemploClasse {
    public static void main(String[] args) {
        //criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Alice", 25);
        //acessando o atributo publico "idade"
        System.out.println("Nome: " + pessoa1.idade);
        
        //usando o metodo publico pra acessar o atr4ibuto privado nome
    }
}