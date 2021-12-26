package Algorithm;

public class FixedCapacityStack <Item>{

    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        a[N++] = item;
    }

    public Item pop(){
        return a[--N];
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> fixedCapacityStack = new FixedCapacityStack<>(3);
        fixedCapacityStack.push("Hello");
        fixedCapacityStack.push("World");
        fixedCapacityStack.push("HEY");
        System.out.println(fixedCapacityStack.pop());
    }
}
