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

<%
    String URLLISTS = "";	
    List<HighConcurrency> URLLIST = (List<HighConcurrency>) request.getAttribute("URLLIST");
    
   
    
  
    for (HighConcurrency HighConcurrency : URLLIST) {
		
    	URLLISTS = URLLISTS+HighConcurrency.getURL()+"@@@"+HighConcurrency.getBrands1()+"@@@"+HighConcurrency.getBrands2()+"@@@"+HighConcurrency.getBrands3()+"@@@"+HighConcurrency.getBrands4()+"@@@"+HighConcurrency.getBrands5()+"@@@"+HighConcurrency.getBrands6()+"###";                           
	}
     
    
    

%>
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
	              <br>
	               <br>
	<table border="0" class="sortable" cellpadding="0" cellspacing="0"
		id="table" style="table-layout: fixed;">
		<thead>
			<tr>
				<!-- <th width="70" height="20">ID</th> -->
				
				<th width="220" height="0">品 牌 URL</th>
				<th width="220" height="0">品 牌 名</th>
				<th width="220" height="0">品 牌 名</th>
				<th width="220" height="0">品 牌 名</th>
				<th width="220" height="0">品 牌 名</th>
				<th width="220" height="0">品 牌 名</th>
				<th width="220" height="0">品 牌 名</th>
			</tr>
		</thead>
		<tbody>
		      <% for (HighConcurrency HighConcurrency : URLLIST) {%>		      
		           <tr>		          
		             <td><%= HighConcurrency.getURL() %></td>
		             <td><%= HighConcurrency.getBrands1() %></td>
		             <td><%= HighConcurrency.getBrands2() %></td>
		             <td><%= HighConcurrency.getBrands3() %></td>
		             <td><%= HighConcurrency.getBrands4() %></td> 
		             <td><%= HighConcurrency.getBrands5() %></td>
		             <td><%= HighConcurrency.getBrands6() %></td> 
		           </tr>		      		      
		      <%}%>
			
		</tbody>
	</table>

	<!-- <div id="controls"> 
		 <div id="perpage"> 
			<select onchange="sorter.size(this.value)">
				<option value="5">5</option>
				<option value="10" selected="selected">10</option>
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
			</select> <span>每页数量</span>
		</div>
		<div id="navigation">
			<img src="images/first.gif" width="16" height="16" alt="First Page"
				onclick="sorter.move(-1,true)" /> <img src="images/previous.gif"
				width="16" height="16" alt="First Page" onclick="sorter.move(-1)" />
			<img src="images/next.gif" width="16" height="16" alt="First Page"
				onclick="sorter.move(1)" /> <img src="images/last.gif" width="16"
				height="16" alt="Last Page" onclick="sorter.move(1,true)" />
		</div>
		<div id="text">
			当前页面<span id="currentpage"></span> 和 <span id="pagelimit"></span>
		</div>
	</div>
-->
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
	<br>
	<br>
	
	<div class="demo">
		<div class="send-button w3layouts agileits">
			<input onclick="window.location.href='HighConcurrency.jsp'" align="center"	type="submit" value="继 续 添 加" style="width: 350px; height: 40px">
		</div>
	</div>
	
	
	 
		<form action="HighConcurrencyAndExecution" method="post">	
		
	   <div style="width:100%;   display:table ; overflow:hidden; margin:0 auto; height: 300px; *position:relative;">
       <div style="display:table-cell; vertical-align: middle; *position:absolute; top:50%;">
       <div style="*position:relative; *top:-50%; text-align:center; width:365px; margin:0 auto;">
       
              
               
             <input  type="hidden" Name="HighConcurrency" placeholder="心 愿 数 据 " required="" maxlength="800000000000000000000"  value="<%= URLLISTS %>"/>                         
       	      <h2>选择浏览器Cookie类型</h2>
       	      <label><input checked="true"  name="Browser" type="radio" value="Google" />Google</label>
       	      <br>
       	      <br>
			  <label><input  name="Browser" type="radio" value="Firefox" />Firefox</label><br><br> 
			   <h2>开启浏览器多开关模式</h2>
       	      <label><input   name="browsers" type="radio" value="YES" />是的,网速好我任性！</label>
       	      <br>
       	      <br>
			  <label><input checked="true" name="browsers" type="radio" value="NO" />不要了,网速卡到爆！</label><br><br>  
		
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