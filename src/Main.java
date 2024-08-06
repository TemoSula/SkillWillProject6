import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //This is task 1
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Russian");
        languages.add("English");
        languages.add("Spanish");
        languages.add("Hindi");
        languages.add("Portuguese");
        languages.add("French");
        languages.add("Arabic");
        languages.add("German");
        languages.add("Bengali ");
        languages.add("Japanese ");

        for(String lang : languages)
        {
            System.out.println(lang);
        }




        //This is task 2

        ArrayList<Integer> myint = new ArrayList<>();
        myint.add(2);
        myint.add(54);
        myint.add(2322);
        myint.add(12);
        ArrayList<Integer> myint2 = new ArrayList<>();
        myint2.add(2322);
        myint2.add(122);
        myint2.add(123);
        myint2.add(532);

        myMethod(myint,myint2);


    }


         public static void myMethod(ArrayList<Integer> myNum1, ArrayList<Integer> myNum2)
         {
             ArrayList<Integer> allList = new ArrayList<>(myNum1);
             allList.addAll(myNum2);

             System.out.println(Collections.max(allList));

         }

}