
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

object containerHolder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(css: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>

        """),_display_(/*11.10*/css),format.raw/*11.13*/("""
        """),format.raw/*12.9*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.versioned("stylesheets/menubar.css")),format.raw/*12.105*/("""">
    </head>
    <body onunload="cleartids()">
        """),_display_(/*15.10*/nav()),format.raw/*15.15*/("""
        """),_display_(/*16.10*/content),format.raw/*16.17*/("""
        """),_display_(/*17.10*/footer()),format.raw/*17.18*/("""
    """),format.raw/*18.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,css:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(css)(content)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (css) => (content) => apply(title)(css)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/shared/containerHolder.scala.html
                  HASH: 61133bbd8fd84ffca595429705a12fb5a909001d
                  MATRIX: 756->1|891->43|918->44|1166->266|1191->271|1237->290|1261->293|1297->302|1370->348|1385->354|1451->398|1536->456|1562->461|1599->471|1627->478|1664->488|1693->496|1725->501
                  LINES: 21->1|26->2|27->3|33->9|33->9|35->11|35->11|36->12|36->12|36->12|36->12|39->15|39->15|40->16|40->16|41->17|41->17|42->18
                  -- GENERATED --
              */
          