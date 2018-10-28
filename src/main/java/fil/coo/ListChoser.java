package fil.coo;

import fil.coo.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class ListChoser {

	// Definir la methode chose, qui prend en premier parametre
	// un message sous forme de chaine de caracteres et en second une liste.
	// Cette liste est typee mais sans restriction sur les types admis.
	// Cette methode propose de choisir un element de la liste en saisissant
	// sa position dans la liste.
	// L'element choisi est retourne par la methode, null si le choix 0 est
	// fait.
	public <T> T chose(String msg,List<T> list) throws java.lang.InterruptedException{
		int u;
		int l=list.size();
		for (u=1;u<=l;u++){
			System.out.println(u + " => " + list.get(u-1));
		}
		TimeUnit.SECONDS.sleep(1);
		System.out.println(msg);
		int i=ScannerInt.readInt(l+1);
		return list.get(i-1);
	}


}
