<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<title>Welcome Client</title>
<!-- Link shortcut icon-->
<link rel="shortcut icon" type="image/ico"
	href="images/logo/logo_umlv.jpg" />
<!-- Link css-->
<link rel="stylesheet" type="text/css" href="css/zice.style.css" />
<link rel="stylesheet" type="text/css" href="css/icon.css" />
<link rel="stylesheet" type="text/css" href="css/ui-custom.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/timepicker.css" />
<link rel="stylesheet" type="text/css"
	href="components/colorpicker/css/colorpicker.css" />
<link rel="stylesheet" type="text/css"
	href="components/elfinder/css/elfinder.css" />
<link rel="stylesheet" type="text/css"
	href="components/datatables/dataTables.css" />
<link rel="stylesheet" type="text/css"
	href="components/validationEngine/validationEngine.jquery.css" />

<link rel="stylesheet" type="text/css"
	href="components/jscrollpane/jscrollpane.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="components/fancybox/jquery.fancybox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="components/tipsy/tipsy.css"
	media="all" />
<link rel="stylesheet" type="text/css"
	href="components/editor/jquery.cleditor.css" />
<link rel="stylesheet" type="text/css"
	href="components/chosen/chosen.css" />
<link rel="stylesheet" type="text/css"
	href="components/confirm/jquery.confirm.css" />
<link rel="stylesheet" type="text/css"
	href="components/sourcerer/sourcerer.css" />
<link rel="stylesheet" type="text/css"
	href="components/fullcalendar/fullcalendar.css" />
<link rel="stylesheet" type="text/css"
	href="components/Jcrop/jquery.Jcrop.css" />


<!--[if lte IE 8]><script language="javascript" type="text/javascript" src="components/flot/excanvas.min.js"></script><![endif]-->
<script type="text/javascript" src="AddCart.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="components/ui/jquery.ui.min.js"></script>
<script type="text/javascript" src="components/ui/jquery.autotab.js"></script>
<script type="text/javascript" src="components/ui/timepicker.js"></script>
<script type="text/javascript"
	src="components/colorpicker/js/colorpicker.js"></script>
<script type="text/javascript"
	src="components/checkboxes/iphone.check.js"></script>
<script type="text/javascript"
	src="components/elfinder/js/elfinder.full.js"></script>
<script type="text/javascript"
	src="components/datatables/dataTables.min.js"></script>
<script type="text/javascript" src="components/datatables/ColVis.js"></script>
<script type="text/javascript"
	src="components/scrolltop/scrolltopcontrol.js"></script>
<script type="text/javascript"
	src="components/fancybox/jquery.fancybox.js"></script>
<script type="text/javascript"
	src="components/jscrollpane/mousewheel.js"></script>
<script type="text/javascript"
	src="components/jscrollpane/mwheelIntent.js"></script>
<script type="text/javascript"
	src="components/jscrollpane/jscrollpane.min.js"></script>
<script type="text/javascript" src="components/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="components/tipsy/jquery.tipsy.js"></script>
<script type="text/javascript"
	src="components/editor/jquery.cleditor.js"></script>
<script type="text/javascript" src="components/chosen/chosen.js"></script>
<script type="text/javascript"
	src="components/confirm/jquery.confirm.js"></script>
<script type="text/javascript"
	src="components/validationEngine/jquery.validationEngine.js"></script>
<script type="text/javascript"
	src="components/validationEngine/jquery.validationEngine-en.js"></script>
<script type="text/javascript"
	src="components/vticker/jquery.vticker-min.js"></script>
<script type="text/javascript" src="components/sourcerer/sourcerer.js"></script>
<script type="text/javascript"
	src="components/fullcalendar/fullcalendar.js"></script>
<script type="text/javascript" src="components/flot/flot.js"></script>
<script type="text/javascript" src="components/flot/flot.pie.min.js"></script>
<script type="text/javascript" src="components/flot/flot.resize.min.js"></script>
<script type="text/javascript" src="components/flot/graphtable.js"></script>

<script type="text/javascript" src="components/uploadify/swfobject.js"></script>
<script type="text/javascript" src="components/uploadify/uploadify.js"></script>
<script type="text/javascript"
	src="components/checkboxes/customInput.jquery.js"></script>
<script type="text/javascript" src="components/effect/jquery-jrumble.js"></script>
<script type="text/javascript"
	src="components/filestyle/jquery.filestyle.js"></script>
<script type="text/javascript"
	src="components/placeholder/jquery.placeholder.js"></script>
<script type="text/javascript" src="components/Jcrop/jquery.Jcrop.js"></script>
<script type="text/javascript"
	src="components/imgTransform/jquery.transform.js"></script>
<script type="text/javascript" src="components/webcam/webcam.js"></script>
<script type="text/javascript"
	src="components/rating_star/rating_star.js"></script>
<script type="text/javascript"
	src="components/dualListBox/dualListBox.js"></script>
<script type="text/javascript"
	src="components/smartWizard/jquery.smartWizard.min.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
<script type="text/javascript" src="js/zice.custom.js"></script>
<script type="text/javascript" src="js/Bank.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				$("[name=cur]").on(
						'change',
						function(e) {
							var optionSelected = $("option:selected", this);
							var valueSelected = this.value;
							$('#changeCur').attr(
									'action',
									'/Client/changeCurrency.do?cur='
											+ valueSelected);
						});

			});
</script>
<style type="text/css">
.error {
	color: red;
}

.modalWindow {
	position: fixed;
	font-family: arial;
	font-size: 80%;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	background: rgba(0, 0, 0, 0.2);
	z-index: 99999;
	opacity: 0;
	-webkit-transition: opacity 400ms ease-in;
	-moz-transition: opacity 400ms ease-in;
	transition: opacity 400ms ease-in;
	pointer-events: none;
}

.modalHeader h2 {
	color: #189CDA;
	border-bottom: 2px groove #efefef;
}

.modalWindow:target {
	opacity: 1;
	pointer-events: auto;
}

.modalWindow>div {
	width: 750px;
	position: relative;
	margin: 10% auto;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	background: #fff;
}

.modalWindowdelete>div {
	width: 250px;
	position: relative;
	margin: 10% auto;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	background: #fff;
}

.modalWindowdelete .modalHeader {
	padding: 5px 20px 0px 20px;
}

.modalWindowdelete .modalContent {
	padding: 0px 20px 5px 20px;
}

.modalWindowdelete .modalFooter {
	padding: 8px 20px 8px 20px;
}

.modalWindow .modalHeader {
	padding: 5px 20px 0px 20px;
}

.modalWindow .modalContent {
	padding: 0px 20px 5px 20px;
}

.modalWindow .modalFooter {
	padding: 8px 20px 8px 20px;
}

.modalFooter {
	background: #F1F1F1;
	border-top: 1px solid #999;
	-moz-box-shadow: inset 0px 13px 12px -14px #888;
	-webkit-box-shadow: inset 0px 13px 12px -14px #888;
	box-shadow: inset 0px 13px 12px -14px #888;
}

.modalFooter p {
	color: #D4482D;
	text-align: right;
	margin: 0;
	padding: 5px;
}

.ok, .close, .cancel {
	background: #606061;
	color: #FFFFFF;
	line-height: 25px;
	text-align: center;
	text-decoration: none;
	font-weight: bold;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border-radius: 2px;
	-moz-box-shadow: 1px 1px 3px #000;
	-webkit-box-shadow: 1px 1px 3px #000;
	box-shadow: 1px 1px 3px #000;
}

.close {
	position: absolute;
	right: 5px;
	top: 5px;
	width: 22px;
	height: 22px;
	font-size: 10px;
}

.ok, .cancel {
	width: 80px;
	float: right;
	margin-left: 20px;
}

.ok:hover {
	background: #189CDA;
}

.close:hover, .cancel:hover {
	background: #D4482D;
}

.clear {
	float: none;
	clear: both;
}
</style>
</head>
<body class="dashborad">
	<div id="alertMessage" class="error"></div>

	<div id="header">
		<div id="account_info">
			<img src="images/avatar.png" alt="Online" class="avatar" />
			<div class="setting" title="Profile Setting">
				<b>Welcome,</b> <b class="red"></b><img src="images/gear.png"
					class="gear" alt="Profile Setting"></img>
			</div>
				<div class="logout" title="quitter">
				<a href="/Client/session.do"> <b>Quitter</b>
				</a>
			</div>
		</div>
	</div>
	<!--//  header -->
	<div id="shadowhead"></div>
	<div id="hide_panel">
		<a class="butAcc" rel="0" id="show_menu"></a> <a class="butAcc"
			rel="1" id="hide_menu"></a> <a class="butAcc" rel="0"
			id="show_menu_icon"></a> <a class="butAcc" rel="1"
			id="hide_menu_icon"></a>
	</div>

	<div id="left_menu">
		<ul id="main_menu" class="main_menu">
			<li class="limenu"><a href="/Client/toClient_index.do"><span
					class="ico gray shadow home"></span><b>Dashboard</b></a></li>

		</ul>
	</div>


	<div id="content">
		<div class="inner">
			<div class="topcolumn">
				<div class="logo">
					<img src="images/logo/logo_umlv2.png" alt="ziceAdmin" />
					
				</div>
				<ul id="shortcut">
					<li><div class="logo"><img src="images/logo/bib.png" alt="ziceAdmin" /></div></li>
				</ul>
			</div>
			<div class="clear"></div>

			<div class="onecolumn">
				<div class="header">
					<span><span class="ico color window"></span>Liste des livres
						dans la bibliothèque <%
						for (int i = 0; i < 10; i++) {
					%> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%
 	}
 %> </span>
				</div>
<div style="color: green;">${bankMSG2}</div>
				<div class="clear"></div>
				<div class="content">
					<div id="tab1" class="tab_content">
						<div class="load_page">
							<div class="formEl_b">


								<a id="1" class="showcart" href="#openModalCart"
									name="Band ring" title="Show Cart"> <img
									src="images/icon/cart.png" id="id" class="imgDelete" />
									Afficher votre panier
								</a>

								<div style="color: red;">
									<%
										for (int i = 0; i < 20; i++) {
									%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
										}
									%><b>${msg}</b>
								</div>

								<div style="color: green;">
									<%
										for (int i = 0; i < 19; i++) {
									%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<%
										}
									%>

									<b>${msgPanier}</b>
								</div>
								<%
									for (int i = 0; i < 38; i++) {
								%>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%
									}
								%>
								<a class="uibutton special "  href="toemptycart.do">Vider Panier</a><a href="tovalidateAccount.do" class="uibutton">Valider
									Achat</a>
								
								<table class="display static ">
									<thead>
										<tr>
											<th width="50">ISBN</th>
											<th width="100">Title</th>
											<th width="100">Author</th>
											<th width="100">Category</th>
											<th width="100">Description</th>
											<th width="50">Price</th>
											<th width="100">Disponibilité</th>
											<th width="100">Panier</th>
										</tr>
									</thead>
									<tbody>
										<s:forEach items="${books }" var="m">
											<tr id="${m.isbn }">
												<td>${m.isbn}</td>
												<td>${m.title}</td>
												<td>${m.author}</td>
												<td>${m.category}</td>
												<td>${m.description}</td>
												<td>${m.price}</td>
												<td id="disp${m.isbn }">${m.disp}</td>
												<td><a href="/Client/addCart.do?isbn=${m.isbn}">Ajouter
														Panier</a></td>
											</tr>
										</s:forEach>
									</tbody>
								</table>

							</div>
							<!-- /////////////////////// -->
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- ///////////////// Show Model-->
		<div id="openModalCart" class="modalWindow">
			<div>

				<div class="modalHeader">
					<img src="images/icon/cart_blue.png" />
					<h2>Somme a payé : ${somme } EUR</h2>
					<a href="#close" title="Close" class="close">X</a>
				</div>

				<div class="modalContent">
					<form id="addCartFrom" method="post">
						<!--onclick="document.forms['form'].action='recupererPassword.do';document.forms['form'].submit();"
							-->

						<table class="display static ">
							<thead>
								<tr>
									<th width="50">ISBN</th>
									<th width="100">Title</th>
									<th width="100">Author</th>
									<th width="100">Price</th>
								</tr>
							</thead>
							<tbody>
								<s:forEach items="${carts }" var="m">
									<tr id="${m.isbn }">
										<td>${m.isbn}</td>
										<td>${m.titre}</td>
										<td>${m.author}</td>
										<td>${m.prix }</td>


									</tr>

								</s:forEach>
							</tbody>

						</table>
						<div class="modalFooter">
							<a href="#cancel" title="Cancel" class="uibutton special">Fermer</a>

							<div class="clear"></div>
						</div>
					</form>
				</div>


			</div>
		</div>
		<!-- // End onecolumn -->
		<div id="footer">
			&copy; Copyright 2015 <span class="tip"><a href="#"
				title="UMLV Descartes">UPEM val-de-marne France</a> </span>
		</div>
	</div>
	<!--// End inner -->

	<!--// End content -->
</body>
</html>