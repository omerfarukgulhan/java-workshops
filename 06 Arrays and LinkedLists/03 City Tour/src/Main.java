import java.util.*;

public class Main {
  
      public static void main(String[] args) {
        
        LinkedList<String> cities = new LinkedList<String>();
        
        cities.add("Ankara");
        cities.add("Eskişehir");
        cities.add("Afyon");
        
        tourCities(cities);
        
    }

    public static void  tourCities(LinkedList<String> cities) {
        ListIterator<String> iterator = cities.listIterator();
        
        int operation;
        
        showOptions();
        
        Scanner scanner = new Scanner(System.in);
        
        if (!iterator.hasNext()) {
            
            System.out.println("There are no cities...");
        }
        boolean quit = false;
        boolean forward = true;
        
        while (!quit) {
            System.out.println("Choose operation:");
            
            operation = scanner.nextInt();
            
            switch(operation) {
                case 0:
                    showOptions();
                    break;
                case 1:
                    if (!forward) {
                        if (iterator.hasNext()) {
                            
                            iterator.next();
                            
                        }
                        forward = true;
                        
                    }
                    if (iterator.hasNext()) {
                        
                        System.out.println("Going to city: " + iterator.next());
                       
                    }
                    else {
                        System.out.println("No City Left to Go...");
                        forward = true;
                        
                        
                    }
                    break;
                case 2:
                    if (forward){
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            
                        }
                        forward = false;
                        
                    }
                    if (iterator.hasPrevious()) {
                        
                        System.out.println("Going to city: " + iterator.previous());
                        
                    }
                    else {
                        System.out.println("City Tour Started...");
                    }
                    break;
                    
                case 3:
                    quit = true;
                    System.out.println("Exiting the app...");
                    break;
                    
            }
        }
    }
    public static void showOptions(){
          
        System.out.println("0 - Show options.");
        System.out.println("1 - Go to next city.");
        System.out.println("2 - Go to previous city.");
        System.out.println("3 - Exit program.");
        
    }
}
