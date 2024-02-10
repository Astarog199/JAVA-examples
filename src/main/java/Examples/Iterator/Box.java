package Examples.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T> {

    List<T> box;
   int weight;


   public Box(){
       this(0);
   }
   public Box(int weight){
       this.box = new ArrayList<>();
       this.weight = weight;
   }

    public void add(T Fruit){
       this.weight += Fruit.getWeight();
       box.add(Fruit);
   }

    public int getWeight(){
       int weight =0;
       for (T item : box)
           weight += item.getWeight();
       return weight;
    }

    public List <T> getBox(){
       return box;
    }

    public void  move (Box <? super T> box){
        box.getBox().addAll(this.box);
        this.box.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return new BoxIterator<T>(box);
    }
}
