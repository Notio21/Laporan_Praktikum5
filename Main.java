public class Main {
    public static void main(String[] args){
        // Membuat objek dan beri nilai
        Pegawai notio = new Pegawai("Notio", 5000000);
        Manager adi= new Manager ("Adi", 6000000, 4000000);
        Programmer rudi= new Programmer ("Rudi", 5500000, 1500000);

        // Memanggil atribut
        notio.cetakInfo();
        adi.cetakInfo();
        rudi.cetakInfo();
    }
}
