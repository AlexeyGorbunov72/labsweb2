package controllers
import play.api.Logger
import javax.inject._
import play.api._
import play.api.mvc._
import rx.lang.scala._
import services.ProfileService

@Singleton
class HomeController @Inject()(
  val controllerComponents: ControllerComponents,
  val navigationController: NavigationController,
  val profileService: ProfileService
  ) extends BaseController {

  private var disposable: Option[Subscription] = Option(null)

  def index() = Action { implicit request: Request[AnyContent] =>
    Logger("access").debug("home")
    println("ijodijiwofjwieo")
    if (this.disposable.isDefined) {
      this.disposable.get.unsubscribe()
    }
    this.disposable = Some(
      profileService.isUserSignInObservable.subscribe({ _ =>
        routes.HomeController.index()
      })
     )
    val nav = navigationController.makeView()
    Ok(views.html.home.view(nav))
  }
}
