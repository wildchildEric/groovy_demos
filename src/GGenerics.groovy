public class GGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2.0);
        list.add("hello");//error happen here
        System.out.println("List populated");
        for (int element : list) {//error happen here
            System.out.println(element);
        }
    }

}