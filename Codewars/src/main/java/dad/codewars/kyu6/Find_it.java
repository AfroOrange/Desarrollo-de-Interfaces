package dad.codewars.kyu6;

import java.util.List;
import java.util.Collections;

public class Find_it {
    public static int findIt(List<Integer> seq) {
        for (int i : seq) {
            if (Collections.frequency(seq, i) % 2 == 0) {
                i++;
            } else {
                return i;
            }
        }
        return 0;
    }
}
