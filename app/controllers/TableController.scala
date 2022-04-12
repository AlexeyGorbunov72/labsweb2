package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class TableController @Inject()(
  val controllerComponents: ControllerComponents,
  val navigationController: NavigationController
  ) extends BaseController {
  def index() = Action { implicit request: Request[AnyContent] =>
    val nav = navigationController.makeView()
    Ok(views.html.table.view(nav))
  }
}
