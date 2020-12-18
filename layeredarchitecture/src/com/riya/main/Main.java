package com.riya.main;
import com.riya.entities.*;
import com.riya.dao.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		System.out.println("Hola!");
		System.out.println("Welcome to consumer portal!");
		System.out.println("Please follow the given steps");
		System.out.println("Enter Details");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String country=sc.nextLine();
		Consumer c=new Consumer(id,name,country);
		ConsumerDAOimpl cd=new ConsumerDAOimpl();
		int r=cd.insert(c);
		System.out.println(r+" row inserted");
	}

}
