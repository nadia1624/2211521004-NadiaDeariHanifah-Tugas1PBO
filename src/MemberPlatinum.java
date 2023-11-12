public class MemberPlatinum extends Member implements CanDeposit, CanRequestCicilan, CanRequestDelivery {
    int saldo = 0;
    
    @Override
    public int deposit(int jumlahDeposit){
        this.saldo = this.saldo + jumlahDeposit;
        return this.saldo;
    }

    @Override
    public int tarikTunai(int jumlahTarikTunai){
        this.saldo = this.saldo - jumlahTarikTunai;
        return this.saldo;
    }

    @Override
    public int getSaldo(){
        return getSaldo();
    }

    public int cekSaldo(){
        return this.saldo;
    }

    @Override
    public int hitungCicilanPerBulan(int totalBelanja, int jumlahBulan){
        return hitungCicilanPerBulan(totalBelanja, jumlahBulan);

    }

    @Override
    public double hitungOngkir(double jarakTujuan){
        if(jarakTujuan>10){
            jarakTujuan = (jarakTujuan - 9.3)*1000.0;
            this.ongkir = Math.round(jarakTujuan*10.0)/10.0;
        }
        return this.ongkir;
    }

    @Override
    public int hitungTotalBayar(int jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja <= 1000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 3 / 100) ;
        } else if (jumlahBelanja > 1000000 && jumlahBelanja <= 7000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 5 / 100);
        } else if (jumlahBelanja > 7000000 && jumlahBelanja <= 10000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 7 / 100) - 1;
        } else if (jumlahBelanja > 10000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 7 / 100);
        } else {
            this.totalBayar = jumlahBelanja;
        }
        
        return this.totalBayar;
    }


    
}
