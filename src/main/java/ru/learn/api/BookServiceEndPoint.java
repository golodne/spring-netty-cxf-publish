package ru.learn.api;

import com.cleverbuilder.bookservice.*;
import org.springframework.stereotype.Service;

@Service
public class BookServiceEndPoint implements BookService {
    @Override
    public GetBookResponse getBook(GetBook parameters) {
        GetBookResponse response = new GetBookResponse();
        response.setAuthor("Ivan");
        response.setID("1");
        response.setTitle("World of Tanks");
        return response;
    }

    @Override
    public AddBookResponse addBook(AddBook parameters) {
        return null;
    }

    @Override
    public GetAllBooksResponse getAllBooks(GetAllBooks parameters) {
        return null;
    }
}
