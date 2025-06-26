public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        
        sb.append(" Programming");
        System.out.println(sb); // Output: Java Programming

        sb.insert(5, "Language ");
        System.out.println(sb); // Output: Java Language Programming

        sb.replace(5, 13, "Core");
        System.out.println(sb); // Output: Java Core Programming

        sb.delete(5, 10);
        System.out.println(sb); // Output: Java Programming

        sb.reverse();
        System.out.println(sb); // Output: gnimmargorP avaJ
    }
}
