import java.util.*;

public class Main {
    public static String[] sortPeople(String[] names, int[] heights) {

        Integer[] index = new Integer[heights.length];

        for (int i = 0; i < heights.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);

        String[] result = new String[names.length];

        for (int i = 0; i < index.length; i++) {
            result[i] = names[index[i]];
        }

        return result;
    }

    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] sorted = sortPeople(names, heights);

        System.out.println(Arrays.toString(sorted));
    }
}

output:
[Mary, Emma, John]
