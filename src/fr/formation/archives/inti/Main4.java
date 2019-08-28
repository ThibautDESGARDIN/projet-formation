package fr.formation.archives.inti;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main4 {

   public static void main(String[] args) {
      List<Cerclebis> list = new ArrayList<Cerclebis>();
      list.add(new Cerclebis(4,2,1));
      list.add(new Cerclebis(2,2,0.7));
      list.add(new Cerclebis(1,-3,0.5));
      list.add(new Cerclebis(6,2,2.1));
      list.add(new Cerclebis(-2,-1,1.4));
      
      
      System.out.println("Avant le tri : ");
      Iterator<Cerclebis> it = list.iterator();
      while(it.hasNext())
         System.out.println(it.next());
      
      Collections.sort(list);
      
      System.out.println();
      System.out.println("Apr�s le tri : ");
      it = list.iterator();
      while(it.hasNext())
         System.out.println(it.next());
         
   }
}