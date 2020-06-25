package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<KJlinika> klinike = new ArrayList<>();
        KJlinika k1 = new KJlinika("Svarcvald","Nemacka",150,1500,5600, KJlinika.TipKlinike.DRZAVNA_KLINIKA);
        klinike.add(k1);
        KJlinika k2 = new KJlinika("Bezanijska Kosa","Beograd,Srbija",56,250,800, KJlinika.TipKlinike.DRZAVNA_KLINIKA);
        klinike.add(k2);
        KJlinika k3 = new KJlinika("KCKg","Kragujevac, Srbija",120,500,450,KJlinika.TipKlinike.DRZAVNA_KLINIKA);
        klinike.add(k3);
        KJlinika k4 = new KJlinika("Beli Orao","Beograd, Srbija",56,2000,1200, KJlinika.TipKlinike.DRZAVNA_KLINIKA);
        klinike.add(k4);
        KJlinika k5 = new KJlinika("Braca Vucic","Subotica, Srbija",56,456,5000, KJlinika.TipKlinike.PRIVATNA_KLINIKA);
        klinike.add(k5);
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite opciju 1 ili 2");
        System.out.println(" 1 - klinika sa najvecom prosecnom platom ");
        System.out.println(" 2 - klinika sa najvie pacijenata");
        int opcija = input.nextInt();
        switch (opcija){
            case 1:
                System.out.println("Klikika sa najvisom prosecnom platom je " + najvecaProsecnaPlata(klinike));
                break;
            case 2:
                System.out.println("Klinika sa najvise pacijenata je: " + najvisePacijenata(klinike));
                break;
            default:
                System.out.println("Unesli ste pogresnu opciju");
                break;
        }
    }

    private static KJlinika najvisePacijenata(List<KJlinika> klinike) {
        KJlinika k = klinike.get(0);
        for(int i =1; i<klinike.size();i++){
            if(klinike.get(i).getBrojPacijenata()> k.getBrojPacijenata()){
                k= klinike.get(i);
            }
        }
        return k;
    }

    private static KJlinika najvecaProsecnaPlata(List<KJlinika> klinike) {
        KJlinika k = klinike.get(0);
        for(int i = 1; i<klinike.size();i++){
            if(klinike.get(i).getProsecnaPlata() > k.getProsecnaPlata()){
                k = klinike.get(i);
            }
        }
        return k;
        
    }
}
