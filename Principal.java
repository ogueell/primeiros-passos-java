public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        IdadePessoa pessoa1 = new IdadePessoa();
        Produto produto1 = new Produto();
        Aluno aluno1 = new Aluno();
        Livro livro1 = new Livro();

        //ContaBancaria.java
        conta1.titular = "Miguel Palmeira dos Santos";
        conta1.setNumeroConta(123123123);
        conta1.setSaldo(1000000000);

        System.out.println("Titular: " + conta1.titular);
        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());

        //IdadePessoa.java
        pessoa1.setIdade((short) 11);
        pessoa1.setNome("Miguel Palmeira dos Santos");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        pessoa1.verificarIdade();

        //Produto.java
        produto1.setNome("wOwoowWOW");
        produto1.setPreco(500.0);

        System.out.println("Preço original: R$ " + produto1.getPreco());

        produto1.aplicarDesconto(50);

        System.out.println("Preço com desconto: R$ " + produto1.getPreco());

        //Aluno.java
        aluno1.setNome("Miguel Palmeira dos Santos");
        aluno1.setNotas(3);
        aluno1.setNotas(10);
        aluno1.setNotas(7);
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Nota total do aluno " + aluno1.getNotas());
        System.out.println("Média de notas do aluno: " + aluno1.calcularMedia());

        //Livro.java
        livro1.setAutor("Miguel Palmeira dos Santos");
        livro1.setTitulo("A Garota dos Olhos Coloridos.");
        livro1.exibirDetalhes();
    }
}
