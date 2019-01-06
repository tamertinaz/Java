package tost;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tost sade = new Tost("Sade bir Tost","beyaz ekmek","Beyaz Peynir",15);
		sade.ilaveUrun1Ekle("Patates Kýzartmasý", 5);
		sade.ilaveUrun2Ekle("Sos", 4);
		sade.ilaveUrun3Ekle("Kola", 8);
		sade.ilaveUrun4Ekle("Domates", 7);
		sade.yiyecekicecekBilgileri();
		double toplamTutar = sade.yiyecekicecekBilgileri();
		System.out.println("TOPLAM TUTAR : "+toplamTutar);
		System.out.println();
		
		SaglikliTost sekerHastalarinaUygun = new SaglikliTost("Hindi", 20);
		sekerHastalarinaUygun.yiyecekicecekBilgileri();
		sekerHastalarinaUygun.ilaveSaglikliUrun1("Domates", 4);
		sekerHastalarinaUygun.ilaveSaglikliUrun2("sos", 6);
		toplamTutar = sekerHastalarinaUygun.yiyecekicecekBilgileri();
		System.out.println("TOPLAM TUTAR :"+toplamTutar);
		System.out.println();
		
		AyvalikTostu doyurucu = new AyvalikTostu();
		toplamTutar = doyurucu.yiyecekicecekBilgileri();
		System.out.println("TOPLAM TUTAR :"+toplamTutar);

	}

}
