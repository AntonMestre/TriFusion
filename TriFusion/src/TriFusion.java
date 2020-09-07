
public class TriFusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// On fusionne deux tableau qui sont déjà trier par ordre croissant

		
		int[] tab1= {5,6,9,10,47};
		int[] tab2= {7,9,19,45,78};
		int i,i1,i2;
		
		int tailleTab = tab1.length + tab2.length;
		
		int[] tab = new int[tailleTab];
 		
		// Initialisation de la 1ere case de Tab
		if(tab1[0]<tab2[0]) {
			
			tab[0]=tab1[0];
			i1=1;
			i2=0;
			i=1;
			
		}else {
			
			tab[0]=tab2[0];
			i1=0;
			i2=1;
			i=1;
		}
		
		// Fusionner les 2 tableaux
		while(true) {
			
			if(i1==tab1.length || i2==tab2.length) {
				
				break;
			}
			
			if(tab1[i1]==tab[i]) {
				
				i1++;
			}else {
				
				if(tab2[i2]==tab[i]) {
					
					i2++;
				}else {
					
					if(tab1[i1]<tab2[i2]) {
						
						tab[i]=tab1[i1];
						i++;
						i1++;
					}else {
						
						tab[i]=tab2[i2];
						i++;
						i2++;
					}
					
				}
				
			}
			
		}
		
		//Tab1 Fini ?
		if(i1==tab1.length) {
			
			while(true) {
				
				if(i2==tab2.length) {
					
					break;
				}
				if(tab2[i2]==tab[i]) {
					
					i2++;
				}else {
					
					tab[i]=tab2[i2];
					i++;
					i2++;
				}
			}
		}else {
			
			while(true) {
				
				if(i1==tab1.length) {
					
					break;
				}
				if(tab1[i1]==tab[i]) {
					
					i1++;
				}else {
					
					tab[i]=tab1[i1];
					i++;
					i1++;
				}
				
			}
			
		}	
		
	}

}
