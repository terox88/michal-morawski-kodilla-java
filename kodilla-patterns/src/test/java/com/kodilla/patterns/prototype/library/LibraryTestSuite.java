package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("My library");
        IntStream.iterate(1, n -> n + 1).limit(8).forEach(n -> library.getBooks().add(new Book("Book nr " + n, "Author " + n, LocalDate.of(2000 - n, 10, n))));

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Deep cloned library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(new Book("Book nr 1", "Author 1", LocalDate.of(1999, 10,1)));
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assertions.assertEquals(7, library.getBooks().size());
        Assertions.assertEquals(7, cloneLibrary.getBooks().size());
        Assertions.assertEquals(8, deepCloneLibrary.getBooks().size());
        Assertions.assertTrue(library.getBooks().size() == cloneLibrary.getBooks().size());
        Assertions.assertFalse(library.getBooks().size() == deepCloneLibrary.getBooks().size());
    }
}
