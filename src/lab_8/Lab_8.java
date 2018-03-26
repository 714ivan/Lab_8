
package lab_8;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Lab_8 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();//Задание 1
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
          String text = iterator.next();
          System.out.println(text);
        }
        System.out.println();
        
        
        Map<String, String> map=new HashMap<String, String>();//Задание 2
        map.put("арбуз","ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень. ");
        
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext())
        {
            Map.Entry<String, String> pair = iterator1.next();
            String key = pair.getKey();          
            String value = pair.getValue();       
            System.out.println(key + " - " + value);
        }
         System.out.println();
        
        
        
        Map<String, Cat> Cats=new HashMap<String, Cat>();//Задание 3
        
        Cat cat1=new Cat("Cat1");
        Cat cat2=new Cat("Cat2");
        Cat cat3=new Cat("Cat3");
        Cat cat4=new Cat("Cat4");
        Cat cat5=new Cat("Cat5");
        Cat cat6=new Cat("Cat6");
        Cat cat7=new Cat("Cat7");
        Cat cat8=new Cat("Cat8");
        Cat cat9=new Cat("Cat9");
        Cat cat10=new Cat("Cat10");
        
        Cats.put(cat1.name(),cat1);
        Cats.put(cat2.name(),cat2);
        Cats.put(cat3.name(),cat3);
        Cats.put(cat4.name(),cat4);
        Cats.put(cat5.name(),cat5);
        Cats.put(cat6.name(),cat6);
        Cats.put(cat7.name(),cat7);
        Cats.put(cat8.name(),cat8);
        Cats.put(cat9.name(),cat9);
        Cats.put(cat10.name(),cat10);
        
        Iterator<Map.Entry<String, Cat>> CatsIterator=Cats.entrySet().iterator();
        while (CatsIterator.hasNext())
        {
            Map.Entry<String, Cat> pair=CatsIterator.next();
            String key = pair.getKey();          
            Object value = pair.getValue();       
            System.out.println(key + " - " + value);
        }
        System.out.println();
        
        iterator1 = map.entrySet().iterator();//Задание 4
        while (iterator1.hasNext())
        {
            Map.Entry<String, String> pair=iterator1.next();
            String key = pair.getKey();                
            System.out.println(key);
        }
        System.out.println();
        
        iterator1=map.entrySet().iterator();//Задание 5
        while (iterator1.hasNext())
        {
            Map.Entry<String, String> pair=iterator1.next();
            String value=pair.getValue();                
            System.out.println(value);
        }
        System.out.println();
        
       
        Map<String, Object> Objects=new HashMap<String, Object>();//Задание 6
        
        Objects.put(cat1.name(),cat1);
        Objects.put(cat2.name(),cat2);
        Objects.put(cat3.name(),cat3);
        Objects.put(cat4.name(),cat4);
        Objects.put(cat5.name(),cat5);
        Objects.put(cat6.name(),cat6);
        Objects.put(cat7.name(),cat7);
        Objects.put(cat8.name(),cat8);
        Objects.put(cat9.name(),cat9);
        Objects.put(cat10.name(),cat10);
        
        Iterator<Map.Entry<String, Object>> ObjectsIterator=Objects.entrySet().iterator();
        while (ObjectsIterator.hasNext())
        {
            Map.Entry<String, Object> pair=ObjectsIterator.next();
            String key = pair.getKey();          
            Object value = pair.getValue();       
            System.out.println(key + " - " + value);
        }
    }
}

 class Cat {
       private String name;
       
       public Cat(String a){
         name=a;
       }
       
       public String name(){
        return name;
       }
        
        public void name(String a){
         name=a;
       }
        
        
        
        public void ShowInformation() {
           System.out.println("Имя: "+name);
       }
   }
