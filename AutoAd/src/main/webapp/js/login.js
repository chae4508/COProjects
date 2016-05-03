var login;

var Login = function(){};

Login.prototype ={
	initPage: function(){
		var that = this;
		
		$("#btnLogin").bind('click',function(){
			that.loginCheck();
		});
	},
	loginCheck: function(){
		if($.trim($("#loginId").val()) == ''){
			//alert('Login IDを入力してください。');
			bootbox.alert('Login IDを入力してください。');
			return;
		}
		
		if($.trim($("#loginPwd").val()) == ''){
			//alert('Login IDを入力してください。');
			bootbox.alert('Passwordを入力してください。');
			return;
		}
		console.log('start login');
		$.ajax({
			url:'/app/login/getLoginInfo.do',
			data:'loginId=' + $("#loginId").val() + '&loginPwd=' + $("#loginPwd").val(),
			type: 'post',
			dataType: 'json',
			success: function(data){
				console.log('data : %o',data);
			},
			error: function(data){
				console.log('data in error : %o',data);
			}
		});
		console.log('end login');
	}
};

$(document).ready(function(){
	login = new Login();
	login.initPage();
});