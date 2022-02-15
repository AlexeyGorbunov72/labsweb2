
package views.html.home

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

object view extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/views/*1.7*/.html.shared.containerHolder("Страница в браузере")/*1.58*/ {_display_(Seq[Any](format.raw/*1.60*/("""
    """),_display_(/*2.6*/css()),format.raw/*2.11*/("""
""")))}/*3.2*/ {_display_(Seq[Any](format.raw/*3.4*/("""
    """),_display_(/*4.6*/content()),format.raw/*4.15*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home/view.scala.html
                  HASH: a741ecdee983b42a55f94b1c70e58feb9e928467
                  MATRIX: 815->1|827->6|886->57|925->59|956->65|981->70|1000->72|1038->74|1069->80|1098->89
                  LINES: 26->1|26->1|26->1|26->1|27->2|27->2|28->3|28->3|29->4|29->4
                  -- GENERATED --
              */
          