import java.util.Arrays;

public class Dog {

    private String[] toys;

    public Dog(){
        this.toys = new String[0];
    }
    
    public boolean toysIsEmpty(){
        return toys.length == 0;
    }

    public void addToy(String toy){
        String[] copy = Arrays.copyOf(toys, toys.length+1);
        
        toys = copy;

    }

    public boolean contains(String toy){
        for (int i = 0; i < toys.length; i++){
            if (toys[i].equals(toy)){
                return true;
            }
        }
        return false;
    }

    public void printAllToys(){
        for (int i = toys.length -1; i >= 0; i--){
            System.out.println("toys[" + i + "] " + toys[i]);
        }
    }

    public int size(){
        return toys.length;
    }
}