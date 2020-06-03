package edunova;

import javax.swing.JOptionPane;

public class Z01 {
  //Korisnik unosi 3 broja
  //ispisuje se najveći
	public static void main(String[] args) {
		 int broj1=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj1"));
		 int broj2=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj2"));
		 int broj3=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj3"));
		
		 if(broj1 >= broj2 && broj1>=broj3) {
			 System.out.println(broj1);
			 
		 }else if (broj2 >= broj1 && broj2>=broj3) {
			 System.out.println(broj2);
		 }else  if(broj3 >= broj1 && broj3>=broj2) {
			 System.out.println(broj3);
		 }
		 
	}
}
