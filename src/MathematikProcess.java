import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MathematikProcess {


    private static LinkedList<Integer> numbersWithoutZeros = new LinkedList<>();
    private static LinkedList<String> stringsWithoutRep = new LinkedList<>();


    public static String calculatePercent(LinkedList<Integer> integerArrayList) {
        int xyz = integerArrayList.size();
        System.out.println("size is " + xyz);
        int divided = 0;
        int i = 0;
        while (xyz != 2) {
            System.out.println("below while loop " + integerArrayList.toString());
            xyz = integerArrayList.size();

            int j = integerArrayList.size() % 2 == 0 ? integerArrayList.size() / 2 : integerArrayList.size() / 2 + 1;

            i = 0;
            for (Iterator<Integer> iterator = integerArrayList.iterator(); iterator.hasNext(); ) {

                System.out.println("The value of  is integerArrayList.get( " + i + ") is " + integerArrayList.get(i) + ",and integerArrayList.get((integerArrayList.size() - 1) " + i + " is " + integerArrayList.get((integerArrayList.size() - 1) - i));

                if (xyz == 3) {
                    integerArrayList.set(0, integerArrayList.get(0) + integerArrayList.get(2));
                    i++;
                    break;
                } else {
                    if (xyz == 2) {
                        break;
                    }
                    integerArrayList.set(i, integerArrayList.get(i) + integerArrayList.get((integerArrayList.size() - 1) - i));
                    i++;
                }
                System.out.println(integerArrayList.toString());
                if (i == j) {
                    break;
                }
            }
            System.out.println();
            for (int m = integerArrayList.size() - 1; m > integerArrayList.size() / 2; m--) {
                integerArrayList.remove(m);
                if (m == xyz / 2) {
                    System.out.println(integerArrayList.toString());
                    break;
                }
            }
            if (xyz == 2) {
                if (integerArrayList.get(0) >= 10) {
                    System.out.println(integerArrayList.get(0) + ",----->" + integerArrayList.get(1));
                    divided = integerArrayList.get(0) / 10 + integerArrayList.get(1);
                    integerArrayList.set(1, integerArrayList.get(0) % 10);
                    integerArrayList.set(0, divided);
                }
            }
        }
        System.out.println(integerArrayList.get(0) + integerArrayList.get(1) + "%");
        System.out.println(String.valueOf(integerArrayList.get(0)) + String.valueOf(integerArrayList.get(1)) + "%");
        return String.valueOf(integerArrayList.get(0)) + String.valueOf(integerArrayList.get(1)) + "%";
    }



    public static LinkedList<Integer> eliminateZeros(LinkedList<Integer> integers) {

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) != 0) {
                numbersWithoutZeros.add(integers.get(i));
            }
        }

        System.out.println("inside eliminate zeros methods " + numbersWithoutZeros.toString());
        return numbersWithoutZeros;
    }

    public static LinkedList<String> eliminateRepetition(ArrayList<String> stringlists) {

        List<String> copy = new LinkedList<>();
        List<Integer> ints = new LinkedList<>();
        for (int j = 0; j < stringlists.size(); j++) {
            copy.add(stringlists.get(j));
        }

        for (int i = 0; i < stringlists.size(); i++) {

            for (int j = 0; j < stringlists.size(); j++) {


                if(copy.get(i).equals(stringlists.get(j))){
                    ints.add(j);
                }
            }
        }
        System.out.println(ints.toString());


        return  stringsWithoutRep;


    }

}
