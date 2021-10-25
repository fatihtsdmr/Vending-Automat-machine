package fatih_tasdemir_etiya_otomat;

public class Coin {
	
	
	private double totalmoney;
	
	
	//constructor
	Coin(){
		
		 totalmoney=0.0;
	}
	
	
	//coin nesnesindeki private paraya ulaþýlabilmesi için set/get metotlarý 
	public void set_totalMoney(double x) {
		
		
		totalmoney = totalmoney + x;
	}
	
	
	public double get_totalMoney() {
		
		
		return totalmoney;
	}
	
	//ürün satýn alýmýndan sonra para üstü hesaplama metodu
	public double get_remainingMoney(double x) {
		
		 totalmoney= totalmoney-x;
		return  totalmoney;
		
		
	}
//para üstünün nasýl iade edileceði hesaplamasý ve bildirimi metodu
	public void findRefund() {
		int tl_10;
		int tl_5;
		int tl_1;
		int krs_50;
		
		
		if(totalmoney==0.0) {
			
			System.out.println("BAKIYE BULUNMAMAKTADIR.");
			
			
		}
		
		
		else if(totalmoney!=0.0) {
			
			//para iadesi için kaç tane 10tl olduðu hesaplamasý
			tl_10= (int)totalmoney/10;
			totalmoney=totalmoney%10;
			
			
			 System.out.print("PARANIZI ");
			
			if(tl_10!=0) {
				System.out.print(tl_10 + "ADET 10TL, ");
				
			}
			
			//para iadesi için kaç tane 5tl olduðu hesaplamasý
			tl_5= (int)totalmoney/5;
			totalmoney=totalmoney%5;
			
			if(tl_5!=0) {
				System.out.print(tl_5 + "ADET 5TL, ");
				
			}
			
			//para iadesi için kaç tane 1tl olduðu hesaplamasý
			tl_1= (int)totalmoney/1;
			totalmoney=totalmoney%1;
			
			if(tl_1!=0) {
				System.out.print(tl_1 + "ADET 1TL,");
				
			}
			
			//para iadesi için kaç tane 50 kurus olduðu hesaplamasý
			krs_50= (int)(totalmoney/0.5);
			totalmoney=totalmoney%0.5;
			
			if(krs_50!=0) {
				System.out.print(krs_50 + "ADET 50 KRS, ");
				
			}
			
			
			 System.out.println("OLARAK GERI IADE EDIYORUZ.\n");
			
		}
		
	
		
	}
	
	
	
	
	
	

}
