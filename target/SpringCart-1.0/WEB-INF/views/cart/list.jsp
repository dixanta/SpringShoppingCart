<%@include file="../shared/header.jsp" %>
<h1>Cart List</h1>
<c:if test="${items.size()!=0}">
<table class="table">
    <tr>
        <th>S.No</th>
        <th>Item</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Total</th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${items}">
        <tr>
            <td>${item.id}</td>
            <td>${item.product.name}</td>
            <td>${item.product.price}</td>
            <td>${item.quantity}</td>
            
            <td>${item.product.price*item.quantity}</td>
            <td><a href="${SITE_URL}/cart/delete/${item.id}" class="btn btn-danger" onclick="return confirm('Are you sure to remove?')"><span class="glyphicon glyphicon-remove"></span></a></td>
        </tr>
    </c:forEach>
</table>
</c:if>
<a href="${SITE_URL}" class="btn btn-primary">Continue Shopping</a>
</div>
</body>
</html>