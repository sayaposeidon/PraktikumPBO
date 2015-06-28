/**
 * 
 */

/**
 * @author binbin07
 *
 */
public class icha {

	/**
	 * @param args
	 */
	
	static String Praktikum = "Praktikum Pertama PBO";//variabel global
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ini Laporan Praktikum Pertama Saya");
		laporan();
		biodata();
		penjumlahan();
		

	}
		public static void laporan()
		{
			System.out.println(Praktikum);
		}
		public static void biodata()
		{
			String nama ="St.Aisyah Abdullah"; // variabel local
			String nim  ="60200112011";
			String matakuliah ="PBO";
			System.out.println("Nama"+":" + nama + "\nNIM "+ ":" + nim + "\nPraktikum "+matakuliah );
		}
		public static void penjumlahan()
		{
			int a = 7+9;
			int b = 3+9;
			System.out.println("Hasil Penjumlahan = "+a);
			System.out.println("Hasil Penjumlahan = "+b);
			
		}
		
		
}
