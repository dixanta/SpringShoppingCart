<%@include file="shared/header.jsp" %>
<h1>Spring Commerce</h1>
        <div class="row">
        <c:forEach var="product" items="${products}">
            
  <div class="col-xs-6 col-md-3">
    <a href="${SITE_URL}/product/${product.id}" class="thumbnail">
      ${product.name}
    </a>
    <br/>
    <span>Price: ${product.price}</span>
  </div>
 


        </c:forEach>
            </div>
        </div>
    </body>
</html>
