package project;
import java.util.Scanner;

public class QuizTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
  String[] questions= {
		"1. Number of primitive data types in Java are?",
		"2. What is the size of float and double in java?",
		"3. Automatic type conversion is possible in which of the possible cases?",
		"4. Find the output of the following code.\r\n"+    "\r\n"+     
		        "int Integer = 24;\r\n"+
		        "char String  = ‘I’;\r\n"+
		        "System.out.print(Integer);\r\n"+
		        "System.out.print(String);",
	    "5. Find the output of the following program.\r\n" + "\r\n"+
	            "public class Solution{\r\n"+
	            "public static void main(String[] args){\r\n"+
	                          "short x = 10;\r\n"+
	                          "x =  x * 5;\r\n"+
	                          "System.out.print(x);\r\n"+
	                      "}\r\n"+
	                     "}",
	    "6. Find the output of the following program.\r\n"   + "\r\n"+
                 "public class Solution{\r\n"+
	             "public static void main(String[] args){\r\n"+
	             "byte x = 127;\r\n"+
	             "x++;\r\n"+
	             "x++;\r\n"+
	             "System.out.print(x);\r\n"+
	             "}\r\n"+
	             "}",
	    "7. Select the valid statement." ,
	    "8. Find the output of the following program.\r\n" + "\r\n"+ 
	    		"public class Solution{\r\n"+
	            " public static void main(String[] args){\r\n"+
	            "int[]  x = {120, 200, 016};\r\n"+
	            "for(int i = 0; i < x.length; i++){\r\n"+
	            "System.out.print(x[i] + “ “);\r\n"+
	            " }   \r\n"+
	            " }\r\n"+
	            "}",
	     "9. When an array is passed to a method, what does the method receive?",
	     "10. Select the valid statement to declare and initialize an array.",
	     "11. Find the value of A[1] after execution of the following program.\r\n" + "\r\n" +
	            "int[] A = {0,2,4,1,3};\r\n"+
	            "for(int i = 0; i < A.length; i++){\r\n"+
	            "A[i] = A[(A[i] + 3) % A.length];\r\n"+
	            "}",
          "12. Arrays in java are-",
          "13. When is the object created with new keyword?",
          "14. Identify the corrected definition of a package.",
          "15. Identify the correct restriction on static methods.\r\n"+ "\r\n"+
              "1.They must access only static data\r\n"+
              "2.They can only call other static methods.\r\n"+
              "3.They cannot refer to this or super."        
       };
  String[] options= {
		  " a)6\n b)7\n c)8\n d)9",
		  " a)32 and 64\n b)32 and 32\n c)64 and 64\n d)64 and 32",
		  " a)Byte to int\n b)Int to long\n c)Long to int\n d)Short to int",
		  " a)Compile error\n b)Throws exception\n c)I\n d)24 I",
		  " a)50\n b)10\n c)Compile error\n d)Exception",
		  " a)-127\n b)127\n c)129\n d)2",
		  " a)char[] ch=new char(5)\n b)char[] ch=new char[5]\n c)char[] ch=new char()\n d)char[] ch=new char[]",
		  " a)120 200 016\n b)120 200 14\n c)120 200 16\n d)none",
		  " a)The reference of the array\n b)A copy of the array\n c)Length of the array\n d)Copy of first element",
		  " a)int[]A={}\n b)int[]A={1,2,3}\n c)int[]A=(1,2,3)\n d)int[][]A={1,2,3}",
		  " a)0\n b)1\n c)2\n d)3",
		  " a)Object reference\n b)objects\n c)Primitive data type\n d)None",
		  " a)At run time\n b)At compile time\n c)Depends on the code\n d)None",
		  " a)A package is a collection of editing tools\n b)A package is a collection of classes\n c)A package is a collection of classes and interfaces\n d)A package is a collection of interfaces",
		  " a)I and II\n b)II and III\n c)Only III\n d)I,II and III "
		   };
       char[] answers = {'c','a','b','d','c','a','b','b','a','b','b','b','a','c','d'};
         int score = 0;

      System.out.println("Welcome to the java Quiz!");
      System.out.println("Please select the correct answer for each question.\n");
      for (int i = 0; i < questions.length; i++) {
          System.out.println(questions[i]);
          System.out.println(options[i]);
          System.out.print("Your answer: ");
          char answer = sc.next().charAt(0);

          if (answer == answers[i]) {
              System.out.println("Correct!\n");
              score++;
          } else {
              System.out.println("Wrong! The correct answer is: " + answers[i] + "\n");
          }
      }

      System.out.println("Quiz Over! Your final score is: " + score + "/" + questions.length);

      if (score == questions.length) {
          System.out.println("Excellent! You got all the answers right!");
      } else if (score >= questions.length / 2) {
          System.out.println("Good job! You got most of the answers correct.");
      } else {
          System.out.println("Better luck next time!");
      }

      sc.close();

	}

}
