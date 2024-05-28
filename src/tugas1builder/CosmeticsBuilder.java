//Nama : Ajeng Febriana Rahmawati
//NIM : 672019323
package tugas1builder;

public class CosmeticsBuilder {
    public Cosmetics prepareFaceCosm(){
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.addItem(new PowderFace());
        cosmetics.addItem(new Liptint());
        cosmetics.addItem(new Eyebrow());
        return cosmetics;
    }
    public Cosmetics prepareLipCosm(){
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.addItem(new ConcealerFace());
        cosmetics.addItem(new Lipcream());
        cosmetics.addItem(new Eyeliner());
        return cosmetics;
    }
    public Cosmetics prepareEyeCosm(){
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.addItem(new MoisturizerFace());
        cosmetics.addItem(new Lipstick());
        cosmetics.addItem(new Eyeshadow());
        return cosmetics;
    }
}
