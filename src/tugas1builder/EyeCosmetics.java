//Nama : Ajeng Febriana Rahmawati
//NIM : 672019323
package tugas1builder;

public abstract class EyeCosmetics implements Item{
    @Override
    public ColorShade colorshade(){
        return new EyeColor();
    }
    @Override
    public abstract float price();
}
