function addEmployee() {
	$('#win').dialog({left:150,top:50}).dialog('open').dialog('setTitle', '添加员工');
}

function postEmployee() {
	$('#fm').form('submit', {
		url:"/addEmployee",
		success:function(data){
			var parsedJson = $.parseJSON(data);
			if(parsedJson.status == 200) {
				$.messager.alert('提示', parsedJson.message, 'info', function(){
					$('#fm').form("reset");
					$('#win').dialog('close');
					$('#employees').datagrid("reload",{ });
				});
			}
		}
	});
}

function postHour() {
	$('#fm-hour').form('submit', {
		url:"/addEmployeeHour",
		success:function(data){
			var parsedJson = $.parseJSON(data);
			if(parsedJson.status == 200) {
				$.messager.alert('提示', parsedJson.message, 'info', function(){
					$('#fm-hour').form("reset");
					$('#win_addhour').dialog('close');
					$('#hourList').datagrid("reload",{ });
				});
			}
		}
	});
}

function postPay() {
	$('#fm-pay').form('submit', {
		url:"/addPayOut",
		success:function(data){
			var parsedJson = $.parseJSON(data);
			if(parsedJson.status == 200) {
				$.messager.alert('提示', parsedJson.message, 'info', function(){
					$('#fm-pay').form("reset");
					$('#win_addpay').dialog('close');
					$('#payList').datagrid("reload",{ });
				});
			}
		}
	});
}

function delHour(hourId) {
	$.messager.confirm("提示", "确认删除该工时?删除后将不可恢复", function(data){
		if(data) {
			$.ajax({
				type : "post",
				url : "/delEmployeeHour",
				dataType : "json",
				data : {'hourId':hourId},
				success : function(data) {
					if(data.status == 200) {
						$('#hourList').datagrid("reload",{ });
					}
				}
			});
		}
	});
}

function delPay(payId) {
	$.messager.confirm("提示", "确认删除该该支出?删除后将不可恢复", function(data){
		if(data) {
			$.ajax({
				type : "post",
				url : "/delPayOut",
				dataType : "json",
				data : {'payId':payId},
				success : function(data) {
					if(data.status == 200) {
						$('#payList').datagrid("reload",{ });
					}
				}
			});
		}
	});
}

function searchEmployee() {
	$('#employees').datagrid('load',{
		employeeName:$('#employeeName').val()
	});
}

$.extend($.fn.validatebox.defaults.rules, {
	phoneNum:{
		validator:function(value, param){
			return /^1[3-8]+\d{9}$/.test(value);
		}
	}
});
