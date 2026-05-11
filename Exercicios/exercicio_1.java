/*Exercício 1 — Lista de convidados
Crie um programa que:
Cadastre 5 convidados;
Exiba todos os convidados;
Informe quantos convidados existem.*/

void main() {

    //Lista para armazenar os nomes dos convidados.
    var convidados = new ArrayList<String>();


    //Cadastrar 5 convidados
    IO.println("Nome de 5 convidados:");
    for (int i = 1; i <= 5; i++) {
        IO.print(i + "º convidado: ");
        String nome = IO.readln();
        convidados.add(nome);
    }

    //Exibir todos os convidados
    IO.println("\n--- Lista de Convidados ---");
    for (String convidado : convidados) {
        IO.println("- " + convidado);
    }

    //Informar quantos convidados existem
    // convidados.size()) = retorna o número armazenados no seu ArrayList.
    IO.println("\nTotal de convidados: " + convidados.size());

}
