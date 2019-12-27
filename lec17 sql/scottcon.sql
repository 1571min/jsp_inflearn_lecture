SELECT
    *
FROM book;


INSERT INTO
    book(book_id,book_name,book_loc)
VALUES
    (BOOK_SEQ.NEXTVAL,'book5','001-00008');
    
COMMIT;

SELECT
    *
FROM book WHERE book_id<43 AND book_id>=41;

SELECT
    *
FROM book WHERE book_id BETWEEN 1 AND 42;

SELECT
    *
FROM book WHERE book_name LIKE '%k1';

SELECT
    *
FROM book ORDER BY book_name ASC;

SELECT
    *
FROM book ORDER BY book_name DESC;

COMMIT;