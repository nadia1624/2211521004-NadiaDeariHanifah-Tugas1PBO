public abstract class Member implements CanGetPoin, CanGetDiskon {
    protected double ongkir = 0.0;
    protected int poin = 0;
    protected int totalBayar = 0;

    public int redeemPoin (int hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
        return this.poin; 
    }

    protected int getBonusPoin(int totalBayar){
        int poin = totalBayar - (totalBayar/10000);
        return poin;
    }

    public int getPoin(){
        int x= 0;
        if (this.totalBayar >=10000){
            for (int a = 10000; a<=this.totalBayar;){
                this.totalBayar = this.totalBayar - 10000;
                x++;
            }
            this.poin = this.poin + x;
        }
        return this.poin;
    }


   
}
