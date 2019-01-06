package tost;

public class Tost {
	
	private String ismi;
	private String ekmekTuru;
	private String etTuru;
	private double ucreti;
	
	private String ilaveUrun1;
	private double ilaveUrun1Ucreti;
	private String ilaveUrun2;
	private double ilaveUrun2Ucreti;
	private String ilaveUrun3;
	private double ilaveUrun3Ucreti;
	private String ilaveUrun4;
	private double ilaveUrun4Ucreti;
	


	public Tost(String ismi, String ekmekTuru, String etTuru, double ucreti) 
	{
		
		this.ismi = ismi;
		this.ekmekTuru = ekmekTuru;
		this.etTuru = etTuru;
		this.ucreti = ucreti;
	}
	
	public double yiyecekicecekBilgileri()
	{
		double toplamUcret = this.ucreti;
		System.out.println(
				"Hamburger Ad� : "+this.ismi
				+"\nEkmek T�r� : "+this.ekmekTuru
				+"\nEt T�r� : "+this.etTuru
				+"\nFiyat� : "+this.ucreti);
		
		if (this.ilaveUrun1 != null) 
		{
			toplamUcret += this.ilaveUrun1Ucreti;
			System.out.println("�lave �r�n 1 : "+this.ilaveUrun1
								+"\n�lave �r�n 1 �creti : "+this.ilaveUrun1Ucreti);
			
		}
		if (this.ilaveUrun2 != null) 
		{
			toplamUcret += this.ilaveUrun2Ucreti;
			System.out.println("�lave �r�n 2 : "+this.ilaveUrun2
								+"\n�lave �r�n 2 �creti : "+this.ilaveUrun2Ucreti);
			
		}
		if (this.ilaveUrun3 != null) 
		{
			toplamUcret += this.ilaveUrun3Ucreti;
			System.out.println("�lave �r�n 3 : "+this.ilaveUrun3
								+"\n�lave �r�n 3 �creti : "+this.ilaveUrun3Ucreti);
			
		}
		if (this.ilaveUrun4 != null) 
		{
			toplamUcret += this.ilaveUrun4Ucreti;
			System.out.println("�lave �r�n 4 : "+this.ilaveUrun4
								+"\n�lave �r�n 4 �creti : "+this.ilaveUrun4Ucreti);
			
		}
		
		
		
		return toplamUcret;
		
	}
	
	
	
	
	public void ilaveUrun1Ekle(String adi, double ucreti)
	{
		this.ilaveUrun1 = adi;
		this.ilaveUrun1Ucreti = ucreti;
	}
	
	public void ilaveUrun2Ekle(String adi, double ucreti)
	{
		this.ilaveUrun2 = adi;
		this.ilaveUrun2Ucreti = ucreti;
	}
	
	public void ilaveUrun3Ekle(String adi, double ucreti)
	{
		this.ilaveUrun3 = adi;
		this.ilaveUrun3Ucreti = ucreti;
	}
	
	public void ilaveUrun4Ekle(String adi, double ucreti)
	{
		this.ilaveUrun4 = adi;
		this.ilaveUrun4Ucreti = ucreti;
	}
	


	public String getIsmi() {
		return ismi;
	}

	public void setIsmi(String ismi) {
		this.ismi = ismi;
	}

	public String getEkmekTuru() {
		return ekmekTuru;
	}

	public void setEkmekTuru(String ekmekTuru) {
		this.ekmekTuru = ekmekTuru;
	}

	public String getEtTuru() {
		return etTuru;
	}

	public void setEtTuru(String etTuru) {
		this.etTuru = etTuru;
	}

	public double getUcreti() {
		return ucreti;
	}

	public void setUcreti(double ucreti) {
		this.ucreti = ucreti;
	}
	
	
	
	
	
	
	
	
	
	
	

}
