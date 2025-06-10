package hitung;

public class matematika {
     //variabell
    double bil1, bil2;
    
    //constructor
     public matematika(double bil1, double bil2) {
         this.bil1 = bil1;
         this.bil2 = bil2;
     }
     
     //setpenjumlahan
     double setPenjumlahan(){
         return bil1 + bil2;
     }
     
     //setpengurangan
     double setPengurangan(){
         return bil1 - bil2;
     }
     
     //setperkalian
     double setPerkalian(){
         return bil1 * bil2;
     }
     
     //setpembagian
     double setPembagian(){
         return bil1 / bil2;
     }
}
