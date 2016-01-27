<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
<title>Connexion</title>
<link rel="shortcut icon" type="image/ico"  href="images/logo/logo_umlv.jpg" />
        <!--[if lt IE 9]>
          <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
<link href="css/zice.style.css" rel="stylesheet" type="text/css" />
<link href="css/icon.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="components/tipsy/tipsy.css" media="all"/>
<style type="text/css">
html {
	background-image: none;
}
#versionBar {
	background-color:#212121;
	position:fixed;
	width:100%;
	height:35px;
	bottom:0;
	left:0;
	text-align:center;
	line-height:35px;
}
.copyright{
	text-align:center; font-size:10px; color:#CCC;
}
.copyright a{
	color:#A31F1A; text-decoration:none
}    
</style>
</head>
<body >
         
<div id="alertMessage" class="error"></div>
<div id="successLogin"></div>
<div class="text_success"><img src="images/loadder/loader_green.gif"  alt="ziceAdmin" /><span>Please wait</span></div>

<div id="login" >
  <div class="ribbon"></div>
  <div class="inner">
  <div  class="logo" ><img src="images/logo/logo_umlv.jpg" alt="ziceAdmin" /></div>
  <div class="userbox"></div>
  <div class="formLogin">
   <form name="form"  id="formLogin" method="get">
   	<span class="f_help">
             </span>
          <div class="tip">
          <input name="username" type="text"    title="Username" class="large"  required/>
          </div>
          <div class="tip">
          <input name="password" type="password"   title="Password" class="large" required/>
          </div>
          <div style="padding:20px 0px 0px 0px ;">
            <div style="float:left; padding:0px 0px 2px 0px ;">
           
           
              <span class="f_help"></span><div style="color: red;">${error}</div>
              </div>
          <div style="float:right;padding:2px 0px ;">
              <div> 
                <ul class="uibutton-group">
                 
                 <li>      <input type="submit" onclick="document.forms['form'].action='authentifieruser.do';document.forms['form'].submit();" class="uibutton"  value="Login" /></li>
                  
               </ul>
              </div>
            </div>
</div>

    </form>
       <a class="uibutton normal " href="toClient_index.do"  >Go to Selling Service</a>
				  
  </div>
</div>
  <div class="clear"></div>
  <div class="shadow"></div>
</div>

<!--Login div-->
<div class="clear"></div>
<div id="versionBar" >
  <div class="copyright" > &copy; Copyright 2015 <a href="#"> <span class="tip"></span>UPEM val-de-marne France</a></a></div>
  <!-- // copyright-->
</div>
<!-- Link JScript-->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="components/effect/jquery-jrumble.js"></script>
<script type="text/javascript" src="components/ui/jquery.ui.min.js"></script>     
<script type="text/javascript" src="components/tipsy/jquery.tipsy.js"></script>
<script type="text/javascript" src="components/checkboxes/iphone.check.js"></script>
<script type="text/javascript" src="js/login.js"></script>
</body>
</html>