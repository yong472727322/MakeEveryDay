<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>百汇创通</title>

<link href="css/jquery.selectbox.css" type="text/css" rel="stylesheet" />

<style>
.demo {
	margin: 100px auto;
}
</style>
<!-- Meta-Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //Meta-Tags -->

<!-- Style -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
</head>
<body>

	<form action="LeadIn.action" method="post">
		<center>

			<div class="demo">
				<select name="country" id="country_id">
					<option value="请选择站点">请选择站点</option>				
						<option value="T-US">T-US 美国</option>
						<option value="D-US">D-US 美国</option>								
						<option value="T-CA">T-CA 加拿大</option>									
						<option value="T-JP">T-JP 日本</option>
						<option value="D-JP">D-JP 日本</option>										
						<option value="D-UK">D-UK 英国</option>										
						<option value="D-DE">D-DE 德国</option>										
						<option value="D-FR">D-FR 法国</option>							
						<option value="D-ES">D-ES 西班牙</option>				
						<option value="D-IT">D-IT 意大利</option>					
				</select>
			</div>
    
       <div style="width:100%;   display:table ; overflow:hidden; margin:0 auto; height: 300px; *position:relative;">
       <div style="display:table-cell; vertical-align: middle; *position:absolute; top:50%;">
       <div style="*position:relative; *top:-50%; text-align:center; width:365px; margin:0 auto;">
       <input  name="dates" type="text" value="请输入导入日期（2017-01-01）" onfocus="javascript:if(this.value=='请输入导入日期（2017-01-01）')this.value='';" style="width: 350px; height: 40px">                         		                
       <input  name="url" type="text" value="请输入准确路径" onfocus="javascript:if(this.value=='请输入准确路径')this.value='';" style="width: 350px; height: 40px">        
       </div>
       </div>
       </div>

         <div class="demo">
			<div class="send-button w3layouts agileits">
				<input align = "center"  type="submit" value="开 启 导 入" style="width: 350px; height: 40px">
			</div>
       </div>                
		</center>
</form>
           
       <div class="demo">
			<div class="send-button w3layouts agileits">
				<input onclick="window.location.href='LOOK.action'"  align = "center"  type="submit" value="开 启 搜 索" style="width: 350px; height: 40px">
			</div>
       </div>
       
       
		<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript" src="js/jquery.selectbox-0.2.js"></script>

		<script type="text/javascript">
$(function () {
	$("[name='country']").selectbox({
		effect:"fade"
		/*以下可无视  注意逗号语法
		onOpen:function(){
			alert("我要打开了！");	
		},
		onChange:function(){
			alert("你选择的值是："+$(this).val());	
		},
		onClose:function(){
			alert("我关闭了！");	
		}*/
	});
	
	$("[name='position']").selectbox({
		effect:"slide"
	});
});
</script>

</body>
</html>
