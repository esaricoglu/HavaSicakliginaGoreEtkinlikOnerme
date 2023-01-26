package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını giriniz: ");
        int heat = input.nextInt();

        if(heat<5){
            System.out.println("Kayak yap.");
        }
        if((5<=heat) && (heat<15)){
            System.out.println("Sinemaya git.");
        }
        if((15<=heat)&&(heat<25)){
            System.out.println("Piknik yap.");
        }
        if(25<=heat){
            System.out.println("Yüzmeye git.");
        }
    }
}
