import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        int sıcaklık;
        Scanner inp=new Scanner(System.in);
        System.out.println("Etkinlik önerme programı");
        System.out.println("Hava sıcaklığını giriniz;");
        sıcaklık=inp.nextInt();
        if(sıcaklık<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        else if(sıcaklık<=15 && sıcaklık>=5){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(sıcaklık>15 && sıcaklık<=25){
            System.out.println("Pikniğe gidebilirsiniz.");}
            else{
                System.out.println("Yüzmeye gidebilirsiniz.");

            }
        }

    }

