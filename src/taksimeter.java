import java.util.Scanner;
public class taksimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gidilenYol,yolUcret,acılıslıUcret,kmucret,acılıs,tamHesap, minimumucret;

        //KM başına ücret:
        kmucret = 2.20;
        //Taksimetre açılış ücreti:
        acılıs = 10;
        //Minimum ücret:
        minimumucret = 20;


        //İlk önce kullanıcıdan ne kadar yol gidildiğini almalıyız.
        System.out.println("<<<<<<<HOŞGELDİNİZ>>>>>>>>");
        System.out.print("Gidilen toplam yolu giriniz (KM): ");
        gidilenYol = input.nextDouble();

        //Kullanıcıya uyarı olarak ücretleri göstermeliyiz.
        System.out.println("!!!!!!!! DİKKAT '!!!!!!!");
        System.out.println("KM başına düşen fiyat " + kmucret + "TL olarak hesaplanacaktır.");
        System.out.println("Taksimetrenin açılış fiyatı da " + acılıs + "TL'dir.");
        System.out.println("Eğer fiyat " + minimumucret + "TL ve aşağısı ise yinede " + minimumucret + "TL ödenecektir.");

        //Her KM başına 2.20TL tutacak şekilde hesaplatmalıyız.
        yolUcret = gidilenYol *kmucret;

        //Açılış ücretini 10TL diye belirtip, gidilen yola bunu eklemeliyiz.
        acılıslıUcret = yolUcret + acılıs;

        //Eğer formulü ile en az 20TL verebilecek şekilde ayarlamalıyız.
        tamHesap = (acılıslıUcret <= minimumucret)? minimumucret: acılıslıUcret;

        //Bundan sonra ekrana sonucu yazdırmalıyız.
        System.out.println("--> Ödenmesi Gereken Üret <--");
        System.out.println("----------- " + tamHesap + "TL ------------");
    }
}
