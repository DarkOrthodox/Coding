import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staticvar{
   public static Scanner in;
    public static int B, H;
    public static boolean flag;
    
    static {
        in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        flag = true;
        if(B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

