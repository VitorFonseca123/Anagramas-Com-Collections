
package testessss;


import java.util.*;
/**
 *
 * @author vitor
 */
public class Testessss {
    public static void main(String[] args) {
        String[] palavras = {
            "ana", "naa", "aan", "bobo", "obob", "lol"
        };

        List<String> p = Arrays.asList(palavras);
        HashMap<String, Set<String>> map = new HashMap<>();

        for (int i = 0; i < p.size(); i++) {
            char[] letras = p.get(i).toCharArray();
            Arrays.sort(letras);

            String chave = new String(letras);
            Set<String> conjunto = new HashSet<>();

            for (int j = 0; j < p.size(); j++) {
                char[] letras2 = p.get(j).toCharArray();
                String chave2 = new String(letras2);
                Arrays.sort(letras2);
                String temp = new String(letras2); 
                

                if (chave.equals(temp)) {
                    conjunto.add(chave2);
                }
            }

            map.put(chave, conjunto);
        }

        
        for (String key : map.keySet()) {
            System.out.println("Palavras com letras ordenadas: " + key);
            System.out.println("Palavras correspondentes: " + map.get(key));
            System.out.println();
        }
    }
}