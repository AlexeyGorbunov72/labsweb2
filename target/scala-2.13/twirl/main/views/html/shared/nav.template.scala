
package views.html.shared

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object nav extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<header>
    <div class="logo_text">
        <h1><a href="#">Я Алексей</a></h1>
        <h2><sup>12 менеджеров на одного разработчика == чистый профит</sup></h2>
    </div>

    <nav>
        <ul class="menu">
            <li id="li1"><a type="menuPoint" name="index" href="/">Это я</a></li>
            <li id="li2"><a type="menuPoint" name="content2" href="/table">Таблица</a></li>
            <li id="li3"><a type="menuPoint" name="interactiveList" href="/tasks">Задачи</a></li>
        </ul>
    </nav>
</header>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/shared/nav.scala.html
                  HASH: 02a71ad4c9a6270df433df9b6b6808867e795b72
                  MATRIX: 816->0
                  LINES: 26->1
                  -- GENERATED --
              */
          