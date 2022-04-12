import com.google.inject.AbstractModule

import services.{ProfileService, DefaultProfileService}

class Module extends AbstractModule {

  override def configure() = {
    bind(classOf[ProfileService]).to(classOf[DefaultProfileService])
  }
}