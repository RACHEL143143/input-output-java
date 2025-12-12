import java.util.Scanner;
public class Dateofbirth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int date=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        System.out.println(date+"/"+month+"/"+year);
    }
    
}
