/*Exercício 5: Lista de compras
     Exibir um menu de opções para esta lista de compras: 1 - Adicionar a lista, 2 - Pesquisar item, 3 - Remover item, 4 - Alterar item, 5 - Listar produtos, 6 - Sair
     para a opção 1 solicitar ao usuário digitar produtos para compra até digitar a palavra "sair"
     para a opção 2 solicitar um produto a ser pesquisado na lista. se encontrar o produto, exibir o mesmo senão exibir produto não encontrado;
     para  a opção 3 solicitar o nome do produto a ser removido da lista. se encontrar, exibir na tela "produto encontrado" senão exibir "produto não encontrado";
     para a opção 4 solicitar o nome do produto a ser alterado. se encontrar exibir na tela "produto alterado com sucesso" senão exibir "produto não encontrado"
     para a opção 5 listar todos os produtos cadastrados. se não houver produtos cadastrados, exibir a mensagem "Lista vazia" senão exibir os produtos cadastrados.
     para a opção 6 sair do programa e exibir na tela "Programa encerrado com sucesso!".*/

void main() {

    List<String> listaProdutos = new ArrayList<>();
    int opcao = 0;

    while (opcao != 6) {
        // Exibição do menu
        IO.println("\n---------------------------------");
        IO.println("\n----- MENU LISTA DE COMPRAS -----");
        IO.println("\n---------------------------------");
        IO.println("1 - Adicionar à lista");
        IO.println("2 - Pesquisar item");
        IO.println("3 - Remover item");
        IO.println("4 - Alterar item");
        IO.println("5 - Listar produtos");
        IO.println("6 - Sair");
        IO.print("Escolha uma opção: ");

        try {
            opcao = Integer.parseInt(IO.readln().trim());
        } catch (NumberFormatException e) {
            IO.println("Opção inválida! Digite um número de 1 a 6.");
            continue;
        }

        switch (opcao) {
            case 1: // Adicionar à lista
                IO.println("\nDigite os produtos (ou 'sair' para voltar ao menu):");
                while (true) {
                    IO.print("Produto: ");
                    String produto = IO.readln().trim();
                    if (produto.equalsIgnoreCase("sair")) {
                        break;
                    }
                    if (!produto.isEmpty()) {
                        listaProdutos.add(produto);
                    }
                }
                break;

            case 2: // Pesquisar item
                IO.print("\nDigite o produto para pesquisar: ");
                String pesquisa = IO.readln().trim();
                boolean encontradoPesquisa = false;

                for (String p : listaProdutos) {
                    if (p.equalsIgnoreCase(pesquisa)) {
                        IO.println("Produto encontrado: " + p);
                        encontradoPesquisa = true;
                        break;
                    }
                }
                if (!encontradoPesquisa) {
                    IO.println("Produto não encontrado");
                }
                break;

            case 3: // Remover item
                IO.print("\nDigite o produto a ser removido: ");
                String remover = IO.readln().trim();
                boolean removido = false;

                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (listaProdutos.get(i).equalsIgnoreCase(remover)) {
                        listaProdutos.remove(i);
                        IO.println("Produto encontrado");
                        removido = true;
                        break;
                    }
                }
                if (!removido) {
                    IO.println("Produto não encontrado");
                }
                break;

            case 4: // Alterar item
                IO.print("\nDigite o nome do produto a ser alterado: ");
                String antigo = IO.readln().trim();
                boolean alterado = false;

                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (listaProdutos.get(i).equalsIgnoreCase(antigo)) {
                        IO.print("Digite o novo nome para o produto: ");
                        String novo = IO.readln().trim();
                        if (!novo.isEmpty()) {
                            listaProdutos.set(i, novo);
                            IO.println("Produto alterado com sucesso");
                            alterado = true;
                        }
                        break;
                    }
                }
                if (!alterado) {
                    IO.println("Produto não encontrado");
                }
                break;

            case 5: // Listar produtos
                if (listaProdutos.isEmpty()) {
                    IO.println("\nLista vazia");
                } else {
                    IO.println("\n--- Produtos Cadastrados ---");
                    for (int i = 0; i < listaProdutos.size(); i++) {
                        IO.println((i + 1) + ". " + listaProdutos.get(i));
                    }
                }
                break;

            case 6: // Sair
                IO.println("\nPrograma encerrado com sucesso!");
                break;

            default:
                IO.println("Opção inválida! Escolha um número de 1 a 6.");
                break;
        }
    }

}