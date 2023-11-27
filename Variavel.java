public class Variavel {
    private String nome;
    private int tipo;
    private int valor;

    public Variavel(String nome, int tipo, int valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Variavel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void imprime(){
        System.out.println("Nome: "+nome+"\nTipo: "+tipo+"\nValor: "+valor);
    }
}