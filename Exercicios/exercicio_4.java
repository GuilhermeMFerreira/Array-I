/*Exercício 4 - Controle de temperaturas
     Solicite temperaturas em graus Celsius até o usuário digitar "sair";
     Converta as temperaturas da lista em graus Celsius para uma nova lista de temperaturas em graus Fahrenheit;
     Calcule e exiba as médias de ambas as temperaturas.*/

void main() {

    //Armazenar as temperaturas
    List<Double> celsiusList = new ArrayList<>();
    List<Double> fahrenheitList = new ArrayList<>();

    IO.println("Digite as temperaturas em Celsius (ou 'sair' para encerrar):");

    // Pegar as temperaturas
    while (true) {
        IO.print("Temperatura em °C: ");
        String entrada = IO.readln();

        //Se digitar sair para
        if (entrada.equals("sair")) {
            break;
        }

        try {
            double celsius = Double.parseDouble(entrada);
            celsiusList.add(celsius);
        } catch (NumberFormatException e) {
            IO.println("Por favor, digite um número inteiro ou 'sair'.");
        }
    }

    // Executa os cálculos
    if (!celsiusList.isEmpty()) {
        double somaCelsius = 0;
        double somaFahrenheit = 0;

        // Conversão para Fahrenheit e junção das somas
        for (double c : celsiusList) {
            double f = (c * 1.8) + 32;
            fahrenheitList.add(f);
            somaCelsius += c;
            somaFahrenheit += f;
        }
        // Cálculo das médias
        double mediaCelsius = somaCelsius / celsiusList.size();
        double mediaFahrenheit = somaFahrenheit / fahrenheitList.size();

        // Exibição dos resultados
        IO.println("\n--- Resultados ---");
        IO.println("Temperaturas em Celsius: " + celsiusList);
        IO.println("Temperaturas em Fahrenheit: " + fahrenheitList);
        IO.println("Média em Celsius: " + mediaCelsius);
        IO.println("Média em Fahrenheit: " + mediaFahrenheit);
    } else {
        IO.println("\nNenhuma temperatura foi digitada.");
    }
}
