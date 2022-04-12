package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Task

@Singleton
class TasksController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  val taskForm = Form(
    "label" -> nonEmptyText
  )
  
  def index = Action {
    Ok("")
    // Redirect(routes.TasksController.tasks)
  }

  def tasks = TODO
  // def tasks = Action {
  //   Ok(
  //     views.html.shared.containerHolder(
  //       "Задачи",
  //       views.html.tasks.content(Task.all(), taskForm)
  //     )
  //   )
  // }

  def newTask = TODO

  def deleteTask(id: Long) = TODO
}
