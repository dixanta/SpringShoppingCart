<%@include file="../shared/header.jsp" %>
<div class="row">
    <h1>${product.name}</h1>
    <div class="col-xs-12">
        ${product.description}
    </div>
    <div>
        <label>Price:${product.price}</label>
        <br/>
        <form action="${SITE_URL}/cart/add/${product.id}" method="post">
            <label>Quantity:</label>
            <input type="text" name="quantity"/>
            <input type="hidden" name="price" value="${product.price}"/>
            
            <input type="hidden" name="id" value="${product.id}"/>
            <button type="submit">Add to Cart</button>
        </form>
    </div>
</div>
</div>
</body>
</html>
