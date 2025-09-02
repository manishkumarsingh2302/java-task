class StringBffer {
    public static void main(String[] args) {
String s1="MyNameIsManish"; 
System.out.println(s1.indexOf("m"));
   System.out.println(s1.lastIndexOf("s"));  
   System.out.println(s1.charAt(4));
   System.out.println(s1.contains("ish"));  
   System.out.println(s1.startsWith("m"));
      System.out.println(s1.toUpperCase()); 
      System.out.println(s1.toLowerCase()); 
      StringBuffer s2=new StringBuffer("manish");
      System.out.println(s2.insert(3, "sss"));
      System.out.println(s2.delete(2, 6));
      System.out.println(s2.append(3 ));
      System.out.println(s2.capacity());
      System.out.println(s2.replace(2, 5, "hariom"));
      System.out.println(s2.reverse());
      System.out.println(s2.subSequence(2, 7));
      System.out.println(s2.substring());    }
}
