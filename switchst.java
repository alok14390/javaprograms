package package1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchst {
    public static void main(String[] args) throws IOException {
        int day;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your day");
        day=Integer.parseInt(br.readLine());
        switch (day){
            case  1:
                System.out.println("monday");
                break;
            case  2:
                System.out.println("Tuesday");
                break;
            case  3:
                System.out.println("wednesday");
                break;
            case  4:

                System.out.println("Thursday");
                break;
            case  5:
                System.out.println("Friday");
                break;
            case  6:
                System.out.println("saturday");
                break;
            case  7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("you have entered a wrong day");
        }


    }
}
