
public class exam{
    public static void main(String[] args){
        int angka = 10;
        long biner = 0;
        
        int convert,i = 1;
        
        while(angka!=0){
            convert = angka%2;
            angka/= 2;
            biner += convert*i;
            i*=10;
            
        }
        System.out.print(biner);
    }
}