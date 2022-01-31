import java.util.ArrayList;

public class ArrayUtil
{
    public static   <T extends Comparable<T>> ArrayList<T> removeRepeatedElements(ArrayList <T> array){
        for (int i=0; i< array.size() - 1 ; i++){

            for (int j = 0; j< array.size() - 1 ; j++){

                if (array.get(i).compareTo(array.get(j)) == 0) {
                    array.remove(i);
                }

            }
        }
        return array;

    }
}
