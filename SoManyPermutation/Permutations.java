package SoManyPermutation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Permutations {
    private static String[] cases;

    public static void main(String []args) {
        singlePermutations("ab");
    }
    public static List<String> singlePermutations(String s) {
        cases = s.split("");
        var res = Arrays.asList(cases).stream()
            .map(Permutations::getCombination);

        Set<String> response = new HashSet<>();
        res.toList().stream().forEach(val -> response.addAll(val));
        return response.stream().toList();
    }

    private static Set<String> getCombination(String comb) {
        Set<String> res = new HashSet<>();
        for (int index = 0; index < cases.length; index++) {
            if(cases[index] != comb) {
                res.add(comb + cases[index]);
            }
        }
        return res;
    }
}