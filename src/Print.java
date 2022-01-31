public class Print
{
    public static <E extends Iterable<E>> void printWithSemicolon(E something)
    {
        int i = 0;
        for (E e : something){
            System.out.println(e + ";");
            i++;
        }
    }
}
