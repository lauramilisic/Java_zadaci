package edunova;

public class UvijetnoGrananjeIf {
	
  public static void main(String[] args) {
	  int i=2;
	  
	  boolean uvjet = i==1;
		//osnovna izvedba if naredbe
	  if(uvjet) {
		  System.out.println("OK");
	  }
		
	  if(i==2 ) {
		  System.out.println("2");
	  }
		i=-4;	  
	  if(i>0) {
		  System.out.println("Veće");
		 
	  } else {
		  System.out.println("Manje ili jednako");
	  }
	    //bad pratice
	  
	  if(i>=0)
		  System.out.println("Veće jednako od 0");
	      System.out.println("I ovo je veće od nule");
	      
	      int j=1;
	      //& logički i 
	      if(i<0 & j>0) {
	    	  System.out.println("Zadovoljena oba uvijeta");
	      }
	      
	      if(i<0 && j>0) {
	    	  System.out.println("Zadovoljena oba uvjeta");
	      }
	      
	   // && u slučaju ne zadovoljenja prvog uvjeta
	   // drugi se ne provjerava
	   if(i<0 && j>0) {
	   System.out.println("ZOB");
	   }
	  
	  
	      
	   if(i%2==0) {
		  
	   }else if (i%3==0) {

	   }else if (i%4==0) {}
  
	   
	   if (i>0) {
		   System.out.println("OK");
		   
	   }esle {
		   System.out.println("NE");
	   }
	   System.out.println((i>0) ? "OK" : "NE")
	   ;
}
}
