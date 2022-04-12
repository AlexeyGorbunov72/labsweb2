package controllers

import services.ProfileService
import javax.inject._
import play.api._
import play.api.mvc._
import play.twirl.api.Html
import play.api.Logger
// import rx.lang.scala.Disposable
import rx.lang.scala._

@Singleton
class NavigationController @Inject() (
    val controllerComponents: ControllerComponents,
    profileService: ProfileService
    ) extends BaseController {

  def makeView(): Html = {
    Logger("access").debug("make view")
    if (profileService.isUserSignIn()) {
        return views.html.shared.navSignIn()
    } else {
        return views.html.shared.navNotSignIn()
    }
  }
}
