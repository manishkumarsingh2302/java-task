\\What is the difference between == and .equals() in Java?"

String a = new String("hello");
String b = new String("hello");

System.out.println(a == b);       // false — different objects
System.out.println(a.equals(b));  // true — same value






//| Use Case     | Use `==`? | Use `.equals()`? |
| ------------ | --------- | ---------------- |
| Same object? | ✅         | ❌                |
| Same value?  | ❌         | ✅                |
