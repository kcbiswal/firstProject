import Conditions.Ifelse;
import Method.Firstmethod;
import Method.Parameter;
import Method.Returntype;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Firstmethod.myMethod();
        Parameter.methodParameter("kanhu",27);
        int z=Returntype.returnMethod(5,8);
        System.out.println(z);
        Ifelse.ifElseConditions();
//        int[] result = Printarray.arrayPrinter();
//        System.out.println(Arrays.toString(result));




    }
}