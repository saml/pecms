package saml

import org.scalatra._

class PageServlet extends PecmsStack with UrlGeneratorSupport {

  val pageGET: Route = get("/pages/:id") {
    val pageId: String = params("id")
    val pageUrl: String =  url(pageGET, "id" -> pageId)

    <html>
      <body>
        <h1>Hi, Keep clicking this to make it longer! <a href={pageUrl+"-"}>{pageId}</a></h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
