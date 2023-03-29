package com.example.selen.seleniummmm;
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	Scanner sc=new Scanner(System.in);
  @Test
  public void f() {
	  System.out.println("Enter the value for A");
	  int A=sc.nextInt();
	  System.out.println("Enter the value for B");
	  int B=sc.nextInt();
	  System.out.println("Enter the value for output");
	  int output=sc.nextInt();
	  int sum=A+B;
	  junit.framework.Assert.assertEquals(sum, output);
  }
}
