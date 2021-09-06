package collections;

import java.util.Comparator;

public class BookSortPageNum implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getNumOfBook()<o2.getNumOfBook()) 
			return 1;
		else if(o1.getNumOfBook()>o2.getNumOfBook())
			return -1;
		else
			return 0;
	}

}
