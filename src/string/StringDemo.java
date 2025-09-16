package string;

import collections.Student;

public class StringDemo {
    public static void main(String[] args) {


      /*  String s1= "kanha";
        String s2= "rajesh";
      //concat method
        String s3=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1);
        */
//       /*//contains
//        String s3="Narasinghpur";
//        boolean b=s3.contains("nas");
//        System.out.println(b);
//        */

       //append
        StringBuffer bf=new StringBuffer("kanha ");
        bf.append("biswal ");
        System.out.println(bf);

        bf.insert(6,"charan ");
        System.out.println(bf);

        bf.replace(6,12,"chutia");
        System.out.println(bf);




    }
}
