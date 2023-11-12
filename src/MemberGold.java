public class MemberGold extends Member implements CanRequestCicilan, CanRequestDelivery {

    @Override
    public int hitungTotalBayar(int jumlahBelanja){
        if(jumlahBelanja >= 500000 && jumlahBelanja <=1000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 2/100);
        }
        else if (jumlahBelanja >1000000 && jumlahBelanja <=7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 4/100);
        }
        else if (jumlahBelanja <7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja*6/100);
        }
        return this.totalBayar;

    }

    @Override
    public int hitungCicilanPerBulan (int totalBelanja,int jumlahBulan){
        return hitungCicilanPerBulan(totalBelanja, jumlahBulan);
    }
    
    @Override
    public double hitungOngkir(double jarakTujuan){
        if (jarakTujuan >7){
            jarakTujuan = (jarakTujuan - 6.3)*1000.0;
            this.ongkir = Math.round(jarakTujuan *10.0)/10.0;
        }
        return ongkir;

    
  }
}
