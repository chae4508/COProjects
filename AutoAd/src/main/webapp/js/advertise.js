/**
 * 
 */

var advertise;

var Advertise = function() {
};

Advertise.prototype = {
	initPage : function() {
		var that = this;
		
		$("#regAdvertiseBtn").bind('click',function(){
			if($.trim($("#adCorpName").val()) == ''){
				bootbox.alert('広告名を入力してください。');
				return;
			}
			$.ajax({
				url:'/app/advertise/regAdComp.do',
				data:'regAdCompNm='+$("#adCorpName").val(),
				type:'post',
				dataType:'json',
				success:function(data){
					if(data=='1'){
						bootbox.alert('登録成功しました');
					}else{
						bootbox.alert('登録失敗しました');
					}
					setTimeout(function(){
						location.href='/app/advertise/adCompList.do?clickPageNo=' + $("#hdnCurrentPageNo").val();
			    		},1500);
				}
			});
		});
	},
};

function modiSelAdCompNm(id){
	$('#modifyAdCompNm').modal();
	$.ajax({
		url:'/app/advertise/modSelAdComp.do',
		data:'id='+ id,
		type:'post',
		dataType:'json',
	    success:function(data){
	    	$("#hdnId").val(data.id);
	    	$("#moDadCorpNm").val(data.adNm);
	    }
	});
}

function modifyAdCompNm(){
	console.log('in');
	$.ajax({
		url:'/app/advertise/modifyAdComp.do',
		data:'id='+ $("#hdnId").val() + '&adNm=' + $("#moDadCorpNm").val(),
		type:'post',
		dataType:'json',
	    success:function(data){
	    	if(data=='1'){
	    		bootbox.alert('更新成功しました');
			}else{
				bootbox.alert('更新失敗しました');
			}
	    	setTimeout(function(){
				location.href='/app/advertise/adCompList.do?clickPageNo=' + $("#hdnCurrentPageNo").val();
	    		},1500);
	    }
		
	});
};
function delAdCompNm(id){
	$("#delHdnId").val(id);
	$('#delAdCompNm').modal();
}

function delOkAdCompNm(){
	$.ajax({
		url:'/app/advertise/delAdCompNm.do',
		data:'id=' + $("#delHdnId").val(),
		type:'post',
		dataType:'json',
		success:function(data){
			console.log(data);
			if(data=='1'){
				bootbox.alert('削除成功しました');
			}else{
				bootbox.alert('削除失敗しました');
			}
			setTimeout(function(){
				location.href='/app/advertise/adCompList.do?clickPageNo=' + $("#hdnCurrentPageNo").val();
			},1500);
		}
	});
}

$(document).ready(function() {
	advertise = new Advertise();
	advertise.initPage();
});