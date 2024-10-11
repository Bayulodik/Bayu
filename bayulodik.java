import java.util.Scanner;

public class bayulodik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("decimal to binary");
        System.out.println("================");


        int user = input.nextInt();
        


        int[] binary = new int[50];
        int index = 0;
        while(user > 0) {
            binary[index++] = user%2;
            user = user/2;
            
            if(user >= 255){
                System.out.println("jumlah input terlalu besar!!");
                break;
            };
        } 
        for(int i=index-1;i>=0;i--) {
            System.out.println(binary[i]);
        }
        
        
    }
}