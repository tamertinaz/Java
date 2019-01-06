package tost;

public class SaglikliTost extends Tost{
	
	private String ilaveSaglikliUrun1;
	private double ilaveSaglikliUrun1Ucreti;
	
	private String ilaveSaglikliUrun2;
	private double ilaveSaglikliUrun2Ucreti;
	

	public SaglikliTost(String etTuru, double ucreti) {
		super("Saðlýklý Burger", "Kepekli Ekmek", etTuru, ucreti);
		// TODO Auto-generated constructor stub
	}
	
	public void ilaveSaglikliUrun1(String ad, double fiyat)
	{
		this.ilaveSaglikliUrun1 = ad;
		this.ilaveSaglikliUrun1Ucreti = fiyat;
	}
	public void ilaveSaglikliUrun2(String ad, double fiyat)
	{
		this.ilaveSaglikliUrun2 = ad;
		this.ilaveSaglikliUrun2Ucreti = fiyat;
	}
	
	@Override
	public double yiyecekicecekBilgileri() {
		// TODO Auto-generated method stub
		double toplamUcret =  super.yiyecekicecekBilgileri();
		if (this.ilaveSaglikliUrun1 != null) 
		{
			toplamUcret += ilaveSaglikliUrun1Ucreti;
			System.out.println("Ýlave Saðlýklý Ürün 1 : "+this.ilaveSaglikliUrun1Ucreti);		
			
		}
		if (this.ilaveSaglikliUrun2 != null) 
		{
			toplamUcret += ilaveSaglikliUrun2Ucreti;
			System.out.println("Ýlave Saðlýklý Ürün 2 : "+this.ilaveSaglikliUrun2Ucreti);		
			
		}
		
		return toplamUcret;
	}
	
	
	
	

	

}
