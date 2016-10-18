package comandaDigital.view.menu;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuUsuarioMaster;

public class MenuUsuarioMaster {
	
	private static MenuUsuarioMaster instance;

    private static MenuUsuarioMaster getIntance() {
        return instance;
    }

    private static void setInstance(MenuUsuarioMaster aInstance) {
        instance = aInstance;
    }

    public static MenuUsuarioMaster getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuUsuarioMaster());
        }

        return getIntance();

    }
    
    public void getMenuUsuarioMaster() {

    		Scanner scan = new Scanner(System.in);
    		int opcaoMenuUsuarioMaster = 0;
    		boolean flagMenuUsuarioMaster = true;

    		while (flagMenuUsuarioMaster) {
    			
    			boolean flagMenu = true;
    			
    			System.out.println("************************************");
    			System.out.println("*	 Menu Usu�rio Master   *");
    			System.out.println("************************************");
    			System.out.println("*  1) Clientes            *");
    			System.out.println("*  2) Funcion�rios        *");
    			System.out.println("*  3) Usu�rioas           *");
    			System.out.println("*  4) Comanda Digital     *");
    			System.out.println("*  5) Relat�rios          *");
    			System.out.println("*  6) Estoque             *");
    			System.out.println("*  0) Sair                *");
    			System.out.println("************************************\n\n");
    			
    			while (flagMenu) {
    				
    				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
    				opcaoMenuUsuarioMaster = scan.nextInt();
    				
    				if (opcaoMenuUsuarioMaster > 0 && opcaoMenuUsuarioMaster < 6) {
    					
    					ValidaMenuUsuarioMaster.getInstance().opcaoMenuUsarioMaster(opcaoMenuUsuarioMaster);
    					flagMenu = false;
    					
    				} else if (opcaoMenuUsuarioMaster == 0) {
    					
    					flagMenu = false;
    					flagMenuUsuarioMaster = false;
    					
    				} else {
    					
    					flagMenu = true;
    					
    				}
    				
    			}
    			
    		}

    	}
    
}
