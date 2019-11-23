<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href='http://fonts.googleapis.com/css?family=Crete+Round' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/style.css">

</head>
 
<body>
<jsp:include page="adminheader.jsp"/>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="images/1.jpg" alt="Chania">
      <div class="carousel-caption">
    
      </div>
    </div>

    <div class="item">
      <img src="images/2.png" alt="Chicago">
      <div class="carousel-caption">
       
      </div>
    </div>

    <div class="item">
      <img src="images/3.jpg" alt="New York">
      <div class="carousel-caption">
  
      </div>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
  <div>
 
  </div>
</div>


  <jsp:include page="footer.jsp"/>



</body>
</html>
