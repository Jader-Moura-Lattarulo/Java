<<<<<<< HEAD
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = tamanhoTela.width;
        int altura = tamanhoTela.height;
        
        System.out.println("Sua tela tem resolução: " + largura + " X " + altura);
    }
    
}
=======
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = tamanhoTela.width;
        int altura = tamanhoTela.height;
        
        System.out.println("Sua tela tem resolução: " + largura + " X " + altura);
    }
    
}
>>>>>>> 9ae903981538b1a9ec625e1ceaefbc4b989beec8
