package comandaDigital.view.menu;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuGerente;

public class MenuGerente {
	
	private static MenuGerente instance;
	
	/**
	 * 
	 * @return
	 */
	
    private static MenuGerente getIntance() {
        return instance;
    }
    
    /**
     * 
     * @param aInstance
     */
    
    private static void setInstance(MenuGerente aInstance) {
        instance = aInstance;
    }
    
    /**
	 * Caso a variavel instance n�o estiver refer�ncia de nenhum ponto da
	 * mem�rio, associamos a ela um endere�o e instanciamos a pr�pria classe,
	 * transformando-a em uma classe assincr�na.
	 * 
	 * @author whesl
	 *
	 */
    public static MenuGerente getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuGerente());
        }

        return getIntance();

    }
    
    public void getMenuGerente() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuGerente = 0;
		boolean flagMenuGerente = true;

		while (flagMenuGerente) {
			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Gerente	     *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Funcion�rios        *");
			System.out.println("*  3) Comanda Digital     *");
			System.out.println("*  4) Relat�rios          *");
			System.out.println("*  5) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
				opcaoMenuGerente = scan.nextInt();
				
				if (opcaoMenuGerente > 0 && opcaoMenuGerente < 6) {
					
					ValidaMenuGerente.getInstance().opcaoMenuGerente(opcaoMenuGerente);
					flagMenu = false;
					
				} else if (opcaoMenuGerente == 0) {
					
					flagMenu = false;
					flagMenuGerente = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
			
		}

	}
    
}
