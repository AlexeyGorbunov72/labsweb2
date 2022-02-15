// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  HomeController_0: controllers.HomeController,
  // @LINE:6
  TableController_1: controllers.TableController,
  // @LINE:9
  TasksController_2: controllers.TasksController,
  // @LINE:14
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    HomeController_0: controllers.HomeController,
    // @LINE:6
    TableController_1: controllers.TableController,
    // @LINE:9
    TasksController_2: controllers.TasksController,
    // @LINE:14
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_0, TableController_1, TasksController_2, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, TableController_1, TasksController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """table""", """controllers.TableController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.TasksController.tasks"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.TasksController.newTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks/""" + "$" + """id<[^/]+>/delete""", """controllers.TasksController.deleteTask(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Роуты приложения:
 Главная страница""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_TableController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("table")))
  )
  private[this] lazy val controllers_TableController_index1_invoker = createInvoker(
    TableController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "index",
      Nil,
      "GET",
      this.prefix + """table""",
      """ Таблица""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_TasksController_tasks2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_TasksController_tasks2_invoker = createInvoker(
    TasksController_2.tasks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TasksController",
      "tasks",
      Nil,
      "GET",
      this.prefix + """tasks""",
      """ Таски""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_TasksController_newTask3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_TasksController_newTask3_invoker = createInvoker(
    TasksController_2.newTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TasksController",
      "newTask",
      Nil,
      "POST",
      this.prefix + """tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TasksController_deleteTask4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_TasksController_deleteTask4_invoker = createInvoker(
    TasksController_2.deleteTask(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TasksController",
      "deleteTask",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tasks/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Ассеты""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:6
    case controllers_TableController_index1_route(params@_) =>
      call { 
        controllers_TableController_index1_invoker.call(TableController_1.index())
      }
  
    // @LINE:9
    case controllers_TasksController_tasks2_route(params@_) =>
      call { 
        controllers_TasksController_tasks2_invoker.call(TasksController_2.tasks)
      }
  
    // @LINE:10
    case controllers_TasksController_newTask3_route(params@_) =>
      call { 
        controllers_TasksController_newTask3_invoker.call(TasksController_2.newTask)
      }
  
    // @LINE:11
    case controllers_TasksController_deleteTask4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TasksController_deleteTask4_invoker.call(TasksController_2.deleteTask(id))
      }
  
    // @LINE:14
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
