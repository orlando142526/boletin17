
package boletin17;

public class Aves implements IPodeVoar,IPodeCaminar {

    @Override
    public void Voar() {
         System.out.println("Puedo Volar,ave");
    }

    @Override
    public void Caminar() {
        System.out.println("Puedo caminar, ave");
    }
    
}
