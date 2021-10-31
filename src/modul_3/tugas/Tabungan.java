package modul_3.tugas;
    public class Tabungan {
        private int saldo;

        public Tabungan(int saldo) {
            this.saldo = saldo;
        }
        public boolean ambiluang(int jumlah) {
            if (jumlah <= saldo) {
                saldo -= jumlah;
                return true;
            } else {
                return false;
            }
        }
        public int getSaldo(){
            return saldo;
        }
        public void simpanuang(int jumlah){
            saldo+=jumlah;
        }

}
