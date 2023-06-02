/**
 * @author Rafael Macena Ribeiro Machado
 * @author 
 * @author
 * @author
 * @author
 */


package br.sp.petaltech.floriculturaalfa;


public class FloriculturaAlfa {

    public static void main(String[] args) {

        TelaInicial telaPrincipal = new TelaInicial();
        telaPrincipal.pack();
        telaPrincipal.setLocationRelativeTo(null); //Centraliza a tela inicial
        telaPrincipal.setVisible(true);
        
        boolean resourceExists = ClassLoader.getSystemResource("/br/sp/petaltech/resources/reloadicon.png") != null;

if (resourceExists) {
    System.out.println("O recurso está presente no classpath.");
} else {
    System.out.println("O recurso NÃO está presente no classpath.");
}
        
        
        
    }
}
