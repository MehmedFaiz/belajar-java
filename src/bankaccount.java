public class bankaccount {
    private double saldo;
    public bankaccount(double saldoawal){
    this.saldo = saldoawal;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void deposit(double setor){
                if(setor > 0){
                    saldo += setor;
                    System.out.printf("Setor berhasil, saldo anda sekarang : Rp%,.2f\n", saldo);
                }else{
                    System.out.println("Setor gagal, jumlah tidak valid");
                }
    }
    public void withdraw(double tarik){
                if(tarik > 0 && tarik <= this.saldo){
                    saldo -= tarik;
                    System.out.printf("Tarik berhasil, Saldo anda saat ini : Rp%,.2f\n", saldo);
                }else if(tarik > this.saldo){
                    System.out.println("Maaf saldo anda tidak mencukupi");
                }else{
                    System.out.println("Maaf saldo anda tidak valid");
                }
    }
}
