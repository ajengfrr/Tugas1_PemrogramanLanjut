//Nama : Ajeng Febriana Rahmawati
//NIM : 672019323
package tugas1builder;

public abstract class FaceCosmetics implements Item{
    @Override
    public ColorShade colorshade(){
        return new FaceColor();
    }
    @Override
    public abstract float price();
}
