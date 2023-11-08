import java.util.HashMap;
import java.util.Map;

public class Estabelecimento {
        private Map<String, Map<String, String>> possiveisRestaurantes;

    public Estabelecimento() {
        possiveisRestaurantes = new HashMap<>();
        initializeRestaurantData();
    }

    public Map<String, Map<String, String>> getPossiveisRestaurantes() {
        return possiveisRestaurantes;
    }

    private void initializeRestaurantData() {
        possiveisRestaurantes.put("Burger King", createRestaurante("Fast-food", "Hamburguer", "Estados Unidos", "Americana", "Whopper"));
        possiveisRestaurantes.put("McDonald's", createRestaurante("Fast-food", "Hamburguer", "Estados Unidos", "Americana", "Big Mac"));
        possiveisRestaurantes.put("KFC", createRestaurante("Fast-food", "Frango Frito", "Estados Unidos", "Americana", null));
        possiveisRestaurantes.put("Pizza Hut", createRestaurante("Fast-food", "Pizza", "Itália", "Italiana", null));
        possiveisRestaurantes.put("Subway", createRestaurante("Fast-food", "Sanduíche", "Estados Unidos", "Americana", null));
        possiveisRestaurantes.put("Starbucks", createRestaurante("Fast-food", "Bebidas", "Estados Unidos", "Cafeteria", null));
        possiveisRestaurantes.put("Taco Bell", createRestaurante("Fast-food", "Taco", "Estados Unidos", "Mexicana", null));
        possiveisRestaurantes.put("Habib's", createRestaurante("Fast-food", "Esfiha", "Brasil", "Árabe", null));
        possiveisRestaurantes.put("Ponto da Esfiha", createRestaurante("Fast-food", "Esfiha", "Brasil", "Árabe", null));
        possiveisRestaurantes.put("Spoletto", createRestaurante("Fast-food", "Massa", "Brasil", "Italiana", null));
        possiveisRestaurantes.put("Domino's", createRestaurante("Fast-food", "Pizza", "Estados Unidos", "Italiana", null));
        possiveisRestaurantes.put("Bob's", createRestaurante("Fast-food", "Hamburguer", "Brasil", "Americana", "Big Bob"));
        possiveisRestaurantes.put("Outback", createRestaurante("Restaurante", "Steakhouse", "Estados Unidos", "Americana", null));
        possiveisRestaurantes.put("Paris 6", createRestaurante("Restaurante", "Massa", "Brasil", "Francesa", null));
        possiveisRestaurantes.put("Autogrill", createRestaurante("Fast-food", "Refeições rápidas", "Itália", "Italiana", null));

    }

    private Map<String, String> createRestaurante(String cadeia, String pratoPrincipal, String paisOrigem, String influenciaCulinaria, String especialidade) {
        Map<String, String> restaurante = new HashMap<>();
        restaurante.put("Cadeia", cadeia);
        restaurante.put("Prato Principal", pratoPrincipal);
        restaurante.put("País de Origem", paisOrigem);
        restaurante.put("Influência Culinária", influenciaCulinaria);
        if (especialidade != null) {
            restaurante.put("Especialidade do Hamburguer", especialidade);
        }
        return restaurante;
    }
}
