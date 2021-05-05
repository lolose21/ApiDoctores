<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/webhead.jsp"/>
        <title>Plantilla</title>
    </head>
    <body>
        <jsp:include page="includes/webmenu.jsp"/>
    <main role="main" class="container">

        <div class="starter-template">
          <h1>MENU API</h1>
        
          <ul>
              <li>
                  <h3>api/doctores</h3>
                  <a href="api/doctores">api/doctores</a>
              </li>
              <li>
                  <h3>
                      api/doctores/{id}
                  </h3>
                  <a href="api/doctores/386">api/doctores/386</a>
              </li>
              <li>
                  <h3>
                      api/doctores/buscarsalario/{salario}
                  </h3>
                  <a href="api/doctores/buscarsalario/220000">
                      api/doctores/buscarsalario/220000
                  </a>
              </li>
          </ul>
        </div>
    </main><!-- /.container -->
    <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
