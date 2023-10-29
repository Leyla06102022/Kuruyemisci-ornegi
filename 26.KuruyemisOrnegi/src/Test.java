

public class Test {

	public static void main(String[] args) {
	
	   /* Bir kuruyemişçi toptancıdan;
		
		12 kilo leblebiyi kilosunu 3.5 TL
		25 kilo fındık kilosunu 15.7 TL
		40 kilo badem kilosunu 22 TL den almıştır.
		
		Bu ürünleri satarken,
		
		Leblebinin kilosunu %50 fazlasına 
		Fındığın kilosunu %40 fazlasına
		Bademin kilosunu %60 fazlasına satmıştır.
		
		Kuruyemişçi o gün kazandığı para ile dükkanın parasını ödemek istemektedir.
		
		kira tutarı : 500 TL
		Kazandığı para 500 TL den fazla ise kirayı ödeyebilsin değilse ödeyemesin...
		*/
		// FİYATLAR
		
		double leblebi = 3.5;
		double fındık = 15.7;
		double badem = 22;
		
		double maliyetTutar = (leblebi*12)+(fındık*25)+(badem*40);
		
		double satisTutar = ((leblebi*1.5)*12+(fındık*1.4)*25+(badem*1.6)*40);
		
		double karTutar = (satisTutar-maliyetTutar);
		
		if (karTutar>500) {
			System.out.println("Kirayi odeyebilirsiniz:))");
		}
		else {
			System.out.println("Kira icin yeterli para yoktur.");
		}
		System.out.println("Maliyet:"+ maliyetTutar);
		System.out.println("Satis:"+satisTutar);
		System.out.println("Kar:"+karTutar);
		
		
	}

}
