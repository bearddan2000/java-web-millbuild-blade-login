import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.webjars:bootstrap:4.2.1",
ivy"org.projectlombok:lombok:1.18.32",
ivy"org.apache.commons:commons-lang3:3.14",
ivy"com.bladejava:blade-mvc:2.0.14.RELEASE"
    // Dependices
  )
}
