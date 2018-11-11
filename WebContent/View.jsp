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
tr {
	color: black;
}

tr:hover {
	color: red;
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
	int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    String NAME = "";
    String URLSS = "";
    String NUMBER = "";
    String ADD = "";
    String WISH = "";
    List<UserName> UserName = (List<UserName>) request.getAttribute("UserName");
    List<UserURL> UserURL = (List<UserURL>) request.getAttribute("UserURL");
    List<UserNumber> UserNumber = (List<UserNumber>) request.getAttribute("UserNumber");
    List<AddCart> AddCart = (List<AddCart>) request.getAttribute("AddCart");
    List<WishCart> WishCart = (List<WishCart>) request.getAttribute("WishCart");
    List<MAXList> MAX = (List<MAXList>) request.getAttribute("MAX");
   
    
    for (UserName user : UserName) {
		
    	 NAME = NAME+"@@@@@"+user.getUserName();
	}
    
    
    for (UserURL url : UserURL) {
		
    	 URLSS = URLSS+"@@@@@"+url.getUserURL();
	}
    
    
    for (UserNumber number : UserNumber) {
		
    	 NUMBER = NUMBER+"@@@@@"+number.getUserNumber();
	}
    
    
    for (AddCart add : AddCart) {
		
    	ADD = ADD+"@@@@@"+add.getAddCart();
	}
    
    for (WishCart wish : WishCart) {
		
    	WISH = WISH+"@@@@@"+wish.getWishCart();
	}
    
   
	//System.out.println(list);

	/* JSONArray arr = JSONArray.fromObject(list);
	JSONObject json = new JSONObject();
	json.put("PurchaseData", arr); */
	//System.out.println(json);
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
				<th width="400" height="0">品牌名</th>
				<th width="300" height="0">品牌URL</th>
				<th width="250" height="20">执行次数</th>
				<th width="180" height="20">加入购物车</th>
				<th width="180" height="20">加入心愿单</th>
			</tr>
		</thead>
		<tbody>
		      <% for (MAXList max : MAX) {%>		      
		           <tr>
		           <%List<UserName> Name = max.getUserName(); %> 
		           <%List<UserURL> URL = max.getUserURL(); %> 
		           <%List<UserNumber> Number = max.getUserNumber(); %> 
		           <%List<AddCart> Add = max.getAddCart(); %> 		           
		           <%List<WishCart> Wish = max.getWishCart(); %> 
		             <td><%= Name.get(a++) %></td>
		             <td><%= URL.get(b++) %></td>
		             <td><%= Number.get(c++) %></td>
		             <td><%= Add.get(d++) %></td>
		             <td><%= Wish.get(e++) %></td> 
		           </tr>		      		      
		      <%}%>
			
		</tbody>
	</table>

	<div id="controls">
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
			<input onclick="window.location.href='Gather.jsp'" align="center"
				type="submit" value="继 续 添 加" style="width: 350px; height: 40px">
		</div>
	</div>
	
	
	 
		<form action="UsersReadServlet" method="post">	
		
	   <div style="width:100%;   display:table ; overflow:hidden; margin:0 auto; height: 300px; *position:relative;">
       <div style="display:table-cell; vertical-align: middle; *position:absolute; top:50%;">
       <div style="*position:relative; *top:-50%; text-align:center; width:365px; margin:0 auto;">
       
       
             <input type="hidden" Name="UserName" placeholder="品 牌  数 据 " required="" value="<%= NAME %>"/>       
             <input type="hidden" Name="UserURL" placeholder="链 接  数 据 " required="" value="<%= URLSS %>"/>       
             <input type="hidden" Name="UserNumber" placeholder="数 量  数 据 " required="" value="<%= NUMBER %>"/>       
             <input type="hidden" Name="AddCart" placeholder="购 车  数 据 " required="" value="<%= ADD %>"/>       
             <input type="hidden" Name="WishCart" placeholder="心 愿 数 据 " required="" value="<%= WISH %>"/>    
             <h2>Cookies</h2>
              <label><input checked="true"   name="Browser" type="radio" value="Google" />Google</label>
              
			  <label><input   name="Browser" type="radio" value="Firefox" />Firefox</label><br><br>
                        
       	     <input type="text" Name="URL" placeholder="账号—密码-cookies—路径地址" required=""/>
       	     <input type="text" Name="VPN" placeholder="VPN地址 ：TXT文本示例 ： 链接名  账号  密码  " required=""/>
       	     
         <center>
			<div class="demo">
				<select name="country" id="country_id">
					<option value="请选择站点">请选择站点</option>				
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