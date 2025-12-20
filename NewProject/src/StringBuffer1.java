public class StringBuffer1 {

    public static void main(String[] args)
    {
        StringBuffer st=new StringBuffer("Sharafia");
        System.out.println(st.capacity());
        st.append(" Naseer");
        System.out.println(st);
        String str1= st.toString();
        System.out.println(str1);
        st.deleteCharAt(2);
        System.out.println(st);
        st.insert(0,"Java ");
        System.out.println(st);
    }

}
