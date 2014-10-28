package Arrayslist;


import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class ArraysList
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list0 = new ArrayList<int[]>();
            list0.add(new int[5]);
            list0.add(new int[2]);
            list0.add(new int[4]);
            list0.add(new int[7]);
            list0.add(new int[0]);

        for (int[] array : list0)
        {

            for (int j = 0; j < array.length; j++)
            {
                array[j] =  (int)(100.0 * (Math.random()));
            }
        }
        return list0;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.print(" " + x);
            }
            System.out.println();
        }
    }
}