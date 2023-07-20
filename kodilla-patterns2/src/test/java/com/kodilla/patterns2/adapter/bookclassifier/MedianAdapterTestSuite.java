package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
   void publicationYearMedianTest(){
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Adam", "Raj", 2020, "111"));
        books.add(new Book("Milton","Utracony", 1998, "222"));
        books.add(new Book("Simons", "Hyperion", 2000, "333"));
        books.add(new Book("Dukaj", "Extensa", 2003, "444"));
        books.add(new Book("Dostojewski", "Idota", 1989, "555"));
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        Assertions.assertEquals(2000, median);

    }
}
