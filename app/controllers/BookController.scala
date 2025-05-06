package controllers

import cats.effect.IO
import cats.effect.unsafe.implicits.global
import javax.inject._
import play.api.mvc._
import services.BookService
import play.api.libs.json._

@Singleton
class BookController @Inject() (
  val controllerComponents: ControllerComponents,
  bookService: BookService,
) extends BaseController {

  implicit val bookWrites: Writes[models.Book] = Json.writes[models.Book]

  def getBooks() = Action.async { implicit request: Request[AnyContent] =>
    bookService.getBooks
      .map(books => Ok(Json.toJson(books)))
      .unsafeToFuture()
  }
}
