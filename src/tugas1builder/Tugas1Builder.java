//Nama : Ajeng Febriana Rahmawati
//NIM : 672019323
package tugas1builder;

public class Tugas1Builder {

    public static void main(String[] args) {
        CosmeticsBuilder cosmeticsbuilder = new CosmeticsBuilder();
        Cosmetics FaceCosm = cosmeticsbuilder.prepareFaceCosm();
        System.out.println("\nCosmetics Packet 1");
        FaceCosm.showItems();
        System.out.println("Total Cost : "+FaceCosm.getCost());
        
        Cosmetics LipCosm = cosmeticsbuilder.prepareLipCosm();
        System.out.println("\nCosmetics Packet 2");
        LipCosm.showItems();
        System.out.println("Total Cost : "+LipCosm.getCost());
        
        Cosmetics EyeCosm = cosmeticsbuilder.prepareEyeCosm();
        System.out.println("\nCosmetics Packet 3");
        EyeCosm.showItems();
        System.out.println("Total Cost : "+EyeCosm.getCost());
    }
    
}
