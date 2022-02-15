
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

object content extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="wrapper">

    <aside>
        Это пространство я<br>
        когда-нибудь реализую
    </aside>

    <main>
        <article>
            <h2>Успехи</h2>
            <div class="success">
                <h3>Младший разработчик в команде клиента iOS яндекс еды</h3>
                <h3>Покрасил 2 кнопки, а к одной даже action добавил</h3>
            </div>
        </article>

        <section>
            <h2>Код за который <span class="struck">не</span> стыдно</h2>
            <pre class="swift" style="font-family:monospace;">
                <code><ol><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;"><span style="color: #B833A1;">class</span> AccessGetter<span style="color: black;">&lt;</span>Value<span style="color: black;">&gt;</span> <span style="color: black;">&#123;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: #B833A1;">private</span> <span style="color: #B833A1;">let</span> 🚽 = <span style="color: #6F41A7;">NSLock</span><span style="color: black;">&#40;</span><span style="color: black;">&#41;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: #B833A1;">private</span> <span style="color: #B833A1;">var</span> value<span style="color: black;">:</span> Value</div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">&nbsp;</div></li><li style="font-weight: bold; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: #B833A1;">init</span><span style="color: black;">&#40;</span>_ value<span style="color: black;">:</span> Value<span style="color: black;">&#41;</span> <span style="color: black;">&#123;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">        <span style="color: #B833A1;">self</span>.<span style="color: #508187;">value</span> = value</div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: black;">&#125;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">&nbsp;</div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: #B833A1;">func</span> addAction<span style="color: black;">&#40;</span>_ action<span style="color: black;">:</span> <span style="color: black;">&#40;</span>Value<span style="color: black;">&#41;</span> <span style="color: black;">-&gt;</span> <span style="color: #6F41A7;">Void</span><span style="color: black;">&#41;</span> <span style="color: black;">&#123;</span></div></li><li style="font-weight: bold; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">        defer <span style="color: black;">&#123;</span> 🚽.🔐<span style="color: black;">&#40;</span><span style="color: black;">&#41;</span> <span style="color: black;">&#125;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">&nbsp;</div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">        🚽.🔒<span style="color: black;">&#40;</span><span style="color: black;">&#41;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">        action<span style="color: black;">&#40;</span>value<span style="color: black;">&#41;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: black;">&#125;</span></div></li><li style="font-weight: bold; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;"><span style="color: black;">&#125;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">&nbsp;</div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;"><span style="color: #B833A1;">private</span> <span style="color: #B833A1;">extension</span> <span style="color: #6F41A7;">NSLock</span> <span style="color: black;">&#123;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: #B833A1;">func</span> 🔐<span style="color: black;">&#40;</span><span style="color: black;">&#41;</span> <span style="color: black;">&#123;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">        unlock<span style="color: black;">&#40;</span><span style="color: black;">&#41;</span></div></li><li style="font-weight: bold; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: black;">&#125;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">&nbsp;</div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: #B833A1;">func</span> 🔒<span style="color: black;">&#40;</span><span style="color: black;">&#41;</span> <span style="color: black;">&#123;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">        lock<span style="color: black;">&#40;</span><span style="color: black;">&#41;</span></div></li><li style="font-weight: normal; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;">    <span style="color: black;">&#125;</span></div></li><li style="font-weight: bold; vertical-align:top;"><div style="font: normal normal 1em/1.2em monospace; margin:0; padding:0; background:none; vertical-align:top;"><span style="color: black;">&#125;</span></div></li></ol></code>
            </pre>
        </section>

        <section>
            <h2>[WIP] Секция с комментариями</h2>
        </section>

        <section>
            <h2>[WIP] Слайдер</h2>
        </section>

        <section>
            <h2>Мое тотемное животное</h2>
            <pre class="animal"> ____________________
/ HTML -- лучший      \
\ инструмент на свете    /
--------------------
\   ^__^
    \  (oo)\_______
    (__)\       )\/\
        ||----w |
        ||     ||
            </pre>
        </section>

        <section>
            <div class="icu">
                <a href="https://1xstavka.ru/"><img src=""""),_display_(/*48.59*/routes/*48.65*/.Assets.versioned("images/M--svXdOXqc.jpg")),format.raw/*48.108*/("""" alt="kartinka"></a>
                <p>картинка с текстом</p>
            </div>
        </section>
    </main>

    <aside>
        <div class="verticale-wrapper">
            <div class="element"><a href="https://1xstavka.ru/"><img src=""""),_display_(/*56.76*/routes/*56.82*/.Assets.versioned("images/Screenshot_1.jpg")),format.raw/*56.126*/("""" alt="kartinka"></a></div>
            <div class="element"><a href="https://1xstavka.ru/"><img src=""""),_display_(/*57.76*/routes/*57.82*/.Assets.versioned("images/Screenshot_2.jpg")),format.raw/*57.126*/("""" alt="kartinka"></a></div>
            <div class="element"><a href="https://1xstavka.ru/"><img src=""""),_display_(/*58.76*/routes/*58.82*/.Assets.versioned("images/Screenshot_3.jpg")),format.raw/*58.126*/("""" alt="kartinka"></a></div>
            <div class="element"><a href="https://1xstavka.ru/"><img src=""""),_display_(/*59.76*/routes/*59.82*/.Assets.versioned("images/Screenshot_4.jpg")),format.raw/*59.126*/("""" alt="kartinka"></a></div>
        </div>
    </aside>
</div>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home/content.scala.html
                  HASH: a5ff234f95b1832c60f7649325e0386f85bf1240
                  MATRIX: 818->0|9050->8205|9065->8211|9130->8254|9399->8496|9414->8502|9480->8546|9610->8649|9625->8655|9691->8699|9821->8802|9836->8808|9902->8852|10032->8955|10047->8961|10113->9005
                  LINES: 26->1|73->48|73->48|73->48|81->56|81->56|81->56|82->57|82->57|82->57|83->58|83->58|83->58|84->59|84->59|84->59
                  -- GENERATED --
              */
          