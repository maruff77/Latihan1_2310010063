package hitung;

public class matematikaberaksi {
    public static void main(String[] args) {
        //membuat objek
        matematika maruf = new matematika(6,3);
        
        System.out.println("Hasil Penjumlahan: " + maruf.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + maruf.setPengurangan());
        System.out.println("Hasil Perkalian: " + maruf.setPerkalian());
        System.out.println("Hasil Pembagian: " + maruf.setPembagian());
    }
}
