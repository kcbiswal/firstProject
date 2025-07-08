package Variables;

public class StaticVariables {
    static int  count=0;

    StaticVariables() {
        count++;
        System.out.println("object created .count" + count);

    }
    public static void main(String[] args) {

            StaticVariables s1= new StaticVariables();
            StaticVariables s2= new StaticVariables();
            StaticVariables s3= new StaticVariables();


        }
    }
