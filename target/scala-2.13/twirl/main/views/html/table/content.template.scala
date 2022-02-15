
package views.html.table

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

object content extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<main>
    <table>
        <caption><b>Лучшие фильмы с участием Райана Гослинга</b></caption>
        <thead>
            <tr>
                <th>#</th>
                <th>Название</th>
                <th>Год выхода</th>
                <th>Режиссер</th>
                <th>Оценка на томатах</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>Drive</td>
                <td>2011</td>
                <td>Николас Виндинг Рефн</td>
                <td>93%</td>
            </tr>
            <tr>
                <td>2</td>
                <td>La La Land</td>
                <td>2016</td>
                <td>Демиен Шазель</td>
                <td>91%</td>
            </tr>
            <tr>
                <td>3</td>
                <td>The nice guys</td>
                <td>2016</td>
                <td>Шейн Блэк</td>
                <td>91%</td>
            </tr>
            <tr>
                <td>4</td>
                <td>Half Nelson</td>
                <td>2006</td>
                <td>Райан Флек</td>
                <td>91%</td>
            </tr>
            <tr>
                <td>5</td>
                <td>The Big Short</td>
                <td>2015</td>
                <td>Адам МакКей</td>
                <td>89%</td>
            </tr>
            <tr>
                <td>6</td>
                <td>Blade Runner 2049</td>
                <td>2017</td>
                <td>Дени Вильнёв</td>
                <td>88%</td>
            </tr>
        </tbody>
    </table>
</main>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/table/content.scala.html
                  HASH: 0a238a3f36928007b1a266a5fd0d09759489eb59
                  MATRIX: 819->0
                  LINES: 26->1
                  -- GENERATED --
              */
          