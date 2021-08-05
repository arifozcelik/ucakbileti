import java.util.Scanner;
public class ucakbileti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.println("mesafe giriniz: ");
        km = scan.nextInt();
        System.out.println("yas giriniz: ");
        yas = scan.nextInt();
        System.out.println("tip giriniz: ");
        tip = scan.nextInt();

        double normalfiyat,yasindirimi,tipindirimi;

        if(km > 0 && yas >= 12 && (tip == 1 || tip == 2)) {
            normalfiyat = km * 0.10;
            if(yas<22){
                yasindirimi = normalfiyat * 0.50;//indirim oranı hesaplanıyor
                normalfiyat = normalfiyat - yasindirimi;//fiyattan indirimi çıkarıyorum
            }else if(yas >= 12 && yas <= 24){
                yasindirimi= normalfiyat*0.10;
                normalfiyat -= yasindirimi;
            }else if(yas >= 65){
                yasindirimi = normalfiyat*0.30;
                normalfiyat -= yasindirimi;
            }else{
                yasindirimi = 0;
            }
            normalfiyat -= yasindirimi; //fiyattan indirim pauını çıkarıyorum
            if(tip==2){
                tipindirimi = normalfiyat*0.20;
                normalfiyat = (normalfiyat-tipindirimi)*2;
            }
            System.out.println("bilet tutar:" +normalfiyat);

        } else{
            System.out.println("Girdiler yanlış,değenlendirilemez!!");
        }
    }
}
