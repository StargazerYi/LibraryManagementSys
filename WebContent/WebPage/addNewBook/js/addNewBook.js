$(document).ready(function(){
	$('body').css({"overflow-x":"auto","overflow-y":"auto"})
	if($("div.successFlag").html()=="0" || $("div.successFlag").html()=="1") {
		if($("div.successFlag").html()=="0") {
			$("#outputWords").html("添加失败")
		} else {
			$("#outputWords").html("添加成功")
		}
		$(function () { $('#myModal').modal({
	      keyboard: true
	   	})});
	}
})