<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="net.sf.json.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.ITzy.entity.CollectData"%>
<%@page import="net.sf.json.JSONObject"%>
<%@page import="net.sf.json.JSON"%>
<%@page import="com.ITzy.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="css/jquery.selectbox.css" type="text/css" rel="stylesheet" />
<style type="text/css">
tr:hover {
	color: white;
}
</style>
<link rel="stylesheet" href="css/styletest.css" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<link rel="stylesheet" href="css/styletest.css" type="text/css" media="all">


<script src="jquery/jquery-1.7.2.min.js"  ></script>


<script type="text/javascript" >

 function bigTest(){
	 
	 alert("00000");
  $.ajax({
	    url:"/UsersReadServlet",
	    type: "get",
	    dataType: 'json',
	    data: {"list":json},
	    success: function(){alert("请求完成的处理");},
	    error: function(){alert("请求出错处理");}
	 }); 
 

} 
	

  
</script>
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
	<br>
	 <br>
	  <br>
	   <br>
	    <br>
	     <br>
	      <br>
	       <br>
	        <br>
	         <br>
	          <br>
	           <br>
	            <br>
	             <br>
	           
	<script type="text/javascript" src="js/scripttest.js"></script>
	<script type="text/javascript">
var sorter = new TINY.table.sorter("sorter");
sorter.head = "head";
sorter.asc = "asc";
sorter.desc = "desc";
sorter.even = "evenrow";
sorter.odd = "oddrow";
sorter.evensel = "evenselected";
sorter.oddsel = "oddselected";
sorter.paginate = true;
sorter.currentid = "currentpage";
sorter.limitid = "pagelimit";
sorter.init("table",1);
</script>

	
	
	
	 
		<form action="AutomaticDataCollectionServlet" method="post">	
		
	   <div style="width:100%;   display:table ; overflow:hidden; margin:0 auto; height: 300px; *position:relative;">
       <div style="display:table-cell; vertical-align: middle; *position:absolute; top:50%;">
       <div style="*position:relative; *top:-50%; text-align:center; width:365px; margin:0 auto;">
       
                                     
       	      <h2>选择Cookie类型</h2>
       	      <label><input checked="true"  name="Browser" type="radio" value="Google" />Google</label>
       	      <br>
       	      <br>
			  <label><input  name="Browser" type="radio" value="Firefox" />Firefox</label><br><br> 
			   <h2>浏览器多开关模式</h2>
       	      <label><input   name="browsers" type="radio" value="YES" />是的,网速好我任性！</label>
       	      <br>
       	      <br>
			  <label><input checked="true" name="browsers" type="radio" value="NO" />不要了,网速卡到爆！</label><br><br>  
			    <h2>事件选择模式</h2>
		        <div>是否加入购物车</div>
				<label><input   name="AddCart" type="radio" value="是" />是</label>
                <label><input checked="true"   name="AddCart" type="radio" value="否" />否</label><br><br> 
                <div>是否加入心愿车</div>
				<label><input   name="WishCart" type="radio" value="是" />是</label> 
                <label><input checked="true"  name="WishCart" type="radio" value="否" />否</label><br><br>    	
       	 <br>	  
		 <center>
			<div class="demo">
				<select name="country" id="country_id">			
						<option value="T-US">T-US 美国</option>																										
						<option value="T-JP">T-JP 日本</option>															
						<option value="D-UK">D-UK 英国</option>										
						<option value="D-DE">D-DE 德国</option>	
						<option value="T-CA">T-CA 加拿大</option>											
						<option value="D-FR">D-FR 法国</option>							
						<option value="D-ES">D-ES 西班牙</option>				
						<option value="D-IT">D-IT 意大利</option>					
				</select>
			</div>                
		</center>	
		
       	 <br>
       	     <input type="text" Name="gogle" placeholder="Gogle 启动脚本地址" required=""/>	    
       	     <input type="text" Name="Data" placeholder="点击链接—路径地址" required=""/>	                        
       	     <input type="text" Name="URL" placeholder="账号—密码-cookies—路径地址" required=""/>
       	     <input type="text" Name="VPN" placeholder="VPN地址 ：TXT文本示例 ： 链接名  账号  密码  " required=""/>
       	     <input type="text" Name="succeed" placeholder="日志记录成功—路径地址" required=""/>
       	     <input type="text" Name="fail" placeholder="日志记录失败—路径地址" required=""/>
       	     
         
          <br>
          <br>      	   	        
       </div>
       </div>
       </div>																					
			<div class="demo">
		          <div class="send-button w3layouts agileits">
			              <input  align="center" type="submit" value="开启执行"	style="width: 350px; height: 40px">
		          </div>
	         </div>
	</form>	
	<br>
</body>
</html>