//Nama : Ajeng Febriana Rahmawati
//NIM : 672019323
package tugas1builder;

import java.util.ArrayList;
import java.util.List;

public class Cosmetics {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost+=item.price();
        }
        return cost;
    }
    public void showItems(){
        for(Item item : items){
            System.out.print("Item : "+item.name());
            System.out.print(", Color Shade : "+item.colorshade().colsha());
            System.out.println(", Price : "+item.price());
        }
    }
}
