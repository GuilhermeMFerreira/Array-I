/*Exercício 3 — Lista de tarefas
     Crie um programa que:
     permita cadastrar tarefas;
     finalize quando o usuário digitar “fim”;
     exiba todas as tarefas.
*/

void main() {

    //Lista para armazenar as tarefas.
    var tarefas = new ArrayList<String>();

    String entrada = "";
    IO.println("Digite suas tarefas (ou 'fim' para encerrar):");

    // O loop continua enquanto nao digitar "fim"
    while (true) {
        IO.print("Tarefa: ");
        entrada = IO.readln();

        // Verifica se o usuário quer parar
        // entrada.equalsIgnoreCase = ignora se é maiusculo ou minusculo
        if (entrada.equalsIgnoreCase("fim")) {
            break; // Sai do loop
        }

        tarefas.add(entrada);
    }

    // Exibe todas as tarefas cadastradas
    IO.println("\n----- Tarefas -----");
    for (String tarefa : tarefas) {
        IO.println(" " + tarefa);
    }
}

