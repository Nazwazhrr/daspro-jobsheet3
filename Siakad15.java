import java.util.Scanner;
public class Siakad15 { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUas, nilaiUts, nilaiAkhir;
    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan Nim: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas: ");
    kelas= sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte(); 
    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai Uas: ");
    nilaiUas = sc.nextDouble();
    System.out.print("Masukkan nilai Uts: ");
    nilaiUts = sc.nextDouble();
    nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUas * 0.35) + (nilaiUts * 0.30);
    System.out.println("Nama: " + nama + " NIM: " + nim);
    System.out.println("Kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir);

    }

}