import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AkinatorGame {
    static Map<String, Map<String, String>> possiveisRestaurantes;
    public static void main(String[] args) {
        Estabelecimento restaurant = new Estabelecimento();
        possiveisRestaurantes = restaurant.getPossiveisRestaurantes();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Você está pensando em um restaurante? (Sim/Nao): ");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                filterBy("Cadeia", "Restaurante");
                break;
            } else if (resposta.equals("nao")) {
                filterBy("Cadeia", "Fast-food");
                break;
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
            }
        }
        while (true) {
            System.out.println("O Pais de Origem desse Estabelecimento é os Estados Unidos? (Sim/Nao): ");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                filterBy("País de Origem", "Estados Unidos");
                retornaNomeSePossivel();
                break;
            } else if (resposta.equals("nao")) {
                System.out.println("O Pais de Origem desse Estabelecimento é o Brasil? (Sim/Nao): ");
                String resposta2 = scanner.nextLine().toLowerCase();
                if (resposta2.equals("sim")) {
                    filterBy("País de Origem", "Brasil");
                    retornaNomeSePossivel();
                break;
            } else {
                filterBy("País de Origem", "Itália");
                retornaNomeSePossivel();
                break;
                }
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
            }
        }
        
    }
    static void filterBy(String chave, String valor) {
        Map<String, Map<String, String>> restaurantesFiltrados = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> entry : possiveisRestaurantes.entrySet()) {
            if (entry.getValue().get(chave).equals(valor)) {
                restaurantesFiltrados.put(entry.getKey(), entry.getValue());
            }
        }
        possiveisRestaurantes = restaurantesFiltrados;
    }

    static void retornaNomeSePossivel() {
        if (possiveisRestaurantes.size() == 1) {
            for (Map.Entry<String, Map<String, String>> entry : possiveisRestaurantes.entrySet()) {
                String restauranteNome = entry.getKey();
                System.out.println("Você está pensando no Restaurante: " + restauranteNome);
            }
        }
    }
}