public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Alerta: o preco nao pode ser negativo! Preco nao alterado.");
            return;
        }
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int qtd) {
        quantidadeEstoque += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd > quantidadeEstoque) {
            System.out.println("Estoque insuficiente! Tem so " + quantidadeEstoque + " unidade(s).");
        } else {
            quantidadeEstoque -= qtd;
        }
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidadeEstoque
                + " unidade(s) | Valor Total: R$ " + calcularValorTotalEstoque();
    }
}
