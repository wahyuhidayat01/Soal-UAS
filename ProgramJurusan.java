import java.io.*;
import java.util.Scanner;


public class ProgramJurusan{
	// static BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		
	    /*String nama = "Jimmy Rengga";
		int mtk = 100;
		int bindo = 80;
		int bing = 90;*/
	
		try{
		System.out.println("Masukkan Nama Anda : ");
		String nama = input.nextLine();
		System.out.println("Masukkan NEM Matematika : ");
		int mtk = input.nextInt();
		System.out.println("Masukkan NEM Bahasa Indonesia : ");
		int bindo = input.nextInt();
		System.out.println("Masukkan NEM Bahasa Indonesia : ");
		int bing = input.nextInt();
		
		int rata = ((mtk+bindo+bing)/3);
		int total = (mtk+bindo+bing);
		
		System.out.println("Program Hitung (1-3)" + "\n\t1.) Hitung Rata-rata" + "\n\t2.) Hitung jumlah total" + "\n\t3.) sarankan jurusan kuliah");
		System.out.println("Masukkan Pilihan Anda : ");
		int choose = input.nextInt();
			if(choose== 1){
			System.out.println("Hai "+nama+" Nilai Rata-rata NEM anda "+rata);
			}
			else if(choose==2){
			System.out.println("Hai "+nama+" Jumlah total nilai NEM anda adalah "+total);
			}
			else if(choose==3){
				if(mtk > bing && mtk > bindo){
				System.out.println("Hai "+nama+", Jurusan yang tepat untuk anda adalah Matematika, Komputer, dan Akutansi");
				} else if (bindo > bing && bindo > mtk){
				System.out.println("Hai "+nama+", Jurusan yang tepat untuk anda adalah Sastra Bahasa Indonesia");
				} else if (bing > mtk && bing > bindo){
				System.out.println("Hai "+nama+", Jurusan yang tepat untuk anda adalah Sastra Bahasa Inggris");
				} else if (mtk > bing && bindo > bing){
				System.out.println("Hai "+nama+", Jurusan yang tepat untuk anda adalah Komputer, Akutansi, dan Sastra Bahasa Indonesia");
				} else if (mtk > bindo && bing > bindo){
				System.out.println("Hai "+nama+", Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akutansi, dan Sastra Bahasa Inggris");
				} else if (bindo > mtk && bindo > mtk){
				System.out.println("Hai "+nama+", Jurusan yang tepat untuk anda adalah Sastra Bahasa Inggris, dan Sastra Bahasa Indonesia");
				} else if (mtk == bing && mtk == bindo && bindo == bing ){
				System.out.println("Hai "+nama+", Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akuntansi, Sastra Bahasa Indonesia, Dan Sastra Bahasa Inggris");
				}
			}
			else{
				throw new Exception("pilihan anda tidak ada !");
			}	
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
			