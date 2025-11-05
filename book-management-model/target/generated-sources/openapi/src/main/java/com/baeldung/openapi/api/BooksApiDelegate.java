package com.baeldung.openapi.api;

import java.math.BigDecimal;
import com.baeldung.openapi.model.Book;
import com.baeldung.openapi.model.BookRequest;
import com.baeldung.openapi.model.PageContent;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link BooksApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-04T11:39:18.491115100+02:00[Europe/Bucharest]", comments = "Generator version: 7.8.0")
public interface BooksApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /books : Add a new book
     *
     * @param bookRequest  (required)
     * @return Book created (status code 200)
     * @see BooksApi#addBook
     */
    default ResponseEntity<Book> addBook(BookRequest bookRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"releaseDate\" : \"2000-01-23\", \"price\" : \"\", \"name\" : \"name\", \"genre\" : \"genre\", \"id\" : 0.8008281904610115 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /books : Delete Book by ID
     *
     * @param id  (required)
     * @return All books deleted (status code 204)
     * @see BooksApi#deleteBook
     */
    default ResponseEntity<Void> deleteBook(BigDecimal id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /books/{id} : Get a book by ID
     *
     * @param id  (required)
     * @return Book details (status code 200)
     * @see BooksApi#getBookById
     */
    default ResponseEntity<Book> getBookById(BigDecimal id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"releaseDate\" : \"2000-01-23\", \"price\" : \"\", \"name\" : \"name\", \"genre\" : \"genre\", \"id\" : 0.8008281904610115 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /books : List all books
     *
     * @param page  (optional, default to 0)
     * @param size  (optional, default to 5)
     * @return A paginated list of books (status code 200)
     * @see BooksApi#getBooksPage
     */
    default ResponseEntity<PageContent> getBooksPage(Integer page,
        Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalItems\" : 1124, \"size\" : 34, \"page\" : 10, \"totalNumberOfPages\" : 35, \"content\" : [ { \"releaseDate\" : \"2000-01-23\", \"price\" : \"\", \"name\" : \"name\", \"genre\" : \"genre\", \"id\" : 0.8008281904610115 }, { \"releaseDate\" : \"2000-01-23\", \"price\" : \"\", \"name\" : \"name\", \"genre\" : \"genre\", \"id\" : 0.8008281904610115 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /books : Add a new book
     *
     * @param book  (required)
     * @return Book updated (status code 201)
     * @see BooksApi#updateBook
     */
    default ResponseEntity<Void> updateBook(Book book) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
