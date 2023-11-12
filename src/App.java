import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Member member1 = new MemberReguler();
        Member member2 = new MemberSilver();
        Member member3 = new MemberGold();
        Member member4 = new MemberPlatinum();

        MemberSilver silverMember = new MemberSilver();
        MemberGold goldMember = new MemberGold();
        MemberPlatinum platinumMember = new MemberPlatinum();

        // Member Reguler
        System.out.print("Masukkan total belanja Member Reguler: Rp.");
        int belanja1 = scanner.nextInt();
        int totalBayar1 = member1.hitungTotalBayar(belanja1);
        System.out.println("Total bayar Member Reguler: Rp. " + totalBayar1);

        // Member Silver
        System.out.print("Masukkan total belanja Member Silver: Rp.");
        int belanja2 = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Silver:  ");
        int jarak2 = scanner.nextInt();
        int totalBayar2 = member2.hitungTotalBayar(belanja2);
        double jarakTujuan2 = silverMember.hitungOngkir(jarak2);
        System.out.println("Total bayar Member Silver: Rp. " + totalBayar2);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuan2);

        // Member Gold
        System.out.print("Masukkan total belanja Member Gold: ");
        int belanja3 = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Gold: ");
        int jarak3 = scanner.nextInt();
        int totalBayar3 = member3.hitungTotalBayar(belanja3);
        double jarakTujuan3 = goldMember.hitungOngkir(jarak3);
        double cicilan3 = totalBayar3 /12;
        System.out.println("Total bayar Member Gold: Rp." + totalBayar3);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuan3);
        System.out.println("Cicilan Per Bulan: Rp. " + cicilan3 + "/bulan");

        // Member Platinum
        System.out.print("Masukkan total belanja Member Platinum:Rp. ");
        int belanja4 = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Platinum:Rp. ");
        int jarak4 = scanner.nextInt();
        int totalBayar4 = member4.hitungTotalBayar(belanja4);
        double jarakTujuan4 = platinumMember.hitungOngkir(jarak4);
        double cicilan4 = totalBayar4 /12;
        System.out.print("Masukkan jumlah deposit untuk Member Platinum: ");
        int depositPlatinum = scanner.nextInt();
        int saldoPlatinum = platinumMember.deposit(depositPlatinum);
        System.out.println("Total bayar Member Platinum:Rp. " + totalBayar4);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuan4);
        System.out.println("Cicilan Per Bulan: Rp. " + cicilan4 + "/bulan");
        System.out.println("Saldo Member Platinum setelah deposit:Rp. " + saldoPlatinum);

        
        scanner.close();


}
}