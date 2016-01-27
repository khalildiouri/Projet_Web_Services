$(document).ready(function() {
	$("[name=cur]").on('change', function (e) {
	    var optionSelected = $("option:selected", this);
	    var valueSelected = this.value;
	    $('#changeCur').attr('action','/Client/changeCurrency.do?cur='+valueSelected);
	});

});
	
