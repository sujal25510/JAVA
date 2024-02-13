public class StingBuffer {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        //System.out.println(sb.capacity());
        sb.insert(0,"J");
        System.out.println(sb);
    }
}
