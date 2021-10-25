package fatih_tasdemir_etiya_otomat;
import java.util.Scanner;

public class Machine {

	

	//coin nesnesi
	Coin c = new Coin();
	
	
	//constructor
	Machine(){
		
		
	
	}
	
	
	public void Start() {
		//
		int select=0;
		int select2=0;
		int select3=0;
		 Scanner s = new Scanner(System.in);
		
		while(select!=8) {
			
			select2=0;//PARA EKLEME MENUSUNDEN CIKTIKTAN SONRA TEKRAR GIREBILMESI ICIN SELECT2 0 OLDU
			select3=0; //URUN ALMA MENUSUNDEN CIKTIKTAN SONRA TEKRAR GIREBILMESI ICIN SELECT3 0 OLDU  
			
			//ANA MENU
			System.out.println("*********************************************" );
			System.out.println("ICECEK OTOMATI\n");
			System.out.println("GUNCEL BAKIYE: " + c.get_totalMoney() + "TL \n");
			System.out.println("MENU:");
			System.out.println("1-) PARA EKLEME");
			System.out.println("2-) URUN ALMA");
			System.out.println("3-) PARA IADE");
			System.out.println("8-) CIKIS");
			System.out.println("*********************************************" );
			
			//1. while için SCANNER
			select= s.nextInt();
			
			switch (select) {
			
			
			  case 1://para ekleme menü
				  
				  while(select2!=8) {
					 
				System.out.println("*********************************************" );
				System.out.println("ICECEK OTOMATI\n");
				System.out.println("GUNCEL BAKIYE: " + c.get_totalMoney() + "TL \n");
			    System.out.println("SADECE ASAGIDAKI PARA BIRIMLERI GECERLIDIR.");
				System.out.println("1-) 50 KURUS");
				System.out.println("2-) 1 TL");
				System.out.println("3-) 5 TL");
				System.out.println("4-) 10 TL");
				System.out.println("8-) UST MENU");
				System.out.println("*********************************************" );
				 
				 //SCANNER2
				 select2= s.nextInt();
				switch (select2) {
				
case 1://50 kuruþ ekleme
					
				c.set_totalMoney(0.50);
					
					break;
case 2://1 tl ekleme
					
				c.set_totalMoney(1);
					
					break;
case 3://5tl ekleme
	
				c.set_totalMoney(5);
	
	break;
				
case 4://10tl ekleme
	
				c.set_totalMoney(10);

	
	break;
				}
				
				  }
			    break;
			    
			    
			     
			    
			    
			    
			    
			    
			    
			  case 2://urun seçme menu
				  	System.out.println("*********************************************" );
				  	System.out.println("ICECEK OTOMATI\n");
				    System.out.println("BAKIYENIZ "+ c.get_totalMoney() + " TL \n");
				    System.out.println("ICECEK MENU:");
					System.out.println("1-) COLA 15TL");
					System.out.println("2-) FANTA 20TL");
					System.out.println("3-) GAZOZ 30TL");
					System.out.println("8-) UST MENU\n");
					System.out.println("*********************************************" );
					
					
					 select3= s.nextInt();
					 
					
						 
						 
					
					//cola satýn alma durumu
					 System.out.println("*********************************************" );
					 System.out.println("ICECEK OTOMATI\n");
					 if(select3==1 && c.get_totalMoney()>= 15 ) {
						
						 System.out.println("COLA SATIN ALDINIZ.");
						 System.out.println("GUNCEL BAKIYE: "+ c.get_remainingMoney(15) + "TL");
						 
						//para iadesi bildirimi
						 c.findRefund();
						
						
					 }
					//cola yetersiz bakiye
					 else if(select3==1 && c.get_totalMoney()< 15 ) {
						 
						 System.out.println("YETERSIZ BAKIYE!");
						 System.out.println("SIZI BIR UST MENUYE AKTARIYORUZ. PARA EKLEYEBILIRSINIZ.");
					 }
					 
					 
					//fanta satýn alma durumu
					 if(select3==2 && c.get_totalMoney()> 20 ) {
						 
						 System.out.println("FANTA SATIN ALDINIZ.");
						 System.out.println("GUNCEL BAKIYE: "+ c.get_remainingMoney(20) + "TL");
						 
						
				 c.findRefund();
					 }
					 
					//fanta yetersiz bakiye
					 else if(select3==2 && c.get_totalMoney()< 20 ) {
						 
						 System.out.println("YETERSIZ BAKIYE!");
						 System.out.println("SIZI BIR UST MENUYE AKTARIYORUZ. PARA EKLEYEBILIRSINIZ.");
					 }
					 
					 
					//gazoz satýn alma durumu
					  if(select3==3 && c.get_totalMoney()> 30 ) {
						 
						  System.out.println("GAZOZ SATIN ALDINIZ.");
							 System.out.println("GUNCEL BAKIYE: "+ c.get_remainingMoney(30) + "TL");
							 
							
					 c.findRefund();
						 
					 }
					//gazoz yetersiz bakiye
					  else if(select3==3 && c.get_totalMoney()< 30 ) {
							 
							 System.out.println("YETERSIZ BAKIYE!");
							 System.out.println("SIZI BIR UST MENUYE AKTARIYORUZ. PARA EKLEYEBILIRSINIZ.");
						 }
					
					  System.out.println("*********************************************" );
				    break;
				    
				
				    //ana menüdeki para iade
			  case 3:
				  System.out.println("*********************************************" );
				  System.out.println("ICECEK OTOMATI\n");
				  c.findRefund();
				  System.out.println("*********************************************" );
				  break;
			
		}
		
		
		
	}
	
		 System.out.println("IYI GUNLER DILERIZ!");
	}
	
}
