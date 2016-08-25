<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

        <!-- Carousel
        ================================================== -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img class="first-slide home-image" src="<c:url value="/resources/images/Kawasaki Z1000sx.jpg" />" alt="First slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Welcome to BikeRide</h1>
                            <p></p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="second-slide home-image" src="<c:url value="/resources/images/Aprilla RSV4.jpg" />" alt="Second slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1></h1>
                            <p></p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="third-slide home-image " src="<c:url value="/resources/images/Yamaha RG.jpg" />" alt="Third slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1></h1>
                            <p></p>
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div><!-- /.carousel -->

        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">

            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productlist?searchCondition=sportsbike" />" role="button">
                        <img class="img-rounded" src="<c:url value="/resources/images/Honda CBR.jpg"/>" alt="Bike Image" width="140" height="140">
                    </a>

                    <h2>Honda CBR:</h2>
                    <p></p>

                </div>



                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productlist?searchCondition=sportsbike" />" role="button">
                        <img class="img-rounded" src="<c:url value="/resources/images/BMW RR.jpg"/>" alt="Bike Image" width="140" height="140">
                    </a>

                    <h2>BMW RR:</h2>
                    <p> </p>

                </div>


                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productlist?searchCondition=sportsbike" />" role="button">
                        <img class="img-rounded" src="<c:url value="/resources/images/Kawasaki Z1000sx.jpg"/>" alt="Bike Image" width="140" height="140">
                    </a>

                    <h2>Kawasaki :</h2>
                    <p>Z1000sx</p>

                </div>
            </div>
            </div>


<%@ include file="/WEB-INF/views/template/footer.jsp" %>
