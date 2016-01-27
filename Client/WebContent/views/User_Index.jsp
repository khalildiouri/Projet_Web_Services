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

<title>Welcome ${firstname} ${name }</title>
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
<script type="text/javascript" src="js/operation.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body class="dashborad">
	<div id="alertMessage" class="error"></div>

	<div id="header">
		<div id="account_info">
			<img src="images/avatar.png" alt="Online" class="avatar" />
			<div class="setting" title="Profile Setting">
				<b>Welcome,</b> <b class="red">${firstname} ${name }</b><img
					src="images/gear.png" class="gear" alt="Profile Setting"></img>
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
			<li class="limenu"><a href="/Client/welcome.do"><span
					class="ico gray shadow home"></span><b>Dashboard</b></a></li>
			<li class="limenu "><a href="/Client/toBorrowBook.do"><span
					class="ico gray shadow spreasheet"></span><b>Emprunté livres</b></a></li>
			<li class="limenu"><a href="#"><span
					class="ico gray shadow window"></span><b>Commentaires </b></a>
				<ul>
					<li><a href="/Client/toComment.do"> Ajouter </a></li>
					<li><a href="/Client/toListCompte.do"> Lister </a></li>
				</ul></li>
			<li class="limenu"><a href="/Client/toCommentsBook.do"><span
					class="ico gray shadow spreasheet"></span><b>Consulter
						Commentaires sur Livres</b></a></li>
		</ul>


	</div>


	<div id="content">
		<div class="inner">
			<div class="topcolumn">
				<li><div class="logo">
						<img src="images/logo/logo_umlv.jpg" alt="ziceAdmin" />
					</div></li>
				<ul id="shortcut">
					<li><div class="logo">
							<img src="images/logo/bib.png" alt="ziceAdmin" />
						</div></li>
				</ul>
			</div>
			<div class="clear"></div>

			<div class="onecolumn">
				<div class="header">
					<span><span class="ico color window"></span>Liste des livres
						dans la bibliothèque </span>
				</div>
				<div class="clear"></div>
				<div class="content">
					<div id="tab1" class="tab_content">
						<div class="load_page">
							<div class="formEl_b">




								<table class="display static ">
									<thead>
										<tr>
											<th width="50">ISBN</th>
											<th width="100">Title</th>
											<th width="100">Author</th>
											<th width="100">Category</th>
											<th width="100">Description</th>
											<th width="100">Disponibilité</th>

										</tr>
									</thead>
									<tbody>
										<s:forEach items="${books }" var="m">
											<tr>
												<td id="isbn${m.isbn }">${m.isbn}</td>
												<td id="title${m.isbn}">${m.title}</td>
												<td id="author${m.isbn }">${m.author}</td>
												<td id="category${m.isbn }">${m.category}</td>
												<td id="description${m.isbn }">${m.description}</td>
												<td id="disp${m.isbn }">${m.disp}</td>
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
		<!-- ///////////////// -->
		<!-- // End onecolumn -->
		<div id="footer">
			&copy; Copyright 2015 <span class="tip"><a href="#"
				title="IBM MAROC">UPEM val-de-marne France</a> </span>
		</div>
	</div>
	<!--// End inner -->

	<!--// End content -->
</body>
</html>


