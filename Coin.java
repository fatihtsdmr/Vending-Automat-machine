package fatih_tasdemir_etiya_otomat;

public class Coin {
	
	
	private double totalmoney;
	
	
	//constructor
	Coin(){
		
		 totalmoney=0.0;
	}
	
	
	//coin nesnesindeki private paraya ula��labilmesi i�in set/get metotlar� 
	public void set_totalMoney(double x) {
		
		
		totalmoney = totalmoney + x;
	}
	
	
	public double get_totalMoney() {
		
		
		return totalmoney;
	}
	
	//�r�n sat�n al�m�ndan sonra para �st� hesaplama metodu
	public double get_remainingMoney(double x) {
		
		 totalmoney= totalmoney-x;
		return  totalmoney;
		
		
	}
//para �st�n�n nas�l iade edilece�i hesaplamas� ve bildirimi metodu
	public void findRefund() {
		int tl_10;
		int tl_5;
		int tl_1;
		int krs_50;
		
		
		if(totalmoney==0.0) {
			
			System.out.println("BAKIYE BULUNMAMAKTADIR.");
			
			
		}
		
		
		else if(totalmoney!=0.0) {
			
			//para iadesi i�in ka� tane 10tl oldu�u hesaplamas�
			tl_10= (int)totalmoney/10;
			totalmoney=totalmoney%10;
			
			
			 System.out.print("PARANIZI ");
			
			if(tl_10!=0) {
				System.out.print(tl_10 + "ADET 10TL, ");
				
			}
			
			//para iadesi i�in ka� tane 5tl oldu�u hesaplamas�
			tl_5= (int)totalmoney/5;
			totalmoney=totalmoney%5;
			
			if(tl_5!=0) {
				System.out.print(tl_5 + "ADET 5TL, ");
				
			}
			
			//para iadesi i�in ka� tane 1tl oldu�u hesaplamas�
			tl_1= (int)totalmoney/1;
			totalmoney=totalmoney%1;
			
			if(tl_1!=0) {
				System.out.print(tl_1 + "ADET 1TL,");
				
			}
			
			//para iadesi i�in ka� tane 50 kurus oldu�u hesaplamas�
			krs_50= (int)(totalmoney/0.5);
			totalmoney=totalmoney%0.5;
			
			if(krs_50!=0) {
				System.out.print(krs_50 + "ADET 50 KRS, ");
				
			}
			
			
			 System.out.println("OLARAK GERI IADE EDIYORUZ.\n");
			
		}
		
	
		
	}
	
	
	
	
	
	

}
