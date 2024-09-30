package dizi_odevler.stack_gerceklestirmesi;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.push("0"));
        System.out.println(stack.push("1"));
        System.out.println(stack.push("2"));
        System.out.println(stack.push("3"));
        System.out.println(stack.push("4"));
        System.out.println(stack.push("5"));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.push("12"));
        System.out.println(stack.pop());

        System.out.println(stack.push("12"));
        System.out.println(stack.push("18"));
        System.out.println(stack.push("17"));
        System.out.println(stack.push("16"));
        System.out.println(stack.push("11"));
        System.out.println(stack.push("10"));
        stack.clear();
        System.out.println("Full:"+stack.isFull());
        System.out.println("BOŞ:"+stack.isEmpty());
        System.out.println(stack.push("142"));
        System.out.println(stack.push("218"));
        System.out.println(stack.push("175"));
        System.out.println(stack.push("166"));
        System.out.println(stack.push("112"));
        System.out.println(stack.push("108"));
        System.out.println(stack.size());
        System.out.println("kapasite:"+stack.getCapacity());
        System.out.println("Full mu:"+stack.isFull());
        System.out.println("Boş mu:"+stack.isEmpty());
        stack.clear();
        System.out.println(stack.size());
        System.out.println(stack.push("17"));
        System.out.println(stack.push("189"));
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.showElements();
        System.out.println(stack.push("123"));
        System.out.println(stack.push("1561"));
        System.out.println(stack.push("1453"));
        System.out.println(stack.push("4563"));
        System.out.println(stack.push("14512"));
        stack.showElements();




    }
}
