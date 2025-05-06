package services

import cats.effect.IO
import models.Book
import javax.inject.Singleton

@Singleton
class BookService {
  def getBooks: IO[List[Book]] = IO {
    List(
      Book(1, "The Pragmatic Programmer", "Andrew Hunt, David Thomas", 1999),
      Book(2, "Clean Code", "Robert C. Martin", 2008),
      Book(3, "Scala with Cats", "Noel Welsh, Dave Gurnell", 2019),
    )
  }
}
