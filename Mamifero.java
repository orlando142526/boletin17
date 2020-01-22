
package boletin17;

 public class Mamifero implements IPodeCaminar,IPodeVoar,IPodeNadar {

    @Override
    public void Voar() {
         System.out.println("Puedo Volar, mamifero");
    }

    @Override
    public void Caminar() {
        System.out.println("Puedo Caminar, mamifero");
    }

    @Override
    public void Nadar() {
        System.out.println("Puedo Nada, Mamifero");
    }
}