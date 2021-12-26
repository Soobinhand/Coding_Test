package Algorithm;

import java.util.Iterator;

/**
 *
 * @param <Item>
 * 후입 선출 스택 (배열 크기 변경 구현)
 * 스택 API에 대한 제네릭, 반복자를 구현하고 있다.
 * 이 코드는 스택 크기에 상수적으로 비례하도록 배열의 크기를 조정한다.
 */

public class ResizingArrayStack<Item> implements Iterable<Item>{

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty(){ return N == 0; }
    public int size() { return N; }

    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i=0;i<N;i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item){
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop(){
        Item item = a[--N];
        a[N] = null; //로이터링 방지
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){ return i > 0; }
        public Item next() { return a[--i]; }
        public void remove() {}
    }

    public static void main(String[] args) {
        ResizingArrayStack<Integer> resizingArrayStack = new ResizingArrayStack<>();
        resizingArrayStack.push(1);
        resizingArrayStack.push(2);
        resizingArrayStack.push(3);
        resizingArrayStack.push(4);
        System.out.println(resizingArrayStack.pop());
    }
}
