package collections;

import java.util.ArrayList;
import java.util.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import java.util.TreeSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("Fareler Ve Insanlar",107,"John Steinbeck",1937);
		Book book2=new Book("Körlük",336,"Jose Saramago",1995);
		Book book3=new Book("Simyacý",188,"Paulo Coelho",1988);
		Book book4=new Book("Altýncý Koðuþ",68,"Anton Cehov",1862);
		Book book5=new Book("Sineklerin Tanrýsý",262,"William Golding",1954);
		
		
		
		TreeSet<Book> bookList=new TreeSet<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		
		System.out.println("------");
		
		for (Book book : bookList) {
			System.out.println(book.getBookName()+"\t "+book.getNumOfBook());
		}
		
		
		System.out.println("------");
		ArrayList<Book> bookList2=new ArrayList<>();
		bookList2.add(book1);
		bookList2.add(book2);
		bookList2.add(book3);
		bookList2.add(book4);
		bookList2.add(book5);
		
		Collections.sort(bookList2,new BookSortPageNum());
		
		for (Book book : bookList2) {
			System.out.println(book.getBookName()+" "+book.getNumOfBook());
		}
		

	}

}
