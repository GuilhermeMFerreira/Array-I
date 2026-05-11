/*Exercício 2 — Controle de preços
     Solicite 5 preços e:
     armazene em uma lista;
     exiba o maior preço;
     exiba o menor preço.*/

void main(){

    //Lista para armazenar os preços.
    var precos = new ArrayList<Double>();

        // Peço 5 preços e armazeno na lista
        for (int i = 1; i <= 5; i++) {
        IO.print("Digite o " + i + "º preço: ");
        precos.add(Double.parseDouble(IO.readln()));
        }

        // Exibo o maior e o menor preço usando Collections
        // Collections = caixa de ferramentas que ajuda no ArrayList.
        double maior = Collections.max(precos);
        double menor = Collections.min(precos);

        IO.println("\n------ Preços ------");
        IO.println("Maior preço: R$ " + maior);
        IO.println("Menor preço: R$ " + menor);

}
