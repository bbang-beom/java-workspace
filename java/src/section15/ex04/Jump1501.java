package section15.ex04;

public class Jump1501 {
    public static void main(String[] args) {
        String result1 = "";
        result1 += "hello";
        result1 += " ";
        result1 += "jump to java";
        
        System.out.println(result1);

        StringBuffer sb = new StringBuffer();
        // StringBuilder도 가능
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");

        sb.insert(5, ",");

        sb.replace(15, sb.length(), "JAVA");
        sb.replace(15, 15, "Python ");
        System.out.println(sb);

        sb.delete(15, 22);
        System.out.println(sb);

        // System.out.println(sb.substring(7));
        // System.out.println(sb.substring(7, 11));
        // sb = sb.substring(7,11); // 불가

        sb.reverse();
        System.out.println(sb);
    }

}
