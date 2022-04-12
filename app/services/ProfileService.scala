package services

import javax.inject._
import play.api.Logger
import rx.lang.scala.Observable
import scala.concurrent.duration._

trait ProfileService {
    def isUserSignIn(): Boolean
    val isUserSignInObservable = Observable.just(false)
}

@Singleton
class DefaultProfileService extends ProfileService {
    private var counter: Long = 0

    override val isUserSignInObservable = Observable
        .interval(Duration(1000, "millis"))
        .map { i => 
            this.counter = i
            i
        }
        .map( i => counter % 2 == 0)

    override def isUserSignIn(): Boolean = {
        Logger("access").debug("profile")
        counter += 1
        // println(counter)
        return counter % 2 == 0
    }
}