//Nama : Ajeng Febriana Rahmawati
//NIM : 672019323
package tugas1builder;

public abstract class LipCosmetics implements Item{
    @Override
    public ColorShade colorshade(){
        return new LipColor();
    }
    @Override
    public abstract float price();
}
