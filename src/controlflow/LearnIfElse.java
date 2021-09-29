package controlflow;

public class LearnIfElse {

    public static void main(String[] args) {

        int number=55;
        int age=18;
        String name= "Iddir";

        if (age==25){
            System.out.println("your age is equal 25");
        } else{
            System.out.println("your age is not equal 25");
        }
        System.out.println("*************************************************");

        if (number>50 && age==18){
            System.out.println("you are good ");
        }else{
            System.out.println("you are out of service ");
        }

        System.out.println("*********************************************");
        if (age<15 || number==58){
            System.out.println("life is good ");

        } else{
            System.out.println("you are eligible for vote ");
        }

        System.out.println("***********************************");

        if (name=="Iddir" && age ==18 && number>55){
            System.out.println("you are perfect");
        } else{
            System.out.println("you have to do more ");
        }

    }
}
