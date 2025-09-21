// HashMap:
// Estrutura chave -> valor
// Aceita valores núlos
// Busca, Inserção e Remoção O(1)

// HashSet
// Guarda somente valores únicos
// Internamente usa o HashMap com valor fixo


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapXHashSet {
    public static void main(String[] args) {
        // HashMap:
        Map<String, Integer> idade = new HashMap<>();
        idade.put("Lucas", 8);
        idade.put("Leandro", 20);
        System.out.println(idade.get("Lucas")); // 8

        // HashSet:
        Set<String> nomes = new HashSet<>();
        nomes.add("Lucas");
        nomes.add("Lucas");
        nomes.add("Lucas");
        System.out.println(nomes.size()); // 1
    }
}
